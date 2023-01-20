package org.example.dao;

import org.example.models.Categoria;
import org.example.models.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private final Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public Produto inserir(Produto produto) throws SQLException {
        String sql = "INSERT INTO produto(nome, descricao) VALUES(?, ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()){
                resultSet.next();
                produto.setId(resultSet.getInt(1));
            }
        }

        return produto;
    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = new ArrayList<>();

        String sql = "SELECT id, nome, descricao, categoria_id FROM produto;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getResultSet()) {
                while (resultSet.next()) {
                    int categoriaId = resultSet.getInt(4);
                    Categoria categoria = new Categoria();
                    if (categoriaId > 0) {
                        CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
                        categoria = categoriaDAO.carrega(categoriaId);
                    } else {
                        categoria = null;
                    }

                    Produto produto = new Produto(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            categoria
                    );
                    produtos.add(produto);
                }
            }
        }

        return produtos;
    }
}

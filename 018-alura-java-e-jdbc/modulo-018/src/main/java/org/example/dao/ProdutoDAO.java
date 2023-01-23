package org.example.dao;

import org.example.models.Categoria;
import org.example.models.Produto;
import org.jetbrains.annotations.NotNull;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private final Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public Produto inserir(@NotNull Produto produto) {
        String sql = "INSERT INTO produto(nome, descricao, categoria_id) VALUES(?, ?, ?);";
        try {
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                preparedStatement.setString(1, produto.getNome());
                preparedStatement.setString(2, produto.getDescricao());
                preparedStatement.setInt(3, produto.getCategoriaId());
                preparedStatement.execute();

                try (ResultSet resultSet = preparedStatement.getGeneratedKeys()){
                    resultSet.next();
                    produto.setId(resultSet.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return produto;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM produto WHERE id = ?;";
        int rowAffected;
        try {
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setInt(1, id);
                rowAffected = preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return rowAffected != 0;
    }

    public List<Produto> listar() {
        List<Produto> produtos = new ArrayList<>();

        String sql = "SELECT id, nome, descricao, categoria_id FROM produto;";
        try {
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return produtos;
    }

    public boolean alterar(Integer id, String nome, String descricao) {
        String sql = "UPDATE produto SET nome=?, descricao=? WHERE id=?;";
        int rowAffected;
        try {
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setString(1, nome);
                preparedStatement.setString(2, descricao);
                preparedStatement.setInt(3, id);
                rowAffected = preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return rowAffected != 0;
    }
}

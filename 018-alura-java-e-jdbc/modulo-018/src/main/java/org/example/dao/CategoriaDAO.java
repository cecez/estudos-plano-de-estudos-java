package org.example.dao;

import org.example.models.Categoria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private final Connection connection;

    public CategoriaDAO(Connection connection) {
        this.connection = connection;
    }

    public Categoria inserir(Categoria categoria) throws SQLException {
        String sql = "INSERT INTO categoria(nome) VALUES(?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, categoria.getNome());
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()){
                resultSet.next();
                categoria.setId(resultSet.getInt(1));
            }
        }

        return categoria;
    }

    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT id, nome FROM categoria;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getResultSet()) {
                while (resultSet.next()) {
                    Categoria categoria = new Categoria(
                            resultSet.getInt(1),
                            resultSet.getString(2)
                    );
                    categorias.add(categoria);
                }
            }
        }

        return categorias;
    }

    public Categoria carrega(int categoriaId) throws SQLException {
        String sql = "SELECT id, nome FROM categoria WHERE id = ?;";
        Categoria categoria = new Categoria();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, categoriaId);
            preparedStatement.execute();

            try (ResultSet resultSet = preparedStatement.getResultSet()) {
                resultSet.next();
                categoria.setId(resultSet.getInt(1));
                categoria.setNome(resultSet.getString(2));
            }
        }

        return categoria;
    }
}

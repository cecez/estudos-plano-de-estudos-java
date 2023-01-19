package org.example;

import java.sql.*;

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
}

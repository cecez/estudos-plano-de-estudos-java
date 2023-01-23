package org.example;

import org.example.dao.ProdutoDAO;
import org.example.factory.ConnectionFactory;
import org.example.models.Produto;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conectando com o banco de dados...");

        // conexão com banco de dados
        try (Connection connection = (new ConnectionFactory()).obter()) {
            connection.setAutoCommit(false);

            connection.beginRequest();
            Statement statement = connection.createStatement();
            if (!statement.execute("SELECT id, nome, descricao FROM produto")) {
                throw new SQLException("Sem resultados");
            }

            // obtendo resultados de um SELECT
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String descricao = resultSet.getString("descricao");

                System.out.println(id + " - " + nome + " - " + descricao);
            }

            // inserindo um registro
            statement = connection.createStatement();
            statement.execute("INSERT INTO produto(nome, descricao) VALUES('caneca', 'rindson');", Statement.RETURN_GENERATED_KEYS);

            resultSet = statement.getGeneratedKeys();
            int id = 1;
            while (resultSet.next()) {
                id = resultSet.getInt(1);
                System.out.println("Registro inserido com id: " + id);
            }

            // removendo um registro
            statement = connection.createStatement();
            statement.execute("DELETE FROM produto WHERE id = " + id, Statement.RETURN_GENERATED_KEYS);
            int removidos = statement.getUpdateCount();
            System.out.println("Removido(s) " + removidos + " registro(s).");

            // inserindo com prepared statement
            String sql = "INSERT INTO produto(nome, descricao) VALUES(?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, args[0]);
            preparedStatement.setString(2, args[1]);
            preparedStatement.execute();
            resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();
            System.out.println("Registro inserido com prepared statement com id: " + resultSet.getInt(1));

            resultSet.close();
            preparedStatement.close();
            statement.close();

            Produto produto = new Produto("Cubo", "Cubo mágico");
            ProdutoDAO produtoDAO = new ProdutoDAO(connection);
            produtoDAO.inserir(produto);
            System.out.println(produto);

            List<Produto> listaProdutos = produtoDAO.listar();
            listaProdutos.forEach(System.out::println);

            connection.commit();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}
/*

Exercício: Crie um programa que solicite ao usuário que insira cinco números inteiros e, em seguida, exiba esses números em ordem crescente.

*/

import java.sql.*;

public class FacilDB {
	public static void main(String[] args) {
		System.out.println("connectando no banco...");

		String url = "jdbc:sqlite:/tmp/facil.db";

		try {
			Connection connection = DriverManager.getConnection(url);
			System.out.println("conectou");

			Statement statement = connection.createStatement();
			statement.executeUpdate("drop table if exists numeros");
			statement.executeUpdate("create table numeros (numero integer)");

			
			statement.executeUpdate("insert into numeros(numero) values(20)");

			ResultSet resultado = statement.executeQuery("select numero from numeros");
			while (resultado.next()) {
				System.out.println(resultado.getInt("numero"));
			}

			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
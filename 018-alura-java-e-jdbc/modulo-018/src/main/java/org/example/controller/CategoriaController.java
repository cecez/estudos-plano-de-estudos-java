package org.example.controller;

import org.example.dao.CategoriaDAO;
import org.example.factory.ConnectionFactory;
import org.example.models.Categoria;

import java.sql.Connection;
import java.util.List;

public class CategoriaController {

	private final CategoriaDAO categoriaDAO;

	public CategoriaController() {
		Connection connection = new ConnectionFactory().obter();
		categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listar() {
		return categoriaDAO.listar();
	}
}

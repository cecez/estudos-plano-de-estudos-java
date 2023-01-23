package org.example.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.example.dao.ProdutoDAO;
import org.example.factory.ConnectionFactory;
import org.example.models.Produto;

public class ProdutoController {

	private final ProdutoDAO produtoDAO;

	public ProdutoController() {
		Connection connection = new ConnectionFactory().obter();
		produtoDAO = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		produtoDAO.excluir(id);
	}

	public void salvar(Produto produto) {
		produtoDAO.inserir(produto);
	}

	public List<Produto> listar() {
		return produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		produtoDAO.alterar(id, nome, descricao);
	}
}

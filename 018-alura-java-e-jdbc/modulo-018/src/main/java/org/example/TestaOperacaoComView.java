package org.example;

import javax.swing.JFrame;

import org.example.view.ProdutoCategoriaFrame;

import java.sql.SQLException;

public class TestaOperacaoComView {

	public static void main(String[] args) {
		ProdutoCategoriaFrame produtoCategoriaFrame = new ProdutoCategoriaFrame();
		produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

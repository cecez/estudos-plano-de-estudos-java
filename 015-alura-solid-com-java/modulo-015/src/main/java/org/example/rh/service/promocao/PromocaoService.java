package org.example.rh.service.promocao;

import org.example.rh.ValidacaoException;
import org.example.rh.model.Cargo;
import org.example.rh.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaAtingida) {
        if (!metaAtingida) {
            throw new ValidacaoException("Funcionario nao bateu a meta.");
        }

        if (funcionario.getCargo() == Cargo.GERENTE) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos.");
        }

        Cargo cargoAtual = funcionario.getCargo();
        Cargo novoCargo = cargoAtual.getProximoCargo();

        funcionario.promover(novoCargo);
    }
}

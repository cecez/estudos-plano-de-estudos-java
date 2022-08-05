package org.example;

import java.io.Serializable;

public class BankClient implements Serializable {
    private String name;
    private String cpf;
    private String profession;

    public BankClient(String name, String cpf, String profession) {
        this.name = name;
        this.cpf = cpf;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }
}

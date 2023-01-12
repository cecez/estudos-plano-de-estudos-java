package br.com.cecez;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    public void semNome() {
        String[] args = {};
        Main.main(args);
        assertEquals(2, 2);
    }

    @Test
    public void gson() {
        Gson gson = new Gson();

        String[] valores = {"um", "zwei", "tres"};

        System.out.println(gson.toJson(valores));


        MeuJson meuJson = new MeuJson();
        System.out.println(meuJson);
        String json = gson.toJson(meuJson);
        System.out.println(json);

        assertEquals("{\"inteiro\":20,\"corda\":\"minha corda\"}", json);
    }
}

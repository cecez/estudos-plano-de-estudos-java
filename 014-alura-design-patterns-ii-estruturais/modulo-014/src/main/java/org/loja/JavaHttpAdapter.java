package org.loja;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpAdapter implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            // ... implementacao da requisicao
            System.out.println("vai fazer requisicao");
        } catch (MalformedURLException e) {
            throw new RuntimeException("Erro ao enviar requisicao", e);
        }
    }
}

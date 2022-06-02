package org.example;

import java.io.IOException;
import java.net.URISyntaxException;

public interface ApiClient {
    String getBody() throws InterruptedException, URISyntaxException, IOException;
}

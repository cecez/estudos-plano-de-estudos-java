package org.example;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) {
        String s = "é";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes();
        System.out.format("%d byte(s) - %s %n", bytes.length, charset.displayName());

        Charset charsetUTF16 = StandardCharsets.UTF_16;
        bytes = s.getBytes(charsetUTF16);
        String s2 = new String(bytes, charsetUTF16);
        System.out.format("(%s) %d byte(s) - %s", s2, bytes.length, charsetUTF16.displayName());
    }
}

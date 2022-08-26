package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate futuro = LocalDate.of(2050, Month.JANUARY, 10);

        Period diferenca = Period.between(hoje, futuro);
        System.out.println(diferenca.getYears());

        LocalDate amanha = hoje.plusDays(1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = amanha.format(dateTimeFormatter);
        System.out.println(dataFormatada);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        ZonedDateTime agoraComZona = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
        System.out.println(agoraComZona);

        Set<String> zonas = ZoneId.getAvailableZoneIds();
        System.out.println(zonas);
    }
}

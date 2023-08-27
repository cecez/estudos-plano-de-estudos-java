/*
Exercício: Crie um programa que determine e exiba o dia da semana em que uma determinada data ocorreu.
*/

import java.time.*;

public class Data {
	public static void main(String[] args) {

		LocalDate lc = LocalDate.of(2023, Month.AUGUST, 22);

		System.out.println(lc.getDayOfWeek());
	}
}
"""
Exercício: Crie um programa que calcule e exiba o fatorial de um número inteiro inserido pelo usuário. O fatorial de um número é o produto de todos os números inteiros positivos até esse número. Por exemplo, o fatorial de 5 é 5 * 4 * 3 * 2 * 1 = 120.
"""

def fatorial(n):
	if n == 1:
		return 1
	else:
		return n * fatorial(n-1)

print(fatorial(5))
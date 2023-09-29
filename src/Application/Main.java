/* 
 >Exercício 2<
 Fazer um programa para ler  nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 (Primeiro trimestre vale 30 e o segundo e terceiro vale 35 cada). Ao final, mostrar a nota final do aluno no ano.
 Dizer se o aluno está aprovado ou não e, em caso de negativo, quantos pontos faltam para o aluno obter o minimo para ser aprovado
 (60% da nota).
 */

package Application;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante aluno = new Estudante();

		System.out.print("Digite o nome do aluno: ");
		aluno.Nome = sc.nextLine();

		System.out.print("Digite a nota 1: ");
		aluno.Nota1 = sc.nextDouble();
		System.out.print("Digite a nota 2: ");
		aluno.Nota2 = sc.nextDouble();
		System.out.print("Digite a nota 3: ");
		aluno.Nota3 = sc.nextDouble();

		System.out.printf("Nota final: %.2f%n", aluno.Calcular_total());

		if (aluno.Calcular_total() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltando: %.2f", aluno.PontosFaltantes());
		} else {
			System.out.println("Aprovado!");
		}

	}

}

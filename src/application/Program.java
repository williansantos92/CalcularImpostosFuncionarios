package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.println("Digite o número de pagamentos");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da taxa de pagamento #" + (i + 1) + ":");
			System.out.println("Física ou Juridica (f/j):");
			char tipo = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if (tipo == 'f') {
				System.out.println("Gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();

				Pessoa p = new PessoaFisica(nome, rendaAnual, gastosSaude);
				list.add(p);
			} else {
				System.out.println("Número de funcionários: ");
				int numFunc = sc.nextInt();

				Pessoa p = new PessoaJuridica(nome, rendaAnual, numFunc);
				list.add(p);
			}

		}

		System.out.println();

		System.out.println("TAXAS:");
		//Nome + taxas
		for (Pessoa p : list) {
			System.out.println(p.getNome() + " $ " + p.calculaImpostos());
		}
		System.out.println();

		//Calcular o total de taxas
		double soma = 0;

		for (Pessoa p : list) {
			soma += p.calculaImpostos();
		}

		System.out.println("TOTAL TAXAS: $ " + soma);
	}

}

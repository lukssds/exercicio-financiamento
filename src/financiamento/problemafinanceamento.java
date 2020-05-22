package financiamento;

import java.util.Locale;
import java.util.Scanner;

public class problemafinanceamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		double salario, totalfinanciado;
		int prestacoes,opcoes;
		String nome;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nome= sc.nextLine();
		System.out.print("Salario: ");
		salario=sc.nextDouble();
		
		while (salario < 0.0) { 
			System.out.println("Salario não pode ser negativo tente novamante");
			System.out.print("Salario: ");
			salario=sc.nextDouble();
		}
		
		sc.close();

	}

}

import java.util.ArrayList;
import java.util.Scanner;

import classes.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n, id, posicao = 0;
		
		do {
			
			System.out.print("Quantos funcionários você irá registrar? ");
			n = scan.nextInt();
			
			if (n > 0) {
				
				ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
				
				for(int i = 0; i < n; i++) {
					
					System.out.println("\nFuncionário #" + (i+1));
					System.out.print("Id: ");
					id = scan.nextInt();
					System.out.print("Nome: ");
					scan.nextLine();
					String nome = scan.nextLine();
					System.out.print("Salário: ");
					double salario = scan.nextDouble();
					
					funcionarios.add(new Funcionario(id, nome, salario));
					
				}
				
				System.out.print("\nDigite o id do funcionário que você deseja aumentar o salário: ");
				id = scan.nextInt();
				
				for(int i = 0; i < n; i++) {
					
					if(funcionarios.get(i).getId() == id) {
						posicao = i;
					}
					
				}
				
				if(posicao != 0) {
					System.out.print("Digite a porcentagem: ");
					double porcentagem = scan.nextDouble();
					
					funcionarios.get(posicao).AumentoSalario(porcentagem);
				} else {
					System.out.println("Id não encontrado!");
				}
				
				System.out.println("\n\nLista de Funcionários:");
				
				for(int i = 0; i < n; i++) {
					System.out.println(funcionarios.get(i).toString());
				}
				
				break;
				
			} else {
				System.out.println("Número inválido, digite novamente!");
			}
			
		}while(true);
		
		System.exit(0);
		
	}

}

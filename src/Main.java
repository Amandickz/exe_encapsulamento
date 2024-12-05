import java.util.ArrayList;
import java.util.Scanner;

import classes.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do {
			
			System.out.print("Quantos funcionários você irá registrar? ");
			n = scan.nextInt();
			
			if (n > 0) {
				
				ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
				
				
				
				break;
				
			} else {
				System.out.println("Número inválido, digite novamente!");
			}
			
		}while(true);
		
	}

}

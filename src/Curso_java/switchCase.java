package Curso_java;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner dp = new Scanner(System.in);
		int num=0;
		String dia = "null";
		
		System.out.println("\t ***Aqui testaremos o switch case***");
		System.out.println("\n\n Digite um numero de 1 a 7");
		num = dp.nextInt();
		
		switch (num) {
		
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "terça-feira";
			break;
		case 4:
			dia = "quarta- feira";
			break;
		case 5:
			dia = "quinta-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		
		System.out.println("Dia selecionado: "+ dia);
		
		
		dp.close();
	}

}

package Dolinha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		converter con = new converter();
		
		System.out.println("digite o valor atual do dolar: (R$)");
		con.dol = sc.nextDouble();
		
		System.out.println("Digite a quantidade de dolares que deseja adquirir");
		con.com = sc.nextDouble();
		
		System.out.println("Para você adiquirir "+con.com+" irá pagar R$"+con.converte());
		System.out.printf("a taxa de transação será no valor de %.2f\n", con.taxa());
		System.out.printf("totalizando o valor de R$%.2f\n",(con.converte()+con.taxa()));
		
		sc.close();
	}

}

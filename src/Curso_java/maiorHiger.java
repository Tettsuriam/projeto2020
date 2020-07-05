package Curso_java;

import java.util.Scanner;

public class maiorHiger {
	
	public static int higer(int [] a) {
		int mai=a[0];
		
		for(int i=0; i<a.length; i++) {
			if(mai<a[i]) {
				mai=a[i];
			}
		}
		
		return mai;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int [] vet  = new int[3];
		Scanner dp = new Scanner(System.in);
		
		System.out.println("digite 3 numeros inteiros");
		
		for(i=0;i<vet.length;i++) {
			System.out.print("("+(i+1)+")");
			vet[i]=dp.nextInt();
			System.out.print("\n");
		}
		int mai = higer(vet);
		
		System.out.println("o maior é: "+mai);
		
		dp.close();
	}

}

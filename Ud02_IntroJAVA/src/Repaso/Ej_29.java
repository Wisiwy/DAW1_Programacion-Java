package Repaso;

import java.util.Scanner;

public class Ej_29 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Num: ");
		int num = teclado.nextInt();
		
		int div = 2;
		
		while(num > 1) {
			if(num%div==0) {
				System.out.printf(" %3d | %-2d \n",num,div);
				num = num/div;
			}else {
				div++;
			}
		}
		System.out.printf(" %3d |  \n",num);
	}
}

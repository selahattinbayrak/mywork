package Homework;

import java.util.Scanner;

public class H03_SıralıYıldızYazdırma {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen pozitif bir rakam giriniz");
		int sayi=scan.nextInt();
		
		
		for (int satir = 1; satir <= sayi; satir++) {
			
			for (int i = 1; i <=satir ; i++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}

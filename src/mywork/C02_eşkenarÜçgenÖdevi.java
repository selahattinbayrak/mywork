package mywork;

import java.util.Scanner;

public class C02_eşkenarÜçgenÖdevi {

	public static void main(String[] args) {
		// kullanıcıdan bir üçgenin üç kenar uzunluğunu alın birbirine eşit ise ekrana "Eşkenar Üçgen" yazdırın
		// diğer durumlarda ekrana "Eşkenar değil" yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Üçgenin 1. kenar uzunluğunu girin");
		double kenar1=scan.nextDouble();
		System.out.println("Üçgenin 2. kenar uzunluğunu giriniz");
		double kenar2=scan.nextDouble();
		System.out.println("Üçgenin 3. kenar uzunluğunu giriniz");
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eşkenar üçgen");
		}
		else {
			System.out.println("Eşkenar değil");
		}

	}

}

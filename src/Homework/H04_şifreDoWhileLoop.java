package Homework;

import java.util.Scanner;

public class H04_şifreDoWhileLoop {

	public static void main(String[] args) {
		/*
		 Soru 5 ) Kullanicidan bir sifre girmesini isteyin. 
		 Girilen sifreyi asagidaki sartlara gore kontrol edin 
		 ve sifredeki hatalari yazdirin.
		Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
		ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		- Sifre kucuk harf icermelidir
		- Sifre buyuk harf icermelidir
		- Sifre ozel karakter icermelidir
		- Sifre en az 8 karakter olmalidir.
		 */
		
		Scanner scan=new Scanner(System.in);
		String sifre="";
		boolean khk=false;
		boolean bhk=false;
		boolean ohk=false;
		boolean uk=false;
		
	do {
		System.out.println("Lütfen bir şifre girirniz");
		sifre=scan.nextLine();
		
		khk=kücükHarfKontrol(sifre);
		bhk=büyüHarfKontrol(sifre);
		ohk=ozelKarakterKontrol(sifre);
		uk=uzunlukKontrol(sifre);
		
	} while (!khk || !bhk || !ohk || !uk);	
		System.out.println("Şifreniz başarılı bir şekilde kaydedildi");
		
		
	}

	private static boolean uzunlukKontrol(String sifre) {
		boolean uk=false;
		if (sifre.length()>=8) {
			uk=true;
			
		}
		if (!uk) {
			System.out.println("Şifreniz en az 8 karakter olmalıdır");
		}
		return uk;
	}

	private static boolean ozelKarakterKontrol(String sifre) {
		boolean ohk=false;
		
		String harfler="é!'^+%&/()=?_-*#${[]}|£><½.:,;";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i,i+1))) {
				ohk=true;
				break;
			}
		}
		if (!ohk) {
			System.out.println("Şifreniz özel karakter içermelidir");
		}
		return ohk;
			
		
	}

	private static boolean büyüHarfKontrol(String sifre) {
		boolean bhk=false;
		String harfler="ABCÇDEFGHIİJKLMNOÖPRSŞTUÜVYZWXQ";
		
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i,i+1))) {
				bhk=true;
				break;
			}
		}
		if (!bhk) {
			System.out.println("Şifreniz en az bir büyük harf içermelidir");
		}
		return bhk;
		
	}

	private static boolean kücükHarfKontrol(String sifre) {
		boolean khk=false;
		String harfler="abcdefghijklmnoprstuvyzqwx";
		
		for (int i = 0; i <sifre.length(); i++) {
			
			if (harfler.contains(sifre.substring(i,i+1))) {
				khk=true;
				break;
			}			
		}
		if (!khk) {
			System.out.println("Şifreniz en az bir küçğk harf içermelidir");
		}
					
		return khk;
		
	}

}

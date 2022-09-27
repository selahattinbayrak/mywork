package mywork;

import java.util.Scanner;

public class Ders01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir karakter giriniz");
		
		char karakter=scan.nextLine().toLowerCase().charAt(0);
		if (karakter>='a' && karakter<='z') {
			System.out.println("Harf girdiniz");			
		}
		else if (karakter>='0' && karakter<='9') {
			System.out.println("Rakam Girdiniz");
		}
		else {
			System.out.println("özel karakter girdiniz");
		}

	}

}

package mywork;

import java.util.Scanner;

public class C03_GünBüyükYAzdırma {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen gün ismi giriniz");
		
		String gün=scan.next().toLowerCase();
		if (gün.equals("pazartesi") || gün.equals("salı") || gün.equals("çarşamba") || gün.equals("perşembe") 
				|| gün.equals("cuma") || gün.equals("cumartesi") || gün.equals("pazar")) {
			System.out.println(gün.substring(0,1).toUpperCase() + gün.substring(1));
		} else {
			System.out.println("geçerli bir gün ismi giriniz");
		}
	}

}

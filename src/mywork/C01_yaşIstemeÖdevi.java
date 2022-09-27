package mywork;

import java.util.Scanner;

public class C01_yaşIstemeÖdevi {

	public static void main(String[] args) {
		// kullanıcıya yaşını sorun eğer 65 den büyük ise "emekli olamazsın"
		// 65 e eşit ve büyük ise "emekli olabilirsin" yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yaşınızı giriniz");
		
		int yaş=scan.nextInt();
		 if (yaş<65) {
			System.out.println("Emekli Olamazsın");
		}
		 else if (yaş>=65) {
			 System.out.println("Emekli olabilirsin");
		}

	}

}

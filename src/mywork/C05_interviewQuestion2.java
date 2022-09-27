package mywork;

import java.util.Scanner;

public class C05_interviewQuestion2 {

	public static void main(String[] args) {
		// Kullanicidan artik yil olup olmadigini
		// kontrol etmek icin yil girmesini isteyin.
		// Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		
		// Kural 2: 4’un kati olmasina ragmen 100 ile
		// bolunebilen yillardan sadece
		// 400’un kati olan yillar artik yildir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir yıl giriniz");
		int yıl=scan.nextInt();
		
		if (yıl%100==0) {
			if (yıl%400==0) {
				System.out.println("artık yıl");
			} else {
				System.out.println("artık yıl değil");
			}
			
		} else if(yıl%4==0){
			System.out.println("artık yıl");

		} else {
			System.out.println("artık yıl değil");
		}
	}

}

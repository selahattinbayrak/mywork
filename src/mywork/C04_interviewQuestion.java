package mywork;

import java.util.Scanner;

public class C04_interviewQuestion {

	public static void main(String[] args) {
		// Kullanicidan artik yil olup olmadigini kontrol etmek
		// icin yil girmesini isteyin.
		// Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		// Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yıldır
		// Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen
		// yillardan sadece 400’un kati olan yillar artik
		// yildir
		
		Scanner scan=new Scanner(System.in);
		int yıl=scan.nextInt();
		
		if (yıl%4==0) {
			if (yıl%100==0) {
				if (yıl%400==0) {
					System.out.println("artık yıl");
				} else {
					System.out.println("artık yıl değil");

				}
			} else {
				System.out.println("artık yıl");

			}
			
			
		} else {
			System.out.println("artık yıl değil");

		}
		


	}

}

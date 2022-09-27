package mywork;

import java.util.Scanner;

public class D01_Deneme {

	public static void main(String[] args) {
					
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Lütfen 1. Slot paket adedini giriniz");
			double paket1=scan.nextDouble();
			System.out.println("Lütfen ikinci slot paket adedini giriniz");
			double paket2=scan.nextDouble();
			System.out.println("Lütfen iade paket adedini giriniz");
			double iade=scan.nextDouble();
			System.out.println("Lütfen toplama nokta sayısını giriniz");
			int toplamaNokta=scan.nextInt();
			System.out.println("Lütfen toplam paket sayısını giriniz");
			double toplamapaket=scan.nextDouble();
			
			
			System.out.println("1. Slot Dağıtım Tutarı : " + birincislot(paket1));
			System.out.println("2. Slot Dağıtım Tuatarı : " +ikincislot(paket2));
			System.out.println("İade Paket Toplama Tutarı : " + iadepaket(iade));
			System.out.println("MP paket toplama tutarı : " + toplamapaket(toplamaNokta, toplamapaket));
			
			double hakedişToplam=((birincislot(paket1)+ ikincislot(paket2)+ iadepaket(iade)
			+ toplamapaket(toplamaNokta,toplamapaket)));
			double kdv=hakedişToplam*0.18;
			System.out.println("KDV Miktarı :" + kdv);
			double GenelToplam=hakedişToplam+kdv;
			System.out.println("Genel Toplam : " + GenelToplam);
			

		}

		private static double toplamapaket(int toplamaNokta, double toplamapaket) {
			
			
			switch (toplamaNokta) {
			case 1:
				toplamapaket=((toplamaNokta*7.25)+(toplamaNokta-1)*0.8*toplamapaket);
				break;
			case 2:
				toplamapaket=((toplamaNokta*7.25)+(toplamaNokta-2)*0.8*toplamapaket);
				break;
			case 3:
				toplamapaket=((toplamaNokta*7.25)+(toplamaNokta-3)*0.8*toplamapaket);
				break;
			case 4:
				toplamapaket=((toplamaNokta*7.25)+(toplamaNokta-4)*0.8*toplamapaket);
				break;
			case 5:
				toplamapaket=((toplamaNokta*7.25)+(toplamaNokta-5)*0.8*toplamapaket);
				break;
			case 6:
				toplamapaket=((toplamaNokta*7.25)+(toplamaNokta-6)*0.8*toplamapaket);
				break;
			case 7:	
				toplamapaket=((toplamaNokta*7.25)+(toplamaNokta-7)*0.8*toplamapaket);
				break;
			default:
				
			}
			
			return toplamapaket;
		}

		private static double iadepaket(double iade) {
			iade=iade*7.25;
			return iade;
			
		}

		private static double ikincislot(double paket2) {
			double hakediş2=0;
			if (paket2<=40) {
				hakediş2=((paket2*7.25)*1.20);
			} else if (paket2<=90){
				hakediş2=((40*7.25)+((paket2-40)*7.10)*1.20);
			} else {
				hakediş2=((40*7.25)+(50*7.10)+((paket2-90)*7)*1.20);
			}
			return hakediş2;
		}

		private static double birincislot(double paket1) {
			
			double hakediş1=0;
			if (paket1<=40) {
				hakediş1=(paket1*7.25);
			} else if (paket1<=90){
				hakediş1=(40*7.25)+((paket1-40)*7.10);
			} else {
				hakediş1=(40*7.25)+(50*7.10)+((paket1-90)*7);
			}
			return hakediş1;
		}

	}



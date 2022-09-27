package mywork;

import java.util.Scanner;

public class C07_şifreIşlemleri {

	public static void main(String[] args) {
		// Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
		// basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
		// sifre girin” yazdirin
		// - Ilk harf buyuk harf olmali
		// - Son harf kucuk harf olmali
		// - Sifre bosluk icermemeli
		// - Sifre uzunlugu en az 8 karakter olmali
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir şifre giriniz");
		String şifre=scan.next();
	
		// tüm eksiklikleri söylemesi için 4 şart için ayrı ayrı if yapacağım
		// başta bir flag tanımlayacağım, eğer onda değişim varsa şifre başarısız
		// değişim yoksa şifre başarılı olacak
		
		int flag=0;
		// - ilk harf büyük olmalı
		if (!(şifre.charAt(0)>='A' && şifre.charAt(0)<='Z')) {
			System.out.println("Şifre büyük harfle başlamalıdır");
			flag++;				
		}
		// - Son harf küçük olmalı
		if (!(şifre.charAt(şifre.length()-1)>='a' && şifre.charAt(şifre.length()-1)<='z')) {
			System.out.println("Şifre küçük harfle bitmelidir");
			flag++;
						
		}
		// - Şifre boşluk içermemeli
		
		if (şifre.contains(" ")) {
			System.out.println("Şifre boşluk içermemeli");
			flag++;
						
		}
		// - şifre uzunluğu en az 8 karakter olmalı
		if (şifre.length()<8) {
			System.out.println("Şifre en az 8 karakter olmalıdır");
			flag++;
						
		}
		// şimdi flag ı kontrol edip
		// şifre başarılı mı değil mi yazdıracagım
		
		if (flag==0) {
			System.out.println("şifre başarı ile tamamlandı");
			
		} else {
			System.out.println("İşlem başarısız, Lütfen yeni bir şifre girin");
		}

	}

}

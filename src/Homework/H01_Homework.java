package Homework;

public class H01_Homework {

	public static void main(String[] args) {
		// // Soru 1) String methodlarini kullanarak “  Java ogrenmek123 Cok guzel@  ”  
		// String’ini “Java ogrenmek cok guzel.” sekline getirin.


		String cumle="  Java ogrenmek123 Cok guzel@  ";
		cumle=cumle.trim();
		cumle=cumle.replaceAll("\\s", "x");
		System.out.println(cumle);
		cumle=cumle.replaceAll("\\W", "");
		System.out.println(cumle);
		cumle=cumle.replaceAll("\\d", "");
		System.out.println(cumle);
		cumle=cumle.replace("x", " ");
		System.out.println(cumle);

	}

}

package mywork;

public class C06_equals {

	public static void main(String[] args) {
		
		
		String isim1="Ali Can";
		String isim2="ali can";
				System.out.println(isim1==isim2);
				System.out.println(isim1.equals(isim2));
				System.out.println(isim1.equalsIgnoreCase(isim2));

		System.out.println(isim1.length());
		
		String str="çalışırsanız, Java öğrenmek çok kolay";
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf('a', 11));
		

	}

}

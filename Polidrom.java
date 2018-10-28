import java.util.Scanner;
import java.util.Arrays;
public class Polidrom{

	public static void main(String[] args) {		
		System.out.println("Vvedite stroky ");// Выводим на экран пояснение пользователю
		String number1=vvod(null);
		int p=0;
		number1=number1.replace(" ","");
		number1=number1.replace(",","");
		number1=number1.replace(".","");
		char[] mass=number1.toCharArray();
		int i=0;
		int j=mass.length-1;
		for (; i<=mass.length && j>=0; i++,j--)
			if (mass[i]!=mass[j])
				p=1;
		if (p==0) 
			System.out.println ("Polindrom"); else
		System.out.println ("NE Polindrom");
		//System.out.println (number1);
    } 
    public static String vvod(String[] args){
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		return n;
	}
}
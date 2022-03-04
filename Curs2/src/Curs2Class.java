import java.util.Scanner;

public class Curs2Class {
	
	public static void main(String[] args) {
	//FizzBazz();
		
	}

	public static void FizzBazz() {
		int a;
		System.out.print("dati numarul natural = ");
		 a = new Scanner(System.in).nextInt();
		 for(int i = 1; i<=a; i++)
		 {
		 if(i%3==0 && i%5==0) System.out.print("FIZZ-BUZZ");	 
		 else if(i%3==0) System.out.print("FIZZ ");
		 else if(i%5==0) System.out.print("BUZZ ");
		
		 System.out.print(i + " ");
		 }
	}
	public static void ClasaPiramida() {
		
	}

}

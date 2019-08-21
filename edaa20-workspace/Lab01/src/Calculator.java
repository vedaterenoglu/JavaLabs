import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		double nbr1 = scan.nextDouble();
		double nbr2 = scan.nextDouble();
		double sum = nbr1 + nbr2;
		double kvoten = nbr1 - nbr2;
		double multiplikation = nbr1 * nbr2;
		double divison = nbr1 / nbr2;
		System.out.println("Summan av talen är " + sum);
		System.out.println("Kvoten mellan talen är " + kvoten);
		System.out.println("Multiplikation av talen är " + multiplikation);
		System.out.println("Division av talen är " + divison);
	}
}

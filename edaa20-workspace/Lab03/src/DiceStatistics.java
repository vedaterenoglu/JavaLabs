import java.util.Random;
import java.util.Scanner;

public class DiceStatistics {
    public static void main(String[] args) {
        System.out.println("How many times do you want to try: ");
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        int dice;
        int counter = 0;
        Random rand = new Random();
        for (int i = 1; i <= times; i++) {
            dice = (rand.nextInt(6)+1);
            if (dice == 6) {
                counter += 1;
            }
            System.out.println(counter+ " " + i);

        }
    }
}

import java.util.Scanner;

public class Play {
    static int mazeNumber = 1;
    public static void main(String[] args) {
        int mnbr = getMazeNumber();
        System.out.println(mnbr);
    }

    public void test(){
        System.out.println("Test");
    }

    private static int getMazeNumber() {
        Scanner mn = new Scanner(System.in);
        System.out.println("Enter a maze number between 1 and 5");
        mazeNumber = mn.nextInt();
        return mazeNumber;
    }


}

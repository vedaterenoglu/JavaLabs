import java.util.*;

public class DiceStatisticsFull {
    public static void main(String[] args) {
        System.out.println("How many times do you want to try: ");
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        int dice;
        int diceArray [] = {0, 0, 0, 0, 0, 0, 0};
        Random rand = new Random();
        for (int i = 1; i <= times; i++) {
            dice = (rand.nextInt(6)+1);
            diceArray[0] = i;
            diceArray[dice] += 1;
        }

        for(int i = 1; i < diceArray.length; i++){
            System.out.println(i + ": " + diceArray[i] + " times");
        }

        HashMap hm = new HashMap();
        hm.put("One", diceArray[1]);
        hm.put("Two", diceArray[2]);
        hm.put("Three", diceArray[3]);
        hm.put("Four", diceArray[4]);
        hm.put("Five", diceArray[5]);
        hm.put("Six", diceArray[6]);

        // Get a set of the entries
        Set set = hm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry draw = (Map.Entry)i.next();
            System.out.print(draw.getKey() + ": ");
            System.out.println(draw.getValue() + " times");
        }
    }
}

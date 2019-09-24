public class TestUdemy {
    int sum = 0;
    public static void main (String[] args){
        System.out.println(sum(3, 5) +11);


    }
    public static int sum (int i1, int i2) {
        int result  = i1 + i2;

        return result;
    }
    public void thisSum (int i1, int i2) {
        int result  = i1 + i2;
        this.sum = result;
    }
    public void doPrint () {
        System.out.println("This sum: " + this.sum);
    }

}

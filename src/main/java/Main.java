public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String arg1 = "11";                           //3
        String arg2 = "110";                          //6
        System.out.println(bins.sum(arg1, arg2));     //9
        System.out.println(bins.mult(arg1, arg2));    //18

    }
}

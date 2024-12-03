public class TypeCast {
    public static void main(String[] args) {

        // Explicitly Casting:
        double d = 35.25;
        double dd = 35.99;
        int i = (int) d;
        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);

        // implicit Casting:
        int j = 35;
        float f = j;
        System.out.println("The number is: " + f);

        // Primitive vs Objects types:
        long start = System.currentTimeMillis();
        Integer sum = 0;
        //for (int k=0;k<Integer.MAX_VALUE;k++) {
        //sum += i;
        //}
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");

        // Test Null:
        Integer a = 10;
        int b = 10;
        a = null;
        //b = null;
    }
}
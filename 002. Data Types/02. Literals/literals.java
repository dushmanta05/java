public class literals {
    public static void main(String a[])
    {
        //literals are the values we assigned to a variable in java


        // binary
        int num = 0b111;

        // hexadecimal
        int num1 = 0xFE;

        System.out.println(num);

        // Writing numbers 
        int n = 1_00_000; // this is same as 100000, but we write this way to differentiate and calculate how many zeros are there

        // integer automatically converts to double

        double db = 56;
        System.out.println(db); // ---> 56.0

        double num2 = 12e10;
        System.out.println(num2);

        // boolean b = 1; // will give error, can't assign (0, 1) to boolean

        // char
        char c = 'a';

        // when we increment it works like normal numeric increment
        c++;
        System.out.println(c); // b
    }
}

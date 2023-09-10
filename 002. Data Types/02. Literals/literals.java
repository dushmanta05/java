public class literals {
    public static void main(String a[])
    {
        //literals are the values we assigned to a variable in java

        // binary
        int num = 0b111;
        System.out.println(num); // Output: 7, ---> here "0b" denotes it's binary format and "111" is the binary number.

        // hexadecimal
        int num1 = 0xFE;
        System.out.println(num1); // Output: 254 ---> Similarly "Ox" denotes Hexadecimal format and "FE" is the number.

        

        // Writing numbers 
        int n = 1_00_000; // this is same as 100000, but we write this way to differentiate and calculate how many zeros are there
        System.out.println(n); // Output: 100000


        // Integer automatically converts to double

        double num3 = 56;
        System.out.println(num3); // Output: 56.0

        double num2 = 12e10;
        System.out.println(num2); // Output: 1.2E11

        // boolean b = 1; // Will give error, can't assign (0, 1) to boolean

        // char
        char c = 'a';
        c++; // when we increment it works like normal numeric increment
        System.out.println(c); // Output: b

    }
}

public class conversion {

     public static void main(String a[])
    {
        // byte b = 127;
        // int i = 256;

        //Type Conversion

        // i = b; //  this is known as conversion
        // System.out.println(i);
        
        // assigning int to byte
        // b = i; // but this here will not work because we can't convert byte to int

        // but we can cast them 

        // Type Casting
        // b = (byte)i; // this is known as type casting

        // float f = 5.6f;
        // int x = (int)f;
        // System.out.println(x); // will print 5

        // int i = 257;
        // byte t = (byte)i;
        // System.out.println(t); // will print 1 because it take modulous operator while type casting
        // here i % 256 (range) is giving the results

        // Type Promotion
        byte p = 10;
        byte q = 30;
        // now if we do multiplication the multiplication will be out of range of byte 

        // Type  Promotion
        //Here we can use promotion by assigning them into a new data type
        int result = p * q; //Type promotion
        System.out.println(result);


    }
}
    

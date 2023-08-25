class Operators 
{
    public static void main(String a[])
    {   
        
        int num1 = 6;
        int num2 = 4;

        // Addition
        int add = num1 + num2;
        System.out.println(add);

        // Subtraction
        int sub = num1 - num2;
        System.out.println(sub);

        // Multiplication
        int multi = num1 * num2;
        System.out.println(multi);

        // Division
        int div = num1 / num2;
        System.out.println(div);

        // Modulous
        int mod = num1 / num2;
        System.out.println(mod);

        // we can also directly write it as
        // int num = 2;
        // num += 2; // also work for other operations
        // System.out.println(num);

        //we can increment like this

        int num = 2;
        num++; //post increment
        num--; //decrement

        ++num; // pre increment

        System.out.println(num);

        // post increment and pre increment behaves differently while assigning  values

        int result1 = ++num; //increment then fetch the value
        int result2 = num++; //fetch the value then increment
    }    
 
}

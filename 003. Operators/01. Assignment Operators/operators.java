public class operators{
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

        // We can also directly write it as
        int num3 = 2;
        num3 += 2; // Also work for other operations
        System.out.println(num3);// Output: 4

        // Increment - Decrement

        int n = 2;
        n++; // Post increment
        n--; // Post decrement
        ++n; // Pre increment
        --n; // Pre decrement

        System.out.println(n);

        // Post increment/decrement and Pre increment/decrement respectively behaves differently while assigning values

        int num = 9;
        int result1 = ++num; 
        System.out.println(result1); // Output: 10 ---> increment then fetch the value

        int result2 = num++; 
        System.out.println(result2); // Output: 9 ---> fetch the value then increment

        int result3 = --num; 
        System.out.println(result3); // Output: 8 ---> decrement then fetch the value

        int result4 = num--;
        System.out.println(result4); // Output: 9 ---> fetch the value then decrement

    }    
 
}

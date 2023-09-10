public class forLoop{
    public static void main(String[] args){
        
        // Increment 
        for(int i = 1; i <= 5; i++){
            System.out.println("Hi " + i);
        }

        // Decrement
        for (int i = 5; i >= 1 ; i--) {
            System.out.println("Hello " + i);
        }

        // Nested loops
        for (int i = 1; i <= 7 ; i++) {
            System.out.println("Day " + i);
            for (int j = 0; j <= 5 ; j++) {
                System.out.println("The time is " + j);
            }
        }

        /*
        We can also use like this

        int i = 1;
        for (; i <= 7 ;) { // Here we have to put 2 semi-colons
            System.out.println("Day " + i);
            i++;
        }
        */
        
    }
}
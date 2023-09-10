public class updatedSwitch {
    public static void main(String[] aStrings){

        // After JAVA 5 String is also supported

        String day1 = "Monday";
        switch (day1) {
            case "Saturday":
            case "Sunday":
                System.out.println("Alaram at 8 AM");
                break;

            case "Monday":
                System.out.println("Alaram at 5 AM");
                break;
        
            default:
                System.out.println("Alaram at 6 AM");
                break;
        }
        //Output: Alaram at 5 AM

        // Using Arrow instead of Colon (Introduced in Java 12)
        // By uisng arrows we can eliminate "break" keyword but we have to use arrow in all cases

        String day2 = "Tuesday";
        switch (day2) {
            case "Saturday", "Sunday" -> System.out.println("Alaram at 8 AM");

            case "Monday" -> System.out.println("Alaram at 5 AM");
        
            default -> System.out.println("Alaram at 6 AM");
        }
        // Output: "Alaram at 6 AM"

        // Switch as an expression ---> It'll return a value

        /*
        String day3 = "Sunday";
        String result = "";
        switch (day3) {
            case "Saturday", "Sunday" -> result = "Alaram at 8 AM";

            case "Monday" -> result = "Alaram at 5 AM";
        
            default -> result = "Alaram at 6 AM";
        }
        System.out.println(result); // Output: "Alaram at 8 AM"
        */

        // We can also write it as

        String day3 = "Sunday";
        String result = "";
        result = switch (day3) {
            case "Saturday", "Sunday" -> "Alaram at 8 AM";

            case "Monday" -> "Alaram at 5 AM";
        
            default -> "Alaram at 6 AM";
        };
        System.out.println(result); // Output: "Alaram at 8 AM"


        // If we want to use colon (:) instead of arrows (->) we need to use the keyword yield

        String day4 = "Sunday";
        String result2 = "";
        result2 = switch (day4) {
            case "Saturday", "Sunday" : yield "Alaram at 8 AM";

            case "Monday" : yield "Alaram at 5 AM";
        
            default : yield "Alaram at 6 AM";
        };
        System.out.println(result2); // Output: "Alaram at 8 AM"


    }
}

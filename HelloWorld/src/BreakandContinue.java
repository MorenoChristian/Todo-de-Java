public class BreakandContinue {
    public static void main(String[] agrs){

        // Examples of Break
        // this code will "jump of" of the for statement when 'i' is equal to 4

        System.out.println("Break Example");
        for (int i = 0; i <= 10; i++){
            if (i == 4){
                break;
            }
            System.out.println(i);
        }

        // Example of Continue
        // the following code will skips the values of 4, but will not break the loop

        System.out.println("Continue Example");
        for (int i = 0; i <= 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }
    }
}

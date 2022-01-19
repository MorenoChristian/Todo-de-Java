public class IfStatement {
    public static void main(String[] args){
        int time = 22;

        if (time < 10){
            System.out.println("Good Morning");;
        } else if (time < 20){
            System.out.println("Good Day");
        } else{
            System.out.println("Good Evening");
        }

        /* Ternary Operator
        It can be used to replace multiple lines of code with a single line.
        It´s often used to replace simple if-else statement*/

        /* Syntax:
            variable = (condition) ? expressionTrue : expressionFalse;  */
        
        int time2 = 22;

        String result = (time2 < 18) ? "Good Day" : "Good Evening";

        System.out.println(result);


    }
}

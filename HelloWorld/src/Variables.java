public class Variables {
    
    public static void main(String[] args){
        
        // the following code creates a variable that store String
        String name = "John";
        System.out.println(name);

        String lastname = "Johnson";
        
        String fullname = name + " " + lastname;

        System.out.println(fullname); //add a string variable to another

        // we can also creates a variable without assign it values
        int myNum;
        myNum = 15;
        System.out.println(myNum);

        // change the value of myNum
        myNum = 20;
        System.out.println(myNum); //Now myNum should store 20

        System.out.println(myNum + 15);

        //note that if you assign a new value to an existing variable, it will overwrite the previous value

        /*However, u can add the "final" keyword if u don´t want others or yourself to overwrite existing values
            this will declare the variables as "constant" or "final"*/

        final int myNum2 = 25;
        System.err.println(myNum2);

        //trying to change myNum´s value
        //myNum2 = 35;

        //a demonstration how to creates variables of other types
        int myNum3 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

    }
}

public class Strings {
    
    public static void main(String[] args){

        //String in java is actually an object, which contain methods that perform certain operation on strings like lenght() method

        String txt = "Pero mas bien loquita";
        System.out.println("The lenght of txt string is "+ txt.length());

        // ToUpper and ToLower Methods

        System.out.println("Upper Case: "+txt.toUpperCase());
        System.out.println("Lower Case: "+txt.toLowerCase());

        /* Finding a character in a String
        The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including white spaces)*/

        System.out.println("\"bien\" start at position: "+txt.indexOf("bien"));
        
        // either we can use charAt() that return the character of a string
        
        System.out.println("\"pero\" finish with the character: "+txt.charAt(3));
        
        /* Extract a substring of a string with substring()*/
        
        System.out.println("Substring: "+txt.substring(5,13));
        
        /* Using equal() method that return true if two strings are equal*/
        
        String name1 = "Jorgito";
        String name2 = "Jussepe";
        
        System.out.println("Are both name the same?: "+name1.equals(name2));

        /* Concatenate String
        The + operator can be used between string to combine them. This is called concatenation*/

        String word = "Hello";
        String word2 = "World";
        System.out.println(word + " " + word2);

        //we can also used the concat() method to concatenate two strings
        System.out.println(word.concat(word2));

        // Put a double quote inside a string without an error
        String text = "We are the so called \"Vikings\" from the north";
        System.out.println(text);

        /* Java used + operator to adittion and concatenate
        if u add two numbers, the result will be a number
        if u add two strings, the result will be a string
        if u add a int and a string, the result wiil be a string*/
    }
}

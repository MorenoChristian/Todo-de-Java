public class Math_Library {
    public static void main(String[] args){

        //Math.max(x,y) can be used to find the highest value of x and y
        int x = 16;
        int y = 11;
        System.out.println("The highest number between 15 and 11 is: " + Math.max(x, y));

        //Math.min(x,y) can be used to find the lower value of x and y
        System.out.println("The lower number between 15 and 11 is: " + Math.min(x, y));

        //Math.sqrt() returns the square root of x
        System.out.println("The square root of 16 is: " + Math.sqrt(x));

        //Math.abs() method return the absolute (positive) of x
        System.out.println(Math.abs(-4.25));

        //Math.random() method return a random rumber between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println("Random numbre between 0.0 and 1.0: " + Math.random());

        // if we want to get more control over the random number, use the following formula
        int random_number = (int) (Math.random() * 101); // 0 to 100

        System.out.println("Random number between 0 and 100: " + random_number);
        
        // With round() method we get 
        
        double j = 5.86;
        
        System.out.println(Math.round(j));
    }    
}

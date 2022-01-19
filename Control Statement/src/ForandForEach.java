public class ForandForEach {
    public static void main(String[] args){

        //the code below print the number 0 to 4

        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

         //the following code print each element of cars array using For

         String [] cars = {"Volvo", "BMW", "Chevrolet", "Toyota"};

         for (int i = 0; i < cars.length; i++){
             System.out.println(cars[i]);
         }

        //the following code print each element of cars array using For-Each

        String [] cars2 = {"Volvo", "BMW", "Chevrolet", "Toyota"};

        for (String car : cars2){
            System.out.println(car);
        }

        //Multi-dimension array
        System.out.println("Multi dimensional array");
        int [][] number_array = {{1, 2, 3, 4, 5} , {6, 7, 8, 9}};

        for (int i = 0; i < number_array.length; i++){
            for (int j = 0; j < number_array[i].length; j++){
                System.out.println(number_array[i][j]);
            }
        }
    }
}

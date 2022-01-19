import javax.swing.JOptionPane;

public class SwitchStatement {
    public static void main(String[] args){
        
        // the example below uses the weekday number to calculate the weekday name
         
        int day = 5;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(("Pero mas bien loquita"));
        }
        
        // the following example works with a "figure" variable
        
        String figure = JOptionPane.showInputDialog("Type a figure name as (square, triangle, circle or rectangle: ");
        String car = figure.substring(0,1).toUpperCase() + figure.substring(1);
        //String car = figure.substring(1);
        System.out.println(car);
        
        switch (car) {
        	case "Square":
        		float side = Float.parseFloat(JOptionPane.showInputDialog("Input the square´s side: "));
        		System.out.println("The are of the square is: "+(Math.pow(side, 2)));
        		break;
        	
        	case "Triangle":
        		double height = Double.parseDouble(JOptionPane.showInputDialog("Input the triangle height: "));
        		double width = Double.parseDouble(JOptionPane.showInputDialog("Input the triangle width: "));
        		
        		System.out.println("The Triangle´s area is: "+((height * width) / 2));
        }
        
    }
}

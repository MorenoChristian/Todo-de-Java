public class TypeCasting {
    
    public static void main(String[] args){
        
        /*Widening Casting -- Ensanchamiento
        Widening casting is done automatically when passing a small size type to a larger size type*/ 
        int myNum = 15;
        double doublenum = myNum; //automatic casting: int to double

        System.out.println(myNum);
        System.out.println(doublenum);

        /*Narrowing Casting -- Estrechamiento
        this is must be done manually by placing the type in parentheses in front of the variable*/
        double num = 20;
        int myInt = (int) num; //manually casting: double to int

        System.out.println(num);
        System.out.println(myInt);

    }
}

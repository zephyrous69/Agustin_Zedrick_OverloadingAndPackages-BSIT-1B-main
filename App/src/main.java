public class main {

    private static int sum2(int num1, int num2){
        return num1 + num2;
    }


    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    private static int greaterValue (int num1, int num2){
        if (num1<num2){
            return num2;
        }else{
            return num1;
        }
    }

    private static double greaterValue(double num1, double num2){
        if (num1 < num2){
            return num1;
        }else{
            return num1;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}
import java.io.InputStream;

public class homeWork2 {

    public static void main (String [] Args){

        boolean check2 = checkForNumb(5,7);
        System.out.println(check2);
        whatNumber(0);
        System.out.println();
        boolean count2 = negativOrPositive(-5);
        System.out.println(count2);
        System.out.println();
        printString("Строка", 5);
        System.out.println();
        boolean b = checkForYear(2404);
        System.out.println(b);




    }
    private static boolean checkForNumb (int a, int b){
        boolean check;
        if ((a + b) >= 10 && (a + b) <= 20) {
            check = true;
        } else check = false;
        return check;
    }
    private static void whatNumber (int a) {
        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число нечетное");

    }
    private static boolean negativOrPositive (int a) {
        boolean count = true;
        if (a <= 0) {
            count = true;
        } else count = false;
        return count;
    }
    private static void printString (String a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    private static boolean checkForYear (int a) {
        boolean b = false;

        if (a % 400 == 0) {
            b = true;
        } else if (a % 100 == 0) {
            b = false;
        } else if (a % 4 == 0) {
            b = true;
        } else b = false;
        return b;
    }





    }

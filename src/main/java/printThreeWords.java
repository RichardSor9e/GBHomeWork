
import java.util.Arrays;


public class printThreeWords {


    public static void main (String [] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords (){
        String fruit1 = "Orange";
        String fruit2 = "Banana";
        String fruit3 = "Apple";
        System.out.println(fruit1 + "\n" + fruit2 + "\n" + fruit3);
    }
    public static void checkSumSign () {
        int a = -10;
        int b = 5;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }
    public static void printColor () {
        int value = 1000;
        if (value <= 0) {
            System.out.println("Красный");}
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");}
        else
            System.out.println("Зеленый");

    }
    public static void compareNumbers () {
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");}
        else System.out.println("a < b");
    }
}
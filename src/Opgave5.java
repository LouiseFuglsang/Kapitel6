import java.util.Scanner;

public class Opgave5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv tre forskellige decimaltal");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

    displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){

        if(num1 > num2 && num1 > num3 && (num2 > num3))
                System.out.println("Tallene er i faldende rækkefølge " + num1 + " " + num2 + " " + num3);
            else if (num1 > num2 && num1 > num3 && (num3 > num2))
                System.out.println("Tallene er i faldende rækkefølge " + num1 + " " + num3 + " " + num2);

            else if (num2 > num1 && num2 > num3 && (num1 > num3))
                System.out.println("Tallene er i faldende rækkefølge " + num2 + " " + num1 + " " + num3);
            else if (num2 > num1 && num2 > num3 && (num3 > num1))
                System.out.println("Tallene er i faldende rækkefølge " + num2 + " " + num3 + " " + num1);

            else if (num3 > num1 && num3 > num2 && (num1 > num2))
                System.out.println("Tallene er i faldende rækkefølge " + num3 + " " + num1 + " " + num2);
            else if (num3 > num1 && num3 > num2 && (num2 > num1))
                System.out.println("Tallene er i faldende rækkefølge " + num3 + " " + num2 + " " + num1);

            else System.out.println("Du skal skrive tre forskellige decimaltal");

        }
}
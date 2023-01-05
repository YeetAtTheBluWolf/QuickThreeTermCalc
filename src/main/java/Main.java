import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner scan = new Scanner(System.in);
            System.out.println("What is the first term(If the term is just x then enter 0 and don't add a x): ");
            int firstTerm = scan.nextInt();
            System.out.print("What is the middle term: ");
            int secondTerm = scan.nextInt();
            System.out.print("What is the third term: ");
            int thirdTerm = scan.nextInt();

            ThreeTermCalc threeTermCalc = new ThreeTermCalc(firstTerm, secondTerm, thirdTerm);
            threeTermCalc.Calc();

        } catch(Exception exception) {
            System.out.println(exception);
        }
    }

}

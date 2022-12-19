import java.util.Scanner;
public class HandleException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number less than 10: ");
            int a = sc.nextInt();

            if (a < 10) {
                System.out.println("Your number is = " + a);
            } else {
                throw new MyException("Invalied Data");
            }
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
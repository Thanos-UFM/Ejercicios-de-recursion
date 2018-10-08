import java.awt.event.InputEvent;
import java.util.Scanner;
public class Ejercicio4 {
    static int pow( int i, int n2, int res ) {
        if (i < n2) {
            res = res * pow(i+1, n2, res);
        }
        else if ( n2 == 0 ) {
            res = 1;
        }
        return res;
    }

	public static void main(String[] args) {
        System.out.println("Ingrese dos numeros, el primero es la base y el segundo la potencia");
        Scanner input = new Scanner(System.in);
        int num1, num2, r, i;
        i = 1;
        num1 = input.nextInt();
        num2 = input.nextInt();
        r = pow(i, num2, num1);
        System.out.println("resultado" + r);
        input.close();
    }
}
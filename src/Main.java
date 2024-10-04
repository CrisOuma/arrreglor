import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int [] numbers = new int[20];
        int [] cuadrado = new int[20];
        int [] cubo = new int[20];

        for(int i = 0; i < 20; i++){

            System.out.println("inserte 20 números 1 por 1: ");
            numbers[i] = teclado.nextInt();
            cuadrado[i] = numbers[i] * numbers[i];
            cubo[i] = cuadrado[i] * numbers[i];

        }

        for(int i = 0; i < 20; i++){
            System.out.println("De el número: " + numbers[i] + " tenemos que su cuadrado es: " + cuadrado[i] + " y que su cubo es: " + cubo[i]);
        }
    }
}
import java.util.Scanner;

public class CalculadorDespacho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: ");
        int compra = scanner.nextInt();
        
        System.out.print("Ingrese la distancia en kilometros: ");
        int distancia = scanner.nextInt();

        int totalPorKilometro;
        if (compra >= 25000 && compra <= 50000) {
            totalPorKilometro = 150;
        } else if (compra < 25000) {
            totalPorKilometro = 300;
        } else {
            totalPorKilometro = 0;
        }

        int totalEnvio = distancia * totalPorKilometro;
        int totalCompraConEnvio = compra + totalEnvio;

        System.out.println("Total por kilometro: " + totalPorKilometro);
        System.out.println("Total envio: " + totalEnvio);
        System.out.println("Total compra con envio: " + totalCompraConEnvio);
        
        scanner.close(); // Es una buena práctica cerrar el scanner
    }
}

import java.util.Scanner;

public class Main {
    static String nombre;
    static String clase;
    static int claseEscogida;

    public static void main(String[] args) throws InterruptedException {
        Scanner print = new Scanner(System.in);

        String[] arrayEnemigos = {"Ogro", "Goblin", "Mago oscuro", "Slime", "Arbol encantado"};
        String[] arrayRecompensas = {"Poción de vida", "Poción mágica", "Poción de daño", "Poción de daño extremo"};
        String[] arrayInventario = new String[10];
        String[] arrayInteraccion = {"normal", "normal", "normal", "esquivo", "critico"};
        String[] arrayClase = {"Mago", "Guerrero", "Guerrero magico", "Elfo", "Alquimista"};


        System.out.println("============ Bienvenido al juego RPG ============");
        Thread.sleep(1000);
        // SECCION PRINCIPAL

        System.out.println("\n\nComo quieres llamar a tu personaje?");
        nombre = print.nextLine();

        escogerClase(arrayClase, print);
        Personaje.datosClase(claseEscogida);
    }

    public static String escogerClase(String[] arrayClase, Scanner print) {
        System.out.println("\n\nQue clase quieres que sea tu personaje?");
        for (int i = 0; i < arrayClase.length; i++) {
            System.out.println(i + " - " + arrayClase[i]);
        }

        claseEscogida = print.nextInt();

        switch (claseEscogida) {
            case 0:
                System.out.println("Has escogido la clase: Mago"); return clase = "Mago";
            case 1:
                System.out.println("Has escogido la clase: Guerrero"); return clase = "Guerrero";
            case 2:
                System.out.println("Has escogido la clase: Guerrero Magico"); return clase = "Guerrero Magico";
            case 3:
                System.out.println("Has escogido la clase: Elfo"); return clase = "Elfo";
            case 4:
                System.out.println("Has escogido la clase: Alquimista"); return clase = "Alquimista";
            default:
                System.out.println("Opción inválida, por defecto se escoge la clase: Mago"); return clase = "Mago";
        }
    }
}

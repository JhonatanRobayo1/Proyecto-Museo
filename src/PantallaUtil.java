public class PantallaUtil {
    // se crea esta clase para ir limpiando la pantalla dependiendo de la consola
    public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {// si la consola es en windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");// si la consola es por linux
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla.");
        }
    }
}

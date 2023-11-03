
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AdminPalabrasSecretas {
     public static List<String> palabras = new ArrayList<>();

    public void agregarPalabra(String palabra) {
        palabras.add(palabra);
    }

    public String seleccionarPalabraAzar() {
        if (palabras.isEmpty()) {
            return "No hay palabras disponibles" ;// Puedes manejar esto de manera más elegante en tu aplicación
        }
        Random random = new Random();
        return palabras.get(random.nextInt(palabras.size()));
    }
}

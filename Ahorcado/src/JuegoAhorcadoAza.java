
import java.util.List;
import java.util.Random;


public class JuegoAhorcadoAza extends JuegoAhorcadoBase {
    public static List<String> palabrasPosibles= AdminPalabrasSecretas.palabras;

    public JuegoAhorcadoAza() {
        inicializarPalabraSecreta();
        intentos=6;
        palabraActual = "_ ".repeat(palabraSecreta.length());
    }
    @Override
    public void actualizarPalabraActual(char letra){
       String nuevaPalabraActual = "";
    for (int i = 0; i < super.palabraSecreta.length(); i++) {
        if (super.palabraSecreta.charAt(i) == letra) {
            nuevaPalabraActual += letra;
        } else {
            nuevaPalabraActual += palabraActual.charAt(i);
        }
    }
    palabraActual = nuevaPalabraActual;  
    }
    @Override
    boolean verificarLetra(char letra) {
        return palabraSecreta.contains(String.valueOf(letra));
    }

    @Override
    boolean hasGanado() {
        return palabraActual.equals(palabraSecreta);
    }

    @Override
    public void inicializarPalabraSecreta() {
        Random random = new Random();
        palabraSecreta = palabrasPosibles.get(random.nextInt(palabrasPosibles.size()));
        
        
    }

    @Override
    public void jugar() {
       
    }

}

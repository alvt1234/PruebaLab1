

public class JuegoAhorcadoFijo extends JuegoAhorcadoBase{

   

    public JuegoAhorcadoFijo(String palabrasecreta) {
        palabraSecreta = palabrasecreta;
        this.intentos = 6; 
        this.palabraActual = "_ ".repeat(palabrasecreta.length());
    }

   
    @Override
    public void actualizarPalabraActual(char letra){
       String nuevaPalabraActual = "";
    for (int i = 0; i < palabraSecreta.length(); i++) {
        if (palabraSecreta.charAt(i) == letra) {
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
       
    }

    @Override
    public void jugar() {
       
    }
}
        


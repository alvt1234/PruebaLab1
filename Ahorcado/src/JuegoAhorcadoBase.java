
public abstract  class JuegoAhorcadoBase implements JuegoAhorcado{
    protected String palabraSecreta;
    protected String palabraActual;
    protected int intentos;
    
    abstract void actualizarPalabraActual(char letra);
    abstract boolean verificarLetra(char letra);
    abstract boolean hasGanado();

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public String getPalabraActual() {
        return palabraActual;
    }

    public int getIntentos() {
        return intentos;
    }
    
}

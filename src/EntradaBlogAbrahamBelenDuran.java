/**
 * Clase para manejar las entradas de un blog.
 * @author Abraham Belén Durán
 * @version V1.0
 * @since 2023-02-14
 */

public class EntradaBlogAbrahamBelenDuran {

    /**
     * separador es el ccarácter que separa ENTRADA DE del nombre del autor
     */
    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase
     *
     * @param id    Recibe el número de entrada
     * @param autor Recibe el nombre del autor
     * @param texto Recibe el texto que contiene la entrada
     * @throws IllegalArgumentException Si el número de entrada es negativo o cero, lanza una excepción.
     */

    public EntradaBlogAbrahamBelenDuran(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    /**
     * @return Devuelve toda la cadena de texto unida.
     */
    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + getId() + " " + getAutor();
        cad += "\n " + getTexto();
        return cad;
    }

    /**
     * @return Devuelve el número de la entrada
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return Devuelve el texto completo de la entrada
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     * @return Devuelve el nombre del autor de la entrada en mayúsculas
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }

    /**
     * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor. Se podría eliminar del código.
     */
    public String devuelveAutor() {
        return this.autor;
    }

    /**
     * @param args No tiene porqué tener argumentos.
     */
    public static void main(String[] args) {
        EntradaBlogAbrahamBelenDuran e1 = new EntradaBlogAbrahamBelenDuran(3, "Abraham Belén Durán", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1.toString());
    }
}


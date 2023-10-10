package myaplicacion.ejemplo.ejemploapp;

public class Animal {

    public String nombre;
    public String tipo;
    public int edad;

    public Animal() {
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

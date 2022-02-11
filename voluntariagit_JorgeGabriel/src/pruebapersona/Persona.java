
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapersona;
import java.util.regex.Pattern;
/*comentario nuevo de la clase persona*/
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    static final int mayoriaEdad = 18;

    public Persona() {
       // System.out.println("SE ESTÃ? EJECUTANDO EL CONSTRUCTOR POR DEFECTO, PORQUE SI!!!!!!!");
    }
    
    
    Persona(String nombrePers, String apellidosPers, int edadPers){
        this();
        this.nombre = nombrePers;
        this.apellidos = apellidosPers;
        this.edad = edadPers;
        this.dni = "NO TIENE";
        
    }
    
    
    
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this();
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad; 
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

        
        
    
}

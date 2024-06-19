package com.miproyectos.app;
import com.miproyectos.app.hogar.Gato;
import com.miproyectos.app.hogar.Persona;
import com.miproyectos.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        // com.miproyectos.app.hogar.Persona persona = new com.miproyectos.app.hogar.Persona();

        Persona persona = new Persona();
        persona.nombre = "Felip";
        System.out.println(persona.nombre);

        Gato gato = new Gato();
        String nombreGato = gato.nombre;
        System.out.println("nombreGato = " + nombreGato);
    }
}

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
        
        // la clase Perro está en este mismo package, por ende no hay que importar
        Perro perro = new Perro();
        perro.nombre = "Firulais";
        System.out.println("nombre perro = " + perro.nombre);
        perro.raza = "Pator Aleman";
        System.out.println("raza perro = " + perro.raza);
    }
}

package com.miproyectos.app.jardin;
import com.miproyectos.app.jardin.Perro;
//import com.miproyectos.app.hogar.Gato;
import com.miproyectos.app.hogar.*;

import static com.miproyectos.app.hogar.Persona.GENERO_FEMENINO;
import static com.miproyectos.app.hogar.Persona.GENERO_MASCULINO;
import static com.miproyectos.app.hogar.Persona.saludar;
// import static com.miproyectos.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        // com.miproyectos.app.hogar.Persona persona = new com.miproyectos.app.hogar.Persona();

        Persona persona = new Persona();
        persona.setNombre("Felipe");
        persona.setColorPelo(ColorPelo.CAFE);
        System.out.println("persona = " + persona);
        System.out.println(persona.getNombre());


        Gato gato = new Gato();
        String nombreGato = gato.nombre;
        System.out.println("nombreGato = " + nombreGato);
        
        // la clase Perro está en este mismo package, por ende no hay que importar
        Perro perro = new Perro();
        perro.nombre = "Firulais";
        System.out.println("nombre perro = " + perro.nombre);
        perro.raza = "Pator Aleman";
        System.out.println("raza perro = " + perro.raza);

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);
        
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;

    }
}

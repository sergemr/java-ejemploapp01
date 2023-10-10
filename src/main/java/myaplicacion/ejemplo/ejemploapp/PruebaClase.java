package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/getClassInfo")
public class PruebaClase {

    @GetMapping
    public String systemInfo() {
        // You can add any information about your endpoints here
        // For simplicity, we'll use a single string as an example
        Animal myAnimal = new Animal();
        myAnimal.setNombre("Perro");
        myAnimal.setEdad(5);
        myAnimal.setTipo("5");

        System.out.println("Hola mundo");
        System.out.println(myAnimal.getNombre());
        return "system_info2";
    }

}

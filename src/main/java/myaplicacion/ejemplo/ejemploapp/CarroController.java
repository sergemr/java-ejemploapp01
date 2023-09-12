package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Coche {
    String marca;
    int año;

    String arrancar() {
        return "El auto está arrancando...";
    }
}

@RestController
@RequestMapping("/carro")
public class CarroController {

    @GetMapping
    public String getCarro() {
        Coche miCoche = new Coche();
        miCoche.marca = "Toyota";
        miCoche.año = 2022;

        // Lla/mar al método arrancar
        return miCoche.arrancar();
    }
}

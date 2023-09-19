package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Coche {
    String marca;
    int año;

    String arrancar() {
        return "El auto está arrancando...";
    }

    String getMarca() {
        return "El auto :" + marca;
    }
}

class Deportivo extends Coche {
    boolean esDeportivo;
    double velocidadMaxima;

    void acelerar() {
        System.out.println("Acelerando el deportivo...");
    }

    String activarModoDeportivo() {
        return "Acelerando el deportivo...";
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
        return miCoche.getMarca();
    }

    @PostMapping
    public String getCarroP() {
        Coche miCoche = new Coche();
        miCoche.marca = "Toyota";
        miCoche.año = 2022;

        // Lla/mar al método arrancar
        return "miCoche.getMarca()";
    }

    @GetMapping("/deportivo")
    public String getDeportivo() {
        Deportivo miDeportivo = new Deportivo();
        miDeportivo.marca = "Ferrari";
        miDeportivo.año = 2023;
        miDeportivo.esDeportivo = true;
        miDeportivo.velocidadMaxima = 250.0;
        System.out.println("Acelerando el deportivo..." + miDeportivo.getMarca());
        System.out.println("Acelerando el deportivo..." + miDeportivo.activarModoDeportivo());

        // Llamar al método arrancar del coche deportivo
        return miDeportivo.activarModoDeportivo();
    }
}

package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shape")
public class ShapeController {
    // Clase base (superclase)
    class Figura {
        double area() {
            return 0.0;
        }
    }

    // Clases derivadas (subclases)
    class Circulo extends Figura {
        double radio;

        Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        double area() {
            return Math.PI * radio * radio;
        }
    }

    class Cuadrado extends Figura {
        double lado;

        Cuadrado(double lado) {
            this.lado = lado;
        }

        @Override
        double area() {
            return lado * lado;
        }
    }

    @GetMapping("/circle")
    public double calculateCircleArea(@RequestParam double radius) {
        Circulo circle = new Circulo(radius);
        return circle.area();
    }

    @GetMapping("/square")
    public double calculateSquareArea(@RequestParam double side) {
        Cuadrado square = new Cuadrado(side);
        return square.area();
    }
}

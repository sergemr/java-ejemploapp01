package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shape")
public class ShapeController {
    // Clase base (superclase)
    class Figura {
        String nombre;

        double area() {
            return 0.0;
        }
    }

    // Clases derivadas (subclases)
    class Circulo extends Figura {
        double radio;

        Circulo(String nombre, double radio) {
            this.radio = radio;
            this.nombre = nombre;
        }

        @Override
        double area() {
            return Math.PI * radio * radio;
        }

        String get() {
            return "" + this.nombre + "" + Math.PI * radio * radio;
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
    public String calculateCircleArea(@RequestParam double radius) {
        Circulo circle = new Circulo("Mi Circulo", radius);
        return circle.get();
    }

    @GetMapping("/square")
    public double calculateSquareArea(@RequestParam double side) {
        Cuadrado square = new Cuadrado(side);
        return square.area();
    }
}

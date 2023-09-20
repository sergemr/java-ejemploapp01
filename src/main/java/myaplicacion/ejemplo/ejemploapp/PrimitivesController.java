package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primitives")
public class PrimitivesController {

    @GetMapping("/int")
    public int getIntExample() {
        return 42;
    }

    @GetMapping("/double")
    public double getDoubleExample() {
        return 3.14159;
    }

    @GetMapping("/boolean")
    public boolean getBooleanExample() {
        return true;
    }

    @GetMapping("/char")
    public char getCharExample() {
        return 'A';
    }

    @GetMapping("/string")
    public String getStringExample() {
        return "Hello, World!";
    }
}

package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/data-structures")
public class DataStructuresController {

    private final List<String> stringList = new ArrayList<>();
    private final Queue<String> stringQueue = new LinkedList<>();
    private final Stack<String> stringStack = new Stack<>();
    private final Map<String, String> stringMap = new HashMap<>();
    private final List<Person> personList = new ArrayList<>();

    @GetMapping("/{data_structure_item}")
    public Object getDataStructureInfo(@PathVariable String data_structure_item) {
        switch (data_structure_item) {
            case "list":
                return stringList;
            case "queue":
                return stringQueue;
            case "stack":
                return stringStack;
            case "map":
                return stringMap;
            case "person":
                return personList;
            default:
                return "Data structure not found.";
        }
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person) {
        personList.add(person);
        return person;
    }

    @GetMapping("/personShow")
    public Person getMockedPerson() {
        // Create and return a mocked Person with made-up values
        Person newPerson = new Person("John", "Doe", "12345");
        personList.add(newPerson);
        return new Person("John", "Doe", "12345");
    }
}

package myaplicacion.ejemplo.ejemploapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private DatabaseService databaseService; // Inject DatabaseService here

    @GetMapping
    public String getStatus() {
        boolean isDatabaseConnected = databaseService.isDatabaseConnected();
        if (isDatabaseConnected) {
            return "Database Connection Successful";
        } else {
            return "Database Connection Failed";
        }
    }
}

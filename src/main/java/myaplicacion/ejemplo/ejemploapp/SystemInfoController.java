package myaplicacion.ejemplo.ejemploapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/getSystemInfo")
public class SystemInfoController {

    @GetMapping
    public String systemInfo(Model model) {
        // You can add any information about your endpoints here
        // For simplicity, we'll use a single string as an example
        String endpointInfo = "This is a simple Swagger-like page for your endpoints.";
        model.addAttribute("endpointInfo", endpointInfo);
        return "system_info";
    }

}

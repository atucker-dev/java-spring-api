package mai.javaspring.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApiController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/config")
    public Map<String, String> getConfig() {
        return Map.of("appName", appName);
    }
}
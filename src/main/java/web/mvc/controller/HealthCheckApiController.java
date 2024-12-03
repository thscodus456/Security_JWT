package web.mvc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckApiController {

    @GetMapping("/check")
    public ResponseEntity check() {
        return ResponseEntity.ok().body("Success Health Check");
    }
}

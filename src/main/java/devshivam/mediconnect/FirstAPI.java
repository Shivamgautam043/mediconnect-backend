package devshivam.mediconnect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPI {
    @GetMapping("/hello-neo-2")
    public String firstFunction(){
        return "Hello Neo ,Ready to meet Shivam?";
    }
}


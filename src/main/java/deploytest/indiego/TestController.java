package deploytest.indiego;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("/")
    public String hello() {

        System.out.println("제발 되라고");
        System.out.println("이번에 안되면 바지에");

        return "hello!";
    }
}

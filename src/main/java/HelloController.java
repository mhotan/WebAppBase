import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Michael Hotan, mhotan@tableausoftware.com, 2014.
 *
 * Example of Simple Rest Controller for incoming Web Request.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World via REST API!";
    }

}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by deep on 11/3/14.
 */
@Controller
@RequestMapping("/hello-world")
public class helloWorldController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    GreetingMsg sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return new GreetingMsg(counter.incrementAndGet(), String.format(template, name));
    }
}

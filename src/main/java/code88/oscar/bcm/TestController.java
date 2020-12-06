package code88.oscar.bcm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping(value ="test/api", method = RequestMethod.GET)
   public String HelloWordl() {
       return "Hi Im Oscar";
   }

}

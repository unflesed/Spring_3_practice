package practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    @GetMapping(value = "/inputdata")
    public ModelAndView car() {
        return new ModelAndView("inputdata", "command", new Car());
    }

    @PostMapping(value = "/addCar")
    public String addCar(@ModelAttribute("SpringWeb")Car car, ModelMap model) {
        model.addAttribute("mark", car.getMark());
        model.addAttribute("speed", car.getMaxSpeed());
        model.addAttribute("year", car.getYear());

        return "outputdata";
    }

    @GetMapping(value = "/addNewCar/{mark}&{maxSpeed}&{year}")
    public String addNewCar(@ModelAttribute("SpringWeb") Car car, ModelMap model){
        model.addAttribute("mark", car.getMark());
        model.addAttribute("speed", car.getMaxSpeed());
        model.addAttribute("year", car.getYear());

        return "outputdata";
    }
}

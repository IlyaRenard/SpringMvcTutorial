package by.gavrilik.springmvctutorial.controller;


import by.gavrilik.springmvctutorial.model.Advertisement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdvertisementController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "/index";
    }

    @RequestMapping(value = "advertisement", method = RequestMethod.GET)
    public ModelAndView advertisement(){
        return new ModelAndView("advertisement","command", new Advertisement());
    }

    public String addAdvertisement(@ModelAttribute("dispatcher") Advertisement advertisement,
                                   ModelMap model){
        model.addAttribute("id", advertisement.getId());
        model.addAttribute("name", advertisement.getName());
        model.addAttribute("description", advertisement.getDescription());
        model.addAttribute("rating", advertisement.getRating());

        return "result";
    }
}

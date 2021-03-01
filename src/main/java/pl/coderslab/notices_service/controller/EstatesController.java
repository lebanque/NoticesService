package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.notices_service.model.sections.Estates;
import pl.coderslab.notices_service.repository.EstatesRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/estates")
public class EstatesController {

    private final EstatesRepository estatesRepository;

    public EstatesController(EstatesRepository estatesRepository) {
        this.estatesRepository = estatesRepository;
    }

    @RequestMapping("/all")
    public String showAllEstates(Model model) {
        List<Estates> estatess = estatesRepository.findAllByOrderByCreatedDesc();
        model.addAttribute("estates", estatess);
        return "estates/estatesBasicView";
    }

    @GetMapping("/add")
    public String getAddEstates(Estates estates, Model model) {
        return "estates/estatesAdd";
    }

    @PostMapping("/add")
    public String postAddEstates(@Valid Estates estates, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        estatesRepository.save(estates);
        return "redirect:/estates/all";
    }

    @GetMapping("/edit/{id}")
    public String getEditEstates(@PathVariable Long id, Model model) {
        model.addAttribute("estates", estatesRepository.findById(id));
        return "estates/estatesEdit";
    }

    @PostMapping("/edit/{id}")
    public String postEditEstates(@Valid Estates estates, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        estatesRepository.save(estates);
        return "redirect:/estates/all";
    }

    @RequestMapping("/delete/{id}")
    public String deleteEstates(@PathVariable Long id) {
        estatesRepository.deleteById(id);
        return "redirect:/estates/all";
    }
}

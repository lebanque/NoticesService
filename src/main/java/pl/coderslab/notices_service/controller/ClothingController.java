package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.notices_service.model.sections.Clothing;
import pl.coderslab.notices_service.repository.ClothingRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/clothing")
public class ClothingController {

    private final ClothingRepository clothingRepository;

    public ClothingController(ClothingRepository clothingRepository) {
        this.clothingRepository = clothingRepository;
    }

    @RequestMapping("/all")
    public String showAllClothing(Model model) {
        List<Clothing> clothings = clothingRepository.findAllByOrderByCreatedDesc();
        model.addAttribute("clothing", clothings);
        return "clothing/clothingBasicView";
    }

    @GetMapping("/add")
    public String getAddClothing(Clothing clothing, Model model) {
        return "clothing/clothingAdd";
    }

    @PostMapping("/add")
    public String postAddClothing(@Valid Clothing clothing, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        clothingRepository.save(clothing);
        return "redirect:/clothing/all";
    }

    @GetMapping("/edit/{id}")
    public String getEditClothing(@PathVariable Long id, Model model) {
        model.addAttribute("clothing", clothingRepository.findById(id));
        return "clothing/clothingEdit";
    }

    @PostMapping("/edit/{id}")
    public String postEditClothing(@Valid Clothing clothing, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        clothingRepository.save(clothing);
        return "redirect:/clothing/all";
    }

    @RequestMapping("/delete/{id}")
    public String deleteClothing(@PathVariable Long id) {
        clothingRepository.deleteById(id);
        return "redirect:/clothing/all";
    }
}

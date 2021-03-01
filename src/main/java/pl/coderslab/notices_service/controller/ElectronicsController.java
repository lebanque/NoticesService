package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.notices_service.model.sections.Electronics;
import pl.coderslab.notices_service.repository.ElectronicsRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/electronics")
public class ElectronicsController {

    private final ElectronicsRepository electronicsRepository;

    public ElectronicsController(ElectronicsRepository electronicsRepository) {
        this.electronicsRepository = electronicsRepository;
    }

    @RequestMapping("/all")
    public String showAllElectronics(Model model) {
        List<Electronics> electronicss = electronicsRepository.findAllByOrderByCreatedDesc();
        model.addAttribute("electronics", electronicss);
        return "electronics/electronicsBasicView";
    }

    @GetMapping("/add")
    public String getAddElectronics(Electronics electronics, Model model) {
        return "electronics/electronicsAdd";
    }

    @PostMapping("/add")
    public String postAddElectronics(@Valid Electronics electronics, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        electronicsRepository.save(electronics);
        return "redirect:/electronics/all";
    }

    @GetMapping("/edit/{id}")
    public String getEditElectronics(@PathVariable Long id, Model model) {
        model.addAttribute("electronics", electronicsRepository.findById(id));
        return "electronics/electronicsEdit";
    }

    @PostMapping("/edit/{id}")
    public String postEditElectronics(@Valid Electronics electronics, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        electronicsRepository.save(electronics);
        return "redirect:/electronics/all";
    }

    @RequestMapping("/delete/{id}")
    public String deleteElectronics(@PathVariable Long id) {
        electronicsRepository.deleteById(id);
        return "redirect:/electronics/all";
    }
}

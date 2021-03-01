package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.notices_service.model.specifics.Localization;
import pl.coderslab.notices_service.repository.LocalizationRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/localization")
public class LocalizationController {

    private final LocalizationRepository localizationRepository;

    public LocalizationController(LocalizationRepository localizationRepository) {
        this.localizationRepository = localizationRepository;
    }

    @RequestMapping("/all")
    public String showAllLocalization(Model model) {
        List<Localization> localizations = localizationRepository.findAll();
        model.addAttribute("localization", localizations);
        return "admin/localization/localizationBasicView";
    }

    @GetMapping("/add")
    public String getAddLocalization(Localization localization, Model model) {
        return "admin/localization/localizationAdd";
    }

    @PostMapping("/add")
    public String postAddLocalization(@Valid Localization localization, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        localizationRepository.save(localization);
        return "redirect:/admin/localization/all";
    }
    @RequestMapping("/delete/{id}")
    public String deleteLocalization(@PathVariable Long id) {
        localizationRepository.deleteById(id);
        return "redirect:/admin/localization/all";
    }
}

package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.notices_service.model.specifics.Brand;
import pl.coderslab.notices_service.repository.BrandRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/brand")
public class BrandController {

    private final BrandRepository brandRepository;

    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @RequestMapping("/all")
    public String showAllBrand(Model model) {
        List<Brand> brands = brandRepository.findAll();
        model.addAttribute("brand", brands);
        return "admin/brand/brandBasicView";
    }

    @GetMapping("/add")
    public String getAddBrand(Brand brand, Model model) {
        return "admin/brand/brandAdd";
    }

    @PostMapping("/add")
    public String postAddBrand(@Valid Brand brand, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        brandRepository.save(brand);
        return "redirect:/admin/brand/all";
    }
    @RequestMapping("/delete/{id}")
    public String deleteBrand(@PathVariable Long id) {
        brandRepository.deleteById(id);
        return "redirect:/admin/brand/all";
    }
}

package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.notices_service.model.specifics.ProductModel;
import pl.coderslab.notices_service.repository.ProductModelRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("admin/productModel")
public class ProductModelController {

    private ProductModelRepository productModelRepository;

    public ProductModelController(ProductModelRepository productModelRepository) {
        this.productModelRepository = productModelRepository;
    }

    @RequestMapping("/all")
    public String showAllProductModel(Model model) {
        List<ProductModel> productModels = productModelRepository.findAll();
        model.addAttribute("productModel", productModels);
        return "admin/productModel/productModelBasicView";
    }

    @GetMapping("/add")
    public String getAddProductModel(ProductModel productModel, Model model) {
        return "admin/productModel/productModelAdd";
    }

    @PostMapping("/add")
    public String postAddProductModel(@Valid ProductModel productModel, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        productModelRepository.save(productModel);
        return "redirect:/admin/productModel/all";
    }
    @RequestMapping("/delete/{id}")
    public String deleteProductModel(@PathVariable Long id) {
        productModelRepository.deleteById(id);
        return "redirect:/admin/productModel/all";
    }
}

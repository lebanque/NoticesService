package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.notices_service.repository.*;

@Controller
public class HomeController {

    private final AutomotiveRepository automotiveRepository;
    private final BrandRepository brandRepository;
    private final ClothingRepository clothingRepository;
    private final ContactRepository contactRepository;
    private final ElectronicsRepository electronicsRepository;
    private final EstatesRepository estatesRepository;
    private final LocalizationRepository localizationRepository;
    private final ProductModelRepository productModelRepository;

    private final ServicesRepository servicesRepository;
    private final WorkRepository workRepository;

    public HomeController(AutomotiveRepository automotiveRepository,
                          BrandRepository brandRepository,
                          ClothingRepository clothingRepository,
                          ContactRepository contactRepository,
                          ElectronicsRepository electronicsRepository,
                          EstatesRepository estatesRepository,
                          LocalizationRepository localizationRepository,
                          ProductModelRepository productModelRepository,
                          ServicesRepository servicesRepository,
                          WorkRepository workRepository) {
        this.automotiveRepository = automotiveRepository;
        this.brandRepository = brandRepository;
        this.clothingRepository = clothingRepository;
        this.contactRepository = contactRepository;
        this.electronicsRepository = electronicsRepository;
        this.estatesRepository = estatesRepository;
        this.localizationRepository = localizationRepository;
        this.productModelRepository = productModelRepository;
        this.servicesRepository = servicesRepository;
        this.workRepository = workRepository;
    }

    @RequestMapping("/")
    public String showAll(Model model) {
        model.addAttribute("automotive", automotiveRepository.findAllByOrderByCreatedDesc());
        model.addAttribute("automotive", clothingRepository.findAllByOrderByCreatedDesc());
        model.addAttribute("automotive", electronicsRepository.findAllByOrderByCreatedDesc());
        model.addAttribute("automotive", estatesRepository.findAllByOrderByCreatedDesc());
        model.addAttribute("automotive", servicesRepository.findAllByOrderByCreatedDesc());
        model.addAttribute("automotive", workRepository.findAllByOrderByCreatedDesc());
        return "/home";
    }
}

package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.notices_service.model.sections.Work;
import pl.coderslab.notices_service.repository.WorkRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/work")
public class WorkController {

    private final WorkRepository workRepository;

    public WorkController(WorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    @RequestMapping("/all")
    public String showAllWork(Model model) {
        List<Work> works = workRepository.findAllByOrderByCreatedDesc();
        model.addAttribute("work", works);
        return "work/workBasicView";
    }

    @GetMapping("/add")
    public String getAddWork(Work work, Model model) {
        return "work/workAdd";
    }

    @PostMapping("/add")
    public String postAddWork(@Valid Work work, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        workRepository.save(work);
        return "redirect:/work/all";
    }

    @GetMapping("/edit/{id}")
    public String getEditWork(@PathVariable Long id, Model model) {
        model.addAttribute("work", workRepository.findById(id));
        return "work/workEdit";
    }

    @PostMapping("/edit/{id}")
    public String postEditWork(@Valid Work work, BindingResult result) {
        if (result.hasErrors()) {
            return "errors/generalError";
        }
        workRepository.save(work);
        return "redirect:/work/all";
    }

    @RequestMapping("/delete/{id}")
    public String deleteWork(@PathVariable Long id) {
        workRepository.deleteById(id);
        return "redirect:/work/all";
    }
}

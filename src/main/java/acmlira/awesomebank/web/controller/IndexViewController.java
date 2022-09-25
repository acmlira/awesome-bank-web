package acmlira.awesomebank.web.controller;

import acmlira.awesomebank.web.service.ExpenseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/awesome-bank-web/")
@SessionAttributes({"result"})
public class IndexViewController {

    private final String ATTRIBUTE = "result";

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute(ATTRIBUTE, "{}");
        return "index";
    }

    @PostMapping("/expense/create")
    public String create(Model model,
                         @RequestParam String name,
                         @RequestParam String description,
                         @RequestParam String dateTime,
                         @RequestParam BigDecimal value,
                         @RequestParam List<String> tags) {
        model.addAttribute(ATTRIBUTE, expenseService.create(name, description, OffsetDateTime.of(LocalDateTime.parse(dateTime), ZoneOffset.UTC), value, tags));
        return "index";
    }

    @PostMapping("/expense/find-by-id")
    public String findById(Model model, @RequestParam UUID expenseId) {
        model.addAttribute(ATTRIBUTE, expenseService.findById(expenseId));
        return "index";
    }

    @PostMapping("/expense/find-all")
    public String findAll(Model model) {
        model.addAttribute(ATTRIBUTE, expenseService.findAll());
        return "index";
    }
}

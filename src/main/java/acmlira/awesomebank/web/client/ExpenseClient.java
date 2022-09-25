package acmlira.awesomebank.web.client;

import acmlira.awesomebank.web.client.request.CreateExpenseRequest;
import acmlira.awesomebank.web.model.Expense;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@FeignClient(
        name = "${feign.client.name.expense}",
        url  = "${feign.client.url.expense}"
)
public interface ExpenseClient {
    @PostMapping("/awesome-bank-api/expense")
    Expense create(@RequestBody CreateExpenseRequest createExpenseRequest);

    @GetMapping("/awesome-bank-api/expense/{expenseId}")
    Optional<Expense> findById(@PathVariable UUID expenseId);

    @GetMapping("/awesome-bank-api/expense")
    List<Expense> findAll();
}

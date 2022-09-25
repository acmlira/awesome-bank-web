package acmlira.awesomebank.web.service;

import acmlira.awesomebank.web.client.ExpenseClient;
import acmlira.awesomebank.web.client.request.CreateExpenseRequest;
import acmlira.awesomebank.web.model.Expense;
import acmlira.awesomebank.web.model.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@SessionScope
public class ExpenseService {
    @Autowired
    private Result result;

    @Autowired
    private ExpenseClient expenseClient;

    public String create(String name, String description, OffsetDateTime dateTime, BigDecimal value, List<String> codes) {
        CreateExpenseRequest request = new CreateExpenseRequest(name, description, dateTime, value, codes);
        Expense expense = expenseClient.create(request);
        result.setMessage(expense.toString());
        return result.getMessage();
    }

    public String findById(UUID expenseId) {
        Optional<Expense> expense = expenseClient.findById(expenseId);
        result.setMessage("{}");
        if (expense.isPresent()) {
            result.setMessage(expense.get().toString());
        }
        return result.getMessage();
    }

    public String findAll() {
        List<Expense> expenses = expenseClient.findAll();
        result.setMessage(expenses.toString());
        return result.getMessage();
    }
}

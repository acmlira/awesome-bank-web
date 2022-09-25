package acmlira.awesomebank.web;

import acmlira.awesomebank.web.client.ExpenseClient;
import acmlira.awesomebank.web.mock.ExpenseMock;
import acmlira.awesomebank.web.mock.TagMock;
import acmlira.awesomebank.web.model.Expense;
import acmlira.awesomebank.web.model.Result;
import acmlira.awesomebank.web.model.Tag;
import acmlira.awesomebank.web.service.ExpenseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.when;

@ExtendWith(MockitoExtension.class)
public class ExpenseServiceTest {

    @InjectMocks
    private ExpenseService expenseService;

    @Mock
    private ExpenseClient expenseClient;

    @Spy
    private Result result;

    private final Expense expense = ExpenseMock.mock();

    private final Tag tag = TagMock.mock();

    private final String expected = "{\"id\": \"10180466-2483-40ee-8433-8005d668dab8\", \"name\": \"Habbibs\", \"description\": \"Jantar no Habbibs\", \"dateTime\": \"+999999999-12-31T23:59:59.999999999-18:00\", \"value\": 10, \"tags\": [{\"id\": \"10180466-2483-40ee-8433-8005d668dab9\", \"code\": \"Food\"}]}";

    @Test
    public void shouldCreate() {
        when(expenseClient.create(any())).thenReturn(expense);

        String resultMessage = expenseService.create(
                expense.getName(),
                expense.getDescription(),
                expense.getDateTime(),
                expense.getValue(),
                expense.getTags().stream().map(Tag::getCode).collect(Collectors.toList()));

        assertEquals(expected, resultMessage);
    }

    @Test
    public void shouldFindById() {
        Optional<Expense> expenseOptional = Optional.of(expense);
        when(expenseClient.findById(any())).thenReturn(expenseOptional);

        String resultMessage = expenseService.findById(UUID.randomUUID());

        assertEquals(expected, resultMessage);
    }

    @Test
    public void shouldFindAll() {
        List<Expense> expenses = List.of(expense);

        when(expenseClient.findAll()).thenReturn(expenses);

        String resultMessage = expenseService.findAll();

        assertEquals("[" + expected + "]", resultMessage);
    }
}

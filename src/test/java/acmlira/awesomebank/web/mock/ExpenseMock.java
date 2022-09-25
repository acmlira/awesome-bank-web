package acmlira.awesomebank.web.mock;

import acmlira.awesomebank.web.model.Expense;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public class ExpenseMock {
    public static Expense mock() {
        Expense expense = new Expense();
        expense.setId(UUID.fromString("10180466-2483-40ee-8433-8005d668dab8"));
        expense.setName("Habbibs");
        expense.setDescription("Jantar no Habbibs");
        expense.setDateTime(OffsetDateTime.MAX);
        expense.setValue(BigDecimal.TEN);
        expense.setTags(List.of(TagMock.mock()));

        return expense;
    }
}

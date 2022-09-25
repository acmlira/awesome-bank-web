package acmlira.awesomebank.web.client.request;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public record CreateExpenseRequest(String name, String description, OffsetDateTime dateTime, BigDecimal value, List<String> tags) {}

package acmlira.awesomebank.web.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Expense implements Serializable {
    private UUID id;

    private String name;

    private String description;

    private OffsetDateTime dateTime;

    private BigDecimal value;

    private List<Tag> tags = new ArrayList<>();

    @Override
    public String toString() {
        return "{" +
                "\"id\": \"" + id + "\", " +
                "\"name\": \"" + name + "\", " +
                "\"description\": \"" + description + "\", " +
                "\"dateTime\": \"" + dateTime + "\", " +
                "\"value\": " + value + ", " +
                "\"tags\": " + tags.toString() +
                "}";
    }
}

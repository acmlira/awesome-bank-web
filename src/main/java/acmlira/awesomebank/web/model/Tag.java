package acmlira.awesomebank.web.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class Tag implements Serializable {
    private UUID id;
    private String code;

    @Override
    public String toString() {
        return "{" +
                "\"id\": \"" + id + "\", " +
                "\"code\": \"" + code + "\"" +
                "}";
    }
}

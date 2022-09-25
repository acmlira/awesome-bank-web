package acmlira.awesomebank.web.mock;

import acmlira.awesomebank.web.model.Tag;

import java.util.UUID;

public class TagMock {
    public static Tag mock() {
        Tag tag = new Tag();
        tag.setId(UUID.fromString("10180466-2483-40ee-8433-8005d668dab9"));
        tag.setCode("Food");
        return tag;
    }
}

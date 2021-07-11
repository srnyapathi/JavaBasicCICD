package in.srnyapathi.azurecicd.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Greeting {
    private String message;

    public Greeting(String message) {
        this.message="Message";
    }
}

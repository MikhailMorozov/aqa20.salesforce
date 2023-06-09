package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {

    private String salutation;
    private String firstName;
    private String lastName;
}

package tacos;

import lombok.Data;

@Data
public class Order {
    String name;
    String street;
    String city;
    String state;
    String zip;
    String ccNumber;
    String ccExpiration;
    String ccCvv;
}

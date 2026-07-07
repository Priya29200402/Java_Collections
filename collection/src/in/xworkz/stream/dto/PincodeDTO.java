package in.xworkz.stream.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class PincodeDTO implements Serializable {
        private String cityName;
        private int pincode;
}

package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Address {
@Value("Texas")
private String address;

public String getAddress() {
	return address;
}
}

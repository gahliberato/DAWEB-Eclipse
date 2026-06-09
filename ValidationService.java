package business.service;

public class ValidationService {
	public boolean validateName(String name) {
		return name!= null && !name.contains("1");
	}
}

package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class CityService {

	public String getState(String state) {
		if(state.startsWith("4")) {
			return "new Jersey";
		}
		else if(state.startsWith("5")) {
			return "Wasigton Dc";
		}
		else if(state.startsWith("6")) {
			return "CA";
		}
		else if(state.startsWith("7")) {
			return "LA";
		}
		else{
			return "state not found";
		}
	}
}

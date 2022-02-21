package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService service;
	@GetMapping("/state/{ssn}")
	public String getState(String state){
		return service.getState(state);
		//return new ResponseEntity<String>(state2,HttpStatus.OK);
	}
}

package com.SpringRest.SpringRest.Controller ;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.SpringRest.Entities.Doctors;
import com.SpringRest.SpringRest.Services.DoctorsService;

@RestController
public class MyController {
	@Autowired 
	public DoctorsService doctorsservice ;
	@GetMapping("/Appointments")
    public String Appointments() {
    	return "WELCOME TO APPOINTMENT DETAILS" ;
    }
	//Get the Doctor Details
	@GetMapping ("/doctorss")
	public List<Doctors> getDoctorss(){
	  return this.doctorsservice.getDoctorss();	
	}	
}
	
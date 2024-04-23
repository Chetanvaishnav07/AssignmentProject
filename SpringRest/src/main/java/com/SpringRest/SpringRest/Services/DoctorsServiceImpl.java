	package com.SpringRest.SpringRest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringRest.SpringRest.Entities.Doctors;
@Service
public class DoctorsServiceImpl implements DoctorsService {
    List<Doctors> list;
    public DoctorsServiceImpl() {
     list = new ArrayList<>();
     list.add(new Doctors(1,"Dev nagar","Indore","Evening",5,"rahul"+","+"dhruv"));
     list.add(new Doctors(1,"Devang runwal","Indore","Evening",5,"Ankit"+","+"Aman"));
    	
    	
    }
	@Override
	public List<Doctors> getDoctorss() {
		// TODO Auto-generated method stub
		return list;
	}

}
	
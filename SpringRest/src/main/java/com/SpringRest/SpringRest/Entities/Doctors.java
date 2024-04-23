package com.SpringRest.SpringRest.Entities;

public class Doctors {
     private long id ;
     private String name ;
     private String location ;
     private String time ;
     private int Maxappointments;
     private String AppointedPatients;
	public Doctors(long id, String name, String location, String time, int maxappointments, String appointedPatients) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.time = time;
		Maxappointments = maxappointments;
		AppointedPatients = appointedPatients;
	}
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getMaxappointments() {
		return Maxappointments;
	}
	public void setMaxappointments(int maxappointments) {
		Maxappointments = maxappointments;
	}
	public String getAppointedPatients() {
		return AppointedPatients;
	}
	public void setAppointedPatients(String appointedPatients) {
		AppointedPatients = appointedPatients;
	}
	@Override
	public String toString() {
		return "Doctors [id=" + id + ", name=" + name + ", location=" + location + ", time=" + time
				+ ", Maxappointments=" + Maxappointments + ", AppointedPatients=" + AppointedPatients + "]";
	}
	
}

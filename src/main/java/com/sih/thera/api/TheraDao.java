package com.sih.thera.api;

import java.util.List;

import com.sih.thera.api.User;

public interface TheraDao {
	
	User auth(String userName, String password);
	User addUser(User user);
	List<TherapyCentre> getTherapyCentres(String therapyType);
	List<Therapist> getTherapyDetails(User user); // can be just an user name of course
	void allocatePatient(String therapistName, String patientName);
	void addTherapyPlan(Therapist therapist);
	void addTherapySessionDetails(Therapist therapist);
	void addGoals(Therapist therapist);
	void addProgressReport(Therapist therapist);
	void addSuperviserReview(Supervisor supervisor);
}



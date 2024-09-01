package com.sih.thera.api;

public class Therapist {

	private String therapistName;
	private String patientName;
	private String therapyPlan;
	private String goals;
	private String progressReport;
	private String sessionDetails;
	private String supervisorFeedback;
	
	public String getTherapistName() {
		return therapistName;
	}
	public void setTherapistName(String therapistName) {
		this.therapistName = therapistName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getTherapyPlan() {
		return therapyPlan;
	}
	public void setTherapyPlan(String therapyPlan) {
		this.therapyPlan = therapyPlan;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getProgressReport() {
		return progressReport;
	}
	public void setProgressReport(String progressReport) {
		this.progressReport = progressReport;
	}
	public String getSessionDetails() {
		return sessionDetails;
	}
	public void setSessionDetails(String sessionDetails) {
		this.sessionDetails = sessionDetails;
	}
	public String getSupervisorFeedback() {
		return supervisorFeedback;
	}
	public void setSupervisorFeedback(String supervisorFeedback) {
		this.supervisorFeedback = supervisorFeedback;
	}
	
}

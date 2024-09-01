package com.sih.thera.api;

public class Supervisor {
	
	private String supervisorName;
	private String therapistName;
	private String patientName;
	private String therapyPlan;
	private String goals;
	private String progressReport;
	
	private String supervisorReview;
	
	private boolean isPlanAccepted;

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

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

	public String getSupervisorReview() {
		return supervisorReview;
	}

	public void setSupervisorReview(String supervisorReview) {
		this.supervisorReview = supervisorReview;
	}

	public boolean isPlanAccepted() {
		return isPlanAccepted;
	}

	public void setPlanAccepted(boolean isPlanAccepted) {
		this.isPlanAccepted = isPlanAccepted;
	}
	

}

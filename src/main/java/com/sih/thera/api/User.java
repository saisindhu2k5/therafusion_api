package com.sih.thera.api;

public class User {
	
    private Long id;
    private String name;
    private String userName;
    private String role;
    private String goals;
    private String sessionDetails;
    private String therapyCentreName;
    private String password;
    
    // Add other fields as necessary

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    // Getter and setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getSessionDetails() {
		return sessionDetails;
	}

	public void setSessionDetails(String sessionDetails) {
		this.sessionDetails = sessionDetails;
	}

	public String getTherapyCentreName() {
		return therapyCentreName;
	}

	public void setTherapyCentreName(String therapyCentreName) {
		this.therapyCentreName = therapyCentreName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Override toString() method for debugging
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }
}

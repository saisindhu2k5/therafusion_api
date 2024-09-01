package com.sih.thera.api;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TheraDaoImpl implements TheraDao {

    private JdbcTemplate jdbcTemplate;

    public TheraDaoImpl() {
        this.jdbcTemplate = new DatabaseConnection().jdbcTemplate();
    }

    private RowMapper<User> rowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        	User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            return user;
        }
    };
    
 	@Override
	public User auth(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TherapyCentre> getTherapyCentres(String therapyType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Therapist> getTherapyDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void allocatePatient(String therapistName, String patientName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTherapyPlan(Therapist therapist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTherapySessionDetails(Therapist therapist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGoals(Therapist therapist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProgressReport(Therapist therapist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSuperviserReview(Supervisor supervisor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}

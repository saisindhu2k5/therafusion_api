package com.sih.thera.api;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
    	User user = new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        // Set other fields as necessary
        return user;
    }
}

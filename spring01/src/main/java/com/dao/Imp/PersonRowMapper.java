package com.dao.Imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.person;

public class PersonRowMapper implements RowMapper<person> {

	public person mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub 
		person per = new person();
		per.setId(arg0.getInt("id"));
		per.setNameString(arg0.getString("name"));
		per.setAge(arg0.getInt("age"));
		return per;
	}

}

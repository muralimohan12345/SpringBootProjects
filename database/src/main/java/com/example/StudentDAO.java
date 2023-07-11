package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDAO {
	
	private JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	/*JDBC
	 * register the driver
	 * connection
	 * prepare statement
	 * execute the query 
	 * close the connections
	 * */
	
	/*JdbcTemplate
	 * register the driver
	 * connection          -spring.xml
	 * */
	
	//insert,update,delete
	public int insert(Student s) {
		String sql="insert into student values("+s.getSid()+",'"+s.getName()+"')";
		return temp.update(sql);
	}
	
	//retrival
	public List<Student> getallstudents(){
		String sql="select * from student";
		return temp.query(sql, new ResultSetExtractor<List<Student>>() {

			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ArrayList<Student> list=new ArrayList<Student>();
				while(rs.next()) {
				Student s=new Student();
				s.setSid(rs.getInt(1));
				s.setName(rs.getString(2));
				list.add(s);
				}
					
			return list;
			
			}
			
			
			
		});
		
	}
	

}





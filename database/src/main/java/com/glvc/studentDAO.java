package com.glvc;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class studentDAO {
private HibernateTemplate temp;

public void setTemp(HibernateTemplate temp) {
	this.temp = temp;
}

//insert
public int insert(student s) {
	
	return (Integer) temp.save(s);
}
//update and delete9

@SuppressWarnings("unchecked")
public List<student> getall(){
	String sql="from student";
	return (List<student>) temp.find(sql);
}

}



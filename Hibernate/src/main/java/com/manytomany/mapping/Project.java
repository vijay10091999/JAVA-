package com.manytomany.mapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
    private int project_id;
	
	@Column(name="project_name")
	private String p_name;
	
	@ManyToMany(mappedBy = "projects")
	private List<Employee> Emp;

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public List<Employee> getEmp() {
		return Emp;
	}

	public void setEmp(List<Employee> emp) {
		Emp = emp;
	}

	public Project(int project_id, String p_name, List<Employee> emp) {
		super();
		this.project_id = project_id;
		this.p_name = p_name;
		Emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

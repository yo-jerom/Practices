package com.example.projectservice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String projectName;
	private String projectType;
	private String clientName;
	
	/*@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Standardrate> standardrate;*/

	public Project() {

	}

	public Project(String projectName, String projectType, String clientName /*List<Standardrate> standardrate*/) {
		this.projectName = projectName;
		this.projectType = projectType;
		this.clientName = clientName;
		//this.standardrate = standardrate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "project_name", nullable = false)
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Column(name = "project_type", nullable = false)
	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	@Column(name = "client_name", nullable = false)
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	/*public List<Standardrate> getStandardrate() {
		return standardrate;
	}

	public void setStandardrate(List<Standardrate> standardrate) {
		this.standardrate = standardrate;
	}*/

}

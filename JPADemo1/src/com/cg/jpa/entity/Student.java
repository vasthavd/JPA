package com.cg.jpa.entity;
import javax.persistence.*;


@Entity
@Table(name="student_info")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rollno;
	@Column(length=20)  //name varchar2(20)
	private String name;
	@Column(length=25)  //emailId varchar2(25)
	private String emailid;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	

}

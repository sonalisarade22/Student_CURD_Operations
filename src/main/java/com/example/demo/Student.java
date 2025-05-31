
package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity   
public class Student {
	
	 
	 @Id 
	 @GeneratedValue(strategy=GenerationType.IDENTITY) 
	 private Long id;
	 private String name;
	 private String email;
	 private String department;
	 private String city;
	
	 
	// constructors
	 
		 public Student() {
		    }
		 
		 public Student(Long id, String name, String email,String department, String city){
	  this.id = id;
	  this.name = name;
	  this.email = email;
	  this.department = department;
	  this.city = city;
	}
	 
	 
	 
	 //getters and setters 
	 
	 public Long getId()
	 {
		 return id;
	 }
	 
	 public void setId(Long id)
	 {
		 this.id=id;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 
	 public String getEmail()
	 {
		 return email;
		 
	 }
	 public void setEmail(String email)
	 {
		 this.email=email;
	 }
	 
	 public String getDepartment()
	 {
		return department;
	 }
	 public void setDepartment(String department)
	 {
		 this.department=department;
	 }
	 public String getCity()
	 {
		 return city;
	 }
	 
	 public void setCity(String city)
	 {
		 this.city=city;
	 }
	 
	 
	//toString() method
	    @Override
	    public String toString() {
	        return "Student{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", department='" + department + '\'' +
	                ", city='" + city + '\'' +
	                '}';
	    }
	 
	 
}

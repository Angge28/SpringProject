package biz.global77.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Learner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private LearnerCourse learnerCourse;
	
	public LearnerCourse getLearnerCourse() {
		return learnerCourse;
	}

	public void setLearnerCourse(LearnerCourse learnerCourse) {
		this.learnerCourse = learnerCourse;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	//validation
	@NotBlank(message = "Must not be blank")
	private String learnerName;
	
//	@Min(value = 17, message = "Input valid age, above 17 years of age")
//	@Max(value = 100, message = "Input valid age, below 100 years of age")
	@NotBlank(message = "Must not be blank")
	private String learnerAge;
	
	@Size(min = 7, max = 7, message = "Must contain 7 characters!")
	private String	employeeId; 
	
	@NotBlank(message = "Must not be blank")
	private String emailId;

	public String getLearnerName() {
		return learnerName;
	}

	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}
	
	public String getLearnerAge() {
		return learnerAge;
	}

	public void setLearnerAge(String learnerAge) {
		this.learnerAge = learnerAge;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

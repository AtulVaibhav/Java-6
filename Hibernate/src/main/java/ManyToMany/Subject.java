package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int subjectId;
    private String subjectName;
    
    @ManyToMany(mappedBy="subject")
    private List<Student> students = new ArrayList<>();

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int subjectId, String subjectName, List<Student> students) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.students = students;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
    
}

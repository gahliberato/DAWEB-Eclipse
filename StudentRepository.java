package model.repository;
import java.util.ArrayList;
import java.util.List;
import model.entity.Student;

public class StudentRepository {
	private List<Student> students = new ArrayList<Student>();
	public void save(Student student) {
		students.add(student);
	}
	public List<Student> findAll() {
		return students;
	}
	public Student findByRegister(String register) {
		for (Student student : students) {
			if(student.getMat().equals(register)) {
				return student;
		}
	}
		return null;
	}
	public boolean delete(Student student) {
		return students.remove(student);
		
	}
}

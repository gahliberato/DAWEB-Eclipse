package business.service;

import java.util.List;

import model.entity.Student;
import model.repository.StudentRepository;

public class StudentService {
	private StudentRepository studentRepository = new StudentRepository();
	public void create(String name, String mat) {
		Student student = new Student(name,mat);
		
		studentRepository.save(student);
	}
	public List<Student> findAll() {
		return  studentRepository.findAll();
		
		
	}
	public boolean update(String oldMat, String newName, String newMat) {
		Student student = studentRepository.findByRegister(oldMat);
		
		if(student != null) {
			student.setMat(newMat);
			student.setName(newName);
			return true;
		}
		return false;
	}
	public boolean delete(String mat) {
		Student student = studentRepository.findByRegister(mat);
		
		if(student != null) {
			return studentRepository.delete(student);
		}
		return false;
	}
	
}

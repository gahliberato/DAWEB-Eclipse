package presentation.controller;

import java.util.Iterator;
import java.util.List;

import business.service.PrinterService;
import business.service.StudentService;
import business.service.ValidationService;
import model.entity.Student;

public class StudentController {
	 private ValidationService validationService = new ValidationService();
	 private StudentService studentService = new StudentService();
	 private PrinterService printerService = new PrinterService();
	 
	 public void create(String name, String mat) {
		 if (validationService.validateName(name)) {
			 //Segue o fluxo
			 studentService.create(name, mat);
		 }
	 }
	 public void showAll() {
		 List<Student> students = studentService.findAll();
		 
		 printerService.println("------Lista de alunos:------");
		 
		 for (Student student : students) {
			printerService.println(student.toString());
		}
	 }
	 public boolean update(String oldMat, String newName, String newMat) {
		if(validationService.validateName(newName)) {
			return studentService.update(oldMat,newName, newMat);
		}
		return false;
	 }
	 public boolean delete(String mat) {
		 if(mat != null) {
		return studentService.delete(mat);
	 }
		 return false;
	 }
}

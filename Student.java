package model.entity;

public class Student {
	private String name;
	private String mat;
	public Student(String name, String mat) {
		super();
		this.name = name;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "Aluno: Nome:" + name + ", Matrícula:" + mat;
	}
	
	
	

}

package presentation;

import business.service.PrinterService;
import business.service.ReaderService;
import presentation.controller.StudentController;

public class Main {
	public static final StudentController studentController = new StudentController();
	public static final PrinterService printerService = new PrinterService();
	public static final ReaderService readerService = new ReaderService();
	public static void main(String[] args) {
	boolean running = true;
	while(running) {
		showMenu();	
		int op = readerService.nextInt();
		
		switch(op) {
		case 1:{
			
			createStudent();
			break;
		}
		case 2:{
			readAll();
			break;
		}
		case 3:{
			editStudent();
			break;
		}
		case 4:{
			deleteStudent();
			break;
		}
		case 5:{
		running = false;
		break;
	}
	default:
		printerService.println("Opção inválida");
	}
	}
			
	}
	private static void deleteStudent() {
		studentController.showAll();
		printerService.println("Digite a matrícula do estudante que deseja deletar:");
		String mat = readerService.nextLine();
		
		boolean result = studentController.delete(mat);
		
		if(result) {
			printerService.println("Estudante deletado com sucesso!");
		}else {
			printerService.println("Estudante não foi deletado!");
		}
		
		
	}
	private static void editStudent() {
		studentController.showAll();
		
		printerService.println("Digite a matrícula do estudante que deseja alterar:");
		String oldMat = readerService.nextLine();
		
		printerService.println("Digite o novo nome:");
		String newName = readerService.nextLine();
		
		printerService.println("Digite a nova matrícula:");
		String newMat = readerService.nextLine();
		
		boolean result = studentController.update(oldMat, newName, newMat);
		if(result) {
			printerService.println("Estudante realizado com sucesso!");
		 }else {
			printerService.println("Estudante não foi atualizado!");
	}
	}
		
	private static void readAll() {
		studentController.showAll();
	}
	private static void showMenu() {
		printerService.println("Digite: ");
		printerService.println("(1) - Criar Estudante");
		printerService.println("(2) - Visualizar dados cadastrados");
		printerService.println("(3) - Editar dados cadastrados");
		printerService.println("(4) - ");
		printerService.println("(5) - Sair");
	}
	private static void createStudent() {	
	printerService.println("Digite o nome:");
	String name = readerService.nextLine();
	
	printerService.println("Digite a matrícula:");
	String mat = readerService.nextLine();
	
	StudentController studentController = new StudentController();
	studentController.create(name, mat);
}

}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		EmployeeManager manager = new EmployeeManager();
		Erros erros = new Erros();
		Scanner input = new Scanner(System.in);
		String answer;
		int options;
		boolean running = true;
		while(running)
		{
			System.out.println("=======Sistema de Folha de Pagamento========");
			System.out.println("");
			System.out.println("MENU PRINCIPAL");
			System.out.println();
			System.out.println("1 - Cadastrar Funcionário");
			System.out.println("2 - Remover Funcionário");
			System.out.println("3 - Editar Funcionário");
			System.out.println("4 - Sair do sistema");
			options = erros.verifyInput();

			switch (options) {
			    case 1:
				    System.out.println("addEmployee() foi chamada");
				    manager.addEmployee();			
			        break;
			    case 2: 
				    if(manager.getEmployeesCount() == 0) System.out.println("Não há funcionários cadastrados");
				    else
				    {
					    System.out.println("Escolha o funcionário a ser removido: ");
					    manager.showEmployees();
					    answer = input.nextLine();
					    manager.removeEmployee(answer);
				    }
			        break;
			    case 3:
				    System.out.println("editEmployee() foi chamada");
				    if(manager.getEmployeesCount() == 0) System.out.println("Não há funcionários cadastrados");
				    else
				    {
					    manager.editEmployee();
				    }	
				    break;
			    case 4:
				    running = false;
				    break;
			}
		}
		input.close();
	}
}

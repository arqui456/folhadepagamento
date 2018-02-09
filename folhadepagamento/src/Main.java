import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		ArrayList<Employee> allEmployees = new ArrayList<Employee>();
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
			options = input.nextInt();
			input.nextLine();

			
			if(options == 1)
			{
				Employee employee = new Employee();
				System.out.println("addEmployee() foi chamada");
				allEmployees.add(employee);			
				if(employee!=null)System.out.println("Funcionário cadastrado com sucesso!");
				else System.out.println("Erro no cadastro do funcionário! :<");
			}
			else if(options == 2)
			{
				if(allEmployees.size() == 0) System.out.println("Não há funcionários cadastrados");
				else
				{
					System.out.println("Escolha o funcionário a ser removido: ");
					showEmployees(allEmployees);
					answer = input.nextLine();
					removeEmployee(answer, allEmployees);
				}
			}
			else if(options == 3)
			{
				System.out.println("editEmployee() foi chamada");
				
				if(allEmployees.size() == 0) System.out.println("Não há funcionários cadastrados");
				else
				{
					System.out.println("Escolha o funcionário a ser editado: ");
					showEmployees(allEmployees);
					answer = input.nextLine();
					for(Employee count: allEmployees){
						if(answer.equals(count.getName().toString())){
							count.editEmployee(count);
							break;
						}
					}
					
				}
				

				//editEmployee(allEmployees);			
			}
			else if(options == 4){
				running = false;
			}
		}
			
	}

	private static void removeEmployee(String removed, ArrayList<Employee> allEmployees) {
		// TODO Auto-generated method stub
		for(Employee count: allEmployees){
			if(removed.equals(count.getName().toString())){ 
				allEmployees.remove(count); 
				System.out.println("Funcionário removido com sucesso!");
				break;
			}
		}
	}
	

	private static void showEmployees(ArrayList<Employee> allEmployees) {
		// TODO Auto-generated method stub
		for(Employee count: allEmployees){
			System.out.println("- " + count.getName()); 
		}
	}


}

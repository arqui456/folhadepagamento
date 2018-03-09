import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	
	Scanner input = new Scanner(System.in);
	List<Employee> employees = new ArrayList<Employee>();
	int employeesCount = 0;
	
	public EmployeeManager() {
		
	}
	
	public void addEmployee() {
		Employee employee = new Employee();
		if(employee!=null)System.out.println("Funcionário cadastrado com sucesso!");
		this.employeesCount++;
		employees.add(employee);
	}
	
	public void removeEmployee(String removed) {
		for(Employee count: this.employees){
			if(removed.equals(count.getName().toString())){ 
				employees.remove(count); 
				System.out.println("Funcionário removido com sucesso!");
				break;
			}
		}
		this.employeesCount--;
	}
	
	public void editEmployee() {
		
		System.out.println("Escolha o funcionário a ser editado: ");
		showEmployees();
		String answer = input.nextLine();
		for(Employee count: this.employees){
			if(answer.equals(count.getName().toString())){
				count.edit();
				break;
			}
		}
	}
	
	public void showEmployees() {
		for(Employee count: this.employees){
			System.out.println("- " + count.getName()); 
		}
	}

	public int getEmployeesCount() {
		return employeesCount;
	}

	public void setEmployeesCount(int employeesCount) {
		this.employeesCount = employeesCount;
	}
	
}

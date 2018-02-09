import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class Employee {
	private String name;
	public String getName() {
		return name;
	}
private int b;

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDailyHours() {
		return dailyHours;
	}

	public void setDailyHours(String dailyHours) {
		this.dailyHours = dailyHours;
	}

	private String address;
	private int id;
	private int salary;
	private String type;
	private String dailyHours;
	private Scanner input = new Scanner(System.in);
	private String answer;
	private int options;
	private boolean syndicated;
	private String paymentMethod;
	private int syndicateID;
	private int taxes;
	
	
	public Employee(){
		//System.out.println("O nome inserido foi " + answer + "!");
		System.out.println("Insira o nome do funcionário: ");		
		answer = input.nextLine();
		this.name = answer;
		System.out.println("Insira o endereço do funcionário: ");		
		answer = input.nextLine();
		this.address = answer;
		System.out.println("Insira o tipo de funcionário: ");		
		answer = input.nextLine();
		this.type = answer;
		System.out.println("Insira o salário do funcionário: ");		
		options = input.nextInt();
		this.salary = options;
	}

	public Employee addEmployee() {
		return null;
		// TODO Auto-generated method stub
		
		
	}

	public void removeEmployee() {
		// TODO Auto-generated method stub
		
	}

	public void editEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String temp;
		
		System.out.println();
		System.out.println("=======Alterar Funcionário========");
		System.out.println("");
		System.out.println("Escolha a ação: ");
		System.out.println();
		System.out.println("1 - Editar Nome");
		System.out.println("2 - Editar Endereço");
		System.out.println("3 - Editar Tipo de funcionário");
		System.out.println("4 - Editar Método de pagamento");
		System.out.println("5 - Editar Assossiação ao sindicato");
		System.out.println("6 - Editar Identificação do sindicato");
		System.out.println("7 - Editar Taxa sindical");
		System.out.println("8 - Sair");
		options = input.nextInt();
		input.nextLine();
		
		if(options == 1)
		{
			temp = this.name;
			System.out.println("Digite o novo nome: ");
			answer = input.nextLine();
			this.name = answer;
			System.out.println("Nome alterado de \""+ temp + "\" para \"" + this.name + "\" com sucesso!");
		}
		else if (options == 2)
		{
			System.out.println("Digite o novo endereço: ");
			answer = input.nextLine();
			this.address = answer;
			System.out.println("Endereço alterado com sucesso!");
		}
		else if(options == 3)
		{
			System.out.println("Digite o Tipo de funcionário: ");
			answer = input.nextLine();
			this.type = answer;
			System.out.println("Tipo de funcionário alterado com sucesso!");
			
		}
		else if(options == 4)
		{
			System.out.println("Digite o novo Método de pagamento: ");
			answer = input.nextLine();
			this.paymentMethod = answer;
			System.out.println("Método de pagamento alterado com sucesso!");
			
		}
		else if(options == 5)
		{
			System.out.println("O funcionário é associado ao sindicato? ");
			this.syndicated = input.nextBoolean();
			System.out.println("Associação alterada com sucesso!");			
		}
		else if(options == 6)
		{
			System.out.println("Digita a nova ID do sindicato: ");
			this.syndicateID = input.nextInt();
			System.out.println("Associação alterada com sucesso!");			
		}
		else if(options == 7)
		{
			System.out.println("Digite a nova taxa sindical: ");
			this.taxes = input.nextInt();
			System.out.println("Taxa sindical alterada com sucesso!");			
		}
		
	}
	
	
	
	
	
}

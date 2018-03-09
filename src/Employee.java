import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class Employee {
	private String name;
	public String getName() {
		return name;
	}

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
	private String options;
	private boolean syndicated;
	private String paymentMethod;
	private int syndicateID;
	private int taxes;
	
	
	public Employee(){
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
		options = input.nextLine();
		this.salary = Integer.parseInt(options);
	}

	public void edit() {
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
		options = input.nextLine();
		int choice = Integer.parseInt(options);
		while(choice < 1 || choice > 8) {
			System.out.println("invalid input, try again: ");
			options = input.nextLine();
			choice = Integer.parseInt(options);
		}
		//input.nextLine();
		
		switch (choice) {
		    case 1:
				temp = this.name;
				System.out.println("Digite o novo nome: ");
				answer = input.nextLine();
				this.name = answer;
				System.out.println("Nome alterado de \""+ temp + "\" para \"" + this.name + "\" com sucesso!");
			    break;
		    case 2:
				System.out.println("Digite o novo endereço: ");
				answer = input.nextLine();
				this.address = answer;
				System.out.println("Endereço alterado com sucesso!");
			    break;
		    case 3:
				System.out.println("Digite o Tipo de funcionário: ");
				answer = input.nextLine();
				this.type = answer;
				System.out.println("Tipo de funcionário alterado com sucesso!");
				break;
		    case 4:
				System.out.println("Digite o novo Método de pagamento: ");
				answer = input.nextLine();
				this.paymentMethod = answer;
				System.out.println("Método de pagamento alterado com sucesso!");
				break;
		    case 5:
				System.out.println("O funcionário é associado ao sindicato? ");
				this.syndicated = input.nextBoolean();
				System.out.println("Associação alterada com sucesso!");			
			    break;
		    case 6:
				System.out.println("Digita a nova ID do sindicato: ");
				this.syndicateID = input.nextInt();
				System.out.println("Associação alterada com sucesso!");			
			    break;
		    case 7:
				System.out.println("Digite a nova taxa sindical: ");
				this.taxes = input.nextInt();
				System.out.println("Taxa sindical alterada com sucesso!");			
			    break;
		}		
	}
}
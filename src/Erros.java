import java.util.Scanner;

public class Erros{
	
	Scanner input = new Scanner(System.in);

	public Erros(){
		
	}

	public int verifyInput(){
		
		int options = input.nextInt();
		while(options < 1 || options > 4) {
			System.out.println("Invalid input, try again");
			options = input.nextInt();
		}
		return options;
	}
}

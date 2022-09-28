package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Persona p = new Persona();
		
		System.out.println("Introduce tu nombre:");
		String line = scanner.nextLine();
		p.setNombre(line);
		
		System.out.println("Introduce tu apellido:");
		line = scanner.nextLine();
		p.setApellidos(line);
		
		System.out.println("Introduce tu edad:");
		line = scanner.nextLine();
		p.setEdad(Integer.valueOf(line));

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		
		System.out.println(json);
	}

}

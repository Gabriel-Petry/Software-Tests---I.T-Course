package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.salario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<salario> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new salario(id,name,salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase:");
		int id = sc.nextInt();
		salario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			
			System.out.println("This id does not exist!");
			
		}
		
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (salario obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

	public static boolean hasId(List<salario> list, int id) {
		
		salario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return emp != null;
	}

}

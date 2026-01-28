package functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	
	public static void main(String[] args) {
		List<String>list = List.of("Apple","Banana","Cat","Dog");
		extracted(list);
		extractedwith(list);
		List<Integer>numbers = List.of(1,5,7,8,9);
		functionalSum(numbers);
		sortedFunction(numbers);
		distinctFunctional(numbers);
		squareFunctional(numbers);
		
		
	}


	private static void squareFunctional(List<Integer> numbers) {
		numbers.stream().map(e->e*e).forEach(e->System.out.println(e ));
	}


	private static void distinctFunctional(List<Integer> numbers) {
		numbers.stream().distinct().forEach(e->System.out.println(e));//intermediate function
	}


	private static void sortedFunction(List<Integer> numbers) {
		numbers.stream().sorted().forEach(e->System.out.print(e));//intermediate operation
	}


	private static void functionalSum(List<Integer> numbers) {
		int sum = numbers.stream()
		        .filter(number -> number % 2 == 1)
		        .reduce(0, (number1, number2) -> number1 + number2);
//reduce->adds element pairwise
		System.out.println("\n" + sum);
	}
	

	private static void extracted(List<String> list) {
		for(String string:list) {
			System.out.print("\n"+string);
		}
	}
	
	private static void extractedwith(List<String> list) {
		list.stream().filter(
				element->element.endsWith("at")
				).forEach(element->System.out.println("\n"+element)
						);
	}
	

}

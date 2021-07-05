package tpPoker;

import java.util.ArrayList;
import java.util.List;

public class prueba extends PokerStatus {

	public static void main(String[] args) {
		
		List<Character>listaDePalos = new ArrayList<Character>();
		
		listaDePalos.add('D');
		listaDePalos.add('D');
		listaDePalos.add('D');
		listaDePalos.add('D');
		listaDePalos.add('D');
		listaDePalos.add('F');
			
		System.out.println(listaDePalos.stream().distinct().count() <= 1);
		System.out.println("J".compareTo("Q"));
		System.out.println("Q".compareTo("K"));
		System.out.println("J".compareTo("K"));

	}

}

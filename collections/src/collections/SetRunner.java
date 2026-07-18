package collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character>characters = List.of('A','Z','A','B','Z','F');
		Set<Character>tree = new TreeSet<>(characters);
		System.out.println(tree);
		Set<Character>treelink = new LinkedHashSet<>(characters);
		System.out.println(treelink);

	}

}

package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list = new CopyOnWriteArrayList<String>();
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		for(String ele : list)
			System.out.println(ele);

	}

}

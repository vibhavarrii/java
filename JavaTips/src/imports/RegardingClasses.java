package imports;
//default class
class Person{
}


public class RegardingClasses {
	//innerclass
	class InnerClass{
		
	}
	static class StaticInnerClass{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInnerClass staticNestedClass = new StaticInnerClass();
		RegardingClasses classes = new RegardingClasses();
		InnerClass innerclass = classes.new InnerClass();
		

	}

}

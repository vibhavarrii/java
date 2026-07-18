package serializationexample;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserialization {
	public static void main (String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream("rectangle.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Rectangle rectangle = (Rectangle) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println("Length :"+ rectangle.length);
		System.out.println("Breadth :"+rectangle.breadth);
		System.out.println("Area:"+rectangle.breadth*rectangle.length);
		
		
		
	}

}

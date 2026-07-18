package serializationexample;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Rectangle implements Serializable {
	int length;
	int breadth;
	int area;
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
		this.area=length*breadth;
		
	}
}
public class Serialization {
	public static void main(String[] args) throws Exception {
		FileOutputStream fileStream = new FileOutputStream("Rectangle.ser");
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
		Rectangle rect = new Rectangle(5,6);
		objectStream.writeObject(rect);
		objectStream.close();
		System.out.println("Rectangle object serialized");
		
	}

}

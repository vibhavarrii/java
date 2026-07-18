//listing files in directory
package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException  {
		Path pathFiletoRead = Paths.get("./resources/data.txt");
		List<String>lines = Files.readAllLines(pathFiletoRead);
		System.out.println(lines);
		Files.lines(pathFiletoRead).forEach(System.out::println);//processing line by line
		
				

	}

}

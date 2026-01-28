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

public class FileReadRunner {

	public static void main(String[] args) throws IOException  {
		Path pathFiletoWrite = Paths.get("./resources/filesWrite.txt");
		List<String>list = List.of("123","112","hii","aplle","bat");
		Files.write(pathFiletoWrite, list);
		
		
				

	}

}

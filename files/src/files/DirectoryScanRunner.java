//listing files in directory
package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException  {
		Path currentDirectory = Paths.get(".");
		BiPredicate<Path, BasicFileAttributes> matcher = (path,attribute)->String.valueOf(path).contains(".java");
		//Predicate<? super Path> predicate = path->String.valueOf(path).contains(".java");
		//Files.list(Paths.get(".")).forEach(System.out::println);
		//Files.walk(currentDirectory,1).filter(predicate).forEach(System.out::println);
		Files.find(currentDirectory, 4, matcher).forEach(System.out::println);;
				

	}

}

package com.in28minutes.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesReadWriterunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("./resources/sample.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		String newFileContent = fileContent.replace("line 1", "line 5");
		System.out.println(newFileContent);
		Path newFilePath = Paths.get("./resources/sample.txt");
		Files.writeString(newFilePath, newFileContent);

	}

}

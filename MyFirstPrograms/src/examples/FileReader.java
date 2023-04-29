package examples;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.io.FileNotFoundException;

public class FileReader {

	public List<String> readDataFromFile {
		File aFile = new File(C:\Users\ramya\QAFolder\RamyaSri-old-laptop\QA\MyQAFiles\csv));
		FileUtils aFileUtils = new FileUtils();
		List<String> linesFromFile = null;

		try {
			 linesFromFile = aFileUtils.readLines(aFile, StandardCharsets.UTF_8);
		}catch(IOException e) {
			System.out.println("some error happened while reading file");
		}
			return linesFromFile;
	}
}

package homeFinalExam1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class splitSentence {
	
	public static void doesFileExist(String path) throws IOException {

		BufferedReader bufreader = new BufferedReader(new FileReader(path));
		String sentence;
		while ((sentence = bufreader.readLine()) != null) {
			String[] words = sentence.split("-|,|:");
			for (String word : words) {
				System.out.println(word);
			}
		}
		bufreader.close();

	}

	public static void main(String[] args) throws IOException {

		String filePath = "src\\test\\java\\homeFinalExam1\\Dictionary";

		doesFileExist(filePath);
	}

	

}

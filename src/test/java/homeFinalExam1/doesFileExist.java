package homeFinalExam1;

import java.io.File;

public class doesFileExist {

	public static void main(String[] args) {
        String filePath = "src\\test\\java\\homeFinalExam1\\Dictionary";

        try {
            doesFileExist1(filePath);
            System.out.println("File exists!");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void doesFileExist1(String filePath) throws Exception {
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File exists at path: " + file.getAbsolutePath());
        } else {
            throw new Exception("File not found at path: " + file.getAbsolutePath());
        }
    }
}

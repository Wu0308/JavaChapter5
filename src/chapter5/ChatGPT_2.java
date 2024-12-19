package chapter5;

import java.io.*;


public class ChatGPT_2 {
	public static void main(String[] args) {
        String data = "This is a sample text for file writing.";
        
        // 寫入檔案
        try (FileWriter fileWriter = new FileWriter("sample.txt")) {
            fileWriter.write(data);
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 從檔案讀取
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

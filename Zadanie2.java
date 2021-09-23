package Laba2;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader reader = new BufferedReader(new FileReader("file1.txt"))) {
            long[] unicodeArray = new long[65536];

            while (reader.ready()) {
                char[] charArray = reader.readLine().toCharArray();
                for (char c : charArray) {
                    unicodeArray[(int) c]++;
                }
            }

            for (int i = 0; i < unicodeArray.length; i++) {
                if (unicodeArray[i] > 0) {
                    System.out.println("Symbol: " + (char) i + " Freq: " + unicodeArray[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
	
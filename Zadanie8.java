package Laba2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kkk {


		public static void main(String[] args) throws IOException {
			try (Scanner input = new Scanner(new File("C:\\Users\\garip\\OneDrive\\Рабочий стол\\lll.txt"))) {
			List<String> inputText = new ArrayList();
			while (input.hasNextLine()) {
			inputText.add(input.nextLine());
			}
			inputText.sort(String::compareTo);
			for (String str : inputText) {
			System.out.println(str);
			}
			}
		}
}

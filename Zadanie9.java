package Laba2;
import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Zadanie9 {

	 public static void main(String[] args) throws Exception {
	        // Открываем поток для чтения файла 1
	        FileReader read_file1 = new FileReader("file1.txt");

	        // Открываем поток для записи файла 2
	        FileWriter write_file2 = new FileWriter("file2.txt");

	        // Сканер для чтения строк
	        Scanner scan = new Scanner(read_file1);

	        StringBuilder file_content = new StringBuilder();
	        // цикл работает пока в файле есть не прочитанные строки
	        while(scan.hasNextLine()) {
	            String line = scan.nextLine() + '\n';
	            file_content.append(line);
	        }

	        int i = 0;
	        boolean minus_x = false;

	        for (char c :  file_content.toString().toCharArray()) {
	            if (c == '-' && !minus_x) {
	                file_content.setCharAt(i, '0');
	                minus_x = true;
	            }
	            else if (c == ' ') {
	                minus_x = false;
	            }
	            else if (minus_x) {
	                file_content.deleteCharAt(i);
	                i--;
	            }
	            i++;
	        }

	        write_file2.write(file_content.toString().toCharArray());
	        System.out.println("Запись прошла успешно. Проверьте file2.txt");

	        // закрываем поток чтения файла
	        read_file1.close();
	        write_file2.close();

	    }
	}
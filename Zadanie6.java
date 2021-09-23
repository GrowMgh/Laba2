package Laba2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Zadanie6 {

	public static void main(String[] args) throws Exception {
        // Открываем потоки для чтения файлов
        FileReader read_file1 = new FileReader("file1.txt");
        FileReader read_file2 = new FileReader("file2.txt");
        FileWriter write_file3 = new FileWriter("file3.txt");

        // Сканер для чтения строк
        Scanner scan = new Scanner(read_file1);

        // цикл работает пока в первом файле есть не прочитанные строки
        while(scan.hasNextLine()) {
            String line = scan.nextLine(); // считываем строку из 1 файла
            write_file3.write(line + "\n");  // записываем в третий
        }

        scan = new Scanner(read_file2);

        // цикл работает пока во втором файле есть не прочитанные строки
        while(scan.hasNextLine()) {
            String line = scan.nextLine(); // считываем строку из 2 файла
            write_file3.write(line + "\n"); // записываем в третий
        }

        System.out.println("Конкатенация file1.txt и file2.txt в file3.txt прошла успешно!");

        // закрываем потоки для чтения файлов
        read_file1.close();
        read_file2.close();
        write_file3.close();
    }
}

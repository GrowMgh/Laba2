package Laba2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Zadanie12 {

	public static void main(String[] args) throws Exception {
        // Открываем потоки для чтения файлов
        FileReader read_file_one = new FileReader("file1.txt");

        // Сканер для чтения строк
        Scanner scan_one = new Scanner(read_file_one);

        // считываем из первого файла
        StringBuilder first_file = new StringBuilder();

        // цикл работает пока в первом файле есть не прочитанные строки
        while(scan_one.hasNextLine()) {
            first_file.append(scan_one.nextLine()).append('\n');
        }

        read_file_one.close();

        // из 1 -> в 3
        FileWriter write_file_three = new FileWriter("file3.txt");
        write_file_three.write(first_file.toString().toCharArray());

        write_file_three.close();

        // из 2 -> в 1
        FileReader read_file_two = new FileReader("file2.txt");
        Scanner scan_two = new Scanner(read_file_two);

        StringBuilder second_file = new StringBuilder();

        // цикл работает пока во втором файле есть не прочитанные строки
        while(scan_two.hasNextLine()) {
            second_file.append(scan_two.nextLine()).append('\n');
        }

        read_file_two.close();

        FileWriter write_file_one = new FileWriter("file1.txt");
        write_file_one.write(second_file.toString().toCharArray());

        write_file_one.close();

        // из 3 -> во 2
        FileReader read_file_three = new FileReader("file3.txt");
        Scanner scan_three = new Scanner(read_file_three);

        StringBuilder third_file = new StringBuilder();

        // цикл работает пока в третьем файле есть не прочитанные строки
        while(scan_three.hasNextLine()) {
            third_file.append(scan_three.nextLine()).append('\n');
        }

        read_file_three.close();

        FileWriter write_file_two = new FileWriter("file2.txt");
        write_file_two.write(third_file.toString().toCharArray());

        write_file_two.close();

        System.out.println("Содержимое file1.txt теперь в file2.txt, а file2.txt в file1.txt");
    }
}

package Laba2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Zadanie7 {

	public static void main(String[] args) throws Exception {
        // Открываем потоки для чтения файлов
        FileReader read_file1 = new FileReader("file1.txt");

        // Сканер для чтения строк
        Scanner scan = new Scanner(read_file1);

        StringBuilder file1_content = new StringBuilder();

        // цикл работает пока в файле есть не прочитанные строки
        while(scan.hasNextLine()) {
            String line = scan.nextLine() + "\n";
            file1_content.append(line);
        }

        // Перезапись файла
        FileWriter write_file1 = new FileWriter("file1.txt");
        String str1 = "первая строка";
        String str2 = "вторая строка";

        String content = file1_content.toString();
        content = content.replace(str1, str2);
        write_file1.write(content);

        System.out.println("Файл успешно перезаписан, проверьте file1.txt");

        // закрываем потоки
        read_file1.close();
        write_file1.close();

    }
}
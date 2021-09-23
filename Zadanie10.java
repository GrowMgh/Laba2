package Laba2;
import java.io.FileReader;
import java.util.Scanner;
public class Zadanie10 {

	public static void main(String[] args) throws Exception {
        // Открываем потоки для чтения файлов
        FileReader read_file1 = new FileReader("file1.txt");

        // Сканер для чтения строк
        Scanner scan = new Scanner(read_file1);

        int count_lines = 0;

        // цикл работает пока в первом или во втором файле есть не прочитанные строки
        while(scan.hasNextLine()) {
            char [] line;
            line = scan.nextLine().toCharArray();
            if (line[0] == line[line.length-1]) {
                count_lines++;
            }
        }

        System.out.println("В файле " + count_lines + " строк, которые начинаются и заканчиваются одним символом.");

        // закрываем поток для чтения файлов
        read_file1.close();
    }
}

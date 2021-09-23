package Laba2;
import java.io.FileReader;
import java.util.Scanner;
public class Class9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 // Открываем потоки для чтения файлов
        FileReader read_file1 = new FileReader("file1.txt");
        FileReader read_file2 = new FileReader("file2.txt");

        // Сканер для чтения строк
        Scanner scan = new Scanner(read_file1);
        Scanner scan2 = new Scanner(read_file2);

        int line_number = 0; // номер текущей строки
        int symbol_number = -1; // номер первого различного символа
        int check_start = -1; // если значение = 1, то первый файл является началом второго, если = 2, то наоборот

        // цикл работает пока в первом или во втором файле есть не прочитанные строки
        while(scan.hasNextLine() || scan2.hasNextLine()) {
            char [] line1;
            char [] line2;
            int length;

            line1 = scan.nextLine().toCharArray(); // считываем строку из первого файла
            line2 = scan2.nextLine().toCharArray(); // и из второго

            if (line1.length > line2.length) // если длина строки первого файла больше длины строки второго файла
                check_start = 2; // то второй файл (предположительно) является началом первого
            else if (line1.length < line2.length)
                check_start = 1; // наоборот

            length = Math.min(line1.length, line2.length); // берем длину строки наименьшего размера

            for (int i = 0; i < length; i++) { // проверяем посимвольно
                if (line1[i] != line2[i]) { // если встречаем разные символы
                    symbol_number = i+1; // записываем номер различного символа
                    break; // останавливаем работу цикла
                }
            }

            line_number++;
        }

        // закрываем потоки для чтения файлов
        read_file1.close();
        read_file2.close();

        if (symbol_number == -1 && check_start == -1) {
            System.out.println("Файлы идентичны!");
        }
        else if (symbol_number == -1 && check_start == 1) {
            System.out.println("Первый файл является началом второго!");
        }
        else if (symbol_number == -1) {
            System.out.println("Второй файл является началом первого!");
        }
        else {
            System.out.println("Файлы отличаются в строке №" + line_number + ". Символ №" + symbol_number);
        }
    }
}

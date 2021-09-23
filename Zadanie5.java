package Laba2;
import java.io.FileReader;
import java.util.Scanner;


public class Class8 {

	public static void main(String[] args) throws Exception {
        // ќткрываем потоки дл€ чтени€ файлов
        FileReader read_file1 = new FileReader("file1.txt");

        // —канер дл€ чтени€ строк
        Scanner scan = new Scanner(read_file1);
        int count = 0;

        // цикл работает пока в первом файле есть не прочитанные строки
        while(scan.hasNextLine()) {
            char [] line;
            line = scan.nextLine().toCharArray(); // считываем строку из файла

            StringBuilder number = new StringBuilder(); // дл€ текущего положительного числа
            boolean plus_sign = false; // true - значит считываем положительное число

            for (char c : line) { // перебираем строку посимвольно
                if (c == '+') { // если встретили символ '+'
                    plus_sign = true; // то значит считываем положительное число
                    continue; // переходим к след. символу
                }

                if (c == ' ' && plus_sign) { // если встретили пустой символ и считывали полож. число
                    int num = Integer.parseInt(number.toString()); // переводим строку с числом в int
                    if (num % 2 == 0) { // если число чЄтное
                        count++; // увелич. кол-во
                    }
                    plus_sign = false; // мы уже закончили считывать полож. число
                    number.delete(0, number.length()); // очищаем строку number
                }

                else if (plus_sign) { // если считываем полож. число и символ не ' '
                    number.append(c); // то записываем его в переменную
                }
            }

            // обработка последнего числа в строке
            if (plus_sign) { // если положит.
                int num = Integer.parseInt(number.toString()); // переводим строку с числом в int
                if (num % 2 == 0) { // если число чЄтное
                    count++; // увелич. кол-во
                }
            }
        }

        System.out.println("ѕоложительных чЄтных чисел в файле: " + count);

        // закрываем поток чтени€ файла
        read_file1.close();

    }
}

 
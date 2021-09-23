package Laba2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Zadanie7 {

	public static void main(String[] args) throws Exception {
        // ��������� ������ ��� ������ ������
        FileReader read_file1 = new FileReader("file1.txt");

        // ������ ��� ������ �����
        Scanner scan = new Scanner(read_file1);

        StringBuilder file1_content = new StringBuilder();

        // ���� �������� ���� � ����� ���� �� ����������� ������
        while(scan.hasNextLine()) {
            String line = scan.nextLine() + "\n";
            file1_content.append(line);
        }

        // ���������� �����
        FileWriter write_file1 = new FileWriter("file1.txt");
        String str1 = "������ ������";
        String str2 = "������ ������";

        String content = file1_content.toString();
        content = content.replace(str1, str2);
        write_file1.write(content);

        System.out.println("���� ������� �����������, ��������� file1.txt");

        // ��������� ������
        read_file1.close();
        write_file1.close();

    }
}
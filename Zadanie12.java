package Laba2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Zadanie12 {

	public static void main(String[] args) throws Exception {
        // ��������� ������ ��� ������ ������
        FileReader read_file_one = new FileReader("file1.txt");

        // ������ ��� ������ �����
        Scanner scan_one = new Scanner(read_file_one);

        // ��������� �� ������� �����
        StringBuilder first_file = new StringBuilder();

        // ���� �������� ���� � ������ ����� ���� �� ����������� ������
        while(scan_one.hasNextLine()) {
            first_file.append(scan_one.nextLine()).append('\n');
        }

        read_file_one.close();

        // �� 1 -> � 3
        FileWriter write_file_three = new FileWriter("file3.txt");
        write_file_three.write(first_file.toString().toCharArray());

        write_file_three.close();

        // �� 2 -> � 1
        FileReader read_file_two = new FileReader("file2.txt");
        Scanner scan_two = new Scanner(read_file_two);

        StringBuilder second_file = new StringBuilder();

        // ���� �������� ���� �� ������ ����� ���� �� ����������� ������
        while(scan_two.hasNextLine()) {
            second_file.append(scan_two.nextLine()).append('\n');
        }

        read_file_two.close();

        FileWriter write_file_one = new FileWriter("file1.txt");
        write_file_one.write(second_file.toString().toCharArray());

        write_file_one.close();

        // �� 3 -> �� 2
        FileReader read_file_three = new FileReader("file3.txt");
        Scanner scan_three = new Scanner(read_file_three);

        StringBuilder third_file = new StringBuilder();

        // ���� �������� ���� � ������� ����� ���� �� ����������� ������
        while(scan_three.hasNextLine()) {
            third_file.append(scan_three.nextLine()).append('\n');
        }

        read_file_three.close();

        FileWriter write_file_two = new FileWriter("file2.txt");
        write_file_two.write(third_file.toString().toCharArray());

        write_file_two.close();

        System.out.println("���������� file1.txt ������ � file2.txt, � file2.txt � file1.txt");
    }
}

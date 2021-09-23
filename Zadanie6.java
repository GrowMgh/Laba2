package Laba2;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Zadanie6 {

	public static void main(String[] args) throws Exception {
        // ��������� ������ ��� ������ ������
        FileReader read_file1 = new FileReader("file1.txt");
        FileReader read_file2 = new FileReader("file2.txt");
        FileWriter write_file3 = new FileWriter("file3.txt");

        // ������ ��� ������ �����
        Scanner scan = new Scanner(read_file1);

        // ���� �������� ���� � ������ ����� ���� �� ����������� ������
        while(scan.hasNextLine()) {
            String line = scan.nextLine(); // ��������� ������ �� 1 �����
            write_file3.write(line + "\n");  // ���������� � ������
        }

        scan = new Scanner(read_file2);

        // ���� �������� ���� �� ������ ����� ���� �� ����������� ������
        while(scan.hasNextLine()) {
            String line = scan.nextLine(); // ��������� ������ �� 2 �����
            write_file3.write(line + "\n"); // ���������� � ������
        }

        System.out.println("������������ file1.txt � file2.txt � file3.txt ������ �������!");

        // ��������� ������ ��� ������ ������
        read_file1.close();
        read_file2.close();
        write_file3.close();
    }
}

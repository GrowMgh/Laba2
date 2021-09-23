package Laba2;
import java.io.FileReader;
import java.util.Scanner;
public class Zadanie10 {

	public static void main(String[] args) throws Exception {
        // ��������� ������ ��� ������ ������
        FileReader read_file1 = new FileReader("file1.txt");

        // ������ ��� ������ �����
        Scanner scan = new Scanner(read_file1);

        int count_lines = 0;

        // ���� �������� ���� � ������ ��� �� ������ ����� ���� �� ����������� ������
        while(scan.hasNextLine()) {
            char [] line;
            line = scan.nextLine().toCharArray();
            if (line[0] == line[line.length-1]) {
                count_lines++;
            }
        }

        System.out.println("� ����� " + count_lines + " �����, ������� ���������� � ������������� ����� ��������.");

        // ��������� ����� ��� ������ ������
        read_file1.close();
    }
}

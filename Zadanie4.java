package Laba2;
import java.io.FileReader;
import java.util.Scanner;
public class Class9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 // ��������� ������ ��� ������ ������
        FileReader read_file1 = new FileReader("file1.txt");
        FileReader read_file2 = new FileReader("file2.txt");

        // ������ ��� ������ �����
        Scanner scan = new Scanner(read_file1);
        Scanner scan2 = new Scanner(read_file2);

        int line_number = 0; // ����� ������� ������
        int symbol_number = -1; // ����� ������� ���������� �������
        int check_start = -1; // ���� �������� = 1, �� ������ ���� �������� ������� �������, ���� = 2, �� ��������

        // ���� �������� ���� � ������ ��� �� ������ ����� ���� �� ����������� ������
        while(scan.hasNextLine() || scan2.hasNextLine()) {
            char [] line1;
            char [] line2;
            int length;

            line1 = scan.nextLine().toCharArray(); // ��������� ������ �� ������� �����
            line2 = scan2.nextLine().toCharArray(); // � �� �������

            if (line1.length > line2.length) // ���� ����� ������ ������� ����� ������ ����� ������ ������� �����
                check_start = 2; // �� ������ ���� (����������������) �������� ������� �������
            else if (line1.length < line2.length)
                check_start = 1; // ��������

            length = Math.min(line1.length, line2.length); // ����� ����� ������ ����������� �������

            for (int i = 0; i < length; i++) { // ��������� �����������
                if (line1[i] != line2[i]) { // ���� ��������� ������ �������
                    symbol_number = i+1; // ���������� ����� ���������� �������
                    break; // ������������� ������ �����
                }
            }

            line_number++;
        }

        // ��������� ������ ��� ������ ������
        read_file1.close();
        read_file2.close();

        if (symbol_number == -1 && check_start == -1) {
            System.out.println("����� ���������!");
        }
        else if (symbol_number == -1 && check_start == 1) {
            System.out.println("������ ���� �������� ������� �������!");
        }
        else if (symbol_number == -1) {
            System.out.println("������ ���� �������� ������� �������!");
        }
        else {
            System.out.println("����� ���������� � ������ �" + line_number + ". ������ �" + symbol_number);
        }
    }
}

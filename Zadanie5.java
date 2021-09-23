package Laba2;
import java.io.FileReader;
import java.util.Scanner;


public class Class8 {

	public static void main(String[] args) throws Exception {
        // ��������� ������ ��� ������ ������
        FileReader read_file1 = new FileReader("file1.txt");

        // ������ ��� ������ �����
        Scanner scan = new Scanner(read_file1);
        int count = 0;

        // ���� �������� ���� � ������ ����� ���� �� ����������� ������
        while(scan.hasNextLine()) {
            char [] line;
            line = scan.nextLine().toCharArray(); // ��������� ������ �� �����

            StringBuilder number = new StringBuilder(); // ��� �������� �������������� �����
            boolean plus_sign = false; // true - ������ ��������� ������������� �����

            for (char c : line) { // ���������� ������ �����������
                if (c == '+') { // ���� ��������� ������ '+'
                    plus_sign = true; // �� ������ ��������� ������������� �����
                    continue; // ��������� � ����. �������
                }

                if (c == ' ' && plus_sign) { // ���� ��������� ������ ������ � ��������� �����. �����
                    int num = Integer.parseInt(number.toString()); // ��������� ������ � ������ � int
                    if (num % 2 == 0) { // ���� ����� ������
                        count++; // ������. ���-��
                    }
                    plus_sign = false; // �� ��� ��������� ��������� �����. �����
                    number.delete(0, number.length()); // ������� ������ number
                }

                else if (plus_sign) { // ���� ��������� �����. ����� � ������ �� ' '
                    number.append(c); // �� ���������� ��� � ����������
                }
            }

            // ��������� ���������� ����� � ������
            if (plus_sign) { // ���� �������.
                int num = Integer.parseInt(number.toString()); // ��������� ������ � ������ � int
                if (num % 2 == 0) { // ���� ����� ������
                    count++; // ������. ���-��
                }
            }
        }

        System.out.println("������������� ������ ����� � �����: " + count);

        // ��������� ����� ������ �����
        read_file1.close();

    }
}

 
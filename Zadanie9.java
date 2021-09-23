package Laba2;
import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Zadanie9 {

	 public static void main(String[] args) throws Exception {
	        // ��������� ����� ��� ������ ����� 1
	        FileReader read_file1 = new FileReader("file1.txt");

	        // ��������� ����� ��� ������ ����� 2
	        FileWriter write_file2 = new FileWriter("file2.txt");

	        // ������ ��� ������ �����
	        Scanner scan = new Scanner(read_file1);

	        StringBuilder file_content = new StringBuilder();
	        // ���� �������� ���� � ����� ���� �� ����������� ������
	        while(scan.hasNextLine()) {
	            String line = scan.nextLine() + '\n';
	            file_content.append(line);
	        }

	        int i = 0;
	        boolean minus_x = false;

	        for (char c :  file_content.toString().toCharArray()) {
	            if (c == '-' && !minus_x) {
	                file_content.setCharAt(i, '0');
	                minus_x = true;
	            }
	            else if (c == ' ') {
	                minus_x = false;
	            }
	            else if (minus_x) {
	                file_content.deleteCharAt(i);
	                i--;
	            }
	            i++;
	        }

	        write_file2.write(file_content.toString().toCharArray());
	        System.out.println("������ ������ �������. ��������� file2.txt");

	        // ��������� ����� ������ �����
	        read_file1.close();
	        write_file2.close();

	    }
	}
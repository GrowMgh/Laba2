package Laba2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Class2 {
	private static final String PATH = "file1.txt";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner read = new Scanner(System.in);
			System.out.print("������� ���������: ");
			String sub = read.nextLine().trim();

			//������ ����
			try (Scanner reader = new Scanner(new File(PATH))) {
			while (reader.hasNextLine()) {
			String lineFile = reader.nextLine();
			//���� ������ �� ������������� ��� �����, �� �������
			if (lineFile.contains(sub)) {
			System.out.println(lineFile);
			}
			}

			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}

			}
			}


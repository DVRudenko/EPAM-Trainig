package by.epam.course.circle1;

// ����� 1.	�������� ���������, ��� ������������ ������ ����� ����� ������������� �����. 
// � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int result=0;
		
		Scanner in = new Scanner (System.in);
				
		// ������ ����� � ��������� ������������ �������� ������ 
		do {
			System.out.println("������� ����� ������������� �����");
			while (!in.hasNextInt()) {
				System.out.println("������� ���������� �����");
				in.next();
			}
			n = in.nextInt();
		} while (n <= 0);
		// ������� �����
		for (int i=1; i<=n; i++) {
			result+=i;
		}
					
		System.out.println("�����="+result);
	
	}
}
	

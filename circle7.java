package by.epam.course.circle7;
// ����� 	7.	��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����. m � n �������� � ����������
//

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int m; // �������������� ����������
		int n; //
		boolean  flag;

		Scanner in = new Scanner(System.in);

		// ������ ����� m � n � ��������� ������������ �������� ������
		do {
			System.out.println("������� ��� ����������� ����� m < n ����� ������"); // ������� ���������
			while (!in.hasNextInt() & !in.hasNextInt()) {
				System.out.println("������� ���������� �����"); // ������� �� ����� ���� Int
				in.next();
				in.next();
			}
			m = in.nextInt();
			n = in.nextInt();
		} while (m > n); // ���������, ��� �������� m<n.

		for (int i = m; i <= n; i++) { // ���������� ���� ��������
			System.out.print("\n�������� ����� " + i + "-");
			flag=true;
			for (int j = 2; j <= i/2; j++) { // ���������� ��� ��������
				if (i % j == 0) {
					System.out.print(j + " ");
					flag=false; //���������� ����, ���� ��� ���������
				}
				
			}
			if (flag) {
				System.out.print("��� ���������");
								}
		}
	}
}



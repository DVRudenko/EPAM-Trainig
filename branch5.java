package by.epam.course.branching5;

// ��������� 5.	��������� �������� ������� ��� x<=3 � x>3

public class Main {

	public static void main(String[] args) {
		float x=2.5f; // ������ ��������
		float result;
		
		// ������������ �������� ������ �� ���������

		result=x<=3 ? x*x-3*x+9 : 1/(x*x*x+6);
					
		System.out.println("�������� �������="+result);
	

	}
}
	

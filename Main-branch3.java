package by.epam.course.branching3;

// ��������� 3.	���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������

public class Main {

	public static void main(String[] args) {
		
		float x1=1.0f; // ������ ���������� �������� �����
		float x2=2.0f; // ������ ���������� �������� �����
		float x3=3.0f; // ������ ���������� �������� �����
		float y1=1.0f; // ������ ���������� �������� �����
		float y2=2.0f; // ������ ���������� �������� �����
		float y3=3.0f; // ������ ���������� �������� �����
		boolean isOnStraight;
		final float APPROX=1E-10f; //������� ���������� �����������
				
		isOnStraight=Math.pow(0.5*((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)),2)<=APPROX; // ����� �� ����� �� ����� ������? (����� ������� ������������)
					
		if (isOnStraight) {
			System.out.println("����� ����� �� ����� ������");
		}
		else {
			System.out.println("����� �� ����� �� ����� ������");
		}

	}
}
	

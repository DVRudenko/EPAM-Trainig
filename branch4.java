package by.epam.course.branching4;

// ��������� 4.	������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ ����� ���������

public class Main {

	public static void main(String[] args) {
		float a=2.0f; // ������� ���������
		float b=1.0f;
		float x=3.0f; // ������� �������
		float y=2.0f;
		float z=2.0f;
	
		boolean isInHole;
		boolean side1;
		boolean side2;
		boolean side3;
		
		// ������������ �������� ������ �� ���������

		side1=(a>=x) && (b>=y)||(a>=y) && (b>=x); // �������� �������� 1
		side2=(a>=x) && (b>=z)||(a>=z) && (b>=x); // �������� �������� 2
		side3=(a>=z) && (b>=y)||(a>=y) && (b>=z); // �������� �������� 3
		
		
		isInHole=side1||side2||side3; // �������� �� � ��������� ����� �� ������
					
		if (isInHole) {
			System.out.println("������ �������");
		}
		else {
			System.out.println("������ �� �������");
		}

	}
}
	

package by.epam.course.branching2;

// 2.	����� max{min(a, b), min(c, d)}

public class Main {
	
	public static void main(String[] args) {
	
		float a=5.2f; //������ �������� �����
		float b=2.1f; //������ �������� �����
		float c=1.5f; //������ �������� �����
		float d=2.3f; //������ �������� �����
		float min1;
		float min2;
		float max;
				
		// ������ Math.Min � Math.M�� �� ����������

		min1 = a<b ? a : b;             // ������� ������ �������
		min2 = c<d ? c : d;		// ������� ������ �������
		max = min1>min2 ? min1 : min2;	// ������� ������������ �� �����������
	
		System.out.print(max);
	}

}

package by.epam.course.circle5;
// ����� 	5.	���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        float an=1/2f+1/3f; //�������������� ������ �������� ����
        float result=an; // ����� ����
        int n=1; //�������=1
        float e;

       Scanner in = new Scanner (System.in);
      
        // ������ ����� E � ��������� ������������ �������� ������
        do {
            System.out.println("������� ����� ������������� ����� E ����� 0 � ����� 0,5"); //��� ������ ��������� E ��� ����� �� ��������
            while (!in.hasNextFloat()) {
                System.out.println("������� ���������� �����"); //������� �� ����� ���� float
                in.next();
            }
            e = in.nextFloat();
        } while ((e <= 0)||(e>0.5)); // ���������, ��� E - ����� �����. 

        // System.out.println(n+"-� ���� ���� = "+an); // ��� �������������� �������� ���������� ������� �������� ����
        while (e<=Math.abs(an)){   //�������� ��������� ������� 
            n++;
            an = (float) (1/Math.pow(2,n)+1/Math.pow(3,n)); //��������� �������� ���� �� �������� �������
            //System.out.println(n+"-� ���� ���� = "+an); // ��� �������������� �������� ���������� ������� �������� ����
            result+=an;
        }

        System.out.println("����� = "+result);

    }
}



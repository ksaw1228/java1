package E5_�迭5_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭5_�˰���_������ {
	/*	
		 ���� 1) ������ ������ �� ���
		 ���� 1) 4400, 7100, 5400		
		 ���� 2) ȣ�� �Է��ϸ� ������ ���
		 ���� 2) �Է� : 202	������ ��� : 2000	
		 ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		 ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)		
		 ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü (101 , 102) ==>  (2100, 1000)		
		 ���� 5) ������ ���� ���¼������ ������� ȣ�� ��� (����)
	*/
	public static void main(String[] args) {

		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		int k =0;
		int[] arr1 = new int [9];
		int[] arr2 = new int [9];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr1[k] = apt[i][j];
				arr2[k] = pay[i][j];
				k = k+1;
			}
		}
		int[] total = new int [3];
		Scanner sc = new Scanner(System.in);
		int pay1 =0;
		int pay2 =0;
		int room1 =0;
		int room2 =0;
		int room3 =0;
		int room4 =0;
		int max =0;
		
		System.out.println("[����1][����2][����3][����4][����5]");
		int SEL = sc.nextInt();
		//���� ������ ��
		if(SEL==1) {
			System.out.println("�� ���� ������ ��");
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					total[i] = total[i] + pay[i][j];
				}
			}
			System.out.println(Arrays.toString(total));	
			//ȣ���Է½� ������ ���
		}else if(SEL==2) {
			System.out.println("������ ����� ȣ���� �Է��ϼ���");
			int inp = sc.nextInt();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(inp == apt[i][j]) {
						System.out.println(pay[i][j]);
					}
				}
			}			
		}
		//������ max , min ���
		else if(SEL==3) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(max<pay[i][j]) {
						max = pay[i][j];
						pay1= i;
						pay2 =j;
					}
				}
			}
			System.out.println("������ ���� ���̳�����:"+ apt[pay1][pay2]);
		}
		//ȣ�� 2�� �Է��ϸ� ������ ��ü
		else if(SEL==4) {
			System.out.println("������ ��ü�� ȣ���� 2�� �Է��ϼ���:");
			int ch1 = sc.nextInt();
			int ch2 = sc.nextInt();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(ch1 == apt[i][j]) {
						room1 = i;
						room2 = j;
					}if(ch2 == apt[i][j]) {
						room3 = i;
						room4 = j;
					}
				}int temp = pay[room1][room2];
				pay[room1][room2] = pay[room3][room4];
				pay[room3][room4] = temp;
			}
		}
		//ū ������� ȣ�� ������ ����
		else if(SEL==5) {
			for(int i = 1; i < 9; i++) {
				for(int j = 0; j < i; j++) {
					if(arr2[i] < arr2[j]) {
						int temp = arr2[i];
						arr2[i] = arr2[j];
						arr2[j] = temp;
						int temp1 = arr1[i];
						arr1[i] = arr1[j];
						arr1[j] = temp1;
					}
				}			
			}k = 0;
			for(int i = 0; i < 3; i ++) {
				for(int j = 0; j < 3; j++) {
					apt[i][j] = arr1[k];
					pay[i][j] = arr2[k];
					k += 1;
				}
			}
		}
		System.out.println("-----------------------------------------");
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(apt[i]));
		}for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(pay[i]));
		}
		
		
	}
}
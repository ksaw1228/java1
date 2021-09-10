package E5_배열5_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열5_알고리즘_관리비 {
	/*	
		 문제 1) 각층별 관리비 합 출력
		 정답 1) 4400, 7100, 5400		
		 문제 2) 호를 입력하면 관리비 출력
		 정답 2) 입력 : 202	관리비 출력 : 2000	
		 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)		
		 문제 4) 호 2개를 입력하면 관리비 교체 (101 , 102) ==>  (2100, 1000)		
		 문제 5) 관리비 많이 나온순서대로 관리비와 호수 출력 (정렬)
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
		
		System.out.println("[문제1][문제2][문제3][문제4][문제5]");
		int SEL = sc.nextInt();
		//층별 관리비 합
		if(SEL==1) {
			System.out.println("각 층별 관리비 합");
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					total[i] = total[i] + pay[i][j];
				}
			}
			System.out.println(Arrays.toString(total));	
			//호수입력시 관리비 출력
		}else if(SEL==2) {
			System.out.println("관리비를 출력할 호수를 입력하세요");
			int inp = sc.nextInt();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(inp == apt[i][j]) {
						System.out.println(pay[i][j]);
					}
				}
			}			
		}
		//관리비 max , min 출력
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
			System.out.println("관리비 제일 많이나온집:"+ apt[pay1][pay2]);
		}
		//호수 2개 입력하면 관리비 교체
		else if(SEL==4) {
			System.out.println("관리비를 교체할 호수를 2개 입력하세요:");
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
		//큰 순서대로 호수 관리비 정렬
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
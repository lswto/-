package demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				System.out.println("������m��");
				int input = scanner.nextInt();
				
				//��¼�ܹ��ж���ͷţ
				int sum = 0;
				
				//ÿ�������Сĸţ
				List<Integer> list=new ArrayList<>();
				
				int a =1,b=0;
				int temp = 0;
				int index = 0;
				for(int i = 2;i<=input;i++){
					if(i>=5) {
						a+=list.get(temp);
						b-=list.get(temp);
						temp++;
					}
					list.add(a);
					b +=list.get(index);
					index++;
				}
				sum=a+b;
				System.out.println("��"+input+"���ܹ���"+sum+"ͷţ");
	}
}

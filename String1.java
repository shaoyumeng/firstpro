package cn.sym.day09;

import java.util.Scanner;

/*1.����һ���ַ���,�жϸ��ַ������Ƿ����ĳ���Ӵ�.�������,����Ӵ������г���λ��.
��:"abcbcbabcb34bcbd"��,"bcb"�Ӵ��ĳ���λ��Ϊ: 1,7,12.�ַ������Ӵ������û�����*/

public class String1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = input.nextLine();
		System.out.println("������һ�����ַ�����");
		String s1 = input.nextLine();
		
		System.out.println("\"" + s + "\"��,\""  + s1 + "\"�Ӵ��ĳ���λ��Ϊ��");
		for(int i = 0; i < s.length();) {
			int n = s.indexOf(s1,i);
			if(n == -1) {
				break;
			}else {
				System.out.print(n + " ");
				i = n + s1.length();
			}
		}
	}

}

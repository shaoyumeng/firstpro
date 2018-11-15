package cn.sym.day09;

import java.util.Scanner;

/*1.给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置.
如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为: 1,7,12.字符串和子串均由用户输入*/

public class String1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = input.nextLine();
		System.out.println("请输入一个子字符串：");
		String s1 = input.nextLine();
		
		System.out.println("\"" + s + "\"中,\""  + s1 + "\"子串的出现位置为：");
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

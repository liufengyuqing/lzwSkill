package lzwSkill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputMethon {
	public static void main(String args[]) {
		String m;
		m = JOptionPane.showInputDialog("输入一个字符串");
		
		JOptionPane.showMessageDialog(null, m, "你输入的是", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, m);
		 
	System.out.println("请在控制台输入数据");
		Scanner reader=new Scanner(System.in);
		int a=reader.nextInt();
		System.out.println(a);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String s=br.readLine();
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("执行完毕");
		
		

	}
}

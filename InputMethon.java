package lzwSkill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputMethon {
	public static void main(String args[]) {
		String m;
		m = JOptionPane.showInputDialog("����һ���ַ���");
		
		JOptionPane.showMessageDialog(null, m, "���������", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, m);
		 
	System.out.println("���ڿ���̨��������");
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
		System.out.println("ִ�����");
		
		

	}
}

package lzwSkill;
/*1������ģ��
import javax.swing.JOptionPane;
2������Ի���
String num=JOptionPane.showInputDialog("������aֵ��");
3������Ի���
JOptionPane.showMessageDialog(null, "a<b");
4��ע�������Ϊ�ַ�������Ҫת����int��
int a=Integer.parseInt(num);*/

import javax.swing.JOptionPane;

public class ShuRu {
	public static void main(String[] args) {
		//����ȱʡֵ
				String num=JOptionPane.showInputDialog("������aֵ��");
				
				//��ȱʡֵ
				String num2=JOptionPane.showInputDialog("������bֵ��");
				try{
				int a=Integer.parseInt(num);
				int b=Integer.parseInt(num2);
				if(a > b){
					//System.out.print("a����b");
					JOptionPane.showMessageDialog(null, "a>b");
				}
				else if(a==b){
					//System.out.print("a����b");
					JOptionPane.showMessageDialog(null, "a=b");
				}
				else
					//System.out.print("aС��b");
					JOptionPane.showMessageDialog(null, "a<b");
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "�ַ��Ƿ�","��ʾ����",JOptionPane.DEFAULT_OPTION);
				}		
	}

}

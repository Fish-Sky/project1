package project1;

import java.util.Random;
import java.util.Scanner;

public class test1 {
public static void res(){
System.out.println("1.��ʾ���\t2.ֱ�ӿ�ʼ��һ��");
}
@SuppressWarnings({ "resource" })
public static void main (String[] arge){
	System.out.println("*****��ѡ��Ҫ������ɵ��㷨*****");
    System.out.println("\t1,�ӷ�\t2,����\t3,�˷�\t4,����");
    System.out.println("**********");
    Scanner sd=new Scanner(System.in);
    int s = sd.nextInt();
    double result=0;
    Random r = new Random();
    int a = r.nextInt(100);
    int b =r.nextInt(100);
switch(s){
case 1:
	System.out.println("-----|"+a+"+"+b+"=?|-----");
	result =a+b;
	Scanner sc = new Scanner(System.in);
	System.out.println("������Ĵ𰸣�");
	int answer=sc.nextInt();
	if(answer==result)
	{
		System.out.println("��ȷ��");
	}
	else
	{
		System.out.println("����");
	}
	res();
	break;
case 2:
	System.out.println("-----|"+a+"-"+b+"=?|-----");
	result =a-b;
	Scanner sc2 = new Scanner(System.in);
	System.out.println("������Ĵ𰸣�");
	int answer2=sc2.nextInt();
	if(answer2==result)
	{
		System.out.println("��ȷ��");
	}
	else
	{
		System.out.println("����");
	}
	res();
	break;
case 3:
	System.out.println("-----|"+a+"*"+b+"=?|-----");
	result =a*b;
	Scanner sc3 = new Scanner(System.in);
	System.out.println("������Ĵ𰸣�");
	int answer3=sc3.nextInt();
	if(answer3==result)
	{
		System.out.println("��ȷ��");
	}
	else
	{
		System.out.println("����");
	}
	res();
	break;
case 4:
	System.out.println("-----|"+a+"/"+b+"=?|-----");
	{
		float c=a;
	    float d=b;
	    result=c/d;
	    }
	Scanner sc4 = new Scanner(System.in);
	System.out.println("������Ĵ𰸣�");
	int answer4=sc4.nextInt();
	if(answer4==result)
	{
		System.out.println("��ȷ��");
	}
	else
	{
		System.out.println("����");
	}
	res();
	break;
default:
	System.out.println("�����������¿�ʼ");
	main(null);
	break;
}
Scanner select =new Scanner(System.in);
int se =select.nextInt();
switch (se){
case 1:
	System.out.println("����Ľ����"+result);
	main(null);
	break;
case 2:
	main(null);
	break;
default:
	System.out.println("�����������¿�ʼ");
	main(null);
}
}
}



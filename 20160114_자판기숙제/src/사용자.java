import java.util.Scanner;

public class ����� {
	
	static String userName;
	static int userMoney;
	static int[] moneyType=new int[5];
	static int[] insertType=new int[5];
	static int insertMoney;
	static Scanner scan=new Scanner(System.in);
	//������ ����
	static void input()
	{
		System.out.println("�̸�:");
		String name=scan.next();
		System.out.println("100�� ����:");
		moneyType[0]=scan.nextInt();
		System.out.println("500�� ����:");
		moneyType[1]=scan.nextInt();
		System.out.println("1000�� ����:");
		moneyType[2]=scan.nextInt();
		System.out.println("5000�� ����:");
		moneyType[3]=scan.nextInt();
		System.out.println("10000�� ����:");
		moneyType[4]=scan.nextInt();
		for(int i=0;i<5;i++)
		{
			userMoney += ��.money[i]*moneyType[i];
		}
		System.out.println("�����ݾ�: "+userMoney);
	}
	//�� �ֱ�
	static void insert()
	{
		System.out.println("�����ϴ� 100��:");
		insertType[0]=scan.nextInt();
		System.out.println("�����ϴ� 500��:");
		insertType[1]=scan.nextInt();
		System.out.println("�����ϴ� 1000��:");
		insertType[2]=scan.nextInt();
		System.out.println("�����ϴ� 5000��:");
		insertType[3]=scan.nextInt();
		System.out.println("�����ϴ� 10000��:");
		insertType[4]=scan.nextInt();
		for(int i=0;i<5;i++)
		{
			insertMoney += ��.money[i]*insertType[i];
		}
		userMoney-=insertMoney;
	}

}

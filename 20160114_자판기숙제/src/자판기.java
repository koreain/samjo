import java.util.Scanner;

public class ���Ǳ� {
	
	static int[] tMoney = {100,100,100,50,50}; // ȭ�������� ����
	static int Money=tMoney[0]*100+tMoney[1]*500+tMoney[2]*1000+tMoney[3]*5000+tMoney[4]*10000; //���Ǳ� �� �����ݾ�
	static int[] numDrink={10,10,10}; //����� �̸��� ����
	static int chooseDrink; //0,1,2 ����� ����
	static Scanner scan=new Scanner(System.in);

	//�ݾ�����
	static void insMoney()
	{
		System.out.println("���Աݾ�"+�����.insertMoney+"��");
		
		for(int i=0;i<5;i++)
		{
			tMoney[i]+=�����.insertType[i];
		}
	}
	
	
	
	//��ȿ����
	static void chooseDrink()
	{
		System.out.println("�ݶ�(0),���̴�(1),����(2) �߿� ���� ���Ƿ�?");
		chooseDrink=scan.nextInt();
		if(chooseDrink!=0&&chooseDrink!=1&&chooseDrink!=2)
		{
			System.out.println("�׷� ����� ���ܴ�.");
			chooseDrink();
		}
		else
		{
			if(numDrink[chooseDrink]==0)
			{
				System.out.println("�ش� ���ᰡ �����ϴ�.");
				chooseDrink();
			}
			else
			{
				minusDrink();//���ứ��
			}	
		}
		
	}
	
	//������ Ȯ��
			static void moneyCheck()
			{
				if(�����.insertMoney<����.drinkPrice[chooseDrink])
				{	int plus =����.drinkPrice[chooseDrink]-�����.insertMoney;
					System.out.println(plus+"���� �� �־��ֽʽÿ�!");
					�����.insert();
				}
			}

			
	// ���ứ��
	static void minusDrink()
	{
		numDrink[chooseDrink]--;
	}
	
	//�ݾ׹�ȯ (�ܵ�ǥ��)
	static boolean returnMoney()
	{   
		boolean bCheck=true;
		int charge=�����.insertMoney-����.drinkPrice[chooseDrink];
		int[] chg=new int[5];
		chg[4]= charge/10000;
		chg[3]=(charge%10000)/5000;
		chg[2]=(charge%5000)/1000;
		chg[1]=(charge%1000)/500;
		chg[0]=(charge%500)/100;
		
	for(int i=0;i<5;i++)
	{
		if(chg[i]>tMoney[i])
		{
			for(int j=0;j<5;j++)
			{
				tMoney[i]-=�����.insertType[i];
			}
			bCheck=false;
			break;
		}
		else
		{
			tMoney[i]-=chg[i];
			�����.moneyType[i]+=chg[i];
			bCheck=true;
		}
	}
	if(bCheck==true)
		System.out.println("�ܵ���: "+charge);
	else
		System.out.println("�ܵ��� �����ϴ�.");
	
	return bCheck;
	
	}
	
	
}

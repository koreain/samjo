import java.util.Scanner;

public class 자판기 {
	
	static int[] tMoney = {100,100,100,50,50}; // 화폐유형별 개수
	static int Money=tMoney[0]*100+tMoney[1]*500+tMoney[2]*1000+tMoney[3]*5000+tMoney[4]*10000; //자판기 총 보유금액
	static int[] numDrink={10,10,10}; //음료수 이름별 개수
	static int chooseDrink; //0,1,2 음료수 선택
	static Scanner scan=new Scanner(System.in);

	//금액투입
	static void insMoney()
	{
		System.out.println("투입금액"+사용자.insertMoney+"원");
		
		for(int i=0;i<5;i++)
		{
			tMoney[i]+=사용자.insertType[i];
		}
	}
	
	
	
	//음효선택
	static void chooseDrink()
	{
		System.out.println("콜라(0),사이다(1),우유(2) 중에 무얼 마실래?");
		chooseDrink=scan.nextInt();
		if(chooseDrink!=0&&chooseDrink!=1&&chooseDrink!=2)
		{
			System.out.println("그런 음료는 없단다.");
			chooseDrink();
		}
		else
		{
			if(numDrink[chooseDrink]==0)
			{
				System.out.println("해당 음료가 없습니다.");
				chooseDrink();
			}
			else
			{
				minusDrink();//음료빼기
			}	
		}
		
	}
	
	//받은돈 확인
			static void moneyCheck()
			{
				if(사용자.insertMoney<음료.drinkPrice[chooseDrink])
				{	int plus =음료.drinkPrice[chooseDrink]-사용자.insertMoney;
					System.out.println(plus+"원을 더 넣어주십시오!");
					사용자.insert();
				}
			}

			
	// 음료빼기
	static void minusDrink()
	{
		numDrink[chooseDrink]--;
	}
	
	//금액반환 (잔돈표시)
	static boolean returnMoney()
	{   
		boolean bCheck=true;
		int charge=사용자.insertMoney-음료.drinkPrice[chooseDrink];
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
				tMoney[i]-=사용자.insertType[i];
			}
			bCheck=false;
			break;
		}
		else
		{
			tMoney[i]-=chg[i];
			사용자.moneyType[i]+=chg[i];
			bCheck=true;
		}
	}
	if(bCheck==true)
		System.out.println("잔돈은: "+charge);
	else
		System.out.println("잔돈이 없습니다.");
	
	return bCheck;
	
	}
	
	
}

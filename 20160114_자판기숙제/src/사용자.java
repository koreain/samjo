import java.util.Scanner;

public class 사용자 {
	
	static String userName;
	static int userMoney;
	static int[] moneyType=new int[5];
	static int[] insertType=new int[5];
	static int insertMoney;
	static Scanner scan=new Scanner(System.in);
	//가진돈 셋팅
	static void input()
	{
		System.out.println("이름:");
		String name=scan.next();
		System.out.println("100원 개수:");
		moneyType[0]=scan.nextInt();
		System.out.println("500원 개수:");
		moneyType[1]=scan.nextInt();
		System.out.println("1000원 개수:");
		moneyType[2]=scan.nextInt();
		System.out.println("5000원 개수:");
		moneyType[3]=scan.nextInt();
		System.out.println("10000원 개수:");
		moneyType[4]=scan.nextInt();
		for(int i=0;i<5;i++)
		{
			userMoney += 돈.money[i]*moneyType[i];
		}
		System.out.println("보유금액: "+userMoney);
	}
	//돈 넣기
	static void insert()
	{
		System.out.println("투입하는 100원:");
		insertType[0]=scan.nextInt();
		System.out.println("투입하는 500원:");
		insertType[1]=scan.nextInt();
		System.out.println("투입하는 1000원:");
		insertType[2]=scan.nextInt();
		System.out.println("투입하는 5000원:");
		insertType[3]=scan.nextInt();
		System.out.println("투입하는 10000원:");
		insertType[4]=scan.nextInt();
		for(int i=0;i<5;i++)
		{
			insertMoney += 돈.money[i]*insertType[i];
		}
		userMoney-=insertMoney;
	}

}

import java.util.Scanner;
public class main {
	static Scanner scan = new Scanner(System.in);
	static void process()
	{
		사용자.input();
		사용자.insert();
		자판기.insMoney();
		자판기.chooseDrink();
		자판기.moneyCheck();
		자판기.returnMoney();
		if(자판기.returnMoney()==true)
		{
			자판기.minusDrink();
			
		}
		
		System.out.println("다시 구매를 진행하시겠습니까? y(0),n(1)");
		int yn=scan.nextInt();
		if(yn==0)
			process();
		else
		System.out.println("이용해 주셔서 감사합니다.");
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

import java.util.Scanner;
public class main {
	static Scanner scan = new Scanner(System.in);
	static void process()
	{
		�����.input();
		�����.insert();
		���Ǳ�.insMoney();
		���Ǳ�.chooseDrink();
		���Ǳ�.moneyCheck();
		���Ǳ�.returnMoney();
		if(���Ǳ�.returnMoney()==true)
		{
			���Ǳ�.minusDrink();
			
		}
		
		System.out.println("�ٽ� ���Ÿ� �����Ͻðڽ��ϱ�? y(0),n(1)");
		int yn=scan.nextInt();
		if(yn==0)
			process();
		else
		System.out.println("�̿��� �ּż� �����մϴ�.");
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

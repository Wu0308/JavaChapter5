package chapter5;

public class Sample6_8 {
	public static void main(String[] args) {
		Company_Sample6_8 cmp = new Company_Sample6_8();
		
		Driver_Sample6_8 dr1 = new Driver_Sample6_8(cmp);
		dr1.start();
		
		Driver_Sample6_8 dr2 = new Driver_Sample6_8(cmp);
		dr2.start();
	}
}

class Company_Sample6_8 {
	private int sum = 0;
	
	public synchronized void add(int a) {
		int tmp = sum;
		System.out.println("目前的合計金額是"+tmp+"元");
		System.out.println("賺到"+a+"元了。");
		tmp = tmp + a;
		System.out.println("合計金額是"+tmp+"元");
		sum = tmp;
	}
}


class Driver_Sample6_8 extends Thread{
	private Company_Sample6_8 comp;
	
	public Driver_Sample6_8(Company_Sample6_8 c) {
		comp = c;
	}
	
	public void run(){
		for(int i=0; i<3; i++) {
			comp.add(50);
		}
	}	
}
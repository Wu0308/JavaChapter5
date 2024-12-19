package chapter5;

public class Sample6_2 {
	public static void main(String[] args) {
		Car_Sample6_2 car1 = new Car_Sample6_2("1號車");
		car1.start();
		
		Car_Sample6_2 car2 = new Car_Sample6_2("2號車");
		car2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("正在執行main()的處理工作");
		}
		
	}
}

class Car_Sample6_2 extends Thread{
	private String name;
	
	public Car_Sample6_2(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("正在執行"+name+"的處理工作");
		}
	}
}
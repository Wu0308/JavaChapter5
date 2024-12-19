package chapter5;

public class Sample6_6 {
	public static void main(String[] args) {
		Car_Sample6_6 car1 = new Car_Sample6_6("一號車");
		
		Thread th1 = new Thread(car1);
		th1.start();
		
		for(int i=0; i<5; i++) {
		System.out.println("正在執行main()的處理工作");
		}
	}
}

class Car_Sample6_6 implements Runnable{
	private String name;
	
	public Car_Sample6_6(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
				System.out.println("正在執行"+name+"的處理工作");
		}
	}
}
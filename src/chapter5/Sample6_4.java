package chapter5;

public class Sample6_4 {
	public static void main(String[] args) {
		Car_Sample6_4 car1 = new Car_Sample6_4("1號車");
		car1.start();
		
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在執行main()的處理工作");
			}catch(InterruptedException e) {
				
			}
			
			
			
		}
		
	}
}

class Car_Sample6_4 extends Thread{
	private String name;
	
	public Car_Sample6_4(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
				System.out.println("正在執行"+name+"的處理工作");
		}
	}
}
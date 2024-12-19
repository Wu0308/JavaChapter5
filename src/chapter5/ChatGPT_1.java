package chapter5;

import java.awt.*;
import java.awt.event.*;

public class ChatGPT_1 {
	 public static void main(String[] args) {
	        Frame frame = new Frame("AWT Example");
	        Button button = new Button("Click Me");

	        // 設置按鈕的事件處理
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("Button Clicked");
	            }
	        });

	        // 設置視窗的大小和按鈕的佈局
	        frame.setSize(300, 200);
	        frame.setLayout(new FlowLayout());
	        frame.add(button);

	        // 顯示視窗
	        frame.setVisible(true);

	        // 關閉視窗時退出
	        frame.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent windowEvent) {
	                System.exit(0);
	            }
	        });
	    }
}

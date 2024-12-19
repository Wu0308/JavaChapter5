package chapter5;

import java.util.Date;
import java.util.Calendar;


public class ChatGPT_3 {
	public static void main(String[] args) {
        // 獲取當前時間
        Date now = new Date();
        System.out.println("Current date and time: " + now);

        // 使用 Calendar 來增加日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, 5);  // 增加5天
        Date futureDate = calendar.getTime();
        System.out.println("Date after 5 days: " + futureDate);
    }
}

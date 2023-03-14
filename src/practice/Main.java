package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("曜日を入力して下さい");
	    String week = new Scanner(System.in).nextLine();
	    // 以下に処理を記述
	    
	    //上記の省略形について。キーボードから入力されたものを受け取る	    
	    //Scanner scanner = new Scanner(System.in);
	    //String input = scanner.nextLine();
	    
	    //下、ミス。列挙型enumのDayOfWeekはインスタンス生成できない
	    //DayOfWeek dayOfWeek = new DayOfWeek(input);
	    
	    DayOfWeek dayOfWeek = DayOfWeek.valueOf(week);
	    
	    switch(dayOfWeek) {
	    case Sun:
	    	System.out.println( "日曜日です");
	    	break;
	    case Mon:
	    	System.out.println( "月曜日です");
	    	break;
	    case Tue:
	    	System.out.println( "火曜日です");
	    	break;
	    case Wed:
	    	System.out.println( "水曜日です");
	    	break;
	    case Thu:
	    	System.out.println( "木曜日です");
	    	break;
	    case Fri:
	    	System.out.println( "金曜日です");
	    	break;
	    case Sat:
	    	System.out.println( "土曜日です");
	    	break;
	    }

	}

}

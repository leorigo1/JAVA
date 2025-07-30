import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comments;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("Have a nice trip!");
		Comments c2 = new Comments("How that's awesome");
		Comments c3 = new Comments("Good Night!");
		Comments c4 = new Comments("May the force be with you");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to new Zeland","I'm going to visit this wonderful country",12);
		p1.addComents(c1);
		p1.addComents(c2);
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good Night guys","See you tomorrow",5);
		p2.addComents(c3);
		p2.addComents(c4);
		
		System.out.println(p1);
		System.out.println(" ");
		System.out.println(p2);
		
	}
}

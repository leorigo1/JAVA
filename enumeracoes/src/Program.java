import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order order = new Order(10, new Date(), OrderStatus.wait_payment);

		OrderStatus os1 = OrderStatus.delivered;
		
		OrderStatus os2 = OrderStatus.valueOf("delivered");
		
	System.out.println(order);	
	System.out.println(os2);

		
	}
}

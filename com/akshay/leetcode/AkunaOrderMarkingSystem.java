package com.akshay.leetcode;

public class AkunaOrderMarkingSystem {
	static int position=0;
	static Boolean flag=false; //flag to identify whether to change the marking position in next Txn
	
	public void new_order(AkunaOrder order){		
		
		if(flag){
			position+=order.quantity;
		}
		else {
			if (order.type=="SELL")
				position+=order.quantity;
			else 
				flag=true;
		}
		flag=false;
	}		
	public void order_ack(AkunaOrder order){
			
	}
	public void order_reject(AkunaOrder order){
		position+=order.quantity;
	}
	public void cancel_order(AkunaOrder order){
		if(!order.filled)			
			flag=true;		
	}
	public void ack_cancel(AkunaOrder order){
		if (flag==true)
			position+=order.quantity;
		flag=false;
	}
	public void reject_cancel(AkunaOrder order){
		if(!order.filled)
			flag=true;		
	}
	public void fill_order(AkunaOrder order, int filled_quantity){
		position-=filled_quantity;
		if (order.quantity == filled_quantity)
				order.filled=true;		
	}
		
	public static class AkunaOrder {
		 int orderid;
		 int quantity;
		 String type;
		 Boolean filled;
		
		 public AkunaOrder(int orderid, int quantity, String type, Boolean filled) {
			super();
			this.orderid = orderid;
			this.quantity = quantity;
			this.type = type;
			this.filled = filled;
		}

		@Override
		public String toString() {
			return "AkunaOrder [orderid=" + orderid + ", quantity=" + quantity + ", type=" + type + ", filled=" + filled
					+ "]";
		}	 	 
	}

		
	public static void main(String[] args) {
		AkunaOrderMarkingSystem aos = new AkunaOrderMarkingSystem();
		
		//creating new order
		AkunaOrder order1 = new AkunaOrder(1, 900, "SELL", false);
		
		//placing new order
		aos.new_order(order1);
		
		//new order acknowledged
		aos.order_ack(order1);
		
		//cancel order
		aos.cancel_order(order1);
		
		//acknowledge cancel
		aos.ack_cancel(order1);
		
		
		AkunaOrder order2 = new AkunaOrder(2, 400, "BUY", false);
		//placing new order
		aos.new_order(order2);
		
		//rejection of order
		aos.order_reject(order2);
				
		AkunaOrder order3 = new AkunaOrder(3, 1800, "BUY", false);
		//placing new order
		aos.new_order(order3);
		
		//new order acknowledged
		aos.order_ack(order3);
		
		//new order filled
		aos.fill_order(order3,1800);
		
		
		AkunaOrder order4 = new AkunaOrder(4, 1100, "SELL", false);
		//placing new order
		aos.new_order(order4);
		
		//order rejection
		aos.order_reject(order4);
		
		//order rejection
		aos.cancel_order(order3);
		
		//order rejection
		aos.reject_cancel(order3);	
		
		System.out.println(order4);
	}

}

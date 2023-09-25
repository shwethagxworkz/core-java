class RefillExecutor {
	public static void main(String[] ref){
		
	Refill refill=new Refill();
	refill.setRefillName("Reynolds");
	refill.setColour("Blue");
	refill.setType("Use and tough");
		
	Pen pen=new Pen();
	pen.refill=refill;
	
	pen.penName="Nataraja Pen";
	System.out.println("------------------------------------------------------------------------");							
	System.out.println("Pen Name"+pen.penName);
	System.out.println("Refill Name : "+pen.refill.getRefillName());
	System.out.println("Refill colour : "+pen.refill.getColour());
	System.out.println("Refill type : "+pen.refill.getType());
	System.out.println("------------------------------------------------------------------------");									
	}
}
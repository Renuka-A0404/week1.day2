package week1.day2;

public class Mobileeee {
	    String msg;
	    
	    //method
	    public void mobileBrand() {
	    	System.out.println("brand");
	    }

	    public String sendSms(String msg) {
	    	msg="hello";
	    	System.out.println(msg);
	    	return msg;
	    	
	    }
	    
	    protected void videoCall() {
	    	System.out.println("Make a call");
	    	
	    }
	    
	    void status() {
	    	System.out.println("My status");	
	    }
	    
	public static void main(String[] args) {
		// data
		 String brand="samsung";
		 boolean isCharged=true;
		 System.out.println(brand);
		 System.out.println(isCharged);

	}

}

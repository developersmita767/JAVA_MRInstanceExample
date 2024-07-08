package Java_8;


interface Add{  
    Integer add(Integer a,Integer b);  
}   
public class MRInstanceExample {
	   public  Integer addTwoNumbers(Integer a,Integer b){  
	       return a+b;  
	    }  
	public static void main(String[] args) {
		MRInstanceExample example=new MRInstanceExample();
		Add a=example::addTwoNumbers;
		//example.addTwoNumbers(5, 6);
		System.out.println(a.add(5, 6));

	}

}

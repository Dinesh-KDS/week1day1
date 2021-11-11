package week1;

public class Assignment1 {

	public static void main(String[] args) {
		
        int first = 0;
        int second = 1;
        int third = 0;
        		
                           
      
        for (int i = 0; i < 8; i++) {
			System.out.print(first + " "); 
			third = first+second;
			first = second;
			second = third;
		}
                    
	}

}
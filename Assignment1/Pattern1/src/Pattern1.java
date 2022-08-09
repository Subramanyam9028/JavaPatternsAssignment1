
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=14; j++) {
				
				if(i-j>=0||i+j>=15)
				System.out.print("* ");
				
				else {
					System.out.print("  ");
				}
			}
			
//			System.out.print("      ");
//			
//			
//			for(int j=8; j>=i; j--) {
//		
//				System.out.print("*");
//			}
			System.out.println();
		}


	}

}

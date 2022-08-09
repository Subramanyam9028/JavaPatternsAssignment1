
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=14; i++) {
			for(int j=1; j<=14; j++) {
				
				if(i<=6&&j<=7&&i+j<=8||i<=6&&j>7&&j-i>=7||i==14||j==1||j==14)
				System.out.print("* ");
				
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}

	}

}

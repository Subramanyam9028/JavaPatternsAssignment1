
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=14; i++) {
			for(int j=1; j<=14; j++) {
				
				if(j<=7&&(i+j)<=8||j<=8&&(i-j+1)>=7||i==1||i==14)
				System.out.print("* ");
				
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}

	}

}

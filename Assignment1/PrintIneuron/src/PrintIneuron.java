
public class PrintIneuron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
	    
	    for(i=1; i<=8; i++){
	        for(int j=1; j<=8;j++){
	            if(i==1||j==4||i==8){
	                System.out.print("*");
	            }
	            
	            else
	            	System.out.print(" ");
	            
	            
	        }
	    
	        System.out.print("     ");
	        
	        
	        for(int k=1; k<=8;k++){
	            if(k==1||i==k||k==8){
	                
	                System.out.print("*");
	            }
	            
	            else
	            	System.out.print(" ");
	            
	            
	        }
	        // cout<<endl;
	    
	        System.out.print("     ");
	    for(int j=1; j<=8; j++){
	        if(i==1||j==1||i==4||i==8){
	        	System.out.print("*");
	        }
	        
	        else
	        	System.out.print(" ");
	    }
	    System.out.print("     ");
	    
	    
	    for(int j=1; j<=8; j++){
	        if(j==1||i==8||j==8){
	        	System.out.print("*");
	        }
	        
	        else
	        	System.out.print(" ");
	    }
	    System.out.print("     ");
	    
	    
	    for(int j=1; j<=8; j++){
	        if(j==1||i==1||j==8&&i<=4||i>=4&&i==j||i==4){
	        	System.out.print("*");
	        }
	        
	        else
	        	System.out.print(" ");
	    }
	    System.out.print("     ");
	    
	    
	    for(int j=1; j<=8; j++){
	        if(i==1&&j!=1&&j!=8||j==1&&i!=1&&i!=8||i==8&&j!=1&&j!=8||j==8&&i!=1&&i!=8){
	        	System.out.print("*");
	        }
	        
	        else
	        	System.out.print(" ");
	    }
	    
	    System.out.print("     ");
	        
	        for(int k=1; k<=8;k++){
	            if(k==1||i==k||k==8){
	            	System.out.print("*");
	            }
	            
	            else
	            	System.out.print(" ");
	            
	            
	        }
	        System.out.println();
	    }
	    


	}

}


public class Piramida {

	private int n;
	
	public Piramida(int n) {
		this.n=n;
	} 
	
	public int getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
	}

	public void print() {
		
	for(int j=1; j<=n; j++){
	for(int k=0; k<(j-1); k++)	
	System.out.print("   ");
	for(int k=0; k<2*(n-j+1); k++)
	{   if(j<10)
		System.out.print("  " + j);
	else if(j>=10)
			System.out.print(" " + j);
	}
	System.out.println();

	}
	
	}
	public void print2() {
					System.out.println();
					System.out.println();
					for(int j=1; j<=n; j++){
					for(int k=0; k<(n-j+1); k++) 
					System.out.print("   ");
					for(int k=0; k<j*2; k++)
					{   if(j<10)
						System.out.print("  " + j);
					else if(j>=10)
							System.out.print(" " + j);
					}
					     System.out.println();
											}
						 }
	
	public static void main(String[] args) {
		
		Piramida p = new Piramida(20);
		p.print();
		p.print2();

	}

}

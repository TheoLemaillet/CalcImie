import java.util.Scanner;

public class Calculatrice {
	
	private int a;
	private int b;

	public Calculatrice (){
		Scanner sc = new Scanner(System.in);
		
		this.a = sc.nextInt();
		this.b = sc.nextInt();
		
		sc.close();
	}
	
	public Calculatrice (int var1, int var2){
		this.a = var1;
		this.b = var2;
	
	}

	public void setA(int var){
		this.a = var;
	}
	
	public void setB(int var){
		this.b = var;
	}

	public int add(){
		return a + b;
	}
	
	public int substract(){
		return a-b;
	}
	
	public int multiply(){
		return a*b;
	}
	
	public float divide(){
		return a/b;
	}

}
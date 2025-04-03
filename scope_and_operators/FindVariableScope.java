package scope_and_operators;

public class FindVariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		if(true) {
			int b = 20;
			System.out.println(a);
			System.out.println(b); 
		}
		System.out.println(a);
//		 System.out.println(b);  //Compiler error because the variable b scope is inside the if block only
	}

}

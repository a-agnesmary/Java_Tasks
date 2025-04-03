package Loops;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] vis = new boolean[31];
		for(int i =2;i*i<=30;i++) {
			if(!vis[i]) {
				for(int j=i*i;j<=30;j+=i)
					vis[j]=true;
			}
		}
		for(int i =2;i<=30;i++)
			if(!vis[i])
				System.out.println(i);
	}

}

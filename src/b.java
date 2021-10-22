import java.util.Scanner;
public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int[10];
		int []b = new int[100];
		int []c = new int[10];
		int i = 0,max=0,j,n=10,count=0;
		System.out.print("Enter 10 numbers:");
		Scanner input = new Scanner(System.in);
		while (n>0) {
			a[i] = input.nextInt();
			if(a[i]>max)
				max=a[i];
			b[a[i]] +=1;
			if(b[a[i]]==1) {
				count++;
				c[count-1] = a[i];
			}
			i++;
			n--;
		}
		System.out.println("The number of distinct numbers is "+count);
		System.out.print("The distinct numbers are:");
		for (int d:c) {
			if(d!=0)
				System.out.print(" "+d);
		}
	}

}

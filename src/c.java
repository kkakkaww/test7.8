import java.util.Scanner;
public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int []a = new int[10];
		int i,j,temp;
		System.out.print("Enter 10 numbers:");
		for (i=0;i<10;i++) {
			a[i] = input.nextInt();
		}
		for(i=0;i<10;i++) {
			for(j=1;j<10-i;j++) {
				if(a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int n:a) {
			System.out.print(n+" ");
		}
	}

}

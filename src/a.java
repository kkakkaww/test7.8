import java.util.Scanner;
public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int[1000];
		int []b = new int[100];
		int i = 0,max=0,j;
		System.out.print("Enter the integers between 1 and 100:");
		Scanner input = new Scanner(System.in);
		while (true) {
			a[i] = input.nextInt();
			if(a[i]>max)
				max=a[i];
			if(a[i]==0)
				break;
			b[a[i]] +=1;
			i++;
		}
		for (j=0;j<=max;j++) {
			if(b[j]!=0&&b[j]!=1) {
				System.out.println(j+" occurs "+b[j]+" times");
			}
			else if(b[j]!=0) {
				System.out.println(j+" occurs "+b[j]+" time");
			}
		}
	}

}

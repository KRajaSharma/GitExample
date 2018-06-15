package codeIt;

public class Code {

	public static void main(String[] args) {

		int arr[][]= {{1,2,3},{4,5,6},{7,8,9},{9,1,3}};
		
		for(int arr2[] : arr)
		{
			for(int num : arr2)
				{
					System.out.print(num);
					System.out.print(" ");
				}
			System.out.println();
		}
		
		System.out.println();
		int m =2;
		
		for(int k=0;k<2;k++)
		{
			
		for(int i=k;i<m+k;i++)
		{
			for(int j=k;j<m+k;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		
		for(int i=k;i<m+k;i++)
		{
			for(int j=k+1;j<=m+k;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
			System.out.println();
		
		}
		
		
		
	}

}

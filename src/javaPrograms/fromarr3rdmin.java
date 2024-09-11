package javaPrograms;

public class fromarr3rdmin {

	public static void main(String[] args) {
		int arr[]= {4,5,2,6,5,7,45,14,32,7};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-3]);

	}

}

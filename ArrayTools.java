package arrays;

public class ArrayTools {
	public static int getMax(int[] arr){
		//�����ֵ
		int index=0;
		for(int i=1;i<arr.length;i++){
			if(arr[index]<arr[i])
				index=i;
		}
		return arr[index];
	}
	
	public static int getMin(int[] arr){
		//����Сֵ
		int index=0;
		for(int i=1;i<arr.length;i++){
			if(arr[index]>arr[i])
				index=i;
		}
		return arr[index];
	}

	public static int getSum(int[] arr){
		//���
		int sum=0;
		for(int x:arr)
			sum+=x;
		return sum;
	}
	
	public static double getAverage(int[] arr){
		//��ƽ��ֵ
		return getSum(arr)*1.0/arr.length;
	}
	
	public static void sort(double[] arr){
		//ð������
		double tmp;
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(arr[j]>arr[j+1]){
					tmp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	
	public static int searchValue(double[] arr,double x){
		//����
		for(int i=0;i<arr.length;i++)
			if(x==arr[i])
				return i;
		return -1;
	}
	
	public static int[] arrayEx(int[] arr,int n){
		//��������n��
		int[] arr1=new int[arr.length*n];
		int i=0;
		for(int x:arr){
			arr1[i]=x;
			i++;
		}
		return arr1;
	}
	

}

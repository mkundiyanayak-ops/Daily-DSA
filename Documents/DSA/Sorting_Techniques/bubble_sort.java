

public class bubble_sort {
    public void bubblesort(int arr[] ,int n){
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("after using the bubble_sort");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
    public static void main(String[] args) {
        bubble_sort ob = new bubble_sort();
        int arr[]={64,34,25,12,22,11,90};
        int n=arr.length;
        ob.bubblesort(arr, n);
    }
}

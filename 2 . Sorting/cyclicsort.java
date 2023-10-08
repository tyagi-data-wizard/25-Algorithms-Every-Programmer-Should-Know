public class cyclicsort {
    public static void main(String args[]) {
        int[] arr={0,2,5,1,4};
        sort(arr);
        printarr(arr);

    }

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
            static void swap(int[] arr, int first ,int second){
                int temp=arr[first];
                arr[first]=arr[second];
                arr[second]=temp;
            }
            public static void printarr(int[] arr ){
                for (int i=0;i< arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
            }

public class MaxMin {

    int max = 0;
    int min =0;

    public void findMaxMin(int[] arr) {





        for (int i =0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            else if (arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);


    }




}

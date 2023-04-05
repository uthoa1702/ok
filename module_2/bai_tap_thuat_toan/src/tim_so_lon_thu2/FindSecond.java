package tim_so_lon_thu2;

public class FindSecond {
    public static void main(String[] args) {
        int[] arr = {100,111,3,4,5,6};
        int index = 0;

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        int second = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=max) {
                if(arr[i] > second){
                second=arr[i];
            }

        }

    }
        System.out.println(second);
}}

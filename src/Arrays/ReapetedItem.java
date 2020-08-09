package Arrays;

public class ReapetedItem {
    public static void main(String[] args) {
        int arr[] = {7, 5, 7, 5, 7};
        ouetr:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if(i == arr.length-1 && j == arr.length-1) return;
                if(i >= j) j = i + 1;
                if(j == arr.length) return;

                if(arr[i] == arr[j]) {
                    if(i == 2) continue ouetr;
                    System.out.println(arr[i]);
                    continue ouetr;
                }
            }
        }
    }
}
import java.util.*;

public class RandomPermNoSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("How many digits you want to input: ");
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input a number: ");
            d[i] = sc.nextInt();
        }

        int fs=1;
        for (int i = 1; i <= n; i++) {
            
               fs=fs*i;
            }
        

        int[] results = new int[fs];
        int count = 0;
        int s=1;

        while (count < fs) {
          
           int arr[]=new int[n];
          for (int l=0;l<n;l++ ) {
           arr[l]=d[l];
    
          }
            for (int i = 0; i < arr.length; i++) {
                int j = r.nextInt(arr.length);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            
            int num = 0;
            for (int val : arr) {
                num = num * 10 + val;
            }

            
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (results[i] == num) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                results[count] = num;
               
                System.out.println(s+": "+num);
                count++;
                s++;
                
            }
        }
    }
}

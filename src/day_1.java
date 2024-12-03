public class day_1 {
        public static int getSecondLargest(int[] arr) {
            int n=arr.length;
            int large=-1;
            int secondLarge=-1;
            int i;
            for(i=0;i<n;i++){
                if(arr[i]>large){
                    secondLarge=large;
                    large=arr[i];
                }
                else if(arr[i]>secondLarge && arr[i]!=large){
                    secondLarge=arr[i];
                }
                //else if(arr[i]>secondLarge && arr[i]!=large){
                //secondLarge=arr[i];

                //}
            }
            return secondLarge;

        }

    public static void main(String[] args) {
        int[] zrr= {25,34,17,18,37};
        int secondL=getSecondLargest(zrr);
        System.out.println(secondL);
    }
    }


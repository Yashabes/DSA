class Solution {
    public int getSecondLargest(int[] arr) {
        int key = arr[0];
        int second = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>key)
            {
                int temp = key;
                key = arr[i];
                arr[i] = temp;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>second && second<key && arr[j]!=key)
            {
                int temp = second;
                second = arr[j];
                arr[j] = temp;
            }
        }
        return second;
    }
}

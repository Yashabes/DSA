public class work {
    public static void main(String[] args) {
        int[] ar = {10,5,20};
        int key = ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>key)
            {
                int temp = key;
                key = ar[i];
                ar[i] = temp;
            }
        }
        System.out.println(key);
    }
}


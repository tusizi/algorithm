/**
 * Created by tusizi on 2016/4/13.
 */
public class Sort {
    public void print(int[] a){
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
    public int[]  bubbleSort(int[] a){
        int temp = 0;
        for(int i= 0;i<a.length;i++){
            for (int j =a.length-1;j>i;j--){
                if (a[j]<a[j-1]){
                    temp = a[j];
                    a[j]=a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        return a;
    }

    public int[] selectSort(int[] a ){
        int temp;
        for(int i= 0;i<a.length;i++){
            for (int j =i+1; j<a.length;j++){
                if (a[j]<a[i]){
                    temp = a[j];
                    a[j]=a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public int[] insertSort(int[] a){
        for (int unsort = 1; unsort<a.length; unsort++){
            int i = unsort-1;
            int k = a[unsort];
            while (i>=0&&a[i]>k){
                a[i+1]=a[i];
               i=i-1;
                a[i+1]= k;
            }
        }
        return a;
            }

    public void quickSort(int[] a, int p, int r){
        int q;
        if (p<r){
            q = partition(a,p,r);
            quickSort(a,p,q-1);
            quickSort(a,q+1,q);
        }
    }
    public int partition (int[] a,int p, int r){
        int x = a[p-1];
        int i =p-1;
       for (int j=p;j<r;j++){
           if(a[j]<=x){
               i=i+1;
               int temp;
               temp = a[j];
               a[j]=a[i];
               a[i] = temp;
           }
           int temp;
           temp = a[r-1];
           a[r-1]=a[i+1];
           a[i+1] = temp;
       }
        return i+1;
}
    public void  shellSort(int[] a, int n){
        int j,gap;
        for (gap=n/2;gap>0;gap=gap/2)
        {
            for (j=gap;j<n;j++)
            {
                if (a[j]<a[j-gap])
                {
                    int temp = a[j];
                    int k = j-gap;
                    while(k>=0 && a[k]>temp)
                    {
                        a[k+gap]=a[k];
                        k = k-gap;
                    }
                    a[k+gap] = temp;
                }
            }
        }
    }
}

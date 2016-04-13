public class Main {

    public static void main(String[] args) {
        int[] a= new int[]{49,38,65,97,76,13,27,49};
        Sort s = new Sort();
//       s.bubbleSort(a);
//       s.selectSort(a);
//       s.insertSort(a);
     //   s.quickSort(a,1,8);
        s.shellSort(a,8);
        s.print(a);

    }
}

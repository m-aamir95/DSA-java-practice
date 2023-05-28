package Algos.Merge_sorted_array;

public class Basic_Test {

    public void run_test_cases(){
        Solution sol =  new Solution();

        int a[] = new int[]{1,2,3,0,0,0};
        int m = 3;

        int b[] =  new int[]{2,5,6};
        int n = 3;

        sol.merge(a,m,b,n);

        for (int x :
                a) {
            System.out.printf("%d, " ,x);
        }
    }
}

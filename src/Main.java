public class Main {
    public static void main(String[] args) {
    
        //Binary Search
        Binary_Search binary_search = new Binary_Search(new int[]{1,2,3,4,5,6});
        for (int i =0; i < 10; i++){
            System.out.printf("Is %d exists ? = %b\n", i ,binary_search.Search(i));
        }
    }
}
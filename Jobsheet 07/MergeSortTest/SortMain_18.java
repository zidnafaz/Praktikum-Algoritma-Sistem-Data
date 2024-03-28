public class SortMain_18 {

    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };

        System.out.println("========================================");
        System.out.println("        Sorting dengan merge sort");
        System.out.println("========================================");
        MergeSorting_18 mSort = new MergeSorting_18();
        
        System.out.println("               DATA AWAL");
        System.out.println("========================================");
        mSort.PrintArray(data);
        mSort.mergeSort(data);
        
        System.out.println("========================================");
        System.out.println("         Data setelah diurutkan");
        System.out.println("========================================");
        mSort.PrintArray(data);
        System.out.println("========================================");
    }

}

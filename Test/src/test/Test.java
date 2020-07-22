package test;

public class Test {
    static int[] list1 = {6,13,14,25,33,43,51,53,64,72,84,93,95,96,97};
    static int binarySearch(int[] list1, int low,int high , int key){
        if (high>= low){
            int mid = (low +high)/2;
            if (list1[mid] == key)
                return mid;
            if (list1[mid] > key)
                return binarySearch(list1,low,mid-1,key);
            return binarySearch(list1,mid+1,high, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list1,0,list1.length-1,6));
        System.out.println(binarySearch(list1,0,list1.length-1,15));
        System.out.println(binarySearch(list1,0,list1.length-1,33));
        System.out.println(binarySearch(list1,0,list1.length-1,53));
        System.out.println(binarySearch(list1,0,list1.length-1,67));
        System.out.println(binarySearch(list1,0,list1.length-1,83));
        int[] array = new int[1000000];
        for (int i=0; i < array.length;i ++){
            array[i] = i+1;
        }
        long start = System.currentTimeMillis();
        for (int i=0; i < 1000000;i++){
            binarySearch(array, 0,list1.length-1,50003);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

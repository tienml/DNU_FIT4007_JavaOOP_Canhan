public class Task8 {
    public static void main(String[] args){
        int integerArray[] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < integerArray.length; i++) {
            sum += integerArray[i];
        }
        System.out.println("Tổng các phần tử là: " + sum);
        int max = integerArray[0];
        for (int i = 1; i < integerArray.length; i++) {
            if (integerArray[i] > max) {
                max = integerArray[i];
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}
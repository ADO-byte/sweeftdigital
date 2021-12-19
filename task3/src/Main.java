public class Main {

    public static int notContains(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>0){
                if (array[i+1]!=array[i]+1){
                    System.out.println(array[i]+1);
                    break;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int myArray[] = {-5,-3,0,1,2,3,7,9,10};
        notContains(myArray);
    }

}
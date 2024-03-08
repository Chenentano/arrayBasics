public class Main {

    public static void main(String[] args) {

        //int[] printArrayBig = {11,12,13,14,15,16,17,18,19,20};
        //arrayPrint();
        arraySum();

    }

    public static void arrayPrint(){
        int[] printArray = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < printArray.length; i++){
            System.out.println("Zählerposition: " + i + " Inhalt array: " + printArray[i]);
        }
    }

    public static void arraySum(){
        int[] printArray = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int j : printArray) {
            sum = sum + j;
            System.out.println(sum);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        arrayPrint();

    }

    public static void arrayPrint(){
        int[] printArray = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < printArray.length; i++){
            System.out.println("Zählerposition: " + i + " Inhalt array: " + printArray[i]);
        }

    }


}

public class Epic1 {
        public static void main(String[] args) {       // дз по массивам до 24.03
            int[] numbers = new int[10];                       // задание 1
            for (int i = 0; i<numbers.length; i++){
                numbers[i] = i * 10;
            }
                System.out.println(numbers[9]);

            System.out.println();

            int [] array = {2,1,3,8,10,11,14,15,18,33};        // задание 2
            for (int i=0;i<array.length;i++){
                if (array[i] % 2 == 0)
                    System.out.println("Index: " + i + "; Number: " + array[i]);
            }

            System.out.println();

            int[] intArray = {33,12,6,86,11,100,4,160,90,74};  // задание 3
            int maxNum = intArray[0];
            for (int j : intArray){
                if (j > maxNum)
                    maxNum = j;
            }
                    System.out.println("Maximum number = " + maxNum);
                }
            }
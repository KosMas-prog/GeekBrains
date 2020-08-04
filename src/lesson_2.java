public class lesson_2 {
    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeling(arr);
    }

    private static void changeling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }/*

    // Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла
    // заполнит его значениями 1 4 7 10 13 16 19 22;

    int[] arr = new int[8];

    progression(arr);

    }

    private static void progression(int[] arr) {
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j = j + 3;
        }
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
    // принимающий на вход массив и умножающий числа меньше 6 на 2;
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    multiplication(arr);
    }
    private static void multiplication(int[] arr){

        for (int i = 0; i < arr.length; i++) {
        arr[i] = (arr[i] < 6)? arr[i]*2: arr[i];
        }
    }

    // Задать одномерный массив.
    // Написать методы поиска в нём минимального и максимального элемента;

    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    arrMax(arr);
    System.out.println();
    arrMin (arr);
    }
    private static int arrMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
        max=(arr[i]<max?max:arr[i]);
        }
        return max;

    }
    private static int arrMin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=(arr[i]>min? min: arr[i]);
        }
        return min;
    }

    // * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        // заполнить его диагональные элементы единицами, используя цикл(ы);
    int[][] Arr = new int[5][5];
    for(int i = 0; i<5; i++){
        for(int j=0; j<5; j++){
            if (j==i){
            Arr[i][j]=1;
            }
        }
    }
    for(int i=0,j=5 ; i<5; i++) {
        j--;
        Arr[i][j] = 1;
    }

    //** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
        // массива равны. Примеры: checkBalance([1, 1, 1, 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
        // checkBalance ([10, 1, 2, 3, 4]) → true.
    int[] arr = {5,8,2,5,9,1};
    checkBalans(arr);
    }
    private static boolean checkBalans (int[] arr){
        int sum=0;
        int sumArr=0;
        boolean checkBalans=false;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
        }
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
            sumArr=arr[i]+sumArr;
            if(sum==sumArr){
            checkBalans=true;
            }
        }
        return checkBalans;
    }*/
}

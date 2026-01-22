import java.util.Scanner;
class oopsLab2_1{
    int [] arr; 
    int sum = 0;
    public static void main(String[] args){
        oopsLab2_1 s = new oopsLab2_1();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        for (int i = 0; i <size; i++){
            s.arr = new int[size];
            s.arr[i] = sc.nextInt();
            s.sum += s.arr[i];

        }
        System.out.println("The sum of the elements of the array is " + s.sum);

        sc.close();
    }
}
    



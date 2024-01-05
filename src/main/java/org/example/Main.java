import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Array-in ölçüsünü daxil edin: ");
    int arraySize = scanner.nextInt();
    int[] array = new int[arraySize];
    System.out.println("Array elementlərini daxil edin:");

    for (int i = 0; i < arraySize; i++) {
        System.out.print("Element " + (i + 1) + ": ");
        array[i] = scanner.nextInt();
    }
    int cem = 0;
    System.out.println("Cüt elementlər:");
    for (int i = 0; i < arraySize; i++)
    {
        if (array[i] % 2 == 0)
        {
            System.out.println(array[i]);
            cem += array[i];
        }
    }
    System.out.println("Cüt elementlərin cəmi: " + cem);
  }
}
import java.util.Scanner;

public class FindMaxMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng :");
        int length = scanner.nextInt();
        int[][] arr = new int[length][length];

        for (int x = 0;x < length; x++)
        {
            for ( int y = 0; y <= x; y++)
            {
                System.out.print(x+1 +","+ y + ":");
                arr[x][y] = scanner.nextInt();
            }
        }
        for (int x = 0;x < length; x++)
        {
            for ( int y = 0; y <= x; y++)
            {
                System.out.println(arr[x][y]);
            }
        }
        int max = arr[0][0];
        for (int x = 0;x < length; x++)
        {
            for ( int y = 0; y < length; y++)
            {
                if (arr[x][y] > max )
                {
                    max = arr[x][y];
                }
            }
        }
        System.out.println(max);
    }
}

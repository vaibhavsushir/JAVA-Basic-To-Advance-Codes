import java.util.Scanner;
 class Rightpyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
     System.out.println("Right Pyramid");
    for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
                System.out.println();
            }

        }
}


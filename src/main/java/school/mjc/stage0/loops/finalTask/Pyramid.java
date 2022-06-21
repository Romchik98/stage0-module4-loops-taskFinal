package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= cathetusLength; j++)
            {
                System.out.print(j);
            }
            for (int j = cathetusLength - 1; j >= i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }
}

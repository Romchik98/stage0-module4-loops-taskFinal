package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++)
        {
            for (int j = cathetusLength; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j = cathetusLength; j > i; j--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*public static void main(String[] args) {
        new Pyramid().printHalfPyramid(7);
    }*/
}

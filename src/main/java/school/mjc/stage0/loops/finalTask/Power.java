package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        if (numberToPrint < 0 && power % 2 == 0) {
            numberToPrint *= -1;
        }
        for (int i = 0; i < power - 1; i++) {
            numberToPrint *= 10;
        }
        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}

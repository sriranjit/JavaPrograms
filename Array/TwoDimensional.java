class ArrayOps {
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

    public void display() {
        System.out.println("Array elements:");
        for (int[] row : arr) {
            for (int element : row) {
                System.out.printf("%-3d",element);
            }
            System.out.println();
        }
    }

    public void ops() {
        System.out.println("M1 M2 M3 MIN MAX TOT AVG");
        for (int[] ints : arr) {
            int min = ints[0];
            int max = ints[0];
            int total = 0;

            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
                if (anInt > max) {
                    max = anInt;
                }
                total += anInt;
            }

            double avg = (double) total / ints.length;


            for (int element : ints) {
                System.out.printf("%-3d", element);
            }
            System.out.printf("%-3d %-3d %-3d %-3.2f", min, max, total, avg);
            System.out.println();
        }

    }
}

public class TwoDimensional {
    public static void main(String[] args) {
        ArrayOps ao = new ArrayOps();
//        ao.get();
        ao.display();
        ao.ops();
    }
}

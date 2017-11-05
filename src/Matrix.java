import java.util.Scanner;

public class Matrix {
    public static Matrix answer = new Matrix();
    public int row = 0, col = 0;
    public int [][] data = new int [10][10];


    public Matrix(int r, int c ) {
        row = r;
        col = c;
    }

    public Matrix() {

    }


    public void setData() {

        Scanner cin = new Scanner(System.in);

        System.out.print("Dimension ->\tRows :\t\t");
        row = cin.nextInt();
        System.out.print("\t\tColumns :\t");
        col = cin.nextInt();


        for (int i = 0; i <= (row - 1); i++)
        {
            for (int j = 0; j <= (col - 1); j++)
            {
                System.out.print("A" + (i+1) + (j+1) + ":\t");
                data[i][j] = cin.nextInt();
            }
        }
    }

    public void testInput(){

        // This method generates inputs 1 - n for testing purpose
        int a = 1;

        for (int i = 0; i <= (row - 1); i++)
        {
            for (int j = 0; j <= (col - 1); j++)
            {
                data[i][j] = a;
                a++;
            }
        }
    }


    public void getData(){
        for (int i = 0; i <= (row - 1); i++)
        {
            for (int j = 0; j <= (col - 1); j++)
            {
                System.out.print( data[i][j] + "\t" );
            }

            System.out.println();
        }
    }

}

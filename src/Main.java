
public class Main {
    public static void main(String [] args){

        System.out.println("Hello! ");
        Matrix a = new Matrix(3, 3);
        Matrix b = new Matrix(3,3);

        Calc C = new Calc();

        a.testInput();
        b.testInput();

        C.mul(a,b);

        Matrix.answer.getData();

    }
}
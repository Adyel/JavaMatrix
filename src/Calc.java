public class Calc {

    public void mul(Matrix a, Matrix b){

        if(a.col != b.row){
            System.out.println("Error !! Check Dimension");
        }else {

            Matrix.answer.col = b.col;
            Matrix.answer.row = a.row;

            for (int i = 0; i <= (b.row - 1); i++) {
                for (int j = 0; j <= (a.col - 1); j++) {
                    for (int k = 0; k < b.row; k++) {
                        Matrix.answer.data[i][j] = Matrix.answer.data[i][j] + a.data[i][k] * b.data[k][j];
                    }
                }
            }

        }
    }
}

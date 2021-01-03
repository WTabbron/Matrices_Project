public class Tests {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(3,2);
        Matrix m2 = new Matrix(2,3);
        int counter = 1;
        for(int i=0;i<2;i++) {
            for(int j=0;j<3;j++) {
                m1.elems[i][j] = counter;
                counter++;
            }
        }
        counter=1;
        for(int i = 0;i<3;i++) {
            for(int j = 0;j<2;j++) {
                m2.elems[i][j] = counter;
                counter++;
            }
        }
        Prototype p = new Prototype();
        Matrix m3 = p.multiply(m2,m1);
        for(int i = 0; i<3;i++) {
            for(int j = 0; j<3; j++) {
                System.out.format("(%d,%d) = %d%n", i,j,m3.elems[i][j]);
            }
        }
    }
}

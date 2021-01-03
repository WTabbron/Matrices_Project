public class Prototype {
    public Matrix multiply(Matrix m1, Matrix m2) {
        if(m1==null || m2 == null) {
            return null;
        }
        Matrix result = new Matrix(m2.getX(),m1.getY());
        for(int i = 0; i<m1.getY();i++) {
            for(int j = 0; j<m2.getX();j++) {
                int[] row = m1.elems[i];
                int[] column = m2.getcolumn(j);
                int r = 0;
                for(int l = 0; l<row.length;l++) {
                    r = r+(row[l]*column[l]);
                }
                result.elems[i][j] = r;
            }
        }
        return result;
    }
}

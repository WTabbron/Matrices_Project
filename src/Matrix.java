public class Matrix {
    private int x;
    private int y;
    public int[][] elems;
    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
        this.elems = new int[y][x];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getcolumn(int i) {
        if(i<x) {
            int[] column = new int[this.y];
            for(int j = 0;j<y;j++) {
                column[j] = this.elems[j][i];
            }
            return column;
        }
        return null;
    }
}

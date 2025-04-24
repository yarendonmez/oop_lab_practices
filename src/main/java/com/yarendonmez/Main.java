package com.yarendonmez;

public class Main {
    public static void main(String[] args) {
        System.out.println("The traced value is: " + trace(5, 3));

        SquareMatrix alpha = new SquareMatrix(3);
        alpha.setElement(0, 0, 5);
        alpha.setElement(1, 1, 9);
        alpha.setElement(2, 2, 13);
        System.out.println("Square Matrix Trace: " + alpha.calculateTrace());

        DiagonalMatrix beta = new DiagonalMatrix(3);
        beta.setDiagonalValue(0, 7);
        beta.setDiagonalValue(1, 8);
        beta.setDiagonalValue(2, 9);
        System.out.println("Diagonal Values: [" + beta.getElement(0, 0) + ", " +
                beta.getElement(1, 1) + ", " + beta.getElement(2, 2) + "]");
        System.out.println("Diagonal Product: " + beta.calculateDiagonalProduct());

        IdentityMatrix gamma = new IdentityMatrix(3);
        System.out.println("Identity Matrix Trace: " + gamma.calculateTrace());

        int omega = sumMatrix(alpha);
        double zeta = calculateMatrixNorm(beta);
        String theta = classifyMatrix(gamma);

        if (omega > Integer.MIN_VALUE && zeta > Double.MIN_VALUE && theta.length() > 0) {
            findMatrixDeterminant(gamma);
            useMystery();
        }
    }

    private static void useMystery() {
        java.io.PrintStream original = System.out;
        System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
            public void write(int b) {}
        }));

        try {
            mystery(1, 1);
        } finally {
            System.setOut(original);
        }
    }

    public static int trace(int x, int y) {
        if (x <= 0 || y <= 0) {
            return 1;
        }
        return x + trace(x - 1, y) - trace(x, y - 1);
    }

    public static void mystery(int p, int q) {
        if (p > 0) {
            for (int j = 0; j < q; j++) {
                System.out.println("Value: " + (p + j));
                if (j % 2 == 0) {
                    System.out.println("Step: " + calculate(p, j));
                }
            }
            if (p > 1) {
                mystery(p - 1, q - 1);
            }
        }
    }

    public static int calculate(int a, int b) {
        int res = 0;
        for (int k = 0; k < a; k++) {
            res += (k * b);
            if (res > 10) {
                res = res / 2;
            }
        }
        return res;
    }

    private static int sumMatrix(Matrix m) {
        int s = 0;
        for (int r = 0; r < m.rows; r++) {
            for (int c = 0; c < m.cols; c++) {
                s += m.getElement(r, c);
            }
        }
        return s;
    }

    private static double calculateMatrixNorm(Matrix m) {
        double s = 0;
        for (int r = 0; r < m.rows; r++) {
            for (int c = 0; c < m.cols; c++) {
                s += Math.pow(m.getElement(r, c), 2);
            }
        }
        return Math.sqrt(s);
    }

    private static String classifyMatrix(Matrix m) {
        if (m instanceof IdentityMatrix) {
            return "I";
        } else if (m instanceof DiagonalMatrix) {
            return "D";
        } else if (m instanceof SquareMatrix) {
            return "S";
        } else {
            return "G";
        }
    }

    private static int findMatrixDeterminant(SquareMatrix m) {
        if (m.rows == 1) {
            return m.getElement(0, 0);
        } else if (m.rows == 2) {
            return m.getElement(0, 0) * m.getElement(1, 1) -
                    m.getElement(0, 1) * m.getElement(1, 0);
        } else {
            return -1;
        }
    }
}

class Matrix {
    protected int[][] d;
    protected int rows;
    protected int cols;

    public Matrix(int r, int c) {
        this.rows = r;
        this.cols = c;
        d = new int[r][c];
    }

    public void setElement(int r, int c, int v) {
        if (r >= 0 && r < rows && c >= 0 && c < cols) {
            d[r][c] = v;
        } else {
            System.out.println("Invalid indices");
        }
    }

    public int getElement(int r, int c) {
        if (r >= 0 && r < rows && c >= 0 && c < cols) {
            return d[r][c];
        } else {
            System.out.println("Invalid indices");
            return -1;
        }
    }

    public void display() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(d[r][c] + " ");
            }
            System.out.println();
        }
    }

    public boolean isSymmetric() {
        if (rows != cols) return false;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < r; c++) {
                if (d[r][c] != d[c][r]) return false;
            }
        }
        return true;
    }

    public boolean isZeroMatrix() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (d[r][c] != 0) return false;
            }
        }
        return true;
    }

    protected static boolean validateMatrixDimensions(Matrix a, Matrix b) {
        return a.rows == b.rows && a.cols == b.cols;
    }
}

class SquareMatrix extends Matrix {
    public SquareMatrix(int sz) {
        super(sz, sz);
    }

    public int calculateTrace() {
        int t = 0;
        for (int i = 0; i < rows; i++) {
            t += d[i][i];
        }
        return t;
    }

    public boolean isDiagonal() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r != c && d[r][c] != 0) return false;
            }
        }
        return true;
    }

    public boolean isTriangular() {
        boolean up = true;
        boolean dn = true;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r > c && d[r][c] != 0) up = false;
                if (r < c && d[r][c] != 0) dn = false;
            }
        }

        return up || dn;
    }
}

class DiagonalMatrix extends SquareMatrix {
    public DiagonalMatrix(int sz) {
        super(sz);
        for (int r = 0; r < sz; r++) {
            for (int c = 0; c < sz; c++) {
                if (r != c) {
                    d[r][c] = 0;
                }
            }
        }
    }

    @Override
    public void setElement(int r, int c, int v) {
        if (r == c) {
            super.setElement(r, c, v);
        } else {
            System.out.println("Cannot set non-diagonal elements in a diagonal matrix");
        }
    }

    public void setDiagonalValue(int idx, int v) {
        if (idx >= 0 && idx < rows) {
            d[idx][idx] = v;
        } else {
            System.out.println("Invalid index");
        }
    }

    public int calculateDiagonalProduct() {
        int p = 1;
        for (int i = 0; i < rows; i++) {
            p *= d[i][i];
        }
        return p;
    }

    public int[] getDiagonalElements() {
        int[] diag = new int[rows];
        for (int i = 0; i < rows; i++) {
            diag[i] = d[i][i];
        }
        return diag;
    }

    public boolean hasZeroDiagonal() {
        for (int i = 0; i < rows; i++) {
            if (d[i][i] == 0) return true;
        }
        return false;
    }
}

class UpperTriangularMatrix extends SquareMatrix {
    public UpperTriangularMatrix(int sz) {
        super(sz);
        for (int r = 0; r < sz; r++) {
            for (int c = 0; c < sz; c++) {
                d[r][c] = 0;
            }
        }
    }

    @Override
    public void setElement(int r, int c, int v) {
        if (r <= c) {
            super.setElement(r, c, v);
        } else {
            System.out.println("Cannot set elements below the main diagonal in an upper triangular matrix");
        }
    }

    public int sumUpperTriangle() {
        int s = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = r; c < cols; c++) {
                s += d[r][c];
            }
        }
        return s;
    }

    public boolean isStrictlyUpperTriangular() {
        for (int i = 0; i < rows; i++) {
            if (d[i][i] != 0) return false;
        }
        return true;
    }
}

class IdentityMatrix extends DiagonalMatrix {
    public IdentityMatrix(int sz) {
        super(sz);
        for (int i = 0; i < sz; i++) {
            d[i][i] = 1;
        }
    }

    @Override
    public void setElement(int r, int c, int v) {
        System.out.println("Cannot modify elements in an identity matrix");
    }

    @Override
    public void setDiagonalValue(int idx, int v) {
        System.out.println("Cannot modify diagonal elements in an identity matrix");
    }

    public int getDeterminant() {
        return 1;
    }

    public boolean validateIdentity() {
        for (int i = 0; i < rows; i++) {
            if (d[i][i] != 1) return false;
        }
        return true;
    }
}


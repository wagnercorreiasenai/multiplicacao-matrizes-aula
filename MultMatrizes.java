package javaapplication1;

public class MultMatrizes {

    public static void main(String[] args) {

        final int linhas = 2;
        final int colunas = 2;

        int[][] a = new int[linhas][colunas];
        int[][] b = new int[linhas][colunas];
        int[][] c = new int[linhas][colunas];

        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;

        b[0][0] = -1;
        b[0][1] = 3;
        b[1][0] = 4;
        b[1][1] = 2;

        for (int linha = 0; linha < c.length; linha++) {
            for (int coluna = 0; coluna < c[linha].length; coluna++) {
               c [linha][coluna] = 0;
                for (int idxAux = 0; idxAux < c.length; idxAux++) {
                    System.out.println(linha+"-"+idxAux+" * "+idxAux+"-"+coluna);
                    c [linha][coluna] = c[linha][coluna] + a[linha][idxAux] * b[idxAux][coluna];
                }
                System.out.println("-----------------");
            }
            
        }
        
        for (int linha = 0; linha < c.length; linha++) {
            for (int coluna = 0; coluna < c[linha].length; coluna++) {
                System.out.print(c[linha][coluna]+"\t");
            }
            System.out.println("");
        }
        

    }

}

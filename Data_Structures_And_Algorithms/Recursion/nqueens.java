import java.util.*;

public class nqueens {
    private static boolean isQueenSafe(boolean[][] chess, 
                                       int r, int c){
        for(int j = c - 1; j >= 0; j--){
            if(chess[r][j] == true){
                return false;
            }
        }

        for(int i = r - 1; i >= 0; i--){
            if(chess[i][c] == true){
                return false;
            }   
        }

        for(int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == true){
                return false;
            }
        }

        for(int i = r - 1, j = c + 1; i >= 0 && j < chess[0].length; i--, j++){
            if(chess[i][j] == true){
                return false;
            }
        }

        return true;
    }


    static int counter = 0;
    private static void nqueens(boolean[][] chess, 
                                int cq, int lqi, int lqj,
                                String asf){
        if(cq == chess.length){
            System.out.println(++counter + ". " + asf);
            return;
        }

        for(int i = lqi; i < chess.length; i++){
            int j = lqj + 1;
            if(i > lqi){
                j = 0;
            }

            for(; j < chess[0].length; j++){
                if(chess[i][j] == false && isQueenSafe(chess, i, j) == true){
                    chess[i][j] = true;
                    nqueens(chess, cq + 1, i, j, asf + i + j + "-");
                    chess[i][j] = false;
                }
            }
        }
    }

    private static boolean isKnightSafe(boolean[][] chess,
                                        int r, int c){
        if(r >= 1 && c >= 2 && 
           chess[r - 1][c - 2] == true){
            return false;
        } else if(r >= 2 && c >= 1 && 
                  chess[r - 2][c - 1] == true){
            return false;
        } else if(r >= 2 && c < chess.length - 1 && 
                  chess[r - 2][c + 1] == true){
            return false;
        } else if(r >= 1 && c < chess.length - 2 && 
                  chess[r - 1][c + 2] == true){
            return false;
        } else {
            return true;
        }
    }

    // private static void nknights(boolean[][] chess, 
    //                             int cq, int lqi, int lqj,
    //                             String asf){
    //     if(cq == chess.length){
    //         System.out.println(++counter + ". " + asf);
    //         return;
    //     }

    //     for(int i = lqi; i < chess.length; i++){
    //         int j = lqj + 1;
    //         if(i > lqi){
    //             j = 0;
    //         }

    //         for(; j < chess[0].length; j++){
    //             if(chess[i][j] == false && isKnightSafe(chess, i, j) == true){
    //                 chess[i][j] = true;
    //                 nknights(chess, cq + 1, i, j, asf + i + j + "-");
    //                 chess[i][j] = false;
    //             }
    //         }
    //     }
    // }

    private static void nknights(boolean[][] chess, 
                                 int i, int j, int ksf,
                                 String asf){
        if(i == chess.length && j == 0){
            if(ksf == chess.length){
                System.out.println(++counter + ". " + asf);
            }
            return;
        } else if(j == chess.length - 1){
            // no
            nknights(chess, i + 1, 0, ksf, asf);

            // yes
            if(isKnightSafe(chess, i, j) == true){
                chess[i][j] = true;
                nknights(chess, i + 1, 0, ksf + 1, asf + i + j + " ");
                chess[i][j] = false;
            }
        } else {
            // no
            nknights(chess, i, j + 1, ksf, asf);

            // yes
            if(isKnightSafe(chess, i, j) == true){
                chess[i][j] = true;
                nknights(chess, i, j + 1, ksf + 1, asf + i + j + " ");
                chess[i][j] = false;
            }
        }
    }

    public static void main(String[] args){
        boolean[][] chess = new boolean[4][4];
        nknights(chess, 0, 0, 0, "");
    }
}
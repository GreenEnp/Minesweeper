package com.company;


public class Minesweeper2 {
    int feld[][];

    int schritte = 0;

    public Minesweeper2(int pBr, int pPba) {
        //fenstererstellen()
        felderstellen(pBr, pPba);
    }

    public int[][] felderstellen(int br, int pBA) {
        int b;
        int h;
        int i;
        int j;
        int ba = pBA;
        feld = new int[br][br];
        //while (ba > 0) {
          //  i = (int) (Math.random() * (br));
            //j = (int) (Math.random() * (br));
            //if(feld[i][j] != 9) {
                feld[0][2] = 9;
                feld[1][0] = 9;
                feld[0][0] = 9;
                feld[2][1] = 9;
                feld[2][0] = 9;
                feld[2][2] = 9;
                feld[1][1] = 9;
                feld[0][1] = 9;
                ba--;


            //}
        //}
        for (b = 0; b < feld.length; b++) {
            for (h=0; h <feld.length; h++){
             if (feld[b][h] != 9) {
                    feld[b][h] = control(b, h);
                }
            }
        }
            //}
        System.out.println(" ");
        for (b = 0; b < feld.length; b++) {
            for (h = 0; h < feld.length; h++) {
                if (h != feld.length-1)
                    System.out.print(feld[b][h]);
                else
                    System.out.println(feld[b][h]);
            }
        }
        System.out.println("         " +schritte);
        return feld;
    }

    public int control(int a, int b) {
        int counter = 0;
        schritte++;
        if (a > 0 && a < feld.length) {schritte++;
            if (a + 1 < feld.length) {schritte++;
                if (b > 0 && b < feld.length) {schritte++;
                    if (b + 1 < feld.length) {
                        schritte++;
                        if (feld[a - 1][b - 1]== 9)
                            counter++;
                        schritte++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a + 1][b - 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a - 1][b] == 9)
                            counter++;
                        schritte++;
                        if (feld[a + 1][b] == 9)
                            counter++;
                        schritte++;
                        if (feld[a - 1][b + 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a][b + 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a + 1][b + 1] == 9)
                            counter++;
                        return counter;
                    }
                } else {schritte++;
                    if (b == 0) {schritte++;
                        if(b+1 == feld.length)
                            return counter;
                        schritte++;
                        if (feld[a - 1][b] == 9)
                            counter++;
                        schritte++;
                        if (feld[a + 1][b] == 9)
                            counter++;
                        schritte++;
                        if (feld[a - 1][b + 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a][b + 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a + 1][b + 1] == 9)
                            counter++;
                        return counter;
                    }
                    schritte++;
                    if (b == feld.length - 1) {schritte++;
                        if (feld[a - 1][b] == 9)
                            counter++;
                        schritte++;
                        if (feld[a][b] == 9)
                            counter++;
                        schritte++;
                        if (feld[a - 1][b - 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        return counter;
                    }
                }
                }
            }
        schritte++;
                if (a == 0) {schritte++;
                    if (a+1 == feld.length)
                        return counter;
                    schritte++;
                    if (b > 0 && b < feld.length) {schritte=schritte+2;
                        if (b + 1 < feld.length) {schritte++;
                            if (feld[a][b - 1] == 9)
                                counter++;
                            schritte++;
                            if (feld[a][b] == 9)
                                counter++;
                            schritte++;
                            if (feld[a + 1][b - 1] == 9)
                                counter++;
                            schritte++;
                            if (feld[a + 1][b] == 9)
                                counter++;
                            schritte++;
                            if (feld[a + 1][b + 1] == 9)
                                counter++;
                            return counter;
                        }
                    }

                    if (b == 0) {schritte++;
                        if(b+1 == feld.length)
                            return counter;
                        schritte++;
                        if (feld[a + 1][b] == 9)
                            counter++;
                        schritte++;
                        if (feld[a][b + 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a + 1][b + 1] == 9)
                            counter++;
                        return counter;
                    }
                    if (b == feld.length - 1) {schritte++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a + 1][b - 1] == 9)
                            counter++;
                        schritte++;
                        if (feld[a + 1][b] == 9)
                            counter++;
                        return counter;
                    }
                }
        if (a + 1 == feld.length) {schritte++;
            if (b > 0 && b < feld.length) {schritte++;
                if (b + 1 < feld.length) {schritte++;
                    if (feld[a - 1][b - 1] == 9)
                        counter++;
                    schritte++;
                    if (feld[a][b - 1] == 9)
                        counter++;
                    schritte++;
                    if (feld[a - 1][b] == 9)
                        counter++;
                    schritte++;
                    if (feld[a - 1][b + 1] == 9)
                        counter++;
                    schritte++;
                    if (feld[a][b + 1] == 9)
                        counter++;
                    return counter;
                }
            }
            schritte++;
            if (b == 0) {schritte++;
                if(b +1 == feld.length)
                    return counter;
                schritte++;
                if (feld[a - 1][b] == 9)
                    counter++;
                schritte++;
                if (feld[a - 1][b + 1] == 9)
                    counter++;
                schritte++;
                if (feld[a][b + 1] == 9)
                    counter++;
                schritte++;
                return counter;
            }
            schritte++;
            if (b == feld.length - 1) {schritte++;
                if (feld[a - 1][b - 1] == 9)
                    counter++;
                schritte++;
                if (feld[a - 1][b] == 9)
                    counter++;
                schritte++;
                if (feld[a][b - 1] == 9)
                    counter++;
                return counter;
            }
        }
        schritte++;

             return counter;
    }
}







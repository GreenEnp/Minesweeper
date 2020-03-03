import java.util.Random;

public class mInesweeper2 {
    int feld[][];
    Random random;

    public mInesweeper2(int pBr, int pPba) {
        //fenstererstellen()
        felderstellen(pBr, pPba);
    }

    public void fenstererstellen() {

    }

    public int[][] felderstellen(int br, int pBA) {
        int b;
        int h;
        int i;
        int j;
        int ba = pBA;
        feld = new int[br][br];
        while (ba > 0) {
            i = (int) (Math.random() * (br));
            j = (int) (Math.random() * (br));
            feld[i][j] = 9;
            ba--;
        }
        for (b = 0; b < feld.length; b++) {
            System.out.println(b);
            for (h = 0; h < feld.length; h++) {
                if (feld[b][h] != 9)
                    feld[b][h] = control(b, h);
                System.out.print(h);
            }
        }
        System.out.println(" ");
        for (b = 0; b < feld.length; b++) {
            for (h = 0; h < feld.length; h++) {
                if (h != 19)
                    System.out.print(feld[b][h]);
                else
                    System.out.println(feld[b][h]);
            }
        }
        // for(b=0;b<feld.length;b++)
        //{
        //  for(h=0;h<feld.length;h++)
        //{

        //}
        //}
        return feld;
    }

    public int control(int a, int b) {
        int counter = 0;
        if (a > 0 && a < feld.length) {
            if (a + 1 < feld.length) {
                if (b > 0 && b < feld.length) {
                    if (b + 1 < feld.length) {
                        if (feld[a - 1][b - 1] == 9)
                            counter++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a][b] == 9)
                            counter++;
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a][b] == 9)
                            counter++;
                        if (feld[a][b] == 9)
                            counter++;
                    }
                } else {
                    if (b == 0) {
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a + 1][b] == 9)
                            counter++;
                        if (feld[a - 1][b + 1] == 9)
                            counter++;
                        if (feld[a][b + 1] == 9)
                            counter++;
                        if (feld[a + 1][b + 1] == 9)
                            counter++;

                    }
                    if (b == feld.length - 1) {
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a][b] == 9)
                            counter++;
                        if (feld[a - 1][b - 1] == 9)
                            counter++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                    }
                }
            }
            if (a + 1 == feld.length) {
                if (b > 0 && b < feld.length) {
                    if (b + 1 < feld.length) {
                        if (feld[a - 1][b - 1] == 9)
                            counter++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a - 1][b + 1] == 9)
                            counter++;
                        if (feld[a][b + 1] == 9)
                            counter++;

                    }
                } else {
                    if (b == 0) {
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a - 1][b + 1] == 9)
                            counter++;
                        if (feld[a][b + 1] == 9)
                            counter++;
                    }
                    if (b == feld.length - 1) {
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a][b] == 9)
                            counter++;
                        if (feld[a - 1][b - 1] == 9)
                            counter++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                    }
                }
            } else {
                if (a == 0) {
                    if (b > 0 && b < feld.length) {
                        if (b + 1 < feld.length) {
                            if (feld[a][b - 1] == 9)
                                counter++;
                            if (feld[a][b] == 9)
                                counter++;
                            if (feld[a + 1][b - 1] == 9)
                                counter++;
                            if (feld[a + 1][b] == 9)
                                counter++;
                            if (feld[a + 1][b + 1] == 9)
                                counter++;

                        }
                    }
                } else {
                    if (b == 0) {
                        if (feld[a + 1][b] == 9)
                            counter++;
                        if (feld[a][b + 1] == 9)
                            counter++;
                        if (feld[a + 1][b + 1] == 9)
                            counter++;
                    }
                    if (b == feld.length - 1) {
                        if (feld[a][b - 1] == 9)
                            counter++;
                        if (feld[a + 1][b - 1] == 9)
                            counter++;
                        if (feld[a + 1][b] == 9)
                            counter++;
                    }
                }
            }
            if (a == feld.length - 1) {
                if (b > 0 && b < feld.length + 1) {
                    if (b + 1 < feld.length) {
                        if (feld[a - 1][b - 1] == 9)
                            counter++;
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a - 1][b + 1] == 9)
                            counter++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                        if (feld[a][b + 1] == 9)
                            counter++;
                    }

                } else {
                    if (b == 0) {
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a][b + 1] == 9)
                            counter++;
                        if (feld[a - 1][b + 1] == 9)
                            counter++;
                    }
                    if (b == feld.length - 1) {
                        if (feld[a - 1][b - 1] == 9)
                            counter++;
                        if (feld[a - 1][b] == 9)
                            counter++;
                        if (feld[a][b - 1] == 9)
                            counter++;
                    }
                }
            }
        }
        return counter;

    }
}




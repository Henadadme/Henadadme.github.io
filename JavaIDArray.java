import java.util.*;

public class JavaIDArray {

    public static boolean canWin(int leap, int[] game) {
        ArrayDeque<Integer> indexesToCheck = new ArrayDeque<>();
        indexesToCheck.add(0);

        int lengthofIndextoCheck = indexesToCheck.size();
        int currentIndex = indexesToCheck.getFirst();
        while (lengthofIndextoCheck > 0) {
            if (currentIndex + 1 >= game.length || currentIndex + leap >= game.length) {
                return true;
            }
            if (game[currentIndex + 1] == 0) {
                indexesToCheck.add(currentIndex + 1);
            }
            if (game[currentIndex + leap] == 0) {
                indexesToCheck.add(currentIndex + leap);
            }
            if (currentIndex != 0) {
                if (game[currentIndex - 1] == 0) {
                    if (game[currentIndex -1] != 1){
                        indexesToCheck.add(currentIndex-1);
                    }
//               
                }

            }
            game[currentIndex] = 1;

//     
            indexesToCheck.removeFirst();
            lengthofIndextoCheck = indexesToCheck.size();
           try {
               currentIndex = indexesToCheck.getFirst();
           }catch (java.util.NoSuchElementException e){
               return false;
           }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}


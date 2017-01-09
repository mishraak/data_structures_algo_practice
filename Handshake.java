import java.util.*;

public class Handshake {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of board members...");
    int NoOfBoardMem = sc.nextInt();

    int totalHandshakes = findTotalHandshake(NoOfBoardMem);

    System.out.println("total handshakes :" + totalHandshakes);
    
    return;
  }

  static int findTotalHandshake(int i) {

    if (i == 1) {
      return 0;
    }
    if (i == 2) { 
      return 1;
    }
    else {
        return findTotalHandshake(i-1) + i-1;
    }
  }
}
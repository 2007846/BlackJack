import java.io.*;
import java.util.*;

public class Main {
  public static void main(String Args[]) throws FileNotFoundException {
    new Player("me", 1000, "Ledger");
    new Player("you", 1300, "Ledger");
    new Player("other", 200, "Ledger");
    System.out.println("MAIN");
  }
}
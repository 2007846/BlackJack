import java.io.*;
import java.util.*;

public class Player{
  
  private String name;
  private double cash;
  private UUID   id = UUID.randomUUID();
  private File f;
  private PrintStream p = new PrintStream(f);
  
  public Player(String name, double cash, String Ledger) throws FileNotFoundException {
    f = new File (Ledger + ".csv");
    this.p = new PrintStream(f);
    this.name = name;
    this.cash = cash;

    write(this.name + "," + this.id + "," + this.cash);
  }

  public void addToLedger() {
    
  }
  
  public void write(String message) {
    this.p.println(message);
  }
  
  public double bet(double amount){
    this.cash -= amount;
    return amount;
  }
  public String getName() {
	  return name;
  }
  public double getCash() {
	  return cash;
  }
}
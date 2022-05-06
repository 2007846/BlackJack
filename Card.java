public class Card{

  static final String[] SUITES    = {"♠","♥","♦","♣"};
  static final String[] SPECIALS  = {"A","J","Q","K"};
  static final int      BASE      = 9; 
  
  int width;
  int height;
  String suite;
  String value;
  int num; 

  public Card(int seed){
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);
    this.num = n+1;
    
    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];
    
    this.suite = SUITES[s];
    this.value = val;
  }

  public String toString() {
    return super.toString() + ": " + this.suite + this.value;
  }
  
}
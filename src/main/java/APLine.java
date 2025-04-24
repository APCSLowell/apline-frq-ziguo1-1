public class APLine
{
  /* your code here */
  protected double a, b, c;

  public APLine(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getSlope() { return -a / b; }
  public boolean isOnLine(double x, double y) { return (a * x) + (b * y) + c == 0; } 
}

public class line {
    
    private Point p1, p2;
    public int a, b, c;
    public line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = p1.getY() - p2.getY();
        this.b = p2.getX() - p1.getX();
        this.c = p1.getX() * p2.getY() - p2.getX() * p1.getY();
    }

    public double getSlope() {
        return (-a/b);
    }

    public double getSlopeFromPoints() {
        double slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        return slope;
    }
    public String getPointSlopeFormula() {
        String x1 = String.valueOf(p1.getX());
        String y1 = String.valueOf(p1.getY());
        String m = String.valueOf(getSlopeFromPoints());
        String formula = String.format("(y - %1$s) = %2$s (x - %3$s)", y1, m, x1);
        return formula;
    }
   public boolean isOnLine(int x, int y) {
       if (a * x + b * y + c == 0){
           return (true);
        }
        else
        return (false);
    }

    public boolean isOnLine(Point p) {
        return (a * p.getX() + b * p.getY() + c == 0);
    }
    
    public String isOn(Point p, boolean isOnline) {
        String onLine;
        if (isOnline) {
            onLine = String.format("(%1$s,%2$s) is on the li e", p.getX(), p.getY());
        } else {
            onLine = String.format("The point (%1$s,%2$s) is not on the line", p.getX(), p.getY());
        }

        return onLine;
    }
    public String toString() {

        return String.format("Standard Form: %1$sx + %2$sy + %3$s = 0\nCoefficients: A = %1$s, B = %2$s, C = %3$s", a,
            b, c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }


  public void setA(int a) {
        this.a = a;
    }

 public void setB(int b) {
        this.b = b;
    }

public void setC(int c) {
        this.c = c;
    }

 public void setP1(Point p) {
        this.p1 = p;
        setCords();
    }

    public void setP2(Point p) {
        this.p2 = p;
        setCords();
    }

    public void setCords() {
        this.a = p1.getY() - p2.getY();
        this.b = p2.getX() - p1.getX();
        this.c = p1.getX() * p2.getY() - p2.getX() * p1.getY();
    }
}
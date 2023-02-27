public class Triangle
{
    // instance variables - replace the example below with your own
    private double base, height;
    
    String adjective;

    public Triangle(double base, double height,String adjectivee)
    {
        this.base = base;
        this.height = height;
        this.adjective = adjective;
    }
        public static void main(String[] args){
        Triangle tri = new Triangle(4,5,"cool");
        tri.getArea();
        System.out.println("bob's area is " + tri.getArea());
        System.out.println("bob is pretty " + tri.adjective);
        
        Triangle sally = new Triangle(4,5,"lame");
        System.out.println("sakky's area is " + sally.getArea());
        System.out.println("sakly is pretty " + sally.adjective);
        System.out.println("wait actually, traingel boob  is " + sally.adjective +  "  two");
        
    }
    private double getArea(){
        return base*height/2;
    }
    
    
}








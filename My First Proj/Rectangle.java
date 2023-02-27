public class Rectangle
{
    public int length, width;
    public String color;

    public Rectangle(int length, int width, String color)
    {
        this.length = length;
        this.width = width;
        this.color = color;
    }

   public void setColor(String newColor)
    {
        this.color = newColor;
    }
   public void setLength(int length)
    {
        this.length = length;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public int getWidth()
    {
        return this.width;
    }
    public int getLength()
    {
        return this.length;
    }
    public String getColor()
    {
        return this.color;
    }
    
}

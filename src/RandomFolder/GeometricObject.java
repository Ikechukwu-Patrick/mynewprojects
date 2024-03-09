package RandomFolder;

public abstract class GeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public boolean getFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getdateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return STR."Created on:\{dateCreated}\nColor:\{color}and filled:\{filled}";
    }
    public abstract double getArea();

    public abstract double getPerimeter();

//    public static void main(String[] args) {
//        GeometricObject geometricObject1 = new Circle(5);
//        GeometricObject geometricObject2 = new Rectangle(5,3);
//        System.out.println("The two angle have the same angle" + equalArea(geometricObject1, geometricObject2));
//    }
}

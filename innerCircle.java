class Circle{
    double ri,ro;
    final double pi=3.14;
    void setRadius(double a, double b)
    {
        ro=a;
        ri=b;
    }
    double computeArea()
    {
        double Area=(pi*ro*ro)-(pi*ri*ri);
        return Area;
    }
    double computeCircumstence()
    {
        double Circumstence=(2*pi*ro)-(2*pi*ri);
        return Circumstence;
    }

}
class innerCircle{
    public static void main(String[] args)
    {
        Circle c1=new Circle();
        c1.setRadius(10,5);
        double Area=c1.computeArea();
        double Circumstence=c1.computeCircumstence();
        System.out.println("Area of Circle "+Area);
        System.out.println("Circumstence of Circle "+Circumstence);
    }
}

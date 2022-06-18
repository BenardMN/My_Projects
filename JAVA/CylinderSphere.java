public class CylinderSphere {
    public int radius, height=10;
    double volume;
    final double pi = 3.142;
    CylinderSphere(int r){
        radius = r;
    }
    public double cylinder(){
        volume = pi * radius * radius * height;
        return volume;
    }
    public static void main(String args[]) {
       Sphere ab = new Sphere(7);
       System.out.println("Volume of Cylinder: "+ab.cylinder());
       System.out.println("Volume of sphere: "+ab.getVolume());
    }
}
class Sphere extends CylinderSphere{
    Sphere(int r) {
        super(r);
    }
    public double getVolume(){
       volume = 4*pi*radius*radius*radius;
       volume/=3;
       return volume;
    }
}

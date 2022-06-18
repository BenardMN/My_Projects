public class Volume {
    public int radius, height = 14;
    final double pi = 3.142;
    double volume;
    Volume(int r){
        radius = r;
    }
    double cylinder(){
        volume = pi * radius * radius * height;
        return volume;
    }
    public static void main(String[] args) {
        spherevolume s1 = new spherevolume(7);
        System.out.println("Volume of cylinder:" + s1.cylinder());
        System.out.println("Volume of sphere: " + s1.svolume());
    }
}
class spherevolume extends Volume{
    spherevolume(int r){
        super(r);
    }
    double svolume(){
        double volume = (4 * radius * radius * radius )/3;
        return volume;
    }
}
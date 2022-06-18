public class Smallest {
    public double weight1,weight2,weight3;
    public Smallest(double weight1,double weight2,double weight3){
        this.weight1 = weight1;
        this.weight2 = weight2;
        this.weight3 = weight3;
    }
    public double Calculate(){
        if(weight1<=weight2 && weight1<=weight3){
            System.out.println(weight1+" is the smallest weight");
                }else if(weight2<=weight1 && weight2<=weight3){
                    System.out.println(weight2+" is the smallest weight");
                } else{
                    System.out.println(weight3+" is the smallest number");
                }
     return 0;
    }
    public static void main(String args[]) {
     Smallest small = new Smallest(230,218,390);
     small.Calculate();
    }
}

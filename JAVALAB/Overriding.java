class ComputerScience{
    void show(){
        System.out.println("first year");
    }
}
class Overriding extends ComputerScience{
    void show(){
        System.out.println("second year");
    }
    public static void main(String args[]){
        Overriding  o = new Overriding();
         ComputerScience cse = new ComputerScience();
        o.show();
        cse.show();
    }
}
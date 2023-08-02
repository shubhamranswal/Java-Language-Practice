class Comp {
    void now(){
        System.out.println("first");
    }
    void now(int a){
    System.out.println("second");
}}
class Overload{
    public static void main(String args[]){
 
 Comp c= new Comp();
    c.now();
 
 }
     
}
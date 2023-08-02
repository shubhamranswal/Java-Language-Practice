class Abc {
    String name;
    int number;
    Abc(){
        System.out.println("\nThis is args constructor."+name +number);
    }
    public static void main(String[] args) {
        Abc a = new Abc();
        a.name="asdfghjmk,";
        a.number=1234567890;
    }
}

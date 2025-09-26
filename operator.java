class A {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if(++x < 10 & ++y < 20) {
           ++x;
        } else {
           ++y;
        }
        System.out.println(x);
        System.out.println(y);
    }
}

//Ternary 
 class B {
     public static void main(String[] args) {
        System.out.println(10<20 ? 10:20);
     }
    
}
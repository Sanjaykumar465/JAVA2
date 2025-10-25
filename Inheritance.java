// Simple Inheritance

class A {
    public void m1() {
        System.out.println("Sanjay");
    }
}

class B extends A {
    public void m2() {
        System.out.println("Kumar");
    }
}

class Test {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
    }
}

// Multilevel Inheritance
class C {
    public void m1() {
        System.out.println("Sanjay");
    }
}

class D extends C {
    public void m2() {
        System.out.println("Kumar");
    }
}

class E extends D {
    public void m3() {
        System.out.println("Mohanta");
    }
}

class Demo {
    public static void main(String[] args) {
        E e = new E();
        e.m1();
        e.m2();
        e.m3();
    }
}

// Hierarchical Inheritance
class F {
    public void m1() {
        System.out.println("Sanjay");
    }
}

class G extends F {
    public void m2() {
        System.out.println("Kumar");
    }
}

class H extends F {
    public void m3() {
        System.out.println("Mohanta");
    }
}
class HTest{
    public static void main(String[] args) {
        G g = new G();
        g.m1();
        g.m2();
    }
}

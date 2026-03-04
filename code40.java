// Parent class
class A {
    void displayA() {
        System.out.println("Class A: Parent class");
    }
}

// Multilevel inheritance: B extends A
class B extends A {
    void displayB() {
        System.out.println("Class B: Child of A");
    }
}

// Multilevel inheritance: C extends B (so A → B → C)
class C extends B {
    void displayC() {
        System.out.println("Class C: Child of B (Grandchild of A)");
    }
}

// Single inheritance: D extends A directly (A → D)
class D extends A {
    void displayD() {
        System.out.println("Class D: Another child of A");
    }
}

public class HybridExample {
    public static void main(String[] args) {

        System.out.println("Multilevel Inheritance (A → B → C):");
        C objC = new C();
        objC.displayA();
        objC.displayB();
        objC.displayC();

        System.out.println("\nSingle Inheritance (A → D):");
        D objD = new D();
        objD.displayA();
        objD.displayD();
    }
}


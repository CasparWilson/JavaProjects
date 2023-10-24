class A {
    A() {
        System.out.println("hello a");
    }

    A(int x) {
        this();  // Current class constructor is called.
        System.out.println(x);
    }
}
interface test{
    void cc();
    void gg();
    void dd();
}

class check{
    public void ch() {
        System.out.println("Checking by adding a child class");
    }
}

 class InterfaceDemo extends check implements test {

    @Override
    public void cc() {
        System.out.println("Method_1");
    }

    @Override
    public void gg() {
        System.out.println("Method_2");

    }

    @Override
    public void dd() {
        System.out.println("Method_3");

    }

    public static void main(String[] args) {
        check c=new check();
        test t=new InterfaceDemo();
        c.ch();
        t.cc();
        t.dd();
        t.gg();
        }
    }


package classandobjects;
class BooleanExample {

    void show(int a) {
        System.out.println("Integer method called");
    }

    void show(boolean a) {
        System.out.println("Boolean method called");
    }

    public static void main(String[] args) {
        BooleanExample obj = new BooleanExample();
        
        obj.show(true); // Calls Boolean method
        obj.show(10);   // Calls Integer method
    }
}
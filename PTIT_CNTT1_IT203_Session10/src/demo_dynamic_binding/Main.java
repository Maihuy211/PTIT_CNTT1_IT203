package demo_dynamic_binding;

public class Main {
    public static void main(String[] args) {
        SuperClass s;
        s= new SuperClass();
        s.show();

        if(s instanceof  SuperClass){
            System.out.println("");
        }
        s = new SubClass();
        s.show();
        if(s instanceof  SubClass){
            System.out.println("");
        }

    }
}
// in ra kết quả gì
// -> đối tượng dược thể hiện
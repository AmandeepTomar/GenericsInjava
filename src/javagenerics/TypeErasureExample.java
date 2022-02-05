package javagenerics;

import java.io.Serializable;

public class TypeErasureExample {

    public static void main(String[] args) {
        FirstStore firstStore = new FirstStore();
        firstStore.setT(1);
        firstStore.setT(1.0);
        firstStore.setT("String");

        // its accept all that implements Serializable
        FirstStore1 firstStore1=new FirstStore1();
        firstStore1.setT("Data");
        firstStore1.setT(1);
    }
}
class FirstStore<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
//// compile code like
//class FirstStore{
//    private Object t;
//
//    public Object getT() {
//        return t;
//    }
//
//    public void setT(Object t) {
//        this.t = t;
//    }
//}

class FirstStore1<T extends Serializable>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

// Compiled code
//class FirstStore1{
//    private Serializable t;
//
//    public Serializable getT() {
//        return t;
//    }
//
//    public void setT(Serializable t) {
//        this.t = t;
//    }
//}

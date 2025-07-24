public class PrintGeneric<T> {

    T number;

    public PrintGeneric(T number) {
        this.number = number;
    }

    public void print() {
        System.out.println(number);
    }
    
}

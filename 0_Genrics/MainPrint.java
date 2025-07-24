public class MainPrint {
    public static void main(String[] args) {
        PrintInteger printInteger = new PrintInteger(10);
        printInteger.print();

        PrintDouble printDouble = new PrintDouble(33.5);
        printDouble.print();

        PrintGeneric<Integer> printInt = new PrintGeneric<>(10);
        printInt.print();

        PrintGeneric<String> printString = new PrintGeneric<String>("Govind");
        printString.print();
    }
}

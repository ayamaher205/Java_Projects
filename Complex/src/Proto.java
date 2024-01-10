public class Proto <T extends Number> {
    private T real;
    private T imagin;

    public Proto(T first, T second) {
        real = first;
        imagin = second;
    }
    void setReal(T x){
        real = x;
    }
    void setImagin(T x){
        imagin = x;
    }
    T getReal(){
        return real;
    }
    T getImagin(){
        return imagin;
    }
    void addition() {
        if (real instanceof Double) {
            double result = real.doubleValue() + imagin.doubleValue();
            System.out.println("summation equal: " + result);
        } else if (real instanceof Integer) {
            int result = real.intValue() + imagin.intValue();
            System.out.println("summation equal: " + result);
        }
    }

    void subtraction() {
        if (real instanceof Double) {
            double result = real.doubleValue() - imagin.doubleValue();
            System.out.println("subtraction equal: " + result);
        } else if (real instanceof Integer) {
            int result = real.intValue() - imagin.intValue();
            System.out.println("subtraction equal: " + result);
        }
    }
} //end class

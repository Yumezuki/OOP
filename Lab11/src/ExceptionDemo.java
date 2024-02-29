public class ExceptionDemo {
    public static void main(String[] args) {
        double a, b, c, x1, x2, num;
        
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);

            num = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

            x1 = ((-1 * b) + num) / (2 * a);
            x2 = ((-1 * b) - num) / (2 * a);

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } catch(NumberFormatException nf) {
            System.out.println("Please input data in number format only.");
        } catch(ArrayIndexOutOfBoundsException arr) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}

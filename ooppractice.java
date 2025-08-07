
class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(
            (a.real * b.real) - (a.imag * b.imag),
            (a.real * b.imag) + (a.imag * b.real)
        );
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else if (imag < 0) {
            System.out.println(real + "" + imag + "i");
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(9, 4);

        System.out.print("First complex number: ");
        c1.printComplex();

        System.out.print("Second complex number: ");
        c2.printComplex();

        Complex sum = Complex.add(c1, c2);
        System.out.print("Sum: ");
        sum.printComplex();

        Complex difference = Complex.diff(c1, c2);
        System.out.print("Difference: ");
        difference.printComplex();

        Complex product = Complex.product(c1, c2);
        System.out.print("Product: ");
        product.printComplex();
    }
}

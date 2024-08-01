public class PowerElement {

    public double power(double base, int exponent) {

        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1 / power(base, -exponent);
        }

        else {
            return base * power(base, exponent - 1);
        }
    }
}


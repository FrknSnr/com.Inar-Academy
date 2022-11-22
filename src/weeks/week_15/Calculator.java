package weeks.week_15;

public class Calculator {

    private Number number1;
    private Number number2;


    public Calculator(double number1, double number2) {
        this.number1 = new Number(number1);
        this.number2 = new Number(number2);
    }

    public Number getNumber1() {
        return number1;
    }

    public Number getNumber2() {
        return number2;
    }

    public Number getSum() {
        return new Number(number1.getValue() + number2.getValue());
    }

    public Number getSubtract() {
        return new Number(number1.getValue() - number2.getValue());
    }

    public Number getMultiply() {
        return new Number(number1.getValue() * number2.getValue());

    }

    public void setNumber1(Number number1) {
        this.number1 = number1;
    }

    public void setNumber2(Number number2) {
        this.number2 = number2;
    }

    public Number getDivide() {
        return new Number(number1.getValue() / number2.getValue());
    }

    public Number getRemainder() {
        return new Number(number1.getValue() % number2.getValue());
    }

    public void clear() {
        setNumber1(null);
        setNumber2(null);
    }
    public void change(Number num) {
        if (num.getValue() > 0) {
            num.setValue(0 - num.getValue());
        } else if (num.getValue() < 0) {
            num.setValue(Math.abs(num.getValue()));
        } else num.setValue(num.getValue());
    }
}

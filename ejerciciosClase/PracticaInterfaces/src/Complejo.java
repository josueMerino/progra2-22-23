public class Complejo implements Comparable{

    private double _p_real;
    private double _p_imag;
    public Complejo(double x, double y)
    {
        this._p_real = x;
        this._p_imag = y;
    }

    public Complejo() {
        this._p_real = 0;
        this._p_imag = 0;
    }

    public double modulo(){
        return Math.sqrt(Math.pow(this._p_real,2) + Math.pow(this._p_imag, 2));
    }
    public double real(){
        return this._p_real;
    }
    public double imaginario(){
        return this._p_imag;
    }

    public String toString(){
        return this._p_real + " + " + this._p_imag + "i";
    }

    public boolean equals(Object x) {
        if(this.modulo() == ((Complejo) x).modulo())
        {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean greaterThan(Comparable arg) {
        if(this.modulo() > ((Complejo) arg).modulo())
        {
            return true;
        }
        else{
            return false;
        }
    }
}

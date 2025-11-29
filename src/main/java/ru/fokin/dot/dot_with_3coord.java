package ru.fokin.dot;

public class dot_with_3coord extends Dot {
    public String Z;

    public dot_with_3coord (String X,String Y,String Z) {
        super(X,Y);
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }
    @Override
    public String toString() {
        return "{" + this.X + ";" + this.Y + ";" + this.Z + "}";
    }

}

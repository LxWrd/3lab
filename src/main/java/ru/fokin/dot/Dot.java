package ru.fokin.dot;

public class Dot implements Cloneable {
    public String X;
    public String Y;
    public Dot(String x,String y) {
        this.X = x;
        this.Y = y;
    }
    public void changeX(String x) {
        this.X = x;
    }

    @Override
    public String toString() {
        return "{"+this.X+":"+this.Y+"}";
    }

    @Override
    public boolean equals(Object obj) {
        Dot dot = (Dot) obj;
        return X == dot.X && Y == dot.Y;
    }

    @Override
    public Object clone() {
        Dot newdot = new Dot(this.X,this.Y);
        return newdot;
    }
}

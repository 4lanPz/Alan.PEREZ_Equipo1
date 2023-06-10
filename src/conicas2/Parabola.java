package conicas2;

public class Parabola {
    private float ejex;
    private float ejey;
    private float a;
    private float b;
    private float c;

    public Parabola(float ejex, float ejey, float a, float b, float c) {
        this.ejex = ejex;
        this.ejey = ejey;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float Parabola_VerticeX(float a, float b) {
        return this.ejex = b / (2.0F * a);
    }

    public float Parabola_VerticeY(float a, float b, float c) {
        return this.ejey = a * this.ejex * this.ejex + b * this.ejex + c;
    }

    public void Parabola_ImpVer() {
        System.out.println("La coordenada del vértice es: (" + this.ejex + "," + this.ejey + ")");
    }

    public float getEjex() {
        return this.ejex;
    }

    public void setEjex(float ejex) {
        this.ejex = ejex;
    }

    public float getEjey() {
        return this.ejey;
    }

    public void setEjey(float ejey) {
        this.ejey = ejey;
    }

    public float getA() {
        return this.a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return this.b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return this.c;
    }

    public void setC(float c) {
        this.c = c;
    }
}

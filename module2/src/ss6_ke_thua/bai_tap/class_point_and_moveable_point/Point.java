package ss6_ke_thua.bai_tap.class_point_and_moveable_point;

public class Point {
    private float x;
    private float y;

    protected Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    protected Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void  setXY(float x, float y ){
        this.x = x;
        this.y= y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

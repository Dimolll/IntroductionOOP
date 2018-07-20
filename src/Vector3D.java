public class Vector3D {
    private int x;
    private int y;
    private int z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D(){}

     public Vector3D addition(Vector3D b){
        return new Vector3D(x +b.x, y +b.y, z +b.z);
     }

     public Vector3D scalarProduct( Vector3D b){
        return new Vector3D(x *b.x, y *b.y, z *b.z);
     }

     public Vector3D vectorProduct(Vector3D b){
        return new Vector3D(y * b.z - z * b.y, z * b.x - x * b.z, x * b.y - y * b.x);
     }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

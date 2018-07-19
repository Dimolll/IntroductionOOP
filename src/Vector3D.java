public class Vector3D {
    private int x;
    private int y;
    private int z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

     public Vector3D addition(Vector3D b){
        return new Vector3D(x +b.x, y +b.y, z +b.z);
     }

     public Vector3D scalarProduct( Vector3D b){
        return new Vector3D(x *b.x, y *b.y, z *b.z);
     }

     public Vector3D vectorProduct(Vector3D b){
        return new Vector3D(y * b.z - z * b.y, z * b.x - x * b.z, x * b.y - y * b.x);
     }
}

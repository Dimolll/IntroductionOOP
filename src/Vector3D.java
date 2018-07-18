public class Vector3D {
    private int X;
    private int Y;
    private int Z;

    public Vector3D(int x, int y, int z) {
        X = x;
        Y = y;
        Z = z;
    }
     public Vector3D Addition(Vector3D B){
        return new Vector3D(X+B.X, Y+B.Y,Z+B.Z);
     }

     public Vector3D ScalarProduct( Vector3D B){
        return new Vector3D(X*B.X, Y*B.Y,Z*B.Z);
     }

     public Vector3D VectorProduct(Vector3D B){
        return new Vector3D(Y*B.Z-Z*B.Y,Z*B.X-X*B.Z,X*B.Y-Y*B.X);
     }
}

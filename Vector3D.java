public class Vector3D {
    
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(
            this.x + other.x,
            this.y + other.y,
            this.z + other.z
        );
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(
            this.x - other.x,
            this.y - other.y,
            this.z - other.z
        );
    }

    public Vector3D multiply(double scalar) {
        return new Vector3D(
            this.x * scalar,
            this.y * scalar,
            this.z * scalar
        );
    }

    public double dotProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3D crossProduct(Vector3D other) {
        return new Vector3D(
            this.y * other.z - this.z * other.y,
            this.z * other.x - this.x * other.z,
            this.x * other.y - this.y * other.x
        );
    }

    
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }
}
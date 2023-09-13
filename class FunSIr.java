class FunSIr {
    static float si() {
        float p = 5000;
        float t = 2;
        float r = 4.5f;
        float i = (p * t * r) / 100;
        return i;
    }

    public static void main(String[] args) {
        System.out.println("simple intrest is: " + si() + " rupees");
    }
}

public class BinOps {
    public String sum(String a, String b) {
        int argA = Integer.parseInt(a, 2);
        int argB = Integer.parseInt(b, 2);
        int result = argA + argB;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int argA = Integer.parseInt(a, 2);
        int argB = Integer.parseInt(b, 2);
        int result = argA * argB;
        return Integer.toBinaryString(result);
    }
}

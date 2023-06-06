public class Task6 {
    public static void main(String[] args) {
        int result;
        result = nextEdge(8, 10);
        System.out.println(result);
        result = nextEdge(5, 7);
        System.out.println(result);
        result = nextEdge(9, 2);
        System.out.println(result);
    }

    public static int nextEdge(int side1, int side2) {
        return (side1 + side2) - 1;
    }
}

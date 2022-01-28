package solutions;

public class FrogJmp {
    public static int solution(int x, int y, int d) {
        int distance= y-x;
        int jumps = (int) Math.ceil(distance/(double) d);
        return jumps;
    }
}

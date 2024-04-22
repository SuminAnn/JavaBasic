package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){}//인스턴스 생성을 막는다

    public static int sum(int[] values) {
        int tot = 0;
        for (int i : values) {
            tot += i;
        }
        return tot;
    }

    public static double average(int[] values) {
        return (double)sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int i : values) {
            if(min > i){
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int i : values) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }
    
}

package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first +=second;
        second = first-second;
        first = first -second;
        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String[] args) {
        BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(12,5);
    }
}

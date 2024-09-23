public class EliudsEggs {
    public int eggCount(int number) {
        return Integer.bitCount(number);
        //        return (int) Integer.toBinaryString(number).chars().filter(c -> c == '1').count();
    }
}

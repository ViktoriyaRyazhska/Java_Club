public class task18 {
    public static int opposite(int number) {
        if (number == 0) {
            return 0;
        } if (number > 0) {
        return number * -1;
        } else {
            return Math.abs(number);
        }
    }
}

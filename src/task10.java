public class task10 {
    public static String datingRange(int age) {
        int minAge;
        int maxAge;
        if (age <= 14) {
            minAge = (int) (age - 0.10 * age);
            maxAge = (int) (age + 0.10 * age);
        } else {
            minAge = age/2 + 7;
            maxAge = (age-7) * 2;
        }

        return minAge + "-" + maxAge;
    }


}

public class TestEnum {
    public enum DaysOfWeek {
        MONDAY,
        TUERSDAY,
        WEDNESDAY,
        THURTHDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
    }

    public static void main(String[] args) {
        DaysOfWeek[] values = DaysOfWeek.values();
        for (DaysOfWeek value : values) {
            System.out.println(value);
        }

    }
}

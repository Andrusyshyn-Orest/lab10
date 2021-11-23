package example;

public enum Day {
    MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5), SUNDAY(6);
    private int order;

    Day(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase() + " " + order;
    }
}

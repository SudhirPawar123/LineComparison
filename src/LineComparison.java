//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LineComparison {
    private double x1, y1, x2, y2;

    public LineComparison(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double length() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        LineComparison line = (LineComparison) obj;

        return (Double.compare(line.length(), this.length()) == 0);
    }
    public int compareTo(LineComparison other) {
        return Double.compare(this.length(), other.length());
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Problem..!");
        LineComparison line1 = new LineComparison(1, 2, 3, 4);
        LineComparison line2 = new LineComparison(2, 3, 4, 5);
        LineComparison line3 = new LineComparison(1, 2, 3, 4);

        System.out.println("Length of line1: " + line1.length());
        System.out.println("Length of line2: " + line2.length());
        System.out.println("Length of line3: " + line3.length());

        System.out.println("line1 equals line2: " + line1.equals(line2));
        System.out.println("line1 equals line3: " + line1.equals(line3));

        System.out.println("Comparison of line1 and line2: " + line1.compareTo(line2));
        System.out.println("Comparison of line1 and line3: " + line1.compareTo(line3));
    }
}
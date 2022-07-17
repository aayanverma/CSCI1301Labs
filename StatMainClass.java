
public class StatMainClass {
	public static void main(String[] args) {
		double[] data = {-5.3, 2.5, 88.9, 0, 0.0, 28, 16.5, 88.9, 109.5, -90, 88.9}; Stat stat1 = new Stat();
		System.out.println("stat1 data = " + stat1.toString()); stat1.append(data);
		System.out.println("stat1 has been altered.");
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat1 min = " + stat1.min());
		System.out.println("stat1 max = " + stat1.max());
		System.out.println("stat1 average = " + stat1.average());
		System.out.println("stat1 mode = " + stat1.mode());
		System.out.println("stat1 variance = " + stat1.variance());
		System.out.println("stat1 standard deviation = " + stat1.standardDeviation() + "\n");
		
	}
}

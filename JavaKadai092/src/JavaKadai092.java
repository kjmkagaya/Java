
public class JavaKadai092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] Data = {23,45,21,67,95,43,76,19};
		System.out.println("配列の平均は" + getAvg(Data) + "です");
		System.out.println("配列の先頭から4個の平均は "
				 + getAvg(Data,4)+ "です");
		System.out.println("配列の先頭から15個の平均は"
				+ getAvg(Data,15) + "です");
	}

	private static double getAvg(int[] data, int i) {
		// TODO Auto-generated method stub
		double sum = 0;
		
		for (int j = 0; j < i; j++) {
			sum += data[j];
		}
		sum += sum/i;
		return sum;
	}

	private static double getAvg(int[] data) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		sum += sum/data.length;
		return sum;
	}

}

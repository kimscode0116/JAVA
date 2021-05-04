package project0326;

public class kaupIndex {
	public static void main(String[] args) {
		kaupMethod kaup = new kaupMethod();
		
		double weightData = kaupMethod.inputData();
		double heightData = kaupMethod.inputData2();
		kaupMethod.outputData (weightData,heightData);
	}
}


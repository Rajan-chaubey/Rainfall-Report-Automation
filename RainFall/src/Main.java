import java.util.List;

public class Main {

	public static void main(String[] args) {

		RainfallReport re = new RainfallReport();
		List<AnnualRainfall> raini = re.generateRainfallReport("src/AllCityMonthlyRainfall.txt");
		for (AnnualRainfall R : raini) {
			System.out.println(R.getCityPincode() + "    " + R.getCityName() + "    "
					+ String.format("%.8f", R.getAverageAnnualRainfall()));
		}
			raini = re.findMaximumRainfallCities();
			System.out.println("Maximum Rainfall:");
			for (AnnualRainfall a : raini) {
				System.out.println(a.getCityName());
			}
		}
	}


public class NumberUtilityApplication {
	public static void main(String[] args){
		NumberUtility nu = new NumberUtility();
		
		System.out.println("Decimal: " + nu.nDecimal(54.2325252, 3));
		System.out.println("Percentage: " + nu.percentage(.2325252));
		System.out.println("Currency: " + nu.currency(54.232233));
		System.out.println("Random betweeen 5 and 10: " + nu.randAB(5, 10));
		System.out.println("Max of 5 and 11: " + nu.max(5, 11));
		System.out.println("Min of 23 and 22: " + nu.min(23, 22));
		
	}

}

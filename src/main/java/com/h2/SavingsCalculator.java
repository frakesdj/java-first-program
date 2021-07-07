package com.h2;
import java.time.LocalDate;
import java.time.YearMonth;
public class SavingsCalculator {

		private float[] credits, debits;
		
		public SavingsCalculator (float[] credits, float[] debits)
		{
			this.credits = credits;
			this.debits = debits;
		}
		
		public static void main(String[] args)
		{
			String[] creditsAsString = args[0].split(",");
			String[] debitsString = args[1].split(",");
			
			float[] credits = new float[creditsAsString.length];
			float[] debits = new float[debitsString.length];
			
			for (int i = 0; i < creditsAsString.length; i++)
			{
				credits[i] = Float.parseFloat(creditsAsString[i]);
				debits[i] = Float.parseFloat(debitsString[i]);
			}
			SavingsCalculator calculator = new SavingsCalculator(credits, debits);
			float netSavings = calculator.calculate();
			System.out.println("Net Savings = " + netSavings + ", remaining days in month = " + remainingDaysInMonth(LocalDate.now()) );
		}
		
		private float sumOfCredits()
		{
			float sum = 0.0f;
			for(int t = 0; t < credits.length; t++)
			{
				sum = sum + credits[t];
			}
			return sum;
		}
		
		private float sumOfDebits()
		{
			float sum = 0.0f;
			for (int j = 0; j < debits.length; j++)
			{
				sum = sum + debits[j];			
			}
			return sum;
		}
		
		private static int remainingDaysInMonth(LocalDate date)
		{
			YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
			int totalDaysInMonth = yearMonth.lengthOfMonth();
			int remainingDays = totalDaysInMonth - date.getDayOfMonth();
		
			return remainingDays;
		}
		
		public float calculate()
		{
			return sumOfCredits() - sumOfDebits();
		}
		
		
		
}

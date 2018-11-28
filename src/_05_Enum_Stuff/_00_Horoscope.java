package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void displayZodiac(Zodiac z) {
		switch (z) {
		case ARIES:
		JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
		break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "You are hated by everyone you know");
			break;
		
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z = Zodiac.GEMINI;
		displayZodiac(z);
	}
}

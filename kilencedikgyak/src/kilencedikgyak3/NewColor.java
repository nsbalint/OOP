package kilencedikgyak3;
import java.awt.Color;

public class NewColor extends Color{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewColor(float r, float g, float b) {
		super(r, g, b);
	}

	public String toString() {
		if (this.equals(BLUE)) {
			return "kék";
		}else if (this.equals(GREEN)) {
			return "zöld";
		}else if (this.equals(RED)) {
			return"piros";
		}else {
			return "?";
		}
	}
	
}
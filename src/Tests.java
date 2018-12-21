import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Tests {

	public void testIfinif() {
		Point2D position;
		boolean negative = false;
		Engine e = null;
		Shape bounds = null;
		Rectangle2D bar = null;
		if (bounds != null || true) {
			// shape is detected as fdp
			if (!bar.contains(bounds.getBounds2D())) {
				if (!negative) {
					position = getPositiveItemLabelPositionFallback();
				} else {
					position = getNegativeItemLabelPositionFallback();
				}
				if (position != null) {
					Object anchorPoint = e.getEngineSpeed();
				}
			}
		}

	}

	private Point2D getNegativeItemLabelPositionFallback() {
		// TODO Auto-generated method stub
		return null;
	}

	private Point2D getPositiveItemLabelPositionFallback() {
		// TODO Auto-generated method stub
		return null;
	}

	// aici apare o problema in sensul ca daca primul bloc are un fdp iar al doilea
	// are 2 printre care si cel de la primul nu le uneste. Ar trebui?Invers le
	// uneste
	protected void createAndAddEntity(Rectangle2D dataArea, Car plotState, String toolTip, String urlText) {
		if (plotState != null && plotState.getPerson() != null) {
			plotState.getPerson();
			String e = plotState.getPerson().getName();
			if (e != null) {
				System.out.println(new Owner());
			}
		}
	}

	public void testIfOneLine(Car c1) {
		if (c1.getPerson()!=null) {
			testIfinif();
		} else if (c1.getPerson()!=null) {
			testIfinif();
		}
	}
	
	//Border case, counterexample for using fdp 2 and don't merge blocks after initial detection
	public void counterExample(Engine e) {
		e.getEngineSpeed();
		e.getMadeFromIron();
		Car c = null;
		c.getCurrentTemperature();
		Owner p=c.getPerson();
		p.getName();
		c.getEngine();
	}
}

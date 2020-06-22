package fatec_ipi_paoo_sabado_decorator_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColorFillDecorator extends GeometricDraw {
	
	private List<String> colors = new ArrayList<String>();
	
	public String color() {
		int color = new Random().nextInt(4);
		return colors.get(color);
	}	
	
	private GeometricDraw geometricDraw;
	
	public ColorFillDecorator(GeometricDraw geometricDraw) {
		colors.add("A cor de preenchimento é azul!");
		colors.add("A cor de preenchimento é prata!");
		colors.add("A cor de preenchimento é preta!");
		colors.add("A cor de preenchimento é amarela!");
		this.geometricDraw = geometricDraw;	
	}

	public GeometricDraw getGeometricDraw() {
		return geometricDraw;
	}

	public void setGeometricDraw(GeometricDraw geometricDraw) {
		this.geometricDraw = geometricDraw;
	}

	@Override
	public String draw() {
		return geometricDraw.draw() + " " + color();
	}
	
	
}	


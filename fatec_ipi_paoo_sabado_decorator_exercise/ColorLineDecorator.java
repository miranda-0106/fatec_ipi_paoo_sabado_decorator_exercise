package fatec_ipi_paoo_sabado_decorator_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColorLineDecorator extends GeometricDraw {
	
	private List<String> colors = new ArrayList<String>();
	
	public String color() {
		int color = new Random().nextInt(4);
		return colors.get(color);
	}
	
	private GeometricDraw geometricDraw;
	
	public ColorLineDecorator(GeometricDraw geometricDraw) {
		colors.add("A cor da linha do desenho é verde!");
		colors.add("A cor da linha do desenho é vermelha!");
		colors.add("A cor da linha do desenho é roxa!");
		colors.add("A cor da linha do desenho é azul!");
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


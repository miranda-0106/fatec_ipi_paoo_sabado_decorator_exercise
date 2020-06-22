package fatec_ipi_paoo_sabado_decorator_exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		
		List<GeometricDraw> geoDraw = new LinkedList<>();
			geoDraw.add(new Square());
			geoDraw.add(new Rectangle());
			geoDraw.add(new Circle());	
			
		int desenho = new Random().nextInt(geoDraw.size());
		
		int decorar = new Random().nextInt(3);
		
		List<GeometricDraw> decorators = new LinkedList<>();
		
		decorators.add(new ColorLineDecorator(geoDraw.get(desenho)));
		decorators.add(new ColorFillDecorator(geoDraw.get(desenho)));
		
		int chooseDecorator = new Random().nextInt(decorators.size());
		
		if (decorar == 0) {
			System.out.println(geoDraw.get(desenho).draw());
		}
		
		if (decorar == 1) {
			System.out.println(decorators.get(chooseDecorator).draw());
		}
		
		if (decorar == 2) {
			System.out.println(decorators.get(0).draw());
			System.out.println(decorators.get(1).draw());
		}

	}

}


package poo;

public class view_trees {

	public static void main(String[] args) {
		
		Trees ejemplares[] = new Trees[6];
		
		ejemplares[0] = new Trees("Samur", "Acer Orange Dream", 35, "Seki-joju", "Hoja", "Orange", "Shohin", 3000, true, false, false);
		ejemplares[1] = new Trees("Decap", "Tiger Bark", 45, "Banyan", "Hoja", "Green", "Shohin", 4030, false, false, true);
		ejemplares[2] = new Trees("Ar", "Acer Deshojo", 45, "Moyogui", "Hoja", "Red", "Shohin", 5500, true, false, false);
		ejemplares[3] = new Trees("Grand", "Acer Burgerianum", 44, "Seki-joju", "Hoja", "Yellow", "Shohin", 2333, true, false, false);
		ejemplares[4] = new Trees("Sa", "Ulmus Parvifolia", 55, "Kenkai", "Hoja", "Green", "Chujin", 6700, true, false, false);
		ejemplares[5] = new Trees("Elle", "Acer Media luna", 33, "Han-Kengai", "Hoja", "Green", "Shohin", 7200, true, false, false);
		
		for(Trees p: ejemplares) {
			System.out.println(p.mostrarDatos());
		}
	}
}




















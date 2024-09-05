package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Reader {

	public static ArrayList<String> leerArchivo(String ruta) {

		ArrayList<String> lineas = new ArrayList<String>();

		FileReader fr;
		BufferedReader br;

		try {
			fr = new FileReader(ruta);
			br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				lineas.add(line);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lineas; // líneas es un arrayList DE LINEAS!!!, NO DE LOS ELEMENTOS DE LAS LINEAS!!
	}

}
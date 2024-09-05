package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Writer {

	public static void escribirArchivo(String ruta, ArrayList<String> lineas) {
		FileWriter fw;
		BufferedWriter bw;
		try {
			fw = new FileWriter(ruta);
			bw = new BufferedWriter(fw);
			for (int i = 0; i < lineas.size(); i++) {
				bw.write(lineas.get(i));
				if (i < lineas.size() - 1)
					bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

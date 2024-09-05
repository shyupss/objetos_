package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import data.Reader;
import data.Writer;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> L_lines = Reader.leerArchivo("data/entrada.txt");
		ArrayList<String> arrayOut = new ArrayList<String>();

		for (String p : L_lines) {

			ArrayList<String> line = new ArrayList<>(Arrays.asList(p.split("\\s+")));

			int n = Integer.parseInt(line.get(0));

			if (n == 1) {
				arrayOut.add("Jolly");
			} else {
				ArrayList<Integer> diff = new ArrayList<>();

				for (int i = 1; i < n; i++) {
					int diffValue = Math.abs(Integer.parseInt(line.get(i)) - Integer.parseInt(line.get(i + 1)));
					diff.add(diffValue);
				}

				Collections.sort(diff);

				boolean jolly = true;
				for (int i = 1; i < n; i++) {
					if (diff.get(i - 1) != i) {
						arrayOut.add("Not Jolly");
						jolly = false;
						break;
					}
				}
				if (jolly)
					arrayOut.add("Jolly");
			}
		}
		Writer.escribirArchivo("out/salida.txt", arrayOut);
	}
}

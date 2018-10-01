package views;
import javax.swing.JOptionPane;

public class Dates {
	public int showMenu() {
		String option = JOptionPane.showInputDialog(null,
				"1. Mostrar la sopa de letras" + '\n' + 
				"2. Escribir una palabra" + '\n' + 
				"3. Ver número palabras faltantes" + '\n' + 
				"4. Ver número palabras encontradas" + '\n' + 
				"5. Salir", "Menú principal", JOptionPane.DEFAULT_OPTION);
		int option1 = Integer.parseInt(option);
		return option1;
	}

	public String readWord() {
		String word = JOptionPane.showInputDialog(null, "Digite la palabra encontrada", "Palabra",
				JOptionPane.DEFAULT_OPTION);
		return word;
	}

	public void showMiss(int quantity) {
		JOptionPane.showMessageDialog(null, "La cantidad de palabras faltantes son: " + quantity, "Palabras faltantes",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void showFound(int quantity) {
		JOptionPane.showMessageDialog(null, "La cantidad de palabras encontradas son: " + quantity,
				"Palabras encontradas", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void showWordSearchView(String wordSearch) {
		JOptionPane.showMessageDialog(null, "Sopa de letras:\n" + wordSearch, "Sopa de letras.", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void showGetOut() {
		JOptionPane.showMessageDialog(null, "Adiós", "Salir", JOptionPane.ERROR_MESSAGE);
	}
}

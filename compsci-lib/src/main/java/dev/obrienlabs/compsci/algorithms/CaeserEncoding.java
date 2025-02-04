package dev.obrienlabs.compsci.algorithms;

public class CaeserEncoding {
	
	public String[] verify(String[] input) {
		String [] reply = new String[4];
		return reply;
	}

	public static void main(String[] args) {
		// input [ 4 strings of 3 length ]
		// output [array of 2 rows of 2 strings ]
		CaeserEncoding encoder = new CaeserEncoding();
		String input[] = {"abc", "def", "bcd", "cre"};
		String output[] = encoder.verify(input);

	}

}

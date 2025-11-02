package reader;

public class Reader4 {

	private String fileContent;
	private int filePointer = 0;

	public Reader4(String file) {
		this.fileContent = file;
	}

	public int read4(char[] buf4) {
		int count = 0;
		while (count < 4 && filePointer < fileContent.length()) {
			buf4[count++] = fileContent.charAt(filePointer++);
		}
		return count;
	}
}

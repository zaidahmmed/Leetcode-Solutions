package reader;

class Solution extends Reader4 {
	private char[] buf4 = new char[4];
	private int bufCnt = 0;

	public Solution(String file) {
		super(file);
	}

	public int read(char[] buf, int n) {
		bufCnt = 0;
		while(bufCnt < n) {
			int readCount = read4(buf4);
			for(int i=0;i<readCount && bufCnt < n;i++) {
				buf[bufCnt++]=buf4[i];
			}
		}
		return bufCnt;
	}
}
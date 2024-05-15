import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("text.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2); // 1번째부터 2개 입력 = BC
		os.flush();
		os.close();

	}

}

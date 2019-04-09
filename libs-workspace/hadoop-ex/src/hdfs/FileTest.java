package hdfs;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


public class FileTest {
	public static void main(String[] args) {
		try {
			Configuration config = new Configuration();
			
			FileSystem hdfs = FileSystem.get(config);
			
			Path path = new Path(args[0]);
			// ��ΰ� �����ϸ� �����ϰ� ���̼� ����
			if(hdfs.exists(path)) {
				hdfs.delete(path, true);
			}
			
			FSDataOutputStream dos = hdfs.create(path);
			dos.writeUTF(args[1]);
			dos.close();
			
			FSDataInputStream ios = hdfs.open(path);
			String data = ios.readUTF();
			ios.close();
			
			// CentOs Console Print...
			System.out.println("Data Result: " + data);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
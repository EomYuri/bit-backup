package com.bit;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class WordCount {
	public static void main(String[] args) throws Exception{
		// ȯ�� ���� Ŭ����
		Configuration config = new Configuration();
		
		// Mapreduce Job : ������ �۾� ����
		// ResourceManager (Job Tracker)
		// : Task Tracker�� ���� (����͸�, �����층)
		// NodeManager (Task Tracker)
		// : Task ���� (Job Tracker���� ����)

		// HDFS �۾� �Ҵ��� ���� Job Ŭ����
		Job job = Job.getInstance(config, "WordCount");
		
		// 1. ������ class ���� ( �ϵ��� ������ jar)
		job.setJarByClass(WordCount.class);
		
		// 2. Mapper class ����
		job.setMapperClass(MapperTask.class);
		job.setReducerClass(ReducerTask.class);
		
		// 3. ����� ���� ����
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		// 4. Key�� Value ���� ����
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// 5. ���� �� �Է��� ���� ������ ��� ����
		//  - ����� ��� ����
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		// ���� �� ���� ����
		// > hadoop jar [jar ���� ���] [���� ���� class(main)] [�Է� ���] [��� ���]
		// �Է� ��� : args[0]
		// ��� ��� : args[1]
		
		// 6. �м� �۾� �Ϸ�ñ��� ��� ����
		job.waitForCompletion(true);
		
		
	}

}
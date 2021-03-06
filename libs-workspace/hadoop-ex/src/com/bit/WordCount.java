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
		// 환경 설정 클래스
		Configuration config = new Configuration();
		
		// Mapreduce Job : 수행할 작업 단위
		// ResourceManager (Job Tracker)
		// : Task Tracker의 관리 (모니터링, 스케쥴링)
		// NodeManager (Task Tracker)
		// : Task 수행 (Job Tracker에게 보고)

		// HDFS 작업 할당을 위한 Job 클래스
		Job job = Job.getInstance(config, "WordCount");
		
		// 1. 수행할 class 지정 ( 하둡이 수행할 jar)
		job.setJarByClass(WordCount.class);
		
		// 2. Mapper class 설정
		job.setMapperClass(MapperTask.class);
		job.setReducerClass(ReducerTask.class);
		
		// 3. 입출력 형식 설정
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		// 4. Key와 Value 형식 설정
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// 5. 수행 시 입력한 명령 패턴의 경로 설정
		//  - 입출력 경로 설정
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		// 수행 시 명령 예시
		// > hadoop jar [jar 파일 경로] [수행 기준 class(main)] [입력 경로] [출력 경로]
		// 입력 경로 : args[0]
		// 출력 경로 : args[1]
		
		// 6. 분석 작업 완료시까지 대기 설정
		job.waitForCompletion(true);
		
		
	}

}

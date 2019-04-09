package com.bit;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MapperTask extends Mapper<LongWritable, Text, Text, IntWritable>{
	private final static IntWritable iw
		= new IntWritable(1);
	private Text text = new Text(); 

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		StringTokenizer st = new StringTokenizer(value.toString());
		while(st.hasMoreTokens()) {
			text.set(st.nextToken());
			context.write(text, iw);
		}
	}
}

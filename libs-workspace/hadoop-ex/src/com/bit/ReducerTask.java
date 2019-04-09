package com.bit;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class ReducerTask extends Reducer<Text, IntWritable, Text, IntWritable>{
	private IntWritable iw = new IntWritable();

	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Context context) throws IOException, InterruptedException {
		int cnt = 0;
		for(IntWritable value : values) {
			cnt += value.get();
		}
		iw.set(cnt);
		context.write(key, iw);
	}
}

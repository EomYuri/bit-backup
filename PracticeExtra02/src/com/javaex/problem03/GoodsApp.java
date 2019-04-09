package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	List<Goods> goodsList = new ArrayList<Goods>();
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("상품 3개를 입력해주세요");
    	for( int i = 0; i < 3 ; i++) {
    		// 상품 정보 입력 받기
    		String line = scanner.nextLine();
    		
    		// 입력받은 상품 정보를 공백으로 분리
    		String[] data = line.split(" ");
    		
    		// Goods 객체 생성하여 데이터 넣기
    		Goods goods = new Goods();
    		goods.setName(data[0]);
    		goods.setPrice(data[1]);
    		goods.setCount(data[2]);
    		
    		
    		// 총 개수 구하기
    		
    		
    		// 배열에 추가하기
    		goodsList.add(goods);
    	}
    	
    	// 상품 정보 출력
    	for(int i = 0; i < goodsList.size(); i++) {
    		goodsList.get(i).showInfo();
    	}
    	scanner.close();

       
    }

}

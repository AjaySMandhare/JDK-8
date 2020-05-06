package com.javabykiran;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListSum {
	int addNumbersNojdk8(List<Integer> list) {
		int sum = 0;
		for (int number : list) {
			if (number > 10) {
				sum = sum + number;
			}
		}
		return sum;
	}

	int addNumbersWithjdk8(List<Integer> list) {
		return list.stream().filter(p->p>10).mapToInt(p -> p).sum();
	}
	
	
	static List<Integer> getListGreaterthan10(List<Integer> list){
		return list.stream().filter(p->p>10).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(13);
		lst.add(7);
		lst.add(4);
		lst.add(11);
		System.out.println(getListGreaterthan10(lst));
		ListSum ls = new ListSum();
		int sum = ls.addNumbersNojdk8(lst);
		int sum8 = ls.addNumbersWithjdk8(lst);
		System.out.println(sum);
		System.out.println(sum8);
		
		
		
	}

}

package assignment01;

import java.util.ArrayList;

public class Tester {
/*
Expected output from the main method below
[abc(1), abc(1), acd(2), ace(3), bea(4), beb(5), ccc(6), ddd(7), feg(8), feg(9), feg(9), ghe(9), ghi(10), qqq(11), rrr(12)]
2
-1
-9
11
-9
-12
-14
14
-15
15
-16
---------------------------
0
-1
-9
9
-9
-12
-14
13
-15
14
-16	
*/
		
	public static void main(String[] args) {
		var test = new SortedList<SampleComparable>();
		var list = new ArrayList<SampleComparable>();
		list.add(new SampleComparable("abc"));
		list.add(new SampleComparable("abc",1));
		list.add(new SampleComparable("acd"));
		list.add(new SampleComparable("ace"));
		list.add(new SampleComparable("bea"));
		list.add(new SampleComparable("beb"));
		list.add(new SampleComparable("ccc"));
		list.add(new SampleComparable("ddd"));
		list.add(new SampleComparable("feg"));
		list.add(new SampleComparable("feg",9));
		list.add(new SampleComparable("feg",9));
		list.add(new SampleComparable("ghe"));
		list.add(new SampleComparable("ghi"));
		list.add(new SampleComparable("qqq"));
		list.add(new SampleComparable("rrr"));
		System.out.println(list);
		System.out.println(test.binarySearchHigh(list, new SampleComparable("abc",1)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("aaa")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("feg",7)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("feg",9)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("eee")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("ffg")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("qqq")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("qqq",11)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("qqr")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("rrr",12)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("sss")));
		System.out.println("---------------------------");
		System.out.println(test.binarySearchLow(list, new SampleComparable("abc",1)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("aaa")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("feg",7)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("feg",9)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("eee")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("ffg")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("qqq")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("qqq",11)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("qqr")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("rrr",12)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("sss")));
	}
}

package assignment01;

import java.util.ArrayList;

public class Tester {
/*
Expected output from the main method below
[abc(1), abc(1), acd(2), ace(3), bea(4), beb(5), ccc(6), ddd(7), feg(1), feg(1), feg(2), feg(2), feg(2), feg(3), feg(3), feg(3), feg(3), feg(4), ghe(8), ghi(9), qqq(10), rrr(11)]
2
-1
1 10
2 13
3 17
4 18
-19
-19
-9
-19
-22
21
-22
22
-23
---------------------------
0
-1
1 8
2 10
3 13
4 17
-19
-19
-9
-19
-22
20
-22
21
-23
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
		list.add(new SampleComparable("feg",1));
		list.add(new SampleComparable("feg",1));
		list.add(new SampleComparable("feg",2));
		list.add(new SampleComparable("feg",2));
		list.add(new SampleComparable("feg",2));
		list.add(new SampleComparable("feg",3));
		list.add(new SampleComparable("feg",3));
		list.add(new SampleComparable("feg",3));
		list.add(new SampleComparable("feg",3));
		list.add(new SampleComparable("feg",4));
		list.add(new SampleComparable("ghe"));
		list.add(new SampleComparable("ghi"));
		list.add(new SampleComparable("qqq"));
		list.add(new SampleComparable("rrr"));
		System.out.println(list);
		System.out.println(test.binarySearchHigh(list, new SampleComparable("abc",1)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("aaa")));
		for(int i = 1; i <= 4; i++)
			System.out.println(i + " " + test.binarySearchHigh(list, new SampleComparable("feg",i)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("feg",7)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("feg",9)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("eee")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("ffg")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("qqq")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("qqq",10)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("qqr")));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("rrr",11)));
		System.out.println(test.binarySearchHigh(list, new SampleComparable("sss")));
		System.out.println("---------------------------");
		System.out.println(test.binarySearchLow(list, new SampleComparable("abc",1)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("aaa")));
		for(int i = 1; i <= 4; i++)
			System.out.println(i + " " + test.binarySearchLow(list, new SampleComparable("feg",i)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("feg",7)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("feg",9)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("eee")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("ffg")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("qqq")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("qqq",10)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("qqr")));
		System.out.println(test.binarySearchLow(list, new SampleComparable("rrr",11)));
		System.out.println(test.binarySearchLow(list, new SampleComparable("sss")));
	}
}

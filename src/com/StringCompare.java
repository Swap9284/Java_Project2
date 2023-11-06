package com;

public class StringCompare {
	public class StringClassCompare {

		public static void main(String[] args) {
			String s1 = "abc";
			String s2 = new String("zbc");

			String s3 = "abd";
			String s4 = new String("abc");

			String s5 = "abc";
			String s6 = new String("abc");

			System.out.println(s1.compareTo(s2));
			System.out.println(s3.compareTo(s4));
			System.out.println(s5.compareTo(s6));

			String str = "Helloooo";
			String gtr = new String("World");

			System.out.println(str.concat(gtr));

			System.out.println(str.length());

			System.out.println(str.replace('o', 'u'));

		}

	}

}

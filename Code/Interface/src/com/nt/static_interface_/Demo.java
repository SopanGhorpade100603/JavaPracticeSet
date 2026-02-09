package com.nt.static_interface_;

/* static method are used to write utility or helper methods inside an interface
 that cannot be override and no need to instantiation*/
interface MathUtils {
	public static int square(int num) {
		return num * num;
	}

	public class Demo implements MathUtils {
		public static void main(String[] args) {
			int res = MathUtils.square(5);
			System.out.println(res);
		}
	}
}

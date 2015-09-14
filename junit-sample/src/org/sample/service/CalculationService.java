/**
 * 
 */
package org.sample.service;

import java.util.StringTokenizer;

/**
 * @author M1033375
 *
 */
public class CalculationService {

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int cube(int n) {
		return n * n * n;
	}

	public static String reverseWord(String word) {
		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(word, "");

		while (tokenizer.hasMoreTokens()) {
			StringBuilder builder = new StringBuilder();
			builder.append(tokenizer.nextToken());
			builder.reverse();
			result.append(builder);
			result.append("");
		}

		return result.toString();
	}
}

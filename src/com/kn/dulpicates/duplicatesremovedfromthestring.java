package com.kn.dulpicates;

public class duplicatesremovedfromthestring {
	// Method to remove duplicates
	public String duplicatesremove(String inputstring) {
		char[] crr = inputstring.toCharArray();
		StringBuffer bufferedstring = new StringBuffer();

		for (int i = 0; i < crr.length; i++) {
			int count = 1;
			for (int j = 1; j < crr.length; j++) {
				if (crr[j] == crr[i]) {
					count++;
				}

			}
			if (count == 1) {
				bufferedstring.append(crr[count]);
			}

		}

		return bufferedstring.toString();

	}

}

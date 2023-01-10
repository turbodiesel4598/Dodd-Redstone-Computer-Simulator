package drcs;

import java.util.Locale;

public class Helpers {
	
	public static String lowerCase(String s) {
		return s.toLowerCase(Locale.ROOT);
	}
	
	public static short low(short value) {
		return (short) (value & 0xFF);
	}
	
	public static short high(short value) {
		return (short) (((short) (value >> 8)) & 0xFF);
	}
	
	public static short nybble(short value) {
		return (short) (value & 0xF);
	}
	
	public static short inv(short value) {
		return (short) ~value;
	}
	
	public static short mod(short a, short b) {
		return (short) ((a % b + b) % b);
	}
	
	public static short bool(boolean bool) {
		return (short) (bool ? 1 : 0);
	}
	
	public static String hex(short value, short length) {
		if (value < 0) {
			return "-0x".concat(String.format("%" + length + "s", Integer.toHexString(-value)).replace(' ', '0').toUpperCase(Locale.ROOT));
		}
		else {
			return "0x".concat(String.format("%" + length + "s", Integer.toHexString(value)).replace(' ', '0').toUpperCase(Locale.ROOT));
		}
	}
}
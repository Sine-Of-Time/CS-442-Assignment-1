package assignment01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {
	static String solution = "[adv(92), adv(94), arf(63), arf(65), ayr(36), bga(94), "
			+ "bga(96), bqx(73), ckq(71), cmx(13), cox(2), cpy(42), cti(2), "
			+ "cti(3), ctu(30), ctu(31), cwp(88), cwp(90), dar(57), deo(35), "
			+ "dgg(20), dgg(21), dzj(17), dzj(19), eah(43), eah(44), eal(73), "
			+ "eal(74), efv(27), efv(29), fac(50), fac(51), feq(39), ffr(12), "
			+ "ffr(14), foj(43), foj(45), gen(23), gtj(11), hpe(43), hyt(97), "
			+ "hyt(98), icy(25), icy(26), ijt(6), iro(86), iro(88), iyt(76), "
			+ "iyt(78), jfk(87), jfk(89), jng(78), jng(79), jub(17), jub(18), "
			+ "jya(10), jya(12), jyn(75), jyn(76), jzk(8), lat(53), lat(55), "
			+ "lhb(91), lhb(92), lps(38), lss(97), lug(47), lug(48), lvu(49), "
			+ "mfi(85), mle(45), mle(47), mnl(60), mnl(62), mnp(59), mnp(60), "
			+ "nii(99), nrn(40), nxh(6), nxh(7), nyo(27), nyo(28), nza(15), "
			+ "nzf(71), nzf(72), ojz(31), ojz(32), oli(62), oli(63), ouj(68), "
			+ "ovx(65), ovx(66), pfo(33), ptz(84), ptz(86), pwm(83), qas(75), "
			+ "qbx(52), qbx(54), qiu(77), qkd(58), qkd(59), qoy(53), qrf(4), "
			+ "qwe(19), qwe(20), rcl(56), rwf(93), rwf(95), siy(44), siy(46), "
			+ "skq(93), smi(25), smi(27), sof(66), sof(67), svm(39), svm(41), "
			+ "tam(67), tam(69), tjt(89), tjt(91), tpw(34), trq(50), trq(52), "
			+ "ubm(17), vau(10), vby(60), vby(61), vii(48), vii(50), vub(25), "
			+ "vvy(15), vvy(16), wap(22), wap(24), xne(85), xne(87), xny(70), "
			+ "ycu(57), ycu(58), ygh(82), ygh(84), yhw(5), yhy(99), yhy(100), "
			+ "yjg(80), yjg(81), you(81), you(82), yti(9), yye(62), yye(64), "
			+ "yyo(1), zly(30), zon(37), zui(78), zui(80), zvl(22)]";
			
	
	public static void objectAdaptertest() {
		SampleComparable.resetNEXT_ID();
		Random random = new Random(17); // The pseudo-random will always be the same.
		SortedList<SampleComparable> list = new SortedList<>();
		SortedSet<SampleComparable> set = new ObjectAdapter<>(list);
		List<String> copy = new ArrayList<>();
 		for(int i = 0; i < 100; i++) {
			byte[] arr = {(byte)(97+random.nextInt(26)),
					(byte)(97+random.nextInt(26)),
					(byte)(97+random.nextInt(26))};
			String str = new String(arr);
			copy.add(str);
			SampleComparable sc = new SampleComparable(str);
			set.add(sc);
		}
 		for(int i = 0; i < copy.size(); i++) {
			SampleComparable sc = new SampleComparable(copy.get(i), i -1 + random.nextInt(3));
			set.add(sc);
 		}
		System.out.println(set.toString().equals(solution));		
	}
	public static void classAdaptertest() {
		SampleComparable.resetNEXT_ID();
		Random random = new Random(17); // The pseudo-random will always be the same.
		SortedSet<SampleComparable> set = new ClassAdapter<>();
		List<String> copy = new ArrayList<>();
 		for(int i = 0; i < 100; i++) {
			byte[] arr = {(byte)(97+random.nextInt(26)),
					(byte)(97+random.nextInt(26)),
					(byte)(97+random.nextInt(26))};
			String str = new String(arr);
			copy.add(str);
			SampleComparable sc = new SampleComparable(str);
			set.add(sc);
		}
 		for(int i = 0; i < copy.size(); i++) {
			SampleComparable sc = new SampleComparable(copy.get(i), i -1 + random.nextInt(3));
			set.add(sc);
 		}
 		System.out.println(set.toString().equals(solution));		
	}
	public static void main(String[] args) {
		objectAdaptertest();
		classAdaptertest();
	}
}

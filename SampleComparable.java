package assignment01;

import java.util.Objects;

class SampleComparable implements Comparable<SampleComparable> {
	// this Sample demonstrates that it is possible, though not recommended
	// var1.compareTo(var2) == 0 may not imply var1.equals(var2).
	static int NEXT_ID = 0; 
	int id;
	String name;
	SampleComparable(String nameIn) {
		name = nameIn;
		id = ++NEXT_ID;
	}
	SampleComparable(String nameIn, int idIn) {
		name = nameIn;
		id = idIn;
	}
	@Override
	public int compareTo(SampleComparable o) {
		return name.compareTo(o.name);
	}
	public String toString() {
		return name + "(" + id +")";
	}

	public static void resetNEXT_ID () { 
		NEXT_ID = 0; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleComparable other = (SampleComparable) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}

package com.HashcodeConcept;

public class HashcodeConcept {

	public static void main(String... hashcodeExample) {
		Simpson homer = new Simpson(1, "Homer");
        Simpson bart = new Simpson(2, "Homer");
		

	}
	static class Simpson{
        int id;
        String name;

        public Simpson(int id, String name) {
            this.id = id;
            this.name = name;
        }
	@Override
	public boolean equals(Object o) {
	if(this==o) return true;
	if(o==null || getClass()!=o.getClass()) return false;
	Simpson simpson = (Simpson) o;
	return id==simpson.id && name.equals(simpson.name);
	}
	@Override
    public int hashCode() {
        return id;
    }
	}

}

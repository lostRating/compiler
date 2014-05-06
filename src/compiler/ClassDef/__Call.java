package compiler.ClassDef;

import java.util.Vector;

public class __Call extends __Quad {

	public __Call(__Label name, Vector<__TempOprand> p, __TempOprand r) {
		function = name;
		for (int i = 0; i < p.size(); ++i)
			params.add(p.get(i));
		result = r;
	}
	public __Label function;
	public Vector<__TempOprand> params = new Vector<__TempOprand>();
	public __TempOprand result;
	@Override
	public String toString() {
		String call = result.toString() + " <- call " + function + " (";
		if (params != null)
			for (int i = 0; i < params.size(); i++) {
				if (i > 0)
					call += ", ";
				call += params.get(i).toString();
			}
		call += ")";
		return call;
	}
}

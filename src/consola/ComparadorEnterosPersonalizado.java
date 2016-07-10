package consola;

import java.util.Comparator;

public class ComparadorEnterosPersonalizado implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		int ret = 0;
		if (o1 < o2)
			ret = 1;
		else if (o1 == o2)
				ret = 0;
			else
				ret = -1;
		return ret;
	}
}// fin class consola.ComparadorEnterosPersonalizado

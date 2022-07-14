package collections_map;

import java.util.Comparator;

public class MyComapratorDemo  implements Comparator<Integer> {

	
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stu
		//o1<o2 -1
		//o2>o2 +1
		//o1==o2 0
		if(o1>o2) {
			return -1;
		}else if(o1<o2) {
			return +1;
		}else {
			return 0;
		}
		
	}

}

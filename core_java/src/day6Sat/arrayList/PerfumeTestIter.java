package day6Sat.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class PerfumeTestIter {
	
	public static void main(String[] args) {
		PerfumeBean p1 = new PerfumeBean("Flourish","Peter England",150.00,390);
		PerfumeBean p2 = new PerfumeBean("The Pride","Armaf",100.00,2000);
		PerfumeBean p3 = new PerfumeBean("Hero","Park Avenue",155.00,250);
		PerfumeBean p4 = new PerfumeBean("Paradise","Fogg",120.00,180);
		
		ArrayList<PerfumeBean> perfumeList = new ArrayList<PerfumeBean>();
		
		perfumeList.add(p1);
		perfumeList.add(p2);
		perfumeList.add(p3);
		perfumeList.add(p4);
		
		//System.out.println(perfumeList);
		
		Iterator<PerfumeBean> iter =perfumeList.iterator();
		while(iter.hasNext()){
			PerfumeBean x= iter.next();
			System.out.println(x);
		}
		
	}

}

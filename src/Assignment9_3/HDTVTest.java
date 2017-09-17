package Assignment9_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HDTVTest {
	
	
	public static void main(String args[]){
		List<HDTV> hdtvList=new ArrayList<HDTV>();
		hdtvList.add(new HDTV("Samsung",22));
		hdtvList.add(new HDTV("Lg",40));
		hdtvList.add(new HDTV("apple",30));
		Collections.sort(hdtvList,new MytvSizeComp());
		
		
		System.out.println(hdtvList.toString());
		
	}


}

class MytvSizeComp implements Comparator<HDTV>{
	 
    @Override
    public int compare(HDTV e1, HDTV e2) {
        if(e1.getSize()>e2.getSize()){
            return 1;
        } else {
            return -1;
        }
    }
}


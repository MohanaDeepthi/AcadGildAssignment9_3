package Assignment9_3;

public class HDTV {
	String brandName;
	int size;
	
	public HDTV(String brandName,int size){
		this.brandName=brandName;
		this.size=size;
		
	}
	
	public void setbrandName(String brandName){
		this.brandName=brandName;
		
	}
	
	public String getbrandName(){
		return this.brandName;
	}
	
	public void setSize(int size){
		this.size=size;
	}

	public int getSize(){
		return this.size;
	}
	
	public String toString(){
		return this.brandName+" "+this.size; 
	}
}

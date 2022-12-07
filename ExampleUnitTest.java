package reference_programs;

public class ex17 {
	int servingsize;
	int servings;
	int calaories;
	int fat;
	int sodium;
	int carbohydrates;
	
	static class Builder{
		int servingsize=0;
		int servings=0;
		int calaories=0;
		int fat=0;
		int sodium=0;
		int carbohydrates=0;
		Builder(int servingsize,int servings){
			this.servingsize = servingsize;
			this.servings=servings;;
		}
		Builder calaories(int val){
			this.calaories=val;
			return this;
			
		}
		Builder faat(int val){
			this.fat=val;
			return this;
			
		}
		Builder sodium(int val){
			this.calaories=val;
			return this;
			
		}
		Builder carbohydrates(int val){
			this.calaories=val;
			return this;
			
		}
		
		ex17 build(){
			return new ex17(this);
		}
		
		
	}
	ex17(Builder builder)
	{
		this.servingsize = builder.servingsize;
		this.servings = builder.servings;
		this.calaories = builder.calaories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrates = builder.carbohydrates;
		System.out.println("servingsize"+servingsize);
		System.out.println("servingsize"+servings);
		System.out.println("fat"+fat);
		System.out.println("sodium"+sodium);
		System.out.println("Carbohydrates"+carbohydrates);
		System.out.println("calaories"+calaories);
		
		
		
		
		
		
		
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	ex17 obj = new ex17 .Builder(240,8).calaories(100).sodium(35)
			.carbohydrates(27).build();
		
	}

}


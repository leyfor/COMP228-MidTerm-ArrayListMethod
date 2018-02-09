import java.util.Random;

public class Lotto649 extends LottoGame implements IBonusNumber {  
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++
	public Lotto649() {
		super(6, 49);
	}
	
	// PUBLIC METHODS ++++++++++++++++++++++++++++++++++++++
	public int bonusNumber() {
		Random rnd = new Random();
		int number = 0;
		int numberArraySize = 0;
		int rndElement;
		
		numberArraySize = this._numberArrayList.size();
		
		rndElement = rnd.nextInt(numberArraySize);
		number  = this._numberArrayList.remove(rndElement);

		return number;
	}
	
	// PUBLIC OVERIDDEN METHODS +++++++++++++++++++++++
	@Override
	public String toString() {
		String output = "";
		int  setNum = 5;
		
		output += "5 SETS OF NUMBERS USING ARRAYS \n";
		output += "+++++++++++++++++++++++++++++++++++\n";
		
		for(int count = 0; count < setNum; count = count + 1) {
			this.pickElements();
			
			for (int element = 0; element < this._elementArrayList.size(); element = element + 1) {
				if(element > 0) {
					output += ", ";
				}
				output += this._elementArrayList.get(element);
			}
			output += " + Bonus: " + this.bonusNumber() + "\n";	
 		}
		output +=  "++++++++++++++++++++++++++++++++\n";
		return output;
		
	}

}
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;

public abstract class LottoGame {
	
	//PRIVATE INSTANCE VARIABLES +++++++++
	private int _elementNum;
	private int _setSize;
	
	
	//PROTECTED REFERENCE TYPES +++++++++++
	protected ArrayList<Integer> _numberArrayList;
	protected ArrayList<Integer> _elementArrayList;

	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++
	public LottoGame(int elementNum, int setSize) {
		super();
		this._elementNum = elementNum;
		this._setSize = setSize;
	}
	
	// Instantiate ArrayList  and Build the numberArrayList
	private void _initialize() {
		
		this._elementArrayList = new ArrayList<Integer>(); // final array to hold the element
		this._numberArrayList = new ArrayList<Integer>(); // Array to manipulate the element(first hold the element)
		
		for (int num = 0; num < this._setSize; num = num + 1) {
			this._numberArrayList.add(num + 1);
		}
		
	}
	
	public void pickElements() {
		Random rnd = new Random();
		int rndElement;
		int numArraySize = 0; // Sentinel variable
		
		this._initialize(); // reset the array structure
	for (int index = 0; index < this._elementNum; index = index + 1) {
		  numArraySize = this._numberArrayList.size();
			// Check if rndElement has been chosen
		    rndElement = rnd.nextInt(numArraySize) + 1; 
			this._elementArrayList.add(this._numberArrayList.remove(rndElement));
			}
	
	//Sort the ArrayList
    Collections.sort(this._elementArrayList);
		}
}
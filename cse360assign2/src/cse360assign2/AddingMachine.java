/**
 * 			@author 			Elisha Carlton
 *			Class ID:			85141
 *			Assignment: 		2 
 *			File Description:	This file simulates an adding machine which can add numbers, Positive or Negative.
 *								The adding machine starts at zero and then keeps track of its transactions	 	
 */
package cse360assign2;

/**
 * The Class AddingMachine creates an integer sum of all adding and subtracting (Negative Adding) operations and stores it
 * in an int variable called total. total can be accessed with the getTotal() method.
 * The sum always starts at zero, therefore the only constructor is the default constructor taking no parameters.
 * The instance keeps track of all operations performed in a String variable called history,
 * and may be accessed with the toString() method.
 * To reset all data in the object's history and it's total to default values, use the clear() method.
 * To perform the add operation use the add(int value) method, where value is the int you want to add to total.
 * To perform the subtract operation use the subtract(int value) method, where value is the int you want to subtract from
 * the total.
 */
public class AddingMachine {
	
	private int total;

	/**
 	 * Only constructor for the AddingMachine class.
 	 * total and history should always initially be the same, 0 and "0 ".
	 */
		public AddingMachine ()
		{
		total = 0;  // not needed - included for clarity
		}

		/**
		 * This is a standard get'er method that returns a specific instances class values while taking no Parameters.
		 * @return total, this variable is the sum of all operations starting at Zero.
	 	*/
		public int getTotal () 
		{
			return 0;
		}
		
		/**
		 * This method adds the parameter's value to the Instance's total variable then appends a string of length 2
		 * to the end of the Instance's history variable representing the operation taking place and the value being
		 * used in the operation,  if value==3, "+3"..
		 * 
		 * @param value, This int parameter will be added to the instance's total, and the instance's string History
		 * 				  should also be updated to match 
		 */		
		public void add (int value)
		{
			
		}

		/**
		 * This method subtracts the parameter's value from the Instance's total variable then appends a string of length 2
		 * to the end of the Instance's history variable representing the operation taking place and the value being
		 * used in the operation, if value==3, "-3".
		 * 
		 * @param value, This int parameter will be subtracted from the instance's total, and the instance's string History
		 * 				  should also be updated to match 
		 */		
		public void subtract (int value) 
		{
			
		}
		
		/**
		 * This method is essentially just a get'er method for the history variable
		 * 
		 * @return history, returns a string, in particular it is this instance's class history variable 
		 */
		public String toString ()
		{
			return "";
		}
		
		/**
		 * No description of this method was given so I am assuming I should Implement "clear()" to
		 * delete this instances information and reset it to default.
		 */		
		public void clear() 
		{
			
		}
		
}



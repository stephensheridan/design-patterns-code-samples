

public class NumberFactory
{
	public NumberList getNumberList(String list)
	{

		if (list.matches("[a-zA-Z0-9 ]+")){
			// String is alpha numeric
			return new CharList(list);
		}
		else{
			// Check for  existence of '.'
			int i = list.indexOf('.');
			if (i != -1){
				return new DoubleList(list);
			}
			else{
				return new IntList(list);
			}
		}

	}
}





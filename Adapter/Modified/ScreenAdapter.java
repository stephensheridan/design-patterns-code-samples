import java.io.*;

public class ScreenAdapter extends Screen{

	public void writeInt(int i)	{
		super.writeInt(new Integer(i));
	}

}

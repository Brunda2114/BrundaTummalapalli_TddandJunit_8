package gittasks.TDDandjunit;

public class check {
public String method(String str)
    {
StringBuilder b = new StringBuilder(str);
        if(str=="")
        	return "";
        else if(str.length()==1)
        {
        	if(b.charAt(0)=='A')
        	{
        		b.deleteCharAt(0);
        		return "";
        	}
        	else
        		return b.toString();
        }
        if(b.charAt(0)=='A')
        {
            b.deleteCharAt(0);
            if(b.charAt(0)=='A')
            {
            b.deleteCharAt(0);
            }
        }
        else if(b.charAt(1)=='A')
        	b.deleteCharAt(1);
        return b.toString();
    }
}

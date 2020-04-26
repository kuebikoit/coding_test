import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * Reverse string
 *
 */
public class StringReverse {

    public  String aba(String str){
        String str1 = "";
        for(int i = str.length(); i>0; i--){
            str1=str1+str.charAt(i-1);
        }
        return str1;
    }
}


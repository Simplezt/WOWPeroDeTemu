package view;

import util.exceptions.ExceptionChecker;
import util.exceptions.NumberMissmatchException;
import util.exceptions.NumberOverflowException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Terminal {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    private boolean bIsBufferFlagged = false;

    public String readWord(){
        while(st == null || !st.hasMoreTokens()) {
            try{
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return  st.nextToken();
    }

    public int readInt() throws NumberOverflowException, NumberMissmatchException {
        String token = readWord();
        ExceptionChecker.intergerChecker(token);
        return Integer.parseInt(token);
    }

    public String readLine() {
        String str = "default";
        try{
            str = br.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

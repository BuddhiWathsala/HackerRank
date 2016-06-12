import java.util.*;
import java.io.*;

public class BM {

    final int ALPHABET_SIZE = 256;
    int index[]=new int[ALPHABET_SIZE];

    public void search(String txt,String pattern){

    	int m=pattern.length();
    	int n=txt.length();
    	char[] text = txt.toCharArray();
        char[] pat = pattern.toCharArray();

    	for(int k=0;k<index.length;k++){

    		index[k]=m;
    	}

    	for(int k=0;k<m;k++){

    		char c=pat[k];
    		int indx=(int)c;

    		if(indx>=0){
    			int shift=m-1-k;
    			if(shift>0){

    				index[indx]=shift;
    			}
    		}

    	}

    	int i=m-1;
    	int j=m-1;

    	while(i<n-1){

    		while(j>=0){
    			char tc=text[i];
    			char pc=pat[j];
    			int ti=(int)tc;
    			int pj=(int)pc;

    			if(tc==pc){
    				if(j==0){
    					System.out.println("Match found at index "+i);

    				}
    				j--; i--;
					break;
    			}

    		if(j==m-1){

    			int skip=index[ti];
    			i+=skip;
    			break;
    		}
    		else{

    			char tcc=text[i+1];
    			int tii=(int)tcc;
    			int skip=index[tii];
    			i+=skip;
    			break;
    		}
    	}

    }
    }

    public static void main(String[] args){

    	BM bm=new BM();
    	Scanner scan=new Scanner(System.in);
    	String text=scan.nextLine();
    	String pat=scan.nextLine();
    	bm.search(text,pat);

    }


}
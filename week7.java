/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package week7;
import java.util.Scanner;

import java.io.*;

/**
*
* @author Kamba
*/
public class Week7 {

private int rows;

private int cols;

private int words;

private char[][] wordSearchchar;        

private String[] wordSearchstring;


public WordSearch()

public int addX(int x, int ax)

x = x + ax;

if(x < 0)="" x="rows" -="">

if(x >= rows) x = 0;

return x;

public int addY(int y, int ay)

y = y + ay;

if(y < 0)="" y="cols" -="">

if(y >= cols) y = 0;

return y;


public boolean test direct(int x, int y, int d, String word, int ax, int ay)

if(d == word.length()) return true;

if(wordSearchchar[x][y] == word.charAt(d))



return testdirect(addX(x, ax), addY(y, ay), d+1, word, ax, ay);



return false;

public void wordFind()

for(int d = 0; d < words;="">



String word = wordSearchstring[d];

boolean foundWord = false;

for(int i = 0; i < rows;="">



if(foundWord == true)



    break;



for(int j = 0; j < cols;="">



    if(wordSearchchar[i][j] == word.charAt(0))



                    if(testdirect(i, j, 0, word, 1, 0) == true)







/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
}
}


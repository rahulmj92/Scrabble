{\rtf1\ansi\ansicpg1252\deff0\deflang1033{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Msftedit 5.41.21.2510;}\viewkind4\uc1\pard\sa200\sl276\slmult1\lang9\f0\fs22 import java.util.*;\par
\par
class Word\{\par
    \par
    private String letter;\par
    \par
    public Word(String letter)\{\par
        \par
        letter = letter;\par
        score = scores[letter.charAt(0) - 65];\par
        \par
    \}\par
     \par
    public RETURN_TYPE genPermutation(int n)\par
    \{\par
        return RETURN_TYPE;\par
    \}\par
\};\par
\par
class Rack \{\par
    public static final int[] scores = \{1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10\};\par
\tab private HashMap<String ,int> masterDict;\par
    private HashMap<int, String> possibleWords;\par
    \par
    public Rack(Word word)\par
    \{\par
        /* Open the file and store it in the masterDict for the word */\par
        BufferredReader br;\par
        int i=0;\par
        String sCurrentLine;\par
        br = new BufferedReader(new FileReader("input.txt"));\par
        \par
        while ((sCurrentLine = br.readLine()) != null) \{\par
    \tab\tab\tab masterDict.put(sCurrentLine,i++);\par
\tab\tab\}\par
        \par
    \}\par
    \par
\};\par
\par
public class HelloWorld\{\par
\par
     public static void main(String []args)\{\par
        //System.out.println("Hello World");\par
     \}\par
\}\par
}
 
/**
 * @author Vamsi Krishna Govada on 8/11/2020.
 * @project Raudra
 */

import java.util.*;


class Huffman{
    int freq;
    char key;
    Huffman left;
    Huffman right;


    Huffman(char key,int freq,Huffman left, Huffman right) {
        this.key = key;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}

public class Huffman_Coding {

    static void printValues(Huffman root, HashMap<Character, String> output, String temp) {
        if((root!=null)){
            if(root.key!='-')
                output.put(root.key,temp);
            if((root.left!=null)){
//                temp =  temp + "0";
                printValues(root.left,output,temp+"0");
            }
            if((root.right!=null)) {
//                temp =  temp + "1";
                printValues(root.right, output, temp+"1");
            }
        }
    }

    static HashMap<Character,String> huffmanCode (char[] key, int [] freq){
        HashMap<Character, String> output = new HashMap<>();
        Huffman root = null;
        int len = key.length;
        PriorityQueue<Huffman> priorityQueue = new PriorityQueue<>(len, (x,y)-> Integer.compare(x.freq,y.freq));
        for(int i=0;i<len;i++){
            Huffman temp = new Huffman(key[i],freq[i],null,null);
            priorityQueue.add(temp);
        }

        while(priorityQueue.size()>1){ //check size
            Huffman x = priorityQueue.peek();
            priorityQueue.poll();
            Huffman y = priorityQueue.peek();
            priorityQueue.poll();
            Huffman z  = new Huffman('-',(x.freq+y.freq),x,y);
            root = z;
            priorityQueue.add(root);
        }
        Huffman root2 = root;
        printValues(root2,output,"");
        return output;
    }

    public static void main(String[] args) {
        HashMap<Character,String> output =huffmanCode(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, new int[]{5, 9, 12, 13, 16, 45});
        System.out.println(output);
//        System.out.println(coding2(new char[]{'a','b','c','d','e','f'},new int[]{5, 9, 12, 13, 16, 45}));
    }
}

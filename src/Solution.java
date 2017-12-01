/**
 * @author Jaison
 */
public class Solution {

    public static void main(String args[]) {
        int number = Integer.valueOf(args[0]);
        String seq = String.valueOf(number);
        int[] numberSequence = new int[seq.length()];

        for(int i=0; i<seq.length(); i++) {
            numberSequence[i] = (int) seq.charAt(i);
        }

        rearrange(numberSequence, 0);

        System.out.println("There are " + rearrangeCount + " possible rearrangements with the number " + number);

    }

    /**
     * n = numeros digitados
     * z = numeros de zero
     */

	private static int rearrangeCount = 0;

	static void rearrange(int[] n, int z) {
    	
        if (z == n.length) {
            for (int i = 0; i < n.length; i++) {
                if(i == 0) {
                    if( n[i] == 0) {
                        rearrangeCount--;
            			break;
            		}
            	}
            }
            rearrangeCount++;

        } else {
            for (int i = z; i < n.length; i++) {
                int t = n[z];
                n[z] = n[i];
                n[i] = t;
                rearrange(n, z + 1);
                t = n[z];
                n[z] = n[i];
                n[i] = t;
            }
        }
    }

}
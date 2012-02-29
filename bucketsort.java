
public class bucketsort {

	public static void Bucketsort(int[] src, int[] dst, int len, int range) {
	    /** 値ごとの出現回数 */
	    int[] count = new int[range];
	    /** ソート後配列における値ごとの開始位置 */
	    int[] offset = new int[range];
	    /** ループ制御用 */
	    int i;
	 
	    /* 出現回数を数える */ 
	    for (i = 0; i < len; i++)
	        count[src[i]]++;
	    /* 開始位置計算 */
	    offset[0] = 0;
	    for (i = 1; i < range; i++)
	        offset[i] = offset[i-1] + count[i-1];
	    /* ソート処理 */
	    for (i = 0; i < len; i++) {
	        int target = src[i];
	        dst[offset[target]] = target;
	        offset[target]++;
	    }
	    for(i = 0; i < len; i++){
	    	System.out.print(dst[i]);
	    }
	}

	
	public static void main(String[] args) {
		int[] src = {1,2,5,4,6,9,7,8,2,0};
		int[] dst = new int[10];
		int len = src.length;
		int range = 10;
		
		Bucketsort(src, dst, len, range);
	}

}

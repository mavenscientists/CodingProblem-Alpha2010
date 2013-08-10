    /*  
    * This program is free software: you can redistribute it and/or modify
    * it under the terms of the GNU General Public License as published by
    * the Free Software Foundation, either version 3 of the License, or
    * (at your option) any later version.
    * 
    * This program is distributed in the hope that it will be useful,
    * but WITHOUT ANY WARRANTY; without even the implied warranty of
    * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    * GNU General Public License for more details.
    * 
    * Copyright 2013 Maven Scientists http://mavenscientists.com
*/
package alpha2010;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author   Maven Scientists (http://blog.mavenscientists.com) 
 * @time     Aug 10, 2013 8:47:07 PM 
 */
public class Solution {

    int solution(int[] A, int N)
    {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int I = 0; I <N; I++ )
        {
            if(set.add(A[I]))
                result = I;
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        int[] A = {2,2,1,0,1};
        int result;

        Solution sol = new Solution();
        result = sol.solution(A, A.length);
        
        System.out.println(result);
    }
}

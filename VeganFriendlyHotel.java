// Given the array restaurants where  restaurants[i] = [idi, ratingi, veganFriendlyi, pricei, distancei]. You have to filter the restaurants using three filters.

import java.util.*;

public class VeganFriendlyHotel {

    public static void main(String[] args) {
        
        int[][] mat = new int[][] {
            {1,4,1,40,10} ,
            {2,8,0,50,5},
            {3,8,1,30,4},
            {4,10,0,10,3},
            {5,1,1,15,1}
        };

        int veg = 1;
        int maxPrice = 50;
        int maxDis = 10;

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<mat.length;i++){

            if(mat[i][3] <= maxPrice && mat[i][4] <= maxDis){
                if(mat[i][2] == veg){
                    res.add(i);
                    continue;
                }

                if(mat[i][2] != veg && veg == 0){
                    res.add(i);
                }
            }
        
        }

        Collections.sort(res , (a,b)->{
            int i = mat[a][1];
            int j = mat[b][1];

            if(i != j){
                return j-i;
            }

            int id1 = mat[a][0];
            int id2 = mat[b][0];

            return id2-id1;
        });

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<res.size();i++){
            ans.add(mat[res.get(i)][0]);
        }

        System.out.println(ans);

    }
    
}

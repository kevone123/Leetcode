import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum{
    public static void main(String[]args) {
        int []arr={2,3,6,7};
        int target=7;
        combinationSum(arr,target);
    }

        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> seq = new ArrayList<Integer>();

            Arrays.sort(candidates);
            doSum(candidates,target,res,seq,0,0);
            return res;
        }

        private static void doSum(int[] candidates, int target, List res, List seq, int sum, int start){
            if(sum == target)
                res.add(new ArrayList(seq));
            if(sum < target){
                for(int i=start; i< candidates.length;i++){
                    sum += candidates[i];
                    if(sum > target)
                        break;
                    else{
                        seq.add(candidates[i]);
                        doSum(candidates,target,res,seq,sum,i);
                        seq.remove(seq.size()-1);
                        sum -= candidates[i];
                    }
                }
            }
        }



}

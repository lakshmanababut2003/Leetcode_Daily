import java.util.Arrays;

public class LongestCommonSuffixQuery {

    public static void main(String[] args) {
        
        String[] wc = new String[] {"abcd","bcd","xbcd"};
        String[] wq = new String[] {"cd","bcd","xyz"};

        int n = wq.length;

        Trie trie = new Trie(wc);

        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = trie.findLongestCommonSuffix(wq[i]);
        }

        System.out.println(Arrays.toString(res));

    }

  
   
}

  class TreeNode{

        public int index;
        public TreeNode[] children;

        public TreeNode(){
            this.index = Integer.MAX_VALUE;
            this.children = new TreeNode[26];
        }
    }


 class Trie{

        private TreeNode root;
        private String[] words;

        public Trie(String[] words){

            int n = words.length;
            root = new TreeNode();
            this.words = words;

            for(int i=0;i<n;i++){
                insertSuffix(words[i] , i);
            }

            fillIndex(root);
        }

        private void insertSuffix(String str , int ind){

            TreeNode curr = root;
            char[] arr = str.toCharArray();

            for(int i=str.length()-1;i>=0;i--){

                if(curr.children[arr[i]-'a'] == null){
                    curr.children[arr[i]-'a'] = new TreeNode();
                }

                curr = curr.children[arr[i]-'a'];
            }

            curr.index = Math.min(curr.index , ind);
        }

        private int fillIndex(TreeNode curr){

            for(TreeNode child : curr.children){
                int r = child != null ? fillIndex(child) : Integer.MAX_VALUE;

                if(change(curr.index , r)){
                    curr.index = r;
                }
            }

            return curr.index;
        }

        private boolean change(int i , int j){

            int n = words.length;

            return (0 <= j && j < n) &&
            (
              !( 0 <= i && i < n) ||
               words[j].length() < words[i].length() ||
               (words[i].length() == words[j].length() && j < i)
            );
        }

        public int findLongestCommonSuffix(String str){

            TreeNode curr = root;
            char[] arr = str.toCharArray();

            for(int i=str.length()-1;i>=0 && curr.children[arr[i]-'a'] != null ;i--){
                curr = curr.children[arr[i]-'a'];
            }

            return curr.index;
        }
    }
    

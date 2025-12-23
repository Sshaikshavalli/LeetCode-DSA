class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[] rowmin=new int[m];
        int[] colmax=new int[n];
        Arrays.fill(rowmin, Integer.MAX_VALUE);
        Arrays.fill(colmax, Integer.MIN_VALUE);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            rowmin[i]=Math.min(rowmin[i], matrix[i][j]);
            colmax[j]=Math.max(colmax[j], matrix[i][j]);
            }
        }
            List<Integer> result=new ArrayList<>();
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==rowmin[i] && matrix[i][j]==colmax[j]){
                        result.add(matrix[i][j]);
                    }
                }
            }
            return result;
        }
    }
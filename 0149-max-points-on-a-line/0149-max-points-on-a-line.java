class Solution {
    public int maxPoints(int[][] points) {
        if(points.length==1){
            return 1;
        }
        // x,y 
        int result=0;
        for(int i=0;i<points.length;i++){
            for(int j=i;j<points.length;j++){
                int count=2;
                // dy/dx =x2-x1 /y2-y1;
                // [1,1],[2,2]
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];
                 double slope = (double) dy / dx;

                for(int k=0;k<points.length;k++){
                    if(k!=i&&k!=j){
                        // dyy//dxxx2-x1 and y3-y1
                        int dxx=points[k][0]-points[i][0];
                        int dyy=points[k][1]-points[i][1];
                        double solpee = (double) dyy / dxx;
                        if(solpee==slope){
                            count++;
                        }
                    }
                }
                result=Math.max(result,count);
            }
        }
        return result;
    }
}
class Solution {
    public:
        vector<int> luckyNumbers(vector<vector<int>>& matrix) {
            vector<int> v;
            for(int i=0;i<matrix.size();i++){
                int a=*std::min_element(matrix[i].begin(),matrix[i].end());
                int j = std::min_element(matrix[i].begin(), matrix[i].end()) - matrix[i].begin();
    
                int maxi=INT_MIN;
                int ans;
                int k=0;
                while(k<matrix.size()){
                    ans=matrix[k][j];
                    maxi=std::max(maxi,ans);
                    k++;
                }
                if(maxi==a){
                    v.push_back(a);
                }
            }
            return v;
        }
    };
    
    
    
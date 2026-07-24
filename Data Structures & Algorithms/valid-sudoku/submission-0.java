class Solution {
    public boolean isValidSudoku(char[][] arr) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.clear();
            for(int j=0;j<arr.length;j++){
                if (arr[i][j] == '.') continue;
                if(!set.contains(arr[i][j])){
                    set.add(arr[i][j]);
                }else{return false;}
            }
        }
        
         for(int i=0;i<arr.length;i++){
            set.clear();
            for(int j=0;j<arr.length;j++){
                if (arr[j][i] == '.') continue;
                if(!set.contains(arr[j][i])){
                    set.add(arr[j][i]);
                }else{return false;}
            }
        }

       for(int boxRow=0;boxRow<3;boxRow++){
            for(int boxCol=0;boxCol<3;boxCol++){
                HashSet<Character> s=new HashSet<>();
                for(int i=boxRow*3;i<boxRow*3+3;i++){
                    for(int j=boxCol*3;j<boxCol*3+3;j++){
                        if(arr[i][j]=='.') continue;
                        if(!s.contains(arr[i][j])){
                            s.add(arr[i][j]);
                        }else{return false;}
                    }
                }
            }
        }

        return true;
    }
    }


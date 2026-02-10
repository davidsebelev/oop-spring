#include<iostream>
#include<vector>
using namespace std;


int main(){
    string s;
    cin >> s;

    vector<char> w;

    for(int i = 0 ; i < s.length();i++){
        if(w.empty()){
            w.push_back(s[i]);
        }else{
            if((w.back() == 'G' && s[i] == 'B') || (w.back() == 'B' && s[i] == 'G')){
                w.pop_back();
            }else{
                w.push_back(s[i]);
            }
        }
    }

    for(auto i : w)cout << i << " ";

    
    return 0;
}
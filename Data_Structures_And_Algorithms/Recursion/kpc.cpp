#include<iostream>
#include<string>
#include<vector>

using namespace std;

string codes[10] = {
    ".",
    "abc",
    "def",
    "ghi",
    "jklm",
    "no",
    "pqrs",
    "tu",
    "vwxy",
    "ez"
};

vector<string> gsp(int n)
{
    
}

// 835
vector<string> getkpc(string str)
{
    if(str.length() == 0)
    {
        vector<string> bres;
        bres.push_back("");
        return bres;
    }

    char ch = str[0]; // 8
    string ros = str.substr(1, str.length() - 1); // 35
    vector<string> rres = getkpc(ros); // 35 -> gn, go, hn, ho, in, io
    vector<string> mres;

    string code = codes[ch - 48];// vwxy
    for(int i = 0; i < code.length(); i++)
    {
        char chcode = code[i];
        // gn, go, hn, ho, in, io
        for(int j = 0; j < rres.size(); j++)
        {
            string rstr = rres[j];
            mres.push_back(chcode + rstr);
        }
    }

    return mres;
}

int main(int argc, char** argv)
{
    vector<string> words = getkpc("835");
    for(int i = 0; i < words.size(); i++)
    {
        cout << words[i] << endl;
    }

}
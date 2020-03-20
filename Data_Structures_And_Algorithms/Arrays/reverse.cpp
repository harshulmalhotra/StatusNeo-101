#include<iostream>

using namespace std;

int main(int argc, char** argv)
{
    int n;
 
    cin >> n;

    while(n > 0)
    {
        int q = n / 10;
        int r = n % 10;

        cout << r;
        n = q;
    }

    cout << endl;
}
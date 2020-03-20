#include<iostream>

using namespace std;

int main(int argc, char** argv)
{
    int a = 21;
    int b = 14;

    while(b % a != 0)
    {
        int c = b % a;
        b = a;
        a = c;
    }

    cout << a << endl;
}
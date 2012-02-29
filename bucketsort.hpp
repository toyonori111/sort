#include <string>
#include <iostream>
using namespace std;

class bucketsort{
public:
  void sort(char src[]){
  char moji[] = "abcdefghijklmnopqrstuvwxyz";
  int count = 0;

    char outsrc[100];

    for (int i = 0; i < 26; i++){
      for (int j = 0; j < 50; j++){
        char str = src[j];

        if (moji[i].equals(str)){
          outsrc[count] = src[j];
          count++;
        }
      }

    }
    for (int i = 0; i < outsrc.length; i++){
      cout << outsrc[i] << endl;
    }
  }


};
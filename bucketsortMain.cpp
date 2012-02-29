#include <string>
#include <iostream>
#include "bucketsort.hpp"
using namespace std;

int main(){
  char word[50];
  cout << ">";
  cin >> word ;
  
  bucketsort().sort(word);

}
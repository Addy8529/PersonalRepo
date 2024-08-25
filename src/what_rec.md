//Work from Muhammad Ahad (Gr. 5), Gurpreet Singh Chandi (Gr. 4) and Shashank Shorya(Gr. 5)
public static int whatRec(int n) {
  if (n < 10)
    return n;
  else
    return whatRec(n / 10) + n % 10;
}

=> whatRec(int n) function returns the sum of all elements of a given numbers as n (i.e n = 123 => 1 + 2 + 3 = 6).

this is how the given code works

eg. n = 546
whatRec(n = 546) => whatRec(546/10) + (546 % 10 = 6)
								|
								V
    					whatRec(54/10) + (54 % 10 = 4) + 6
									|
									V
									5 + 4 + 6 = 15. 
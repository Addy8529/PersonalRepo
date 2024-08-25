Binomialkoeffizient mit Pascalschem Dreieck
---

**TODO:** Insert your answer for task 1, 3 and 4!

**1**
function binomialCoefficient(n, k):

let C be a 2D array of size (n+1) x (k+1)

    for i from 0 to n:
        for j from 0 to min(i, k):
            if j == 0 or j == i:
                C[i][j] = 1
            else:
                C[i][j] = C[i-1][j-1] + C[i-1][j]

    return C[n][k]

Beispiel: Berechne den Binomialkoeffizienten für n=7 und k=5

                      1
                     1  1
                    1  2  1
                   1 3   3  1
                  1 4  6   4  1
                 1 5 10  10   5  1
               1  6 15 20   15  6 1 
              1  7 21 35  35  21 7  1

C[7][5] =21

**2**
Um die Anzahl der Rechenschritte zu reduzieren, kann der Algorithmus optimiert werden, indem wir nur ein 
eindimensionales Array verwenden, statt eines zweidimensionalen Arrays. Dadurch sparen wir Speicher und 
reduzieren die Anzahl der erforderlichen Berechnungen. Diese Optimierung ist möglich, weil der aktuelle 
Wert nur von den Werten aus der vorherigen Zeile abhängt.



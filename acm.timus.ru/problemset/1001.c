// #include <math.h>
// #include <stdio.h>

// int main() {
//     long double in[256 * 1024 / 2];
//     long int i = 0;

//     while(scanf("%Lf", &in[i]) == 1)
//         i++;

//     for(int j = i - 1; j >= 0; j--)
//         printf("%.4Lf\n", sqrtl(in[j]));

//     return 0;
// }

#include <math.h>
#include <stdio.h>

int main() {
    long long int in[256 * 1024 / 2];
    int i = 0, j;

    while(scanf("%lld", &in[i]) == 1)
        i++;

    for(j = i - 1; j >= 0; j--)
        printf("%.4lf\n", sqrt((double)in[j]));

    return 0;
}

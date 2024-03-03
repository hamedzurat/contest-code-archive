// #include <stdio.h>
// #include <stdlib.h>

// int compareInts(const void* a, const void* b) {
//     return (*(int*)b - *(int*)a);
// }

// int main() {
//     long int in, b1 = 0, b2 = 0;
//     scanf("%ld", &in);

//     long int w[in];
//     for(int i = 0; i < in; i++)
//         scanf("%ld", &w[i]);

//     qsort(w, in, sizeof(long int), compareInts);

//     // for (int i = 0; i < in; i++)
//     //   printf("%ld ", w[i]);
//     // printf("\n\n");

//     for(int i = 0; i < in; i++) {
//         // printf("%ld\n", w[i]);
//         if(0 > (b1 - b2))
//             b1 = b1 + w[i];
//         else
//             b2 = b2 + w[i];

//         // printf("%ld %ld\n", b1, b2);
//     }

//     if(0 < (b1 - b2))
//         printf("%ld\n", b1 - b2);
//     else
//         printf("%ld\n", b2 - b1);

//     return 0;
// }

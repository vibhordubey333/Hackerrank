// Complete the divisibleSumPairs function below.
func divisibleSumPairs(n int32, k int32, ar []int32) int32 {
// Complete the divisibleSumPairs function below.
    count := 0 
   for i := 0 ; i < len(ar) ; i++ {
       for j := i+1 ; j < len(ar) ; j++ {
            if (ar[i]+ar[j]) % k == 0 {
                count++
            }
       }
   }
    return int32(count)
}

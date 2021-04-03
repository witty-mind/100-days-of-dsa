public class GetMatchedTarget{
    public static void main(String args[]){
        int int_array_values[] = {5, 10, 20, 50, 80};
        int getMatchedValue = hasPairWithTarget(int_array_values, 10, 150);
        System.out.println("The matched value is "+ getMatchedValue);
}

// Function responsible for getting the target match from the sum of two integers from the array
public static int hasPairWithTarget(int arr[], int n, int target){
    Boolean sum_match_found = false;
    for (int  i = 0; i < arr.length; i ++){
            if(sum_match_found){
                break;
            }
        for (int j = 0; j < arr.length; j++){
            if(arr[i] != arr [j]){
                System.out.println("The values "+ arr[i] + " " + arr[j]);
                if(target == arr[i] + arr [j]){
                    sum_match_found = true;
                    break;
                }    
            }
        }
    }
    
    if(sum_match_found == true){
        return 1;
    } else{
        return 0;
    }
}
}

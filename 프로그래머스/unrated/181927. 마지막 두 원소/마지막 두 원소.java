class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int a = num_list[num_list.length-1];
        int b = num_list[num_list.length-2];
        int[] newArr = new int[num_list.length + 1];

        for (int i = 0; i<num_list.length; i++){
            newArr[i] = num_list[i];
        }
        if (a>b) {
            newArr[newArr.length-1] = a-b;
        } else {
            newArr[newArr.length-1] = a*2;
        }
        //             answer.add(a-b);
//         } else {
//             answer.add(a*2);

//         }
//         answer = num_list;
        return newArr;
        }
    }

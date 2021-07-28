//Time Complexity : O(n2)
//Space Complexity : O(1)
var twoSum1 = function (nums, target) {
    //Brute Force
    let result = [];
    for (var i = 0; i < nums.length; i++) {
        for (var j = i + 1; j < nums.length; j++) {
            var sum = 0;
            sum = nums[i] + nums[j];
            if (sum === target) {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
    }
}

//Time O(n)
//Space O(n)
var twoSum2 = function (nums, target) {
    const hash = {};
    for (let i = 0; i < nums.length; i++) {
        let difference = target - nums[i];
        if (difference in hash) {
            //return the Array coz found
            return [i, hash[difference]];
        } else {
            //insert into hash
            hash[nums[i]] = i;
        }
    }
    return [];
}

let nums = [2, 7, 11, 15];
let target = 9;
//ts 1
//let value = twoSum(nums, target);
//console.log(value);
//ts 2
nums = [3, 2, 4];
target = 6;
value = twoSum1(nums, target);
console.log(value);

value = twoSum2(nums, target);
console.log(value)
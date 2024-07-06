// Brute Force Solution
var twoSum = function (nums, target) {
  for (let p = 0; p < nums.length; p++) {
    const numToFind = target - nums[p];

    for (let q = p + 1; q < nums.length; q++) {
      if (numToFind === nums[q]) {
        return [p, q];
      }
    }
  }
  return null;
};

// Optimized Solution
const numsArray = [1, 3, 7, 9, 2];
const targetToFind = 11;

const findTwoSum = function (nums, target) {
  const numsMap = {};

  for (let p = 0; p < nums.length; p++) {
    const currentMapVal = numsMap[nums[p]];

    if (currentMapVal >= 0) {
      return [currentMapVal, p];
    } else {
      const numberToFind = target - nums[p];
      numsMap[numberToFind] = p;
    }
  }

  return null;
};

console.log(findTwoSum(numsArray, targetToFind));

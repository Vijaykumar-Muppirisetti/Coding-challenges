# solution logic
def two_sum(nums, target):
    for p in range(len(nums)):
        num_to_find = target - nums[p]

        for q in range(p + 1, len(nums)):
            if num_to_find == nums[q]:
                return [p, q]
    return None
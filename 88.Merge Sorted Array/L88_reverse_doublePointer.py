class Solution:
    def merge(self,nums1:List[int],m:int,nums2:List[int],n:int):
        #start from the tail of the list
        p1,p2,p3 = m-1,n-1,m+n-1
        while p1 >= 0 or p2 >= 0:
            #check whether the pointer is -1 first to deal with the case that either list is empty

            #elements in nums1 are all examined, and maybe there are some elements left in nums2
            #that are all smaller than nums1 --> move them to nums1
            if p1 == -1:
                nums1[:k+1] = nums2[:j+1]
                break
            #elements in nums2 are all examined, and maybe there are some elements left in nums1
            #that are all smaller than nums2 --> stay the original poistions
            elif p2 == -1:
                break
            #put the bigger element to k, and move the pointers
            elif nums1[i] >= nums2[j]:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
            else:
                nums1[k] = nums2[j]
                k -= 1
                j -= 1
            

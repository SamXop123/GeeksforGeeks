#User function Template for python3
arr = tuple(map(int, input().split()))

if len(arr) == len(set(arr)):
    print("True")
else:
    print("False")

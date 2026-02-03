
# tuples
aTuple = {4, 3, 5, 2, 1}
# add ids
enumerated = enumerate(aTuple)
# create dictionary
vocab = {token:integer for integer,token in enumerated} 
# {1: 0, 2: 1, 3: 2, 4: 3, 5: 4}
#print(vocab)

# find all condos with a view to the ocean on the right
# work backwards and iterate the list - an O(n) operation


#aList = [1,5,2,8,4,7,6]
#aList.sort()
#for i in aList:
#  print(i)

value = 1
aList2 = [ value**2 for value in range(5)]
for i in aList2:
  print(i)

def lists_1():
  source = [1,3,5,7,11,13,17] 
  target = []
  i = 1

  for x in source:
    target.append(x)#.insert(0,x)
  for y in target:
    print(y)
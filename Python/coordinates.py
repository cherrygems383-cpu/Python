points = [(2,3), (-1,4), (5,-6), (0,7), (-3,-2)]

def postive(point):
      index, count = point
      return index > 0 and count > 0
            
result = filter(postive, points)
print(tuple(result))


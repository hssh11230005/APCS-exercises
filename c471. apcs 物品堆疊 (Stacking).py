# 60%
n = int(input())
w = [int(x) for x in input().split()]
f  = [int(x) for x in input().split()]
fnw = []; en = 0

for i in range(n):
    fnw.append((f[i], w[i]))
fnw.sort();

for i in range(1, n):
    weight_sum = sum(fnw[j][1] for j in range(i))
    en += weight_sum * fnw[i][0] 
print(en)

#完全解，但ZJ(75%) 因為f[i] = 0
n = int(input())
w = [int(x) for x in input().split()]
f  = [int(x) for x in input().split()]
a = [(w[i]/f[i], w[i], f[i]) for i in range(n)];a.sort()
ans = total_w = 0
for(r, x, y) in a:
    ans += total_w * y
    total_w += x

print(ans)

#ZJ(100%) 
n = int(input()); w2 = []; f2 = []
w = [int(x) for x in input().split()]
f  = [int(x) for x in input().split()]
for i in range(n):
    if f[i] != 0: f2.append(f[i]); w2.append(w[i])
a = [(w2[i]/f2[i], w2[i], f2[i]) for i in range(len(f2))];a.sort()
ans = total_w = 0
for(r, x, y) in a:
    ans += total_w * y
    total_w += x

print(ans)

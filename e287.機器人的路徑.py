n, m = map(int, input().split())
oo = 1000001
n += 2; m += 2
a = [[] for i in range(n)]
a[0] = [oo for j in range(m)]
a[n-1] = [oo for j in range(m)]
for i in range(1, n-1):
    a[i] = [oo] + [int(x) for x in input().split()] + [oo]

si = -1; sj = -1; mm = oo
for i in range(n):
    for j in range(m):
        if a[i][j] < mm:
            si = i; sj = j; mm = a[i][j]
print(si, sj, mm)
total = 0
while True:
    total += a[si][sj]
    a[si][sj] = oo
    ni = si; nj = sj; mm = oo
    if a[si-1][sj] < mm:
        ni = si-1; nj = sj; mm = a[si-1][sj]
    if a[si+1][sj] < mm:
        ni = si+1; nj = sj; mm = a[si+1][sj]
    if a[si][sj-1] < mm:
        ni = si; nj = sj-1; mm = a[si][sj-1]
    if a[si][sj+1] < mm:
        ni = si; nj = sj+1; mm = a[si][sj+1]
    if mm == oo: break
    si = ni; sj = nj
print(total)
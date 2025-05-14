import time
times = time.time()
for i in range (100):
    i+= 1
    for j in range(10):
        j+=1
        for k in range(10):
            k+=1
end_times = time.time()
print(f"{(end_times - times) * 1000:.7f} ms")
print(time.time())
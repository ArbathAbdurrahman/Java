import time
import random
from collections import deque

def measure_insertion(array_list, linked_list, data_size):
    print("\n=== Penyisipan di Tengah ===")
    
    # Penyisipan pada List (Array)
    start_time = time.time()
    for i in range(data_size):
        array_list.insert(len(array_list) // 2, i)
    end_time = time.time()
    print(f"List (Penyisipan Tengah): {(end_time - start_time) * 1000:.2f} ms")

    # Penyisipan pada Linked List (Deque)
    start_time = time.time()
    for i in range(data_size):
        linked_list.insert(len(linked_list) // 2, i)
    end_time = time.time()
    print(f"LinkedList (Penyisipan Tengah): {(end_time - start_time) * 1000:.2f} ms")

def measure_random_access(array_list, linked_list, data_size):
    print("\n=== Akses Elemen Secara Acak ===")
    
    array_list = list(range(data_size))  # Mengisi ulang list
    linked_list = deque(range(data_size))  # Mengisi ulang deque
    
    rand = random.Random()
    total = 0  # Untuk menghindari optimisasi Python
    
    # Akses acak pada List (Array)
    start_time = time.time()
    for _ in range(100000):
        total += array_list[rand.randint(0, data_size - 1)]
    end_time = time.time()
    print(f"List (Akses Acak): {(end_time - start_time) * 1000:.2f} ms")

    # Akses acak pada Linked List (Deque)
    start_time = time.time()
    linked_list = list(linked_list)  # Konversi ke list karena akses acak di deque lambat
    for _ in range(100000):
        total += linked_list[rand.randint(0, data_size - 1)]
    end_time = time.time()
    print(f"LinkedList (Akses Acak - Simulasi dengan List): {(end_time - start_time) * 1000:.2f} ms")

def measure_deletion(array_list, linked_list, data_size):
    print("\n=== Penghapusan di Tengah ===")
    
    array_list = list(range(data_size))  # Mengisi ulang list
    linked_list = deque(range(data_size))  # Mengisi ulang deque
    
    # Penghapusan di tengah pada List (Array)
    start_time = time.time()
    for _ in range(data_size // 2):
        del array_list[len(array_list) // 2]
    end_time = time.time()
    print(f"List (Penghapusan Tengah): {(end_time - start_time) * 1000:.2f} ms")

    # Penghapusan di tengah pada Linked List (Deque)
    start_time = time.time()
    for _ in range(data_size // 2):
        del linked_list[len(linked_list) // 2]
    end_time = time.time()
    print(f"LinkedList (Penghapusan Tengah): {(end_time - start_time) * 1000:.2f} ms")

if __name__ == "__main__":
    data_size = 100000  # Ukuran data untuk pengujian
    array_list = []
    linked_list = deque()

    measure_insertion(array_list, linked_list, data_size)
    measure_random_access(array_list, linked_list, data_size)
    measure_deletion(array_list, linked_list, data_size)

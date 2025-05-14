import requests

req = requests.get("https://daring.uin-suka.ac.id/login")

# print(req.content)
print(req.status_code)
print(req.headers)
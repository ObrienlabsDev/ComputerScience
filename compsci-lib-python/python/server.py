# basic tcp/ip backend server - without using flask
# 20260206 michael at obrienlabs.dev

# curl -X POST -H 'Content-Type: application/json' -d '{"key":"value", "key2":"value2"}' http://localhost:9998


import os
import socket
import threading

IP = '0.0.0.0'
PORT = 9998

def main():
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind((IP, PORT))
    server.listen(5)
    print(f'[*] listen: {IP}:{PORT}')

    while True:
        client, address = server.accept()
        print(f'[*] accept conn: {address[0]}:{address[1]}')
        client_handler = threading.Thread(target=handle_client, args=(client,))
        client_handler.start()

def handle_client(Client_socket):
    with Client_socket as sock:
        request = sock.recv(1024)
        print(f'[*] received: {request.decode("utf-8")}')
        sock.send(b'ACK')
    

if __name__ == '__main__':
    main()
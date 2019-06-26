cd docker/postgresql/

docker-compose up --build -d

curl https://fonoapi.freshpixl.com/v1/getdevice -XPOST -H 'Accept: application/json' -d 'token=b749770c72143641ba54dd64f0b18c924b64ce253caf0af4&limit=5&device=A8'


b749770c72143641ba54dd64f0b18c924b64ce253caf0af4

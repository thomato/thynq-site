FROM nginx:alpine

COPY /build/distributions/ /usr/share/nginx/html

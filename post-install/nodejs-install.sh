#!/bin/bash

NODEJS_VERSION="node-v18.14.2-linux-arm64"

echo $NODEJS_VERSION

wget https://nodejs.org/dist/v18.14.2/${NODEJS_VERSION}.tar.xz

tar -xf ${NODEJS_VERSION}.tar.xz

cd $NODEJS_VERSION

install_dir="/usr/local"
if [ ! -d "$install_dir" ]; then
  mkdir "$install_dir"
  echo "Created $install_dir"
fi

cp -R * $install_dir

echo "Checking Node and NPM versions"
node -v
npm -v


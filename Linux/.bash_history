# 1. Использование команды cat в Linux
cat > Pets
cat > PackAnimals
cat Pets PackAnimals >> file
cat file
mv file HumanFriends
# 2. Работа с директориями в Linux
mkdir dir
mv HumanFriends dir
# 3. Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”
wget -c https://dev.mysql.com/get/mysql-apt-config_0.8.16-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.16-1_all.deb
sudo apt-get update
sudo apt-get install mysql-server
systemctl status mysql
# 4. Управление deb-пакетами
wget https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-j_8.0.32-1ubuntu22.04_all.deb
sudo dpkg -i mysql-connector-j_8.0.32-1ubuntu22.04_all.deb
sudo dpkg -r mysql-connector-j
sudo apt-get autoremove
# 5. История команд в терминале Ubuntu
exit

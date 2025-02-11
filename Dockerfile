# Используем JDK 11 и Maven
FROM maven:3.8.6-openjdk-11 AS builder

# Создаем рабочую директорию
WORKDIR /app

# Копируем исходники
COPY . .

# Копируем build.properties.example, если build.properties отсутствует
RUN cp server/build.properties.example server/build.properties

# Собираем проект через Maven
RUN mvn clean install -DskipTests

# Используем Tomcat для деплоя
FROM tomcat:9.0

# Создаем рабочую директорию в Tomcat
WORKDIR /usr/local/tomcat/webapps/

# Копируем собранный .war-файл
COPY --from=builder /app/server/target/launcher.war ./ROOT.war

# Expose порт Tomcat
EXPOSE 8090

# Запускаем Tomcat
CMD ["catalina.sh", "run"]
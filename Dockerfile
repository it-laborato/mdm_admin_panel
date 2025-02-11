# Используем базовый образ с JDK 11 для сборки
FROM openjdk:11-jdk-slim AS builder

# Устанавливаем необходимые утилиты
RUN apt-get update && apt-get install -y \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Создаем рабочую директорию
WORKDIR /app

# Копируем исходники
COPY . .

# Собираем проект с помощью Gradle
RUN ./gradlew build -x test

# Финальный контейнер с JRE
FROM openjdk:11-jre-slim

# Создаем рабочую папку
WORKDIR /app

# Копируем собранный .jar файл из стадии builder
COPY --from=builder /app/build/libs/hmdm-server.jar ./hmdm-server.jar

# Открываем порт
EXPOSE 8080

# Запускаем приложение
CMD ["java", "-jar", "hmdm-server.jar"]

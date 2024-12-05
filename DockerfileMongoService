# Используем базовый образ с Java
FROM openjdk:17

# Создаем директорию для приложения
WORKDIR /mongoService

# Копируем JAR-файл приложения в контейнер
COPY target/mongoService-0.0.1-SNAPSHOT.jar /app/mongoService-0.0.1-SNAPSHOT.jar

# Указываем порт, на котором будет работать приложение
EXPOSE 8040

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "/app/mongoService-0.0.1-SNAPSHOT.jar"]
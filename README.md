# Застосунок HelloWorld Servlet

Це простий веб-застосунок на основі Java Servlet, який виводить "Hello, World!" у браузері. Проєкт використовує Gradle як інструмент збірки та Jakarta Servlet API.

## Вимоги

- **Java JDK 8+**: Переконайтеся, що у вас встановлений JDK (не лише JRE).
- **Gradle**: Проєкт містить Gradle wrapper, тому немає необхідності встановлювати Gradle окремо.
- **IntelliJ IDEA Community Edition**: Для розробки та запуску проєкту. Переконайтеся, що у вас встановлена остання версія.
- **Apache Tomcat**: Ми використовуємо локальний сервер Tomcat (налаштовується через плагін Gradle) для запуску застосунку.

## Як почати

### 1. Клонування репозиторію

Спочатку клонуй цей репозиторій на свій локальний комп'ютер:

```bash
git clone <repository-url>
cd Servlet-education
```
### 2. Встановлення JDK
Переконайтеся, що на вашій системі встановлено Java Development Kit (JDK).
 
### 3. Відкрийте проєкт у IntelliJ IDEA
Відкрийте IntelliJ IDEA, виберіть Open і завантажте проєкт.
### 4. Збірка і запуск застосунку
   Запустіть застосунок за допомогою Gradle:

```bash 
.\gradlew appRun
```
### 5. Відкрийте застосунок у браузері
   Перейдіть за адресою http://localhost:8080/Servlet-education/hello, щоб побачити повідомлення "Hello, World!".


### Вирішення проблем
tools.jar not found: Переконайтеся, що використовується JDK, а не JRE.
Tomcat не запускається: Перевірте порти та запущені процеси.
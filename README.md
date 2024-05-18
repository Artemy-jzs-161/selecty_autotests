# Проект по тестированию сайта по подбору вакансий Selecty

<html>
 <body> 
   <p><a href="https://selecty.ru/"><img src="readme_files/images/selecty.png" width="800" 
   height="300" alt="Selecty"></a></p>
 </body> 
</html>

## **Содержание:**

* <a href="#tools">Технологии и инструменты</a>
* <a href="#cases">Список реализованных проверок</a>
* <a href="#jenkins">Сборка в Jenkins</a>
* <a href="#console">Запуск из терминала</a>
* <a href="#allure">Allure отчет</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#jira">Интеграция с Jira</a>
* <a href="#telegram">Уведомление в Telegram при помощи бота</a>
* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>

<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">
<img width="6%" title="Java" src="readme_files/icons/java-original-wordmark.svg">
<img width="6%" title="Gradle" src="readme_files/icons/gradle-original.svg">
<img width="6%" title="JUnit5" src="readme_files/icons/junit-original-wordmark.svg">
<img width="6%" title="Selenide" src="readme_files/icons/Selenide.png">
<img width="6%" title="Jenkins" src="readme_files/icons/jenkins-original.svg">
<img width="6%" title="Selenoid" src="readme_files/icons/Selenoid.png">
<img width="6%" title="Allure Report" src="readme_files/icons/Allure_Report.png">
<img width="5%" title="Allure TestOps" src="readme_files/icons/AllureTestOps.png">
<img width="6%" title="IntelliJ IDEA" src="readme_files/icons/intellij-original.svg">
<img width="5%" title="Jira" src="readme_files/icons/jira-original-wordmark.svg">
<img width="6%" title="GitHub" src="readme_files/icons/github-original-wordmark.svg">
</p>


- В данном проекте автотесты написаны на языке `Java` с использованием фреймворка для тестирования `Selenide`.
- В качестве сборщика был использован - `Gradle`.
- Использованы фреймворки `JUnit 5` и `Selenide`.
- При прогоне тестов браузер запускается в `Selenoid`.
- Для удаленного запуска реализована джоба в `Jenkins` с формированием `Allure`отчета и отправкой результатов в `Telegram` при помощи бота.
- Осуществлена интеграция с `Allure TestOps` и `Jira`
#### Содержание Allure-отчета:
- Шаги теста;
- Скриншот страницы на последнем шаге;
- Page Source;
- Логи браузерной консоли;
- Видео выполнения автотеста.

<a id="cases"></a>
## <a name="Список реализованных проверок">**Список реализованных проверок:**</a>
#### Список реализованных автотестов
- Проверка окончания работы анимации
- Проверка телефонного номера на главной странице
- Проверка адреса на главной странице
- Проверка заголовка на главной странице русскоязычной версии сайта
- Проверка заголовка на главной странице англоязычной версии сайта
- Проверка ссылок на социальные сети
- Проверка ссылок навигационной панели на русскоязычной версии сайта
- Проверка ссылок навигационной панели на англоязычной версии сайта

#### Список проверок ручного тестирования
- TODO
- TODO

<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="readme_files/icons/jenkins-original.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Selecty_autotets/)</a>

 ![image](/readme_files/images/jenkins.png)

 - **TASK** - запуск задачи, по умолчанию запускаются все тесты first_tests
- **BROWSER** - браузер, по умолчанию chrome
- **BROWSER_SIZE** - размер окна браузера, по умолчанию 1920x1080
- **BROWSER_VERSION** - версия браузера, по умолчанию 122.0
- **REMOTE_URL** - адрес удаленного сервера Selenoid

<a id="console"></a>
## Команды для запуска из терминала

#### Локальный запуск:

```bash  
gradle clean first_tests
```

#### Удалённый запуск через Jenkins:

```bash  
clean
${TASK}
"-Dbrowser=${BROWSER}"
"-Dbrowser_size=${BROWSER_SIZE}"
"-Dbrowser_version=${BROWSER_VERSION}"
"-Dremote_url=${REMOTE_URL}"
```

<a id="allure"></a>
## <img alt="Allure" height="25" src="readme_files/icons/Allure_Report.png" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/Selecty_autotets/allure/)</a>
### По результатам каждого запуска тестов в Jenkins создается Allure отчет с подробной информацией по каждому пройденному тесту.

### Основная страница отчета
![image](/readme_files/images/allure_report.png)

### Тест-кейсы
![image](/readme_files/images/allure_tests.png)

<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="readme_files/icons/Allure_Report.png" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4209/dashboards">Allure TestOps</a>
### Полная статистика по прохождению тест-кейсов, отчёты и приложения к ним хранятся в Allure TestOps(запрос доступа admin@qa.guru).

### **Allure TestOps Dashboard**
![image](/readme_files/images/allure_testops_dash.png)

### **Автоматизированные тест-кейсы**
![image](/readme_files/images/allure_testops_auto.png)

### **Ручные тест-кейсы**
![image](/readme_files/images/allure_testops_manual.png)

<a id="jira"></a>
## <img alt="Jira" height="25" src="readme_files/icons/jira-original-wordmark.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-1207">Jira</a>

- Реализована интеграция Allure TestOps с Jira, в тикете отображается информация, какие тест-кейсы были написаны в рамках задачи и результат их прогона.

![image](/readme_files/images/jira.png)

<a id="telegram"></a>
## <img alt="Allure" height="25" src="readme_files/icons/Telegram.png" width="25"/></a> Уведомление в Telegram при помощи бота
- После завершения сборки, бот созданный в Telegram, автоматически обрабатывает и отправляет сообщение с результатом.

![image](/readme_files/images/telegram.png)

<a id="video"></a>
## <img alt="Selenoid" height="25" src="readme_files/icons/Selenoid.png" width="25"/></a>Видео примера запуска тестов в Selenoid

<img title="Selenoid Video" src="/readme_files/images/selecty_video.gif" width="550" height="350"  alt="video">   


## Проект по разработке автотестов для сайта поиска и покупки билетов [Tutu.ru](https://www.tutu.ru/)
### Технологический стек
<img src="https://user-images.githubusercontent.com/93325839/154862413-4bb9b756-15b8-427d-92c1-1a340c181315.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862433-be90aa45-f19f-4e1e-8e22-d1b600615b49.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862453-a583af29-90d9-4a54-9a39-9964c45b443a.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862486-9da17504-c697-4f75-8d7e-d9d6a0ad09ed.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862525-f8f1fc2d-f979-4e0b-9981-5a322ef58b56.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862578-b50fa136-7b0b-43ae-ae32-6b0bc2511caa.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862600-5b1a419e-2a5d-407a-ad46-440ff0fb30de.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862620-50321a56-e42b-4a8e-8e66-6ad3761c8877.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862659-51fda643-d471-4b70-8223-e240e3e4722c.png"  height="50"/> <img src="https://user-images.githubusercontent.com/93325839/154862695-0c968a13-c8f7-41e8-bcda-f42ef8d33127.png"  height="50"/> 

-----
* Автотесты написаны на ``Java`` с использованием фреймворка ``Selenide``.
* ``JUnit 5`` фреймворк для модульного тестирования.
* ``Gradle`` используется для автоматизированной сборки проекта.
* С помощью ``Jenkins`` выполняется запуск тестов.
* ``Selenoid`` выполняет запуск браузеров в контейнерах ``Docker``.
* ``Allure Report`` формирует отчет о запуске тестов.
* Автотесты интегрируются с тест-менеджмент системой ``Allure TestOps`` и таск-трекер системой ``Jira``
* В ``Telegram`` бот отправляет уведомления о результатах прохождения тестов.

### ✅  Реализованы следующие тест-кейсы

1. Проверка наличия логотипа и слогана
2. Проверка текста заголовка на главной странице
3. Проверка функции поиска ж/д билетов на сайте и отображения результатов
4. Проверка наличие табов поиска
5. Проверка информации в разделе 'О компании'

### 🚀 Запуск тестов из терминала с заполненным файлом remote.properties (locale.properties):
* Локально ``gradle clean test -DtypeEnv=locale``
* Удалённо ``gradle clean test -DtypeEnv=remote``

### 🚀 Запуск тестов из терминала с не заполненным файлом remote.properties:

    gradle clean test     
    -DselenoidUrl=https://${LOGIN}:${PASSWORD}@selenoid.autotests.cloud/wd/hub/     
    -Dbrowser=${BROWSER}        
    -DbrowserVersion=${BROWSER_VERSION}         
    -DbrowserSize=${BROWSER_SIZE}
  
### <img src="https://user-images.githubusercontent.com/93325839/154862578-b50fa136-7b0b-43ae-ae32-6b0bc2511caa.png"  height="30"/> Конфигурация Job в Jenkins 
🔴 Открыть сборку [Jenkins](https://jenkins.autotests.cloud/job/009_qaguru_j_unicorn_TutuRu_UI_Test).  
🔴 Нажать **"Собрать с параметрами"**.  
🔴 Указать необходимые параметры.  
🔴 Нажать на кнопку **"Собрать"**. 
<details>
  <summary>Подробнее</summary>  
  
<img src="https://user-images.githubusercontent.com/93325839/154866866-3497cc50-c7b6-4c6c-a66f-72435aa97fbe.png"  />  
<img src="https://user-images.githubusercontent.com/93325839/154866961-9acc7505-da3c-4e29-adac-79d39650de3f.png"  />
  


🔴 Чтобы посмотреть сформированный отчет о прохождении тестов в Allure Report необходимо нажать на ссылку/иконку **"Allure Report"**.  
  
  <img src="https://user-images.githubusercontent.com/93325839/154867361-e5ce60f4-734c-44af-b391-0f0ec40a9aa1.png"  />  
  </details>

### <img src="https://user-images.githubusercontent.com/93325839/154862525-f8f1fc2d-f979-4e0b-9981-5a322ef58b56.png" height="30"/> Отчет о результатах тестирования в Allure Report

<details>
  <summary>Подробнее</summary> 
  
  **1.** Страница «Overview».

<img src="https://user-images.githubusercontent.com/93325839/154868716-9293ac59-1629-4ddc-b035-c3995e7203ae.png" />  

* ALLURE REPORT - отображает дату и время прохождения общее количество тестов, а также диаграмму с указанием процента и количества успешных, упавших и сломавшихся в процессе выполнения тестов
* TREND - отображает тренд прохождения тестов от сборки к сборке
* SUITES - отображает распределение результатов тестов по тестовым наборам
* FEATURES BY STORIES - отображает распределение тестов по функционалу, который они проверяют
  
  
**2.** Страница «Suites».  

На данной странице представляется распределение выполнявшихся тестов по тестовым наборам или классам, в которых находятся тестовые методы.  
  Каждый тестовый набор содержит скриншот, сделанный после последнего шага, видео прохождения и консольные логи браузера.

<img src="https://user-images.githubusercontent.com/93325839/154868805-59f2e359-3cad-4710-94f8-140afc542674.png" />  
  


     
**3.** Страница «Graphs».

На этой странице можно получить информацию о тестовом прогоне в графическом виде: статус прогона, распределение тестов по их критичности, длительности прохождения, перезапусках, категориях дефектах.  

<img src="https://user-images.githubusercontent.com/93325839/154868860-05fc64cd-c20b-4194-9916-aac8a8380778.png" />  

    
**4.** Страница «Timeline».  

Данная страница визуализирует временные рамки прохождения каждого теста.  

<img src="https://user-images.githubusercontent.com/93325839/154868914-c633a14b-1193-4dca-bc9a-3ad7ee2cf992.png" />  

</details>  

### <img src="https://user-images.githubusercontent.com/93325839/154862620-50321a56-e42b-4a8e-8e66-6ad3761c8877.png" height="30"/> Интеграция тестов c тест-менеджмент системой [Allure TestOps](https://allure.autotests.cloud/project/1035/dashboards/1960)

<details>
  <summary>Подробнее</summary> 

  
📎 **Dashboards.**  

<img src="https://user-images.githubusercontent.com/93325839/154869105-d93c0d2b-45e1-4305-a131-16abd05cf6a2.png" />  
  
  

📎 **Test cases.**  

<img src="https://user-images.githubusercontent.com/93325839/154869159-57c3fcd3-40a8-43d2-82c7-b8b7fa760843.png" />  
  
<img src="https://user-images.githubusercontent.com/93325839/154869221-1e6e34f9-126d-4c23-9bbc-13f76f30874c.png" />
  
  
📎 **Launches. Запуски тестов.**  

<img src="https://user-images.githubusercontent.com/93325839/154869275-63278525-abe7-4021-92e1-fc2ed3c3e6bb.png" />  
  

</details>  

### <img src="https://user-images.githubusercontent.com/93325839/154862659-51fda643-d471-4b70-8223-e240e3e4722c.png"  height="30"/> Интеграция тестов c таск-трекер системой [Jira](https://jira.autotests.cloud/browse/HOMEWORK-343)  



<details>
  <summary>Подробнее</summary>  
  
  #### Запускаемые кейсы и их результаты можно добавить в Jira.
  
<img src="https://user-images.githubusercontent.com/93325839/154869390-8a38c0af-bb4d-49dc-bcac-a0317c28b83e.png" />  
 
</details>

### <img src="https://user-images.githubusercontent.com/93325839/154862695-0c968a13-c8f7-41e8-bcda-f42ef8d33127.png"  height="30"/>  Уведомления о прохождении тестов в Telegram  
<details>
  <summary>Подробнее</summary>
  
#### После прохождения тестов, в telegram канал приходит оповещение с результами.

<img src="https://user-images.githubusercontent.com/93325839/154869482-f29c7579-ede5-4819-b84a-a969a8832d2b.png" />  
  
</details>  

### <img src="https://user-images.githubusercontent.com/93325839/154862600-5b1a419e-2a5d-407a-ad46-440ff0fb30de.png"  height="30"/> Видео прохождения тестов в Selenoid  

https://user-images.githubusercontent.com/93325839/155041937-c17ef424-1c9f-47d2-a30c-b212bc750e71.mp4


# Тестовое задание

## Задание: разработать backend-сервер на Spring для функционирования доски объявлений.

Функционал, который требуется реализовать:
Регистрация и аутентификация пользователя в личном кабинете:
пользователь при регистрации должен указать роль, email и пароль;
аутентификацию реализовать через вход по email и паролю.
В личном кабинете пользователь может создать объявление и разместить его на доске объявлений в общем списке. Объявление содержит название, описание, контакты продавца и изображения.
Доска объявлений в данном случае - это список всех объявлений с многочисленными фильтрами (продумать максимально возможные варианты фильтров на своё усмотрение), который отображается на главной странице сервиса.
Пользователь может как размещать свои объявления, так и совершать сделки в рамках других объявлений.
Объявления имеют 2 статуса - активное и снятое с публикации.
Продумать и реализовать вариант коммуникации между покупателем и продавцом во время совершения сделки.
Для всех методов необходимо реализовать API-методы с документацией на Swagger.
Покрыть весь функционал тестами. Желательно использовать TDD при разработке.

Дополнительные требования:
Сделать обертку исходного кода в docker-образ (добавить в корневую директорию файл Dockerfile, docker-compose.yml при необходимости).
В readme файл разместить текст данного задания, а, также, инструкцию по развертыванию проекта и основные команды для запуска.
Исходный код выложить на github.com в публичный репозиторий.
При создании коммитов писать осмысленные названия.
Использовать инструмент тестового покрытия для отображения % покрытия исходного кода тестами.
Для проверки кода дополнительно подключить линтер на выбор.

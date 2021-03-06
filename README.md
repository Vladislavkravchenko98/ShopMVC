# ShopMVC
Описание: Сервер Spring Boot MVC.
Средства разработки: Java.
Framework: Spring boot 1.2.3 (или выше).
База данных: MySQL (FlyWay миграция).
Протокол: HTTP, порт 8080.
Запуск: через ServingWebContentApplication с 7 строчки.
Обращение к главной странице магазина: http://localhost:8080/shop.
Чтобы зайти в аккаунт админа: Логин- Admin, Пароль- Pro100.

В данной программе был создан магазин на Spring Boot MVC со следующими возможностями:
- Регистрация пользователя. Необходимо указать имя, почту и пароль. Имена пользователей должны отличаться. Сохранение инофрмации о пользователе в БД MySQL с шифрованием паролей;
- Страница регистрации выводит ошибку в случае ввода неверных данных или если такое имя пользователя уже существует;
- У пользователей пресутствуют различные роли (User, Admin);
- Реализация функционала Spring Security;
- Редирект на страницу аутентификации; 
- На странице аутентификации выводится ошибка, если данные введены не верно;
- Реализация выхода из аккаунта пользователя (Logout);
- Главная страница магазина, где выводится список всех товаров;
- Страница с подробным описанием товара, где пользователь может: 
     1.Добавить товар в корзину; 
     2.Оставить отзыв о товаре; 
     3.Поставить оценку товару.
- Страница корзины пользователя, где: 
     1.Выводится список всех товаров добавленных в корзину, 
     2.Корзину можно очистить; 
     3.Можно перейти к оформлению заказа;
- Страница с указанием более подробных данных о пользователе для окончательного заказа (номер телефона, вид доставки и т.д.);
- Настройки для пользователей с ролью Admin: 
     1.Работа с категориями товаров: добавление, изменение, удаление;
     2.Работа с производителем товара: добавление, изменение, удаление;
     3.Работа с товаром: добавление, изменение, удаление;
     4.Работа с пользователями: изменение роли, изменение имени, изменение почты;
     4.Просмотр страницы всех заказов и возможность просмтра подробностей о конкретном заказе.

package com.grs24.mt;

import java.io.IOException;
import java.util.Properties;

/**
* Интерфейс работы с СДП.
* Реализация должна самостоятельно заботиться об установке соединения к СДП
* и позволять обрабатывать запросы в многонитевом окружении и от имени разных 
* Банков-получателей одновременно.
* Так же реализация должна:
* 1) Cамостоятельно заботиться о мапинге необходимых справочников СДП на данные сервиса,
* например, коды стран, валюты, типы документов удостоверений личности.
* 2) Формировать и проверять подписи на запросах и ответах.
* 3) Сохранять полученные подписанные документы (ответы СДП) в хранилище и заполнять
* атрибуты Stan и TimeStamp соотвествующими значениями или их эквивалентами.
* 4) Связывать с сохраненными документами ссылки на сертификаты или пароли.
* 5) Преобразовывать имена получателей перевода (транслитерация по правилам СДП).
*
* Наименования и назначения параметров настроек классов, реализующих интерфейс
* должны быть задокументированы разработчиком после реализации.
*
* Получение экземпляра должно происходить через обращение к MtManager, исходный 
* код которого так же должен предоставляться разработчиком:
* MtAdapter con = MtManager.getAdapter(String bankBin);
* Цель MtManager - оптимизировать и ускорить подключение к СДП за счет экономии 
* ресурсов на установке соединения, переиспользования коннектов, настройке 
* параметров и т.д.
*
* Общая последовательность выдачи перевода: moneySearch->moneyHold->moneyPay
* В случае проблем вызыватся moneyUnhold
*/
public interface MtAdapter {

/**
* На вход подается набор параметров для установки соединения, таких как URL точки доступа,
* логин и пароль, идентификатор приложения или системы, идентификатор сертификата и ключ доступа 
* к хранилищу и т.д. Список необходимых параметров, которые должны быть установлены, 
* предоставляется разработчиком при передаче исходного кода реализации.
* @param cfg набор параметров для инициализации, такие как dbUser, dbPassword, etc.
* @throws IOException в случае проблем инициализации (например, ошибка соединения 
* с СУБД.
*/
public void init(Properties cfg) throws IOException;

/**
* Поиск денежного перевода, доступного для выдачи. 
* Если перевод по КНП найден, но не может быть выдан (например, не тот статус), должно 
* выдаваться исключение прикладного типа для передачи информации клиенту.
*
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
	 * @param approxOrgFunds
	 * @param approxDstFunds
	 * @param orgCountry
	 * @param dstCountry
* @return RemittanceHolder[] найденные денежные переводы. Иногда СДП могут возвращать де-факто
* один и тот же перевод в разных вариантах валют к выплате. 
	 * @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) 
	 * @throws java.io.IOException
*/
public RemittanceHolder[] moneySearch(String mtcn, FundsHolder approxOrgFunds, 
		FundsHolder approxDstFunds, String orgCountry, String dstCountry ) throws RemittanceException, IOException;

/**
* Блокирование денежного перевода в СДП для выдачи, включая внесение всей необходимой информации по получателю. 
* Если не удается блокировать перевод должно выдаваться исключение прикладного типа. 
*
* @param mtID идентификатор денежного перевода в СДП
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param payee полная информация о получателе денежного перевода
* @throws RemittanceException если возникли проблемы резервирования перевода в СДП.
	 * @throws java.io.IOException
*/ 
public void moneyHold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException;


/**
* Разблокирование денежного перевода в СДП (отказ от ранее сделанной блокировки). 
* Если не удается разблокировать перевод должно выдаваться исключение прикладного типа. 
*
* @param mtID идентификатор денежного перевода в СДП
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param payee полная информация о получателе денежного перевода
* @throws RemittanceException если возникли проблемы разрезервирования перевода в СДП.
	 * @throws java.io.IOException
*/ 
public void moneyUnhold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException;


/**
* Выплата денежного перевода в СДП, включая внесение всей необходимой информации по получателю. 
* Если не удается выплатить перевод должно выдаваться исключение прикладного типа. 
*
* @param mtID идентификатор денежного перевода в СДП
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param payee полная информация о получателе денежного перевода
* @param docID идентификатор документа-проводки выдачи перевода в банке-получателе
* @param docDate дата документа-проводки
* @throws RemittanceException если возникли проблемы выдачи перевода в СДП.
	 * @throws java.io.IOException
*/ 
public void moneyPay(String mtID, String mtcn, PersonHolder payee, String docID, 
			String docDate) throws RemittanceException, IOException;

}

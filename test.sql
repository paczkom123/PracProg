INSERT INTO QUESTION VALUES(1, 'y', true, 'Priorytetem polityki kulturalnej państwa powinno być wzmacnianie tożsamości narodowej.');
INSERT INTO QUESTION VALUES(2, 'y', false, 'Aborcja powinna być legalna w szerszym katalogu przypadków niż obecnie.');
INSERT INTO QUESTION VALUES(3, 'y', false, 'Należy ułatwić dostęp do broni palnej.');
INSERT INTO QUESTION VALUES(4, 'x', false, 'Hodowla zwierząt na futra powinna pozostać dozwolona.');
INSERT INTO QUESTION VALUES(5, 'x', false, 'Należy podwyższyć podatki dla najlepiej zarabiających osób.');
INSERT INTO QUESTION VALUES(6, 'y', true, 'Pensja minimalna powinna zostać znacznie podwyższona.');
INSERT INTO QUESTION VALUES(7, 'y', true, 'Priorytetem polityki kulturalnej państwa powinno być wzmacnianie tożsamości narodowej.');
INSERT INTO QUESTION VALUES(8, 'y', true, 'Priorytetem polityki kulturalnej państwa powinno być wzmacnianie tożsamości narodowej.');
INSERT INTO QUESTION VALUES(9, 'y', true, 'Priorytetem polityki kulturalnej państwa powinno być wzmacnianie tożsamości narodowej.');
INSERT INTO QUESTION VALUES(10, 'y', true, 'Priorytetem polityki kulturalnej państwa powinno być wzmacnianie tożsamości narodowej.');


<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
hiaa
<p th:text="'Pytanie: ' + ${question.getQuestion()} + '!'" />
</body>
</html>




<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BookS</title>
</head>
<body>
<table>
    <tr>
        <td>图书编号</td>
        <td>图书名称</td>
        <td>图书作者</td>
    </tr>
    <#if books ??&&(books?size>0)>
        <#list books as book>
            <tr>
                <td>${book.id}</td>
                <td>${book.bookName}</td>
                <td>${book.bookAuthor}</td>
            </tr>
        </#list>
    </#if>
</table>
</body>
</html>
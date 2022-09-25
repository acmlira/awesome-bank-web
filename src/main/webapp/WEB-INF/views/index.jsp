<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="/resources/style.css" media="screen" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Fira+Code:wght@300;400;500&display=swap" rel="stylesheet">

    <title>Awesome Bank</title>
</head>
<body>
    <h1>Expense</h1>
    <main>
        <section>
            <h1>Create</h1>
            <form action = "/awesome-bank-web/expense/create" method = "POST">
                <ul>
                    <li>
                        <div>Name:</div>
                        <div><input type = "text" name = "name" required></div>
                    </li>
                    <li>
                        <div>Description:</div>
                        <div><input type = "text" name = "description" required /></div>
                    </li>
                    <li>
                        <div>Date/Time:</div>
                        <div><input type = "datetime-local" name = "dateTime" required /></div>
                    </li>
                    <li>
                        <div>Value:</div>
                        <div><input type = "number" name = "value" required /></div>
                    </li>
                    <li>
                        <div>Tags:</div>
                        <div>
                            <div><div><input type = "checkbox" value = "food"    name = "tags" /></div><div>Food</div></div>
                            <div><div><input type = "checkbox" value = "health"  name = "tags" /></div><div>Health</div></div>
                            <div><div><input type = "checkbox" value = "leisure" name = "tags" /></div><div>Leisure</div></div>
                        </div>
                    </li>
                    <li>
                        <div class="button"><input type = "submit" value = "Submit" /></div>
                    </li>
                </ul>
            </form>
        </section>
        <section>
            <h1>FindById</h1>
                <form action = "/awesome-bank-web/expense/find-by-id" method = "POST">
                    <ul>
                        <li>
                            <div>ExpenseId:</div>
                            <div><input type = "text" name = "expenseId" required></div>
                        </li>
                        <li>
                            <div class="button"><input type = "submit" value = "Submit" /></div>
                        </li>
                    </ul>
                </form>
        </section>
        <section>
            <h1>FindAll</h1>
                <form action = "/awesome-bank-web/expense/find-all" method = "POST">
                    <ul>
                        <li>
                            <div class="button"><input type = "submit" value = "Submit" /></div>
                        </li>
                    </ul>
                </form>
        </section>
    </main>
    <aside>
        <h1>Result</h1>
        <%= session.getAttribute("result") %>
    </aside>
</body>
</html>

# Awesome Bank Web

Web application to handle expenses and cash in/out of a bank account.

> This project depends on [awesome-bank-api](https://github.com/acmlira/awesome-bank-api) (REST API which provides the expenses model).

## Goal

This project aims to have a:

- Client to access the Awesome Bank API
- Web project to access the API the client:
  - Create an expense
  - View of all expenses
  - Viewing the details of an expense

## Getting Started

Step-by-step:

1. Bring up [awesome-bank-api](https://github.com/acmlira/awesome-bank-api)
2. Bring up this project
3. In your browser, see http://localhost:8919/awesome-bank-web/

There are a few ways to bring up this application:
- (Highly recommended) In Intellij run [AwesomeBankWebApplication](src/main/java/acmlira/awesomebank/web/AwesomeBankWebApplication.java)
- You can use the following line to start the application, but it requires some tweaks in your docker environment:
    ```shell
    docker-compose up
    ```
The [requests](/requests) folder has some examples of requests, you can execute them via Intellij in order to test.

## Troubleshooting

In order to make the development easy-understandable for everyone, I present to you some tips.

### No effect changes

Clean your docker environment (remove images, networks, containers, etc.).
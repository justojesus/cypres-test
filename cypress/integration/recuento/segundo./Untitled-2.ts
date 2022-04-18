/// <reference types="cypress" />

export class homepage {

    gotoHomePage() {
        cy.visit("https://the-internet.herokuapp.com/login")

    })

    it.only("valid user can login",() =>

    clicklogin()
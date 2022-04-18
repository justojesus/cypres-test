/// <reference types="cypress"/>


it("test recuento", () => {
    cy.visit("https://the-internet.herokuapp.com")
    cy.get(':nth-child(39) > a').click()
    cy.get('[href="/shifting_content/menu"]').click()
    cy.get('ul li').sould("have.length", 5);
})





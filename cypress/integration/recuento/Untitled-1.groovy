/// <reference types="cypress"/>


it("test recuento", () => {
    cy.visit("https://the-internet.herokuapp.com")
    cy.get(':nth-child(39) > a').click()
    cy.get('[href="/shifting_content/menu"]').click()
    cy.get(':nth-child(1) > a')/cy.get(':nth-child(7) > :nth-child(2) > a').check() 
    cy.get(':nth-child(7) > :nth-child(2) > a').check() 
    cy.get(':nth-child(7) > :nth-child(3) > a').check() 
    cy.get(':nth-child(7) > :nth-child(4) > a').check() 
    cy.get('.shift').check() 
    

})
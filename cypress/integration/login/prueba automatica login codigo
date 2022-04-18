/// <reference types="cypress"/>


describe('tests de login', () => {

    beforeEach(() => {

     cy.visit('https://the-internet.herokuapp.com/login')


    })

    it('valid user can login', ()=>{
        cy.get('#username').type("tomsmith")
        cy.get('#password').type("SuperSecretPassword!")
        cy.get('.fa').click()
        cy.get('#flash').contains("You logged into a secure area!") 
    })


        
    it.skip('not valid username can NOT login', () =>{
            cy.get('#username').type("invalido") 
            cy.get('#password').type("SuperSecretPassword!") 
            cy.get('.fa').click()
            cy.get('#flash').contains("Your username is invalid!")
            
    })
            
             
     it('not valid password can NOT login', () =>{
     cy.get('#username').type("tomsmith")
     cy.get('#password').type("invalida")
     cy.get('.fa').click()
     cy.get('#flash').contains("Your password is invalid!")
                
     })
            



})


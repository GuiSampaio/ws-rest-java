# Consume WS-Rest

 #### Questão 6 – Consume WS-Rest
 
This API contemplates formula 1 race results.
What we want is for you to make a REST / JSON API from this service. Keep in mind that we want a solution that validates what you know and also how you would make a real-world solution.
Finally, document the relevant points in readme.md and post to some public git repository.

 #### O que foi implementado?:

    - API REST

    - Consumo do serviço https://ergast.com/api/f1/:

   ##### 1.1 Funcionalidades:

    - Encontrar todas as corridas da temporada por ano e round;

    - Encontrar todas as classificações da temporada por ano e round.
 
 2. ##### Tecnologias utilizadas no projeto
 
    - Java 8 com a IDE STS
    - Spring Boot
    
 3. #### Rotas
 
       - Encontrar todas as corridas da temporada /findF1RacesBySeasonAndRound?year={ano}&round={round}
    
       - Encontrar todas as classificações da temporada /findF1StandingsBySeasonAndRound?year={ano}&round={round}


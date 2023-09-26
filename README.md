Neste projeto, desenvolvi uma aplicação utilizando tecnologias como Java, Spring Boot, Hibernate, MySQL e JPA.

Inicialmente, a tarefa consistiu em escrever testes para a classe PersonService de forma a garantir uma cobertura mínima de 80% das linhas de código. Isso se tornou essencial, pois o código adquirido não incluía testes unitários.

Em seguida, o foco foi na adaptação da rota POST /farms/{farmId}/crops para incluir campos de data. Caso a rota já tivesse sido implementada na Fase A do projeto, era necessário fazer os devidos ajustes. Caso contrário, a implementação completa da rota era necessária, abrangendo tanto os campos antigos quanto os novos, que incluem as datas de semeadura e de colheita.

Posteriormente, foram realizados ajustes ou criação das rotas GET /farms/{farmId}/crops, GET /crops, e GET /crops/{id} para também incluírem informações de datas.

A rota GET /crops/search foi criada para possibilitar a busca de plantações a partir da data de colheita, permitindo a especificação de um período de tempo.

Outra funcionalidade importante implementada foi a gestão de fertilizantes. Foram criadas rotas para cadastrar novos fertilizantes (POST /fertilizers), listar todos os cadastrados (GET /fertilizers), e obter informações de um fertilizante específico (GET /fertilizers/{id}).

Além disso, foi criada a rota para associar uma plantação a um fertilizante (POST /crops/{cropId}/fertilizers/{fertilizerId}), e também uma rota para listar os fertilizantes associados a uma plantação (GET /crops/{cropId}/fertilizers).

Durante o desenvolvimento, foram aplicados conceitos como injeção de dependência para conectar as camadas de controle, serviço e persistência. O Spring Data JPA foi utilizado para implementar entidades e repositórios para a persistência em banco de dados, incluindo buscas customizadas. Foram também utilizados campos de data nas rotas da API e no banco de dados.

Adicionalmente, para garantir a qualidade e o funcionamento correto da implementação, foram criados testes unitários, alcançando uma cobertura de código adequada.

No geral, o projeto representa uma integração bem-sucedida de diversas tecnologias e boas práticas de desenvolvimento, proporcionando uma aplicação funcional e segura.

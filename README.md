Rota
====

Programa de console que utiliza maven feito para consumir o webservice de Rotas do mapLink, é fornecido um arquivo json que informa as coordenadas de origem e destino e após consumir o webservice é retornado a distancia entre os pontos, o valor de combustivel gasto até o destino (Com base no preço de combustivel de $ 3 ) e o tempo de percurso. Para manipulação do json é utilizado Gson.

RequestJSON.class representa o json com os dados de entrada no sistema.

MainApp.class é o arquivo que deve ser executado para consumir o web service e retornar os dados no formato json no console.

O pacote model contem as classes que representam os modelos de Request e Response.

O pacote webservice contem as classes do webservice de rotas da maplink.

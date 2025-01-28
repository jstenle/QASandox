package com.apiTest.restAssuredTest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AppTest {

	// URL base da API reqres.in
	private static final String BASE_URL = "https://reqres.in/api";

	@Test
	public void testGetEndpoint() {
		// Teste positivo para GET
		given().when().get(BASE_URL + "/users/2") // Um usuário existente
				.then().statusCode(200) // Validação de status code
				.header("Content-Type", "application/json; charset=utf-8") // Valida o header Content-Type
				.body("data.id", equalTo(2)) // Validação do corpo
				.body("data.email", equalTo("janet.weaver@reqres.in")); // Verifica o email
	}

	@Test
	public void testGetNonExistentEndpoint() {
		// Teste negativo para GET de um recurso inexistente
		when().get(BASE_URL + "/users/99999") // ID que não existe
				.then().statusCode(404); // Verifica se o status code é 404
	}

	@Test
	public void testPostEndpoint() {
		// Teste positivo para POST
		given().header("Content-Type", "application/json").body("{ \"name\": \"John\", \"job\": \"Developer\" }").when()
				.post(BASE_URL + "/users").then().statusCode(201) // Validação de status code
				.header("Content-Type", "application/json; charset=utf-8") // Validação do header Content-Type
				.body("name", equalTo("John")) // Validação do corpo
				.body("job", equalTo("Developer")); // Validação do corpo
	}

	@Test
	public void testPostInvalidData() {
		// Teste negativo para POST com dados inválidos
		given().header("Content-Type", "application/json").body("invalid json") // JSON Inválido
				.when().post(BASE_URL + "/users").then().statusCode(400) // Espera-se que retorne 400
				.header("Content-Type", "text/html; charset=utf-8"); // Verifica cabeçalho
	}

	@Test
	public void testPutEndpoint() {
		// Teste positivo para PUT
		given().header("Content-Type", "application/json")
				.body("{ \"name\": \"John Updated\", \"job\": \"Senior Developer\" }").when().put(BASE_URL + "/users/2") // Atualiza um usuário existente
				.then().statusCode(200) // Verifica status code
				.header("Content-Type", "application/json; charset=utf-8") // Validação do header Content-Type
				.body("name", equalTo("John Updated")) // Verifica que os dados foram atualizados
				.body("job", equalTo("Senior Developer")); // Verifica que o trabalho foi atualizado
	}

	@Test
	public void testPutInvalidData() {
		// Teste negativo para PUT com dados inválidos
		given().header("Content-Type", "application/json").body("invalid json") // JSON Inválido
				.when().put(BASE_URL + "/users/2").then().statusCode(400) // Espera-se que retorne 400
				.header("Content-Type", "text/html; charset=utf-8"); // Verifica cabeçalho
	}

	@Test
	public void testDeleteEndpoint() {
		// Teste positivo para DELETE
		when().delete(BASE_URL + "/users/2") // Deleta um usuário existente
				.then().statusCode(204); // Verifica se o status code é 204 (No Content)
	}

	@Test
	public void testDeleteNonExistentEndpoint() {
		// Teste negativo para DELETE de um recurso inexistente
		when().delete(BASE_URL) // Deleta um ID que não existe
				.then().statusCode(404) // Verifica se o status code é 404
				.header("Content-Type", "text/html; charset=utf-8"); // Verifica cabeçalho (se aplicável)
	}
}

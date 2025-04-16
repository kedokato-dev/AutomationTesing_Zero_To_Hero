package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Main {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://sinhvienhouapi.onrender.com";


        fetWeekSchedule(fetchSessionId(), "04/21/2025-04/27/2025");


    }

    private static String fetchSessionId() {
        String sessionId = given()
                .header("Content-Type", "application/json")
                .body("{\"username\": \"22a1001d0275\", \"password\": \"quandeptrai19@\"}")
                .when()
                .post("/api/login")
                .then()
                .statusCode(200)
                .extract()
                .path("sessionId"); // Trích xuất sessionId từ phản hồi
        System.out.println("Session ID: " + sessionId);
        return sessionId;
    }

// Mô phỏng dữ liệu phản hồi từ server
// {
//     "success": true,
//     "data": {
//         "name": "Trần Anh Quân",
//         "studentId": ""
//     }
// }

    private static void fetWeekSchedule(String sessionId, String weekValue) {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", sessionId)
                .when()
                .get("/api/week-school-schedule?sessionId=" + sessionId + "&weekValue=" + weekValue);

        String jsonResponse = response.asString();

        // Pretty print the JSON response
        try {
            ObjectMapper mapper = new ObjectMapper();
            Object json = mapper.readValue(jsonResponse, Object.class);
            ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
            String prettyJson = writer.writeValueAsString(json);
            System.out.println(prettyJson);
        } catch (Exception e) {
            System.out.println("Error formatting JSON: " + e.getMessage());
            System.out.println(jsonResponse); // Fallback: Print raw JSON if formatting fails
        }
//                System.out.println(response.asString());
    }
}


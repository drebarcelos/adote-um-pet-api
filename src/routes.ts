import { itsWorks } from "./controllers"
import { getAll } from "@controllers/home"
import { createPet } from "@controllers/pet"

export const defineRoutes = (app) => {
  app.get("/", itsWorks)
  app.get("/all", getAll)

  app.post("/pet", createPet)
}
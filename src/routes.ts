import { itsWorks } from "./controllers"
import { getAll } from "@controllers/home"

export const defineRoutes = (app) => {
  app.get("/", itsWorks)
  app.get("/all", getAll)
}
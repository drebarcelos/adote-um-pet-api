import { getAll, itsWorks } from "./controllers/home"

export const defineRoutes = (app) => {
  app.get("/", itsWorks)
  app.get("/all", getAll)
}
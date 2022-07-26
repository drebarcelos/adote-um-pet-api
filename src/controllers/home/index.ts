export const itsWorks = (request, response) => {
  return response.json({ message: "It's Works!!" })
}

export const getAll = (request, response) => {
  return response.json({ All: [] })
}
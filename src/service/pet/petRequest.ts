
export const petRequest = () => {
  const convertFromHttpBody = (body) => {
    const { name, specie, gender, size, age, coatLength, behavior } = body
    return { name, specie, gender, size, age, coatLength, behavior }
  }

  return{ convertFromHttpBody }
}
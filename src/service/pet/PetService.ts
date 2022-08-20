import { getRepository } from "typeorm"
import { Pet } from "@models/entity/Pet"
import { validate } from "class-validator"
import { HttpError, HttpStatusCode } from "@service/HttpError"

export const PetService = () => {
  const createPetService = async (petRequest: any) => {
    const petRepository = getRepository(Pet)
    const petEntity = petRepository.create(petRequest)
    await validatePet(petEntity)
    const petEntitySaved = await petRepository.save(petEntity)
    return petEntitySaved
  }

  const validatePet = async (pet) => {
    const errors = await validate(pet)

    if(errors.length > 0){
      throw new HttpError(
        "Errors validating the pet:" + errors,
        HttpStatusCode.NOT_FOUND
      ); 
    }
  }
  return { createPetService }
}
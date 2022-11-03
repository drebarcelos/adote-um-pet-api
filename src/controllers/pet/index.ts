import { PetRequest } from "@service/pet/PetRequest";
import { PetService } from "@service/pet/PetService";
import { httpResponseHandler } from "@controllers/HttpResponseHandler";
import { Message } from "@messages/pt-br";
import { getRepository } from "typeorm";
import { Pet } from "@models/entity/Pet";

export const createPet = async (request, response) => {
  try {
    const pet = PetRequest().convertFromHttpBody(request.body)
    const result = await PetService().createPetService(pet)
    return httpResponseHandler().createSuccessResponse(
      Message.SUCCESS,
      result,
      response
    )
  } catch (error) {
    return httpResponseHandler().createErrorResponse(error, response)
  }
}
export const getAllPets = async (request, response) => {
  try {
    const petRepository = getRepository(Pet)
    const pet = await petRepository.find()
    return response.status(200).json(pet)
  } catch (error) {
    return response.status(500).json(error)
  }
}
import { response } from "express";
import { PetRequest } from "@service/pet/PetRequest";
import { PetService } from "@service/pet/PetService";
import { httpResponseHandler } from "@controllers/HttpResponseHandler";
import { Message } from "@messages/pt-br";

export const createPet = (request, response) => {
  try {
    const pet = PetRequest().convertFromHttpBody(request.body)
    const result = PetService().createPetService(pet)
    return httpResponseHandler().createSuccessResponse(
      Message.SUCCESS,
      result,
      response
    )
  } catch (error) {
    return httpResponseHandler().createErrorResponse(error, response)
  }
}
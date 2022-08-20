import { response } from "express";
import { PetRequest } from "@service/pet/petRequest";
import { PetService } from "@service/pet/PetService";
import { httpResponseHandler } from "@controllers/httpResponseHandler";

export const createPet = (request, response) => {
  try {
    const pet = PetRequest().convertFromHttpBody(request.body)
    const result = PetService().createPetService(pet)
  } catch (error) {
    
  }
}
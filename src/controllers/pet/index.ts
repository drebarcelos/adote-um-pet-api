import { response } from "express";
import { petRequest } from "@service/pet/petRequest";

export const createPet = (request, response) => {
  try {
    const pet = petRequest().convertFromHttpBody(request.body)
    
  } catch (error) {
    
  }
}
export enum HttpStatusCode {
  NOT_FOUND = 404,
}

export class HttpError extends Error {
  public readonly msg: string
  public readonly status: HttpStatusCode

  constructor(msg: string, status: HttpStatusCode) {
    super(msg)
    this.msg = msg
    this.status = status
  }
}
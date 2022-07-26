export enum HttpStatusCode {
  OK = 200,
  NOT_FOUND = 404,
  INTERNAL_SERVER = 500,
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
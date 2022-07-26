import { Entity, PrimaryGeneratedColumn, Column } from "typeorm";

@Entity()
export class All {
  @PrimaryGeneratedColumn()
  id: number;

  @Column({ name: 'name', type: 'varchar' })
  name: String;
}
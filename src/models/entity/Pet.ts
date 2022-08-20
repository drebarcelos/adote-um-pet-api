import { Column, Entity, PrimaryGeneratedColumn } from "typeorm";

@Entity()
export class Pet {
  @PrimaryGeneratedColumn()
  id: number

  @Column({ name: 'name', type: 'varchar' })
  name: String

  @Column({ name: 'specie', type: 'varchar' })
  specie: String

  @Column({ name: 'gender', type: 'varchar' })
  gender: String

  @Column({ name: 'size', type: 'varchar' })
  size: String

  @Column({ name: 'age', type: 'varchar' })
  age: String

  @Column({ name: 'coat_length', type: 'varchar' })
  coatLength: String

  @Column({ name: 'behavior', type: 'varchar' })
  behavior: String
}
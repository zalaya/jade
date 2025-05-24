# Persistence ATDD

- Cuando se persiste un nuevo proyecto válido se guarda la hora de creación y se le asigna un id automáticamente.
- Cuando se persiste un nuevo proyecto sin nombre se devuelve un DataIntegrityViolationException.
- Cuando se persiste un nuevo proyecto sin path se devuelve un DataIntegrityViolationException.
- Cuando se actualiza un proyecto ya persistido se actualiza el valor del updatedAt del proyecto.

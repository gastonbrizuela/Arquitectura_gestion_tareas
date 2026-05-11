CREATE TYPE task_status AS ENUM ('TODO', 'IN_PROGRESS', 'DONE');
 
CREATE TABLE tasks (
    id          UUID        PRIMARY KEY DEFAULT gen_random_uuid(),
    name        VARCHAR(100) NOT NULL,
    description TEXT,
    status      task_status  NOT NULL DEFAULT 'TODO',
    owner_id    UUID         NOT NULL,
    created_at  TIMESTAMP    NOT NULL DEFAULT NOW(),
    updated_at  TIMESTAMP    NOT NULL DEFAULT NOW(),
 
    CONSTRAINT fk_tasks_owner
        FOREIGN KEY (owner_id)
        REFERENCES users (id)
        ON DELETE CASCADE
);
 
-- Índice para traer rápido todas las tareas de un usuario
CREATE INDEX idx_tasks_owner_id ON tasks (owner_id);

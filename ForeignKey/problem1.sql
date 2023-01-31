CREATE TABLE post (
    id SERIAL PRIMARY KEY,
    post VARCHAR(255),
    user_fk int,
    FOREIGN KEY (user_fk) REFERENCES site_user(id)
);
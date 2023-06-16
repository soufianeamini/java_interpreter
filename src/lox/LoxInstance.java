package lox;

import java.util.HashMap;
import java.util.Map;

public class LoxInstance {
    private LoxClass classe;
    private final Map<String, Object> fields = new HashMap<>();

    LoxInstance(LoxClass classe) {
        this.classe = classe;
    }

    Object get(Token name) {
        if (fields.containsKey(name.lexeme)) {
            return fields.get(name.lexeme);
        }

        throw new RuntimeError(name,
                "Undefined property '" + name.lexeme + "'.");
    }

    void set(Token name, Object value) {
        fields.put(name.lexeme, value);
    }

    @Override
    public String toString() {
        return classe.name + " instance";
    }
}

package org.example._2024_01_16;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrettyPrinter {
/*    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final Map<Class<?>, MyFunction<Object, int[], String>> handlers = new HashMap<>();

    static {
        handlers.put(List.class, (o, pad) -> iterWithList(((List<?>) o).toArray(), pad));
        handlers.put(Map.class, (o, pad) -> iterWithMap((Map<?, ?>) o, pad));
        handlers.put(String[].class, (o, pad) -> iterWithList((Object[]) o, pad));
        handlers.put(CharSequence.class, (o, pad) -> {
            int p = check(pad);
            return " ".repeat(p) + o;
        });
        handlers.put(Number.class, (o, pad) -> {
            int p = check(pad);
            return " ".repeat(p) + o;
        });
    }
    private PrettyPrinter() {
    }

    private static int check(int... pad) {
        if (pad.length == 1) {
            return pad[0];
        }
        return 0;
    }

    public static String getPrettyString(Object o, int... pad) {
        return handlers.getOrDefault(o.getClass(), PrettyPrinter::iterWithObject).apply(o, pad);
    }

    public static String pprint(Object o, int... pad) {
        if (o instanceof List<?>) {
            return iterWithList(((List<?>) o).toArray(), pad);
        } else if (o instanceof Map<?, ?>) {
            return iterWithMap((Map<?, ?>) o, pad);
        } else if (o instanceof Object[]) {
            return iterWithList((Object[]) o, pad);
        } else if (o instanceof CharSequence || o instanceof Number) {
            int p = check(pad);
            return " ".repeat(p) + o;
        } else {
            return iterWithObject(o, pad);
        }
    }*/

/*    public static String pprint(List<?> list, int... pad) {
        return iterWithList(list.toArray(), pad);
    }

    public static String pprint(Map<?, ?> map, int... pad) {
        return iterWithMap(map, pad);
    }

    public static String pprint(Number number, int... pad) {
        int p = check(pad);
        return " ".repeat(p) + number;
    }

    public static String pprint(CharSequence charSequence, int... pad) {
        int p = check(pad);
        return " ".repeat(p) + charSequence;
    }*/

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private PrettyPrinter() {
    }

    private static int check(int... pad) {
        if (pad.length == 1) {
            return pad[0];
        }
        return 0;
    }

    public static String pprint(Object o, int... pad) {
/*        return switch (o) {
            case List<?> list -> iterWithList(list.toArray(), pad);
            case Map<?, ?> map -> iterWithMap(map, pad);
            case Object[] objects -> iterWithList(objects, pad);
            case CharSequence charSequence -> {
                int p = check(pad);
                yield " ".repeat(p) + charSequence;
            }
            case Number number -> {
                int p = check(pad);
                yield " ".repeat(p) + number;
            }
            default -> iterWithObject(o, pad);
        };*/

/*        if (o instanceof List<?>) {
            return iterWithList(((List<?>) o).toArray(), pad);
        } else if (o instanceof Map<?, ?>) {
            return iterWithMap((Map<?, ?>) o, pad);
        } else if (o instanceof Object[]) {
            return iterWithList((Object[]) o, pad);
        } else if (o instanceof CharSequence || o instanceof Number) {
            int p = check(pad);
            return " ".repeat(p) + o;
        } else {
            return iterWithObject(o, pad);
        }*/
        return "2";
    }

    private static String iterWithList(Object[] a, int... p) {

        int pad = check(p);

        StringBuilder sb = new StringBuilder();

        sb.append(" ".repeat(pad)).append("[");
        for (Object o : a) {
            sb.append("\n").append(pprint(o, pad + 1));
        }

        sb.append("\n").append(" ".repeat(pad)).append("]");

        return sb.toString();
    }

    private static String iterWithMap(Map<?, ?> m, int... p) {

        int pad = check(p);

        StringBuilder sb = new StringBuilder();

        int max = m.keySet().stream()
                .map(Object::toString)
                .mapToInt(String::length)
                .max()
                .orElse(0);

        sb.append(" ".repeat(pad)).append("{");

        for (Object o : m.keySet()) {
            sb.append("\n").append(" ".repeat(pad + 1));
            sb.append(o).append(" ".repeat(max - o.toString().length())).append(" :\n");

            sb.append(pprint(m.get(o), pad + max+3));
        }
        sb.append("\n").append(" ".repeat(pad)).append("}");

        return sb.toString();
    }

    private static String iterWithObject(Object o, int... p) {


        Map<String, Object> json = objectMapper.convertValue(o, new TypeReference<>() {
        });

        return iterWithMap(json, p);

    }
}

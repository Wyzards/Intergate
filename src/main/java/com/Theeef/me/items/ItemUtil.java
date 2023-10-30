package com.Theeef.me.items;

import com.google.common.collect.Lists;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemUtil {

    private final static int MAX_CHARACTERS = 30;

    public static List<String> splitString(String msg, int lineSize) {
        List<String> res = new ArrayList<String>();

        Pattern p = Pattern.compile("&*\\b.{1," + (lineSize - 1) + "}\\b\\W?");
        Matcher m = p.matcher(msg);

        while (m.find()) {
            res.add(m.group());
        }

        return res;
    }

    public static List<TextComponent> splitComponent(TextComponent toSplit, int lineSize) {
        List<TextComponent> list = new ArrayList<>();
        List<TextComponent> words = new ArrayList<>();
        List<TextComponent> components = Lists.newArrayList(toSplit);
        components.addAll(toSplit.children().stream().map(child -> (TextComponent) child).toList());

        for (TextComponent component : components)
            for (String word : component.content().split(" "))
                words.add(Component.text(word).style(component.style()));

        TextComponent.Builder builder = null;

        for (TextComponent word : words) {
            if (builder == null)
                builder = word.toBuilder();
            else if (PlainTextComponentSerializer.plainText().serialize(builder.build()).length() + 1 + word.content().length() < lineSize) {
                builder.append(Component.text(" ")).append(word);
            } else {
                list.add(builder.build());
                builder = word.toBuilder();
            }
        }

        if (builder != null) list.add(builder.build());

        return list;
    }


}

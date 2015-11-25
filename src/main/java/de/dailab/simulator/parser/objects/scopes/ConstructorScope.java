package de.dailab.simulator.parser.objects.scopes;

import de.dailab.simulator.parser.objects.statements.Statement;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @since 12.05.2015
 * @author Timo Hanisch / timohanisch@gmail.com
 */
public class ConstructorScope extends Scope {

    private String path;
    private Scope preBlock;
    private Scope doBlock;

    public ConstructorScope(Scope parentScope) {
        super(parentScope);
    }

    private void initStandardScopeVars() {
        setVarValue("index", "0");
    }

    @Override
    public boolean execute() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
            initStandardScopeVars();
            for (Statement stmt : getStatementList()) {
                if (!stmt.execute(this)) {
                    throw new RuntimeException("An error occurred");
                }
            }
            executeBlock(lines, preBlock);
            initStandardScopeVars();
            executeBlock(lines, doBlock);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private void executeBlock(List<String> lines, Scope scope) {
        lines.forEach(line -> {
            setVarValue("input", line);
            scope.resetVars();
            if (!scope.execute()) {
                throw new RuntimeException("An error occurred");
            }
        });
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setPreBlock(Scope preBlock) {
        this.preBlock = preBlock;
    }

    public void setDoBlock(Scope doBlock) {
        this.doBlock = doBlock;
    }
}

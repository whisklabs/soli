package com.whisk.soli.analysis.common.de;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.IOException;
import java.util.Arrays;

public class GermanDecompounderTest {

    @Test
    public void basicTest() throws IOException {
        Decompounder d = Decompounder.defaultInstance();
        assertThat(d.decompound("Räucherlachs"), is(Arrays.asList("Rauch", "lachs")));
        assertThat(d.decompound("Schwarzwurzelbrühe"), is(Arrays.asList("Schwarz", "wurzel", "brühe")));
    }
}

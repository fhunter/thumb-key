package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.KeyboardBackspace
import androidx.compose.material.icons.outlined.KeyboardReturn
import androidx.compose.material.icons.outlined.Numbers
import androidx.compose.material.icons.outlined.Settings
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection

val thumbkeyV4Keyboard = KeyboardC(
    arrayOf(
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("s"),
                    action = KeyAction.CommitText("s"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("w"),
                        action = KeyAction.CommitText("w")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("r"),
                    action = KeyAction.CommitText("r"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("g"),
                        action = KeyAction.CommitText("g")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("o"),
                    action = KeyAction.CommitText("o"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("u"),
                        action = KeyAction.CommitText("u")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                    action = KeyAction.GotoSettings,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("n"),
                    action = KeyAction.CommitText("n"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("m"),
                        action = KeyAction.CommitText("m")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("h"),
                    action = KeyAction.CommitText("h"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("j"),
                        action = KeyAction.CommitText("j")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("q"),
                        action = KeyAction.CommitText("q")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("b"),
                        action = KeyAction.CommitText("b")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("p"),
                        action = KeyAction.CommitText("p")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("y"),
                        action = KeyAction.CommitText("y")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("x"),
                        action = KeyAction.CommitText("x")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("v"),
                        action = KeyAction.CommitText("v")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("k"),
                        action = KeyAction.CommitText("k")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("a"),
                    action = KeyAction.CommitText("a"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("l"),
                        action = KeyAction.CommitText("l")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = KeyAction.ToggleShiftMode(true),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
                    action = KeyAction.ToggleNumericMode(true),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("t"),
                    action = KeyAction.CommitText("t"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("c"),
                        action = KeyAction.CommitText("c")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("i"),
                    action = KeyAction.CommitText("i"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("f"),
                        action = KeyAction.CommitText("f")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("z"),
                        action = KeyAction.CommitText("z")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("e"),
                    action = KeyAction.CommitText("e"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("d"),
                        action = KeyAction.CommitText("d")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
                    action = KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent
                                .KEYCODE_DEL
                        )
                    ),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    )
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" ")
                ),
                nextTapActions = arrayOf(
                    KeyAction.ReplaceLastText(". ", trimCount = 1),
                    KeyAction.ReplaceLastText(", "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": ")
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
                widthMultiplier = 3
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardReturn),
                    action = KeyAction.IMECompleteAction,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        )
    )
)

val thumbkeyV4KeyboardShifted = KeyboardC(
    arrayOf(
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("S"),
                    action = KeyAction.CommitText("S"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("W"),
                        action = KeyAction.CommitText("W")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("R"),
                    action = KeyAction.CommitText("R"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("G"),
                        action = KeyAction.CommitText("G")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("O"),
                    action = KeyAction.CommitText("O"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("U"),
                        action = KeyAction.CommitText("U")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                    action = KeyAction.GotoSettings,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("N"),
                    action = KeyAction.CommitText("N"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("M"),
                        action = KeyAction.CommitText("M")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("H"),
                    action = KeyAction.CommitText("H"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("J"),
                        action = KeyAction.CommitText("J")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Q"),
                        action = KeyAction.CommitText("Q")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("B"),
                        action = KeyAction.CommitText("B")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("P"),
                        action = KeyAction.CommitText("P")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Y"),
                        action = KeyAction.CommitText("Y")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("X"),
                        action = KeyAction.CommitText("X")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("V"),
                        action = KeyAction.CommitText("V")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("K"),
                        action = KeyAction.CommitText("K")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("A"),
                    action = KeyAction.CommitText("A"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("L"),
                        action = KeyAction.CommitText("L")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                        action = KeyAction.ToggleShiftMode(false),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
                    action = KeyAction.ToggleNumericMode(true),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("T"),
                    action = KeyAction.CommitText("T"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("C"),
                        action = KeyAction.CommitText("C")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("I"),
                    action = KeyAction.CommitText("I"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("F"),
                        action = KeyAction.CommitText("F")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Z"),
                        action = KeyAction.CommitText("Z")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-"),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText("."),
                        color = ColorVariant.MUTED
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(","),
                        color = ColorVariant.MUTED
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("E"),
                    action = KeyAction.CommitText("E"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("D"),
                        action = KeyAction.CommitText("D")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
                    action = KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent
                                .KEYCODE_DEL
                        )
                    ),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    )
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" ")
                ),
                nextTapActions = arrayOf(
                    KeyAction.ReplaceLastText(". ", trimCount = 1),
                    KeyAction.ReplaceLastText(", "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": ")
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT,
                widthMultiplier = 3
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardReturn),
                    action = KeyAction.IMECompleteAction,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.SECONDARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        )
    )
)

val THUMBKEY_V4_KEYBOARD_MODES: Map<KeyboardMode, KeyboardC> = mapOf(
    KeyboardMode.MAIN to thumbkeyV4Keyboard,
    KeyboardMode.SHIFTED to thumbkeyV4KeyboardShifted,
    KeyboardMode.NUMERIC to numericKeyboard
)

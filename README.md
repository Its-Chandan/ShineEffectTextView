# ShineEffectTextView

A simple yet effective Android library to add a shimmering effect to your TextViews.

## Installation

Add the JitPack repository to your root `build.gradle` or `settings.gradle`:

```gradle
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency:

```gradle
dependencies {
    implementation 'com.github.Its-Chandan:ShineEffectTextView:1.0.0'
}
```

## Usage

### XML Implementation

```xml
<com.chandan.shineeffecttextview.ShineEffectTextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Shimmering Text"
    android:textSize="24sp"
    app:shine_base_color="#D3D3D3"
    app:shine_highlight_color="#FFFFFF"
    app:shine_duration="1500"
    app:shine_auto_start="true" />
```

### Attributes

| Attribute | Format | Description |
|-----------|--------|-------------|
| `shine_auto_start` | boolean | Whether to start shimmer automatically. |
| `shine_base_color` | color | The base color of the text. |
| `shine_highlight_color` | color | The color of the shimmer highlight. |
| `shine_base_alpha` | float | Alpha value for the base color (0.0 to 1.0). |
| `shine_highlight_alpha` | float | Alpha value for the highlight (0.0 to 1.0). |
| `shine_duration` | integer | Duration of one shimmer cycle in ms. |
| `shine_repeat_count` | integer | Number of times to repeat (-1 for infinite). |
| `shine_repeat_delay` | integer | Delay between repeats in ms. |
| `shine_repeat_mode` | enum | `restart` or `reverse`. |
| `shine_start_delay` | integer | Delay before starting the first shimmer in ms. |
| `shine_direction` | enum | `left_to_right`, `top_to_bottom`, `right_to_left`, `bottom_to_top`. |
| `shine_dropoff` | float | Controls how quickly the shimmer fades out. |
| `shine_intensity` | float | Intensity of the shimmer effect. |
| `shine_tilt` | float | Angle of the shimmer in degrees. |
| `shine_shape` | enum | `linear` or `radial`. |
| `shine_colored` | boolean | Set to true if using color-based shimmer. |

## Sample App

You can find a sample application in the `app` module of this repository.

## License

MIT License

Copyright (c) 2026 Chandan

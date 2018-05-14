### Thee4g

## A Three.js wrapper for GWT

# Maven (not yet)
Current Version 0.1, implements 0.91 version of three.js

<dependency>
    <groupId>org.treblereel.gwt</groupId>
    <artifactId>three4g</artifactId>
    <version>0.1</version>
</dependency>

Snapshot Version 0.1-SNAPSHOT

<dependency>
    <groupId>org.treblereel.gwt</groupId>
    <artifactId>three4g</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>

# Setup
all you need to do is add
<inherits name="org.treblereel.gwt.Three4G"/>

to our gwt project module, or   
<inherits name="org.treblereel.gwt.Three4GMin"/>

for min version.


# Code example

```java
PerspectiveCamera  camera = new PerspectiveCamera( 70, aspect, 1, 1000 );
camera.position.z = 400;

Scene  scene = new Scene();

Texture texture = new TextureLoader().load( "https://threejs.org/examples/textures/crate.gif");

BoxBufferGeometry geometry = new BoxBufferGeometry( 200, 200, 200 );

MeshBasicMaterialParameters meshBasicMaterialParameters = new MeshBasicMaterialParameters();
meshBasicMaterialParameters.map = texture;

MeshBasicMaterial material = new MeshBasicMaterial(meshBasicMaterialParameters);

Mesh  mesh = new Mesh(geometry, material);

scene.add(mesh);

WebGLRenderer  webGLRenderer = new WebGLRenderer();
```
Like we do in Java world and pretty close to javascript original.




# License
GNU General Public License v2.0

# Contributing
Pull Requests are welcome by all.

## feel free to contact me anytime 

This README file contains information on the contents of the meta-bsm layer.

Please see the corresponding sections below for details.

Note: This repo is intended to work with the Colibri iMX8X chipset using the Dunfell 5.x.y BSP files. 
[Please see this Toradex wiki stub to get started with the correct BSP files](https://developer.toradex.com/linux-bsp/os-development/build-yocto/build-a-reference-image-with-yocto-projectopenembedded).
If a link references kirkstone-6.x.y, replace with dunfell-5.x.y.

Dependencies
============

  URI: meta-clang
  branch: dunfell-clang12

  URI: meta-browser
  branch: master

  .
  .
  .

Patches
=======

Please submit any patches against the meta-bsm layer to the xxxx mailing list (xxxx@zzzz.org)
and cc: the maintainer:

Maintainer: XXX YYYYYY <xxx.yyyyyy@zzzzz.com>

Table of Contents
=================

  I. Adding the meta-bsm layer to your build
 II. Misc


I. Adding the meta-bsm layer to your build
=================================================

1. After setting up the oe-core/ directory with Dunfell tooling (see Toradex link above), goto the `oe-core/` 
directory and type `.export`. This will setup the shell environment for `bitbake`.
2. Modify `oe-core/build/conf/local.conf`. Pick the correct `MACHINE` and add the `ACCEPT_FSL_EULA = "1"`. See [here](https://developer.toradex.com/linux-bsp/os-development/build-yocto/build-a-reference-image-with-yocto-projectopenembedded) for more info.
3. In `oe-core/layers/` clone:
  - meta-clang: Make sure to then switch to the dunfell-clang12 branch
  - meta-browser: Master should work
4. Open up `oe-core/layers/meta-browser/meta-chromium/recipes-browser/chromium/chromium-ozone-wayland*.inc` in a text editor
5. At the end of the file, add `CXXFLAGS += "-D__GBM__"` ([see thread to follow bug](https://github.com/OSSystems/meta-browser/issues/649))
6. Edit `oe-core/build/conf/bblayers.conf`:
  - Add `meta-browser/meta-chromium`
  - Add `meta-bsm`
  - Add `meta-clang`
  *Note* - Use the other examples in the file as a template to adding this. `meta-bsm` might look something along like `${DIR}/layers/meta-bsm \`
7. run `bitbake bsm`. This may take a lot of memory, consider using `PARALLEL_MAKE="-j 4" BB_NUMBER_THREADS="6" bitbake bsm` and replace 4 and 6 
as needed.
8. Wait
9. Keep waiting
10. Hopefully no errors. Since this is Toradex, transfer the `oe-core/build/deploy/images/colibri-imx8x/` *tezi*.tar.xz to a USB drive. 
11. Reset the Toradex, plug in the USB, and flash the image. See [here](https://developer.toradex.com/easy-installer/toradex-easy-installer/loading-toradex-easy-installer) for more info.

II. Misc
========

--- replace with specific information about the meta-bsm layer ---

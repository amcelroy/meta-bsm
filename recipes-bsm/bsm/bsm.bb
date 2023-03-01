require tdx-reference-minimal-image.bb

SUMMARY = "BSM Image"
DESCRIPTION = "Minimal BSM Wayland Image"

#Prefix to the resulting deployable tarball name
export IMAGE_BASENAME = "Reference-Multimedia-Image"

SYSTEMD_DEFAULT_TARGET = "graphical.target"

IMAGE_INSTALL += " \
    wayland \
    weston \
    packagegroup-tdx-cli \
    packagegroup-tdx-graphical \
    packagegroup-fsl-isp \
    \
    bash \
    coreutils \
    less \
    makedevs \
    mime-support \
    net-tools \
    util-linux \
    v4l-utils \
    \
    gpicview \
    media-files \
    chromium-ozone-wayland \
"

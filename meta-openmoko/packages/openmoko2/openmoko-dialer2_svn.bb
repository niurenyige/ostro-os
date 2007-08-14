require openmoko.inc

DESCRIPTION = "The OpenMoko Dialer"
DEPENDS += "libmokogsmd2 libmokoui2 libmokojournal2 gstreamer"
RDEPENDS = "gst-meta-audio"
REAL_PN = "openmoko-dialer2"
PR = "r2"

EXTRA_OECONF = "--with-dbusbindir=${STAGING_BINDIR_NATIVE}"

FILES_${PN} += "${datadir}/openmoko-dialer/ ${datadir}/dbus-1/services/"

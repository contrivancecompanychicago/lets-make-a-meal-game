{ pkgs }: {
	deps = [
   pkgs.postgresql
   pkgs.tk
   pkgs.tcl
   pkgs.qhull
   pkgs.gtk3
   pkgs.gobject-introspection
   pkgs.ghostscript
   pkgs.ffmpeg-full
   pkgs.cairo
   pkgs.portmidi
   pkgs.pkg-config
   pkgs.libpng
   pkgs.libjpeg
   pkgs.freetype
   pkgs.fontconfig
   pkgs.SDL2_ttf
   pkgs.SDL2_mixer
   pkgs.SDL2_image
   pkgs.SDL2
		pkgs.python38Packages.black
  pkgs.python38Full
	];
  env = {
    PYTHONBIN = "${pkgs.python38Full}/bin/python3.8";
  };
}
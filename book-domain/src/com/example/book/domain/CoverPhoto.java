package com.example.book.domain;

import java.util.Base64;
import java.util.Objects;

public class CoverPhoto {

	private final byte[] coverPhoto;

	public CoverPhoto(byte[] coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public byte[] getCoverPhoto() {
		return coverPhoto;
	}

	public static CoverPhoto valueOf(byte[] coverPhoto) {
		Objects.requireNonNull(coverPhoto);
		return new CoverPhoto(coverPhoto);
	}

	public static CoverPhoto valueOf(String coverPhoto) {
		Objects.requireNonNull(coverPhoto);
		return new CoverPhoto(Base64.getDecoder().decode(coverPhoto));
	}

	public String getBase64Values() {
		return String.valueOf(Base64.getEncoder().encode(coverPhoto));
	}

}

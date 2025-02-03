package com.example.samuraitravel.form;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ReservationInputForm {
	@NotNull(message = "チェックイン日を選択してください。")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate checkinDate;

	@NotNull(message = "チェックアウト日を選択してください。")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate checkoutDate;

	@NotNull(message = "宿泊人数を入力してください。")
	@Min(value = 1, message = "宿泊人数は1人以上に設定してください。")
	private Integer numberOfPeople;

	// 画面エラーが出たため、追記した0128
	public LocalDate getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(LocalDate checkinDate) {
		this.checkinDate = checkinDate;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

    // 新しいメソッドの追加 0129
    public String getFromCheckinDateToCheckoutDate() {
        if (checkinDate != null && checkoutDate != null) {
            return checkinDate.toString() + " から " + checkoutDate.toString();
        }
        return "";
    }
}
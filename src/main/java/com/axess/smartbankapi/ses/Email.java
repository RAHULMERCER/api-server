package com.axess.smartbankapi.ses;

import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Email {

  String from;

  String to;

  String subject;

  String body;
}

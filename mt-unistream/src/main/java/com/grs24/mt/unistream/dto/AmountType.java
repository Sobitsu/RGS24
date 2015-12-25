package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public enum AmountType 
{
	/** Основная сумма и валюта перевода */
	Main,
	
	/** Фактически внесённая отправителем cумма и валюта (без комиссии) */
	ActualPaid,
	
	/** Предполагаемая сумма и валюта выдачи перевода */
	EstimatedPaidout,
	
	/** Фактически выплаченная сумма и валюта перевода */
	ActualPaidout,
	
	/** Сумма комиссий */
	PrimaryPaidComission
}

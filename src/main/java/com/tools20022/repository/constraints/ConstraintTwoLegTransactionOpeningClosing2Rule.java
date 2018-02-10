/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * For settlement of two parts transactions (buy-sell back, sell buy-back,
 * collateral in and out), the opening/initiation and closing/return of the
 * transaction is alleged by sending the below combination of
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
 * SettlementParameters/SecuritiesTransactionType codes:<br>
 * <br>
 * Sell-Buy Back: Sell<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
 * Sell-Buy Back: Buy Back<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
 * <br>
 * Buy-Sell Back: Buy<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
 * Buy-Sell Back: Sell Back<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
 * <br>
 * Collateral (giver) Out Initiation<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
 * Collateral (giver) Out Return<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
 * <br>
 * Collateral (taker) In Initiation<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
 * Collateral (taker) In Return<br>
 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
 */
public class ConstraintTwoLegTransactionOpeningClosing2Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07
	 * SecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07> forSecuritiesSettlementTransactionAllegementNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotificationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionAllegementNotificationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08
	 * SecuritiesSettlementTransactionConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV07
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> forSecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV07;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08
	 * SecuritiesSettlementTransactionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> forSecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstructionV07;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV06
	 * SecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionAllegementNotificationV07
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06> forSecuritiesSettlementTransactionAllegementNotificationV06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotificationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionAllegementNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionAllegementNotificationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07
	 * SecuritiesSettlementTransactionConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV08
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV06
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV07> forSecuritiesSettlementTransactionConfirmationV07 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV07
	 * SecuritiesSettlementTransactionInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstructionV08
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> forSecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06
	 * SecuritiesSettlementTransactionAllegementNotification002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06> forSecuritiesSettlementTransactionAllegementNotification002V06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotification002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07
	 * SecuritiesSettlementTransactionInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> forSecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07
	 * SecuritiesSettlementTransactionConfirmation002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V07> forSecuritiesSettlementTransactionConfirmation002V07 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V07>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmation002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01
	 * SecuritiesSettlementTransactionConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> forSecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV02
	 * SecuritiesSettlementTransactionConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> forSecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV03
	 * SecuritiesSettlementTransactionConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> forSecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV04
	 * SecuritiesSettlementTransactionConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> forSecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01
	 * SecuritiesSettlementTransactionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> forSecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV02
	 * SecuritiesSettlementTransactionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> forSecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV03
	 * SecuritiesSettlementTransactionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> forSecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV04
	 * SecuritiesSettlementTransactionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> forSecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01
	 * SecuritiesSettlementTransactionAllegementNotificationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01> forSecuritiesSettlementTransactionAllegementNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotificationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02
	 * SecuritiesSettlementTransactionAllegementNotificationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02> forSecuritiesSettlementTransactionAllegementNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotificationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03
	 * SecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03> forSecuritiesSettlementTransactionAllegementNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotificationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionAllegementNotificationV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04
	 * SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionAllegementNotificationV03
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04> forSecuritiesSettlementTransactionAllegementNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotificationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionAllegementNotificationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionAllegementNotificationV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV05
	 * SecuritiesSettlementTransactionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstructionV06
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstructionV04
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> forSecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV05
	 * SecuritiesSettlementTransactionConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV06
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV04
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> forSecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV06
	 * SecuritiesSettlementTransactionInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstructionV07
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionInstructionV05
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> forSecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionInstructionV05;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06
	 * SecuritiesSettlementTransactionConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV07
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionConfirmationV05
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV06> forSecuritiesSettlementTransactionConfirmationV06 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionConfirmationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV05
	 * SecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05> forSecuritiesSettlementTransactionAllegementNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotificationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionAllegementNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesSettlementTransactionAllegementNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V05
	 * SecuritiesSettlementTransactionAllegementNotification002V05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05> forSecuritiesSettlementTransactionAllegementNotification002V05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionAllegementNotification002V05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06
	 * SecuritiesSettlementTransactionConfirmation002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V06> forSecuritiesSettlementTransactionConfirmation002V06 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionConfirmation002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06
	 * SecuritiesSettlementTransactionInstruction002V06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> forSecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesSettlementTransactionInstruction002V06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5
	 * TransactionDetails5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails5> forTransactionDetails5 = new MMConstraint<TransactionDetails5>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9
	 * TransactionDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails9> forTransactionDetails9 = new MMConstraint<TransactionDetails9>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22
	 * TransactionDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails22> forTransactionDetails22 = new MMConstraint<TransactionDetails22>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23
	 * TransactionDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails23> forTransactionDetails23 = new MMConstraint<TransactionDetails23>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36
	 * TransactionDetails36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails36> forTransactionDetails36 = new MMConstraint<TransactionDetails36>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47
	 * TransactionDetails47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails47> forTransactionDetails47 = new MMConstraint<TransactionDetails47>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails47.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53
	 * TransactionDetails53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails61
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails61}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails53> forTransactionDetails53 = new MMConstraint<TransactionDetails53>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails61);
			owner_lazy = () -> TransactionDetails53.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58
	 * TransactionDetails58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails58> forTransactionDetails58 = new MMConstraint<TransactionDetails58>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails58;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails58.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails7
	 * TransactionDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails7> forTransactionDetails7 = new MMConstraint<TransactionDetails7>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails16
	 * TransactionDetails16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails16> forTransactionDetails16 = new MMConstraint<TransactionDetails16>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26
	 * TransactionDetails26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails26> forTransactionDetails26 = new MMConstraint<TransactionDetails26>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails27
	 * TransactionDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails27> forTransactionDetails27 = new MMConstraint<TransactionDetails27>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails39
	 * TransactionDetails39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails39> forTransactionDetails39 = new MMConstraint<TransactionDetails39>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails39.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails50
	 * TransactionDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails50> forTransactionDetails50 = new MMConstraint<TransactionDetails50>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails56
	 * TransactionDetails56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails62
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails56> forTransactionDetails56 = new MMConstraint<TransactionDetails56>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails62);
			owner_lazy = () -> TransactionDetails56.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails59
	 * TransactionDetails59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails59> forTransactionDetails59 = new MMConstraint<TransactionDetails59>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails59.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails6
	 * TransactionDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails6> forTransactionDetails6 = new MMConstraint<TransactionDetails6>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails18
	 * TransactionDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails18> forTransactionDetails18 = new MMConstraint<TransactionDetails18>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails24
	 * TransactionDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails24> forTransactionDetails24 = new MMConstraint<TransactionDetails24>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails34
	 * TransactionDetails34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails34> forTransactionDetails34 = new MMConstraint<TransactionDetails34>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails34.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails37
	 * TransactionDetails37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails37> forTransactionDetails37 = new MMConstraint<TransactionDetails37>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails48
	 * TransactionDetails48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails48> forTransactionDetails48 = new MMConstraint<TransactionDetails48>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails48;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails48.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails57
	 * TransactionDetails57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails63
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails63}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails57> forTransactionDetails57 = new MMConstraint<TransactionDetails57>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails63);
			owner_lazy = () -> TransactionDetails57.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails60
	 * TransactionDetails60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails60> forTransactionDetails60 = new MMConstraint<TransactionDetails60>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails60.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4
	 * SecuritiesTradeDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails4> forSecuritiesTradeDetails4 = new MMConstraint<SecuritiesTradeDetails4>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17
	 * SecuritiesTradeDetails17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails17> forSecuritiesTradeDetails17 = new MMConstraint<SecuritiesTradeDetails17>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10
	 * SecuritiesTradeDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails10> forSecuritiesTradeDetails10 = new MMConstraint<SecuritiesTradeDetails10>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22
	 * SecuritiesTradeDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails22> forSecuritiesTradeDetails22 = new MMConstraint<SecuritiesTradeDetails22>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23
	 * SecuritiesTradeDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesTradeDetails35
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesTradeDetails35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails23> forSecuritiesTradeDetails23 = new MMConstraint<SecuritiesTradeDetails23>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesTradeDetails35);
			owner_lazy = () -> SecuritiesTradeDetails23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29
	 * SecuritiesTradeDetails29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails29> forSecuritiesTradeDetails29 = new MMConstraint<SecuritiesTradeDetails29>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails51
	 * TransactionDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails93
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails93}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails51> forTransactionDetails51 = new MMConstraint<TransactionDetails51>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails93);
			owner_lazy = () -> TransactionDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61
	 * TransactionDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails70
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails70}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails53
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails53}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails61> forTransactionDetails61 = new MMConstraint<TransactionDetails61>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails53;
			owner_lazy = () -> TransactionDetails61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails62
	 * TransactionDetails62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails69
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails69}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails56
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails56}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails62> forTransactionDetails62 = new MMConstraint<TransactionDetails62>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails56;
			owner_lazy = () -> TransactionDetails62.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails63
	 * TransactionDetails63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails78
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails78}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails57
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails57}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails63> forTransactionDetails63 = new MMConstraint<TransactionDetails63>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails78);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails57;
			owner_lazy = () -> TransactionDetails63.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35
	 * SecuritiesTradeDetails35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesTradeDetails49
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesTradeDetails49}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesTradeDetails23
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesTradeDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails35> forSecuritiesTradeDetails35 = new MMConstraint<SecuritiesTradeDetails35>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesTradeDetails49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesTradeDetails23;
			owner_lazy = () -> SecuritiesTradeDetails35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66
	 * TransactionDetails66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails66> forTransactionDetails66 = new MMConstraint<TransactionDetails66>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails66.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42
	 * SecuritiesTradeDetails42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails42> forSecuritiesTradeDetails42 = new MMConstraint<SecuritiesTradeDetails42>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails42.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails67
	 * TransactionDetails67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails67> forTransactionDetails67 = new MMConstraint<TransactionDetails67>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails67;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails67.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails68
	 * TransactionDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails68> forTransactionDetails68 = new MMConstraint<TransactionDetails68>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70
	 * TransactionDetails70}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails79
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails79}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails61
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails70> forTransactionDetails70 = new MMConstraint<TransactionDetails70>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails70;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails79);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails61;
			owner_lazy = () -> TransactionDetails70.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails69
	 * TransactionDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails75
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails75}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails62
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails69> forTransactionDetails69 = new MMConstraint<TransactionDetails69>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails75);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails62;
			owner_lazy = () -> TransactionDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71
	 * TransactionDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails71> forTransactionDetails71 = new MMConstraint<TransactionDetails71>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails72
	 * TransactionDetails72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails72> forTransactionDetails72 = new MMConstraint<TransactionDetails72>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails72;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails72.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49
	 * SecuritiesTradeDetails49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesTradeDetails68
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesTradeDetails68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesTradeDetails35
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesTradeDetails35}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails49> forSecuritiesTradeDetails49 = new MMConstraint<SecuritiesTradeDetails49>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesTradeDetails68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesTradeDetails35;
			owner_lazy = () -> SecuritiesTradeDetails49.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79
	 * TransactionDetails79}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails97
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails97}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails70
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails70}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails79> forTransactionDetails79 = new MMConstraint<TransactionDetails79>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails79;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails97);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails70;
			owner_lazy = () -> TransactionDetails79.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails75
	 * TransactionDetails75}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails96
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails96}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails69
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails69}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails75> forTransactionDetails75 = new MMConstraint<TransactionDetails75>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails75;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails69;
			owner_lazy = () -> TransactionDetails75.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails78
	 * TransactionDetails78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails95
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails95}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails63
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails63}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails78> forTransactionDetails78 = new MMConstraint<TransactionDetails78>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails78;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails95);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails63;
			owner_lazy = () -> TransactionDetails78.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61
	 * SecuritiesTradeDetails61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails61> forSecuritiesTradeDetails61 = new MMConstraint<SecuritiesTradeDetails61>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails61.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87
	 * TransactionDetails87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails87> forTransactionDetails87 = new MMConstraint<TransactionDetails87>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails87;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails87.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails91
	 * TransactionDetails91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails91> forTransactionDetails91 = new MMConstraint<TransactionDetails91>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails91;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails91.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails90
	 * TransactionDetails90}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails90> forTransactionDetails90 = new MMConstraint<TransactionDetails90>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails90;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails90.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails93
	 * TransactionDetails93}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails102
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails102}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails51
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails93> forTransactionDetails93 = new MMConstraint<TransactionDetails93>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails93;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails102);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails51;
			owner_lazy = () -> TransactionDetails93.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68
	 * SecuritiesTradeDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesTradeDetails71
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesTradeDetails71}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesTradeDetails49
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesTradeDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails68> forSecuritiesTradeDetails68 = new MMConstraint<SecuritiesTradeDetails68>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesTradeDetails71);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesTradeDetails49;
			owner_lazy = () -> SecuritiesTradeDetails68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97
	 * TransactionDetails97}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails105
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails105}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails79
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails79}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails97> forTransactionDetails97 = new MMConstraint<TransactionDetails97>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails97;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails105);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails79;
			owner_lazy = () -> TransactionDetails97.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails96
	 * TransactionDetails96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails104
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails104}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails75
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails75}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails96> forTransactionDetails96 = new MMConstraint<TransactionDetails96>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails96;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails104);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails75;
			owner_lazy = () -> TransactionDetails96.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails95
	 * TransactionDetails95}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails103
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails103}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails78
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails78}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails95> forTransactionDetails95 = new MMConstraint<TransactionDetails95>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails95;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails103);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails78;
			owner_lazy = () -> TransactionDetails95.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69
	 * SecuritiesTradeDetails69}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails69> forSecuritiesTradeDetails69 = new MMConstraint<SecuritiesTradeDetails69>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails69;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails69.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100
	 * TransactionDetails100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails100> forTransactionDetails100 = new MMConstraint<TransactionDetails100>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails100;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails100.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails99
	 * TransactionDetails99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails99> forTransactionDetails99 = new MMConstraint<TransactionDetails99>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails99;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails99.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails98
	 * TransactionDetails98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails98> forTransactionDetails98 = new MMConstraint<TransactionDetails98>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails98;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails98.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails102
	 * TransactionDetails102}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails93
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails102> forTransactionDetails102 = new MMConstraint<TransactionDetails102>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails102;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails93;
			owner_lazy = () -> TransactionDetails102.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails71
	 * SecuritiesTradeDetails71}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forSecuritiesTradeDetails68
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.
	 * forSecuritiesTradeDetails68}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails71;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forSecuritiesTradeDetails68;
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105
	 * TransactionDetails105}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails97
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails97}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails105> forTransactionDetails105 = new MMConstraint<TransactionDetails105>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails105;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails97;
			owner_lazy = () -> TransactionDetails105.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails104
	 * TransactionDetails104}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails96
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails96}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails104> forTransactionDetails104 = new MMConstraint<TransactionDetails104>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails104;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails96;
			owner_lazy = () -> TransactionDetails104.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103
	 * TransactionDetails103}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#forTransactionDetails95
	 * ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails95}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails103> forTransactionDetails103 = new MMConstraint<TransactionDetails103>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails103;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.forTransactionDetails95;
			owner_lazy = () -> TransactionDetails103.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails85
	 * SecuritiesTradeDetails85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails85> forSecuritiesTradeDetails85 = new MMConstraint<SecuritiesTradeDetails85>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkSecuritiesTradeDetails85;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> SecuritiesTradeDetails85.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110
	 * TransactionDetails110}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails110> forTransactionDetails110 = new MMConstraint<TransactionDetails110>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails110;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails110.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails111
	 * TransactionDetails111}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails111> forTransactionDetails111 = new MMConstraint<TransactionDetails111>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails111;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails111.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails112
	 * TransactionDetails112}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing2Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails112> forTransactionDetails112 = new MMConstraint<TransactionDetails112>() {
		{
			validator = ConstraintTwoLegTransactionOpeningClosing2Rule::checkTransactionDetails112;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing2Rule";
			definition = "For settlement of two parts transactions (buy-sell back, sell buy-back, collateral in and out), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nSell-Buy Back: Sell\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\nSell-Buy Back: Buy Back\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)\r\n\r\nBuy-Sell Back: Buy\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\nBuy-Sell Back: Sell Back\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)\r\n\r\nCollateral (giver) Out Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\nCollateral (giver) Out Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)\r\n\r\nCollateral (taker) In Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)\r\nCollateral (taker) In Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).";
			owner_lazy = () -> TransactionDetails112.mmObject();
		}
	};

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV07(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV06(SecuritiesSettlementTransactionAllegementNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV07(SecuritiesSettlementTransactionConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotification002V06(SecuritiesSettlementTransactionAllegementNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmation002V07(SecuritiesSettlementTransactionConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV01(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV02(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV03(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV04(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmationV06(SecuritiesSettlementTransactionConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotificationV05(SecuritiesSettlementTransactionAllegementNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionAllegementNotification002V05(SecuritiesSettlementTransactionAllegementNotification002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionConfirmation002V06(SecuritiesSettlementTransactionConfirmation002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is instructed by sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails5(TransactionDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails9(TransactionDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails22(TransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails23(TransactionDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails36(TransactionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails47(TransactionDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails53(TransactionDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails58(TransactionDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails7(TransactionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails16(TransactionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails26(TransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails27(TransactionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails39(TransactionDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails50(TransactionDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails56(TransactionDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails59(TransactionDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails6(TransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails18(TransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails24(TransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails34(TransactionDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails37(TransactionDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails48(TransactionDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails57(TransactionDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails60(TransactionDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails4(SecuritiesTradeDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails17(SecuritiesTradeDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails10(SecuritiesTradeDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails22(SecuritiesTradeDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails23(SecuritiesTradeDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails29(SecuritiesTradeDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails51(TransactionDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails61(TransactionDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails62(TransactionDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails63(TransactionDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails35(SecuritiesTradeDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails66(TransactionDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails42(SecuritiesTradeDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails67(TransactionDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails68(TransactionDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails70(TransactionDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails69(TransactionDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails71(TransactionDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails72(TransactionDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails49(SecuritiesTradeDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails79(TransactionDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails75(TransactionDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails78(TransactionDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails61(SecuritiesTradeDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails87(TransactionDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails91(TransactionDetails91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails90(TransactionDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails93(TransactionDetails93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails68(SecuritiesTradeDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails97(TransactionDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails96(TransactionDetails96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails95(TransactionDetails95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails69(SecuritiesTradeDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails100(TransactionDetails100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails99(TransactionDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails98(TransactionDetails98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails102(TransactionDetails102 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails105(TransactionDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails104(TransactionDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails103(TransactionDetails103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is alleged by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkSecuritiesTradeDetails85(SecuritiesTradeDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails110(TransactionDetails110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is identified by the providing of the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails111(TransactionDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (buy-sell back, sell buy-back,
	 * collateral in and out), the opening/initiation and closing/return of the
	 * transaction is confirmed by sending the below combination of
	 * SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Sell-Buy Back: Sell<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * Sell-Buy Back: Buy Back<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SellBuyBack (SBBK)<br>
	 * <br>
	 * Buy-Sell Back: Buy<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * Buy-Sell Back: Sell Back<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: BuySellBack (BSBK)<br>
	 * <br>
	 * Collateral (giver) Out Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * Collateral (giver) Out Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralOut (COLO)<br>
	 * <br>
	 * Collateral (taker) In Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI)<br>
	 * Collateral (taker) In Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: CollateralIn (COLI).
	 */
	public static void checkTransactionDetails112(TransactionDetails112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
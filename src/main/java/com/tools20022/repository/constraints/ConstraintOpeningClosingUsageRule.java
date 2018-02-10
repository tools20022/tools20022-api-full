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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * For settlement of two parts transactions (Securities Financing, buy-sell
 * back, sell buy-back), the opening/initiation and closing/return of the
 * transaction will be confirmed by sending the below combination of
 * ReceiveDelivery codes and SettlementTransactionType codes:
 * 
 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
 * Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
 * SettlementTransactionType : Repo (REPU)
 * 
 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
 * (RVPO)
 * 
 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
 * (TRPO)
 * 
 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse Repo
 * Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
 * TriPartyReverseRepo (TRVO)
 * 
 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
 * SecuritiesLending (SECL)
 * 
 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities Borrowing
 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
 * SecuritiesBorrowing (SECB)
 * 
 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
 * (SBBK)
 * 
 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE) SettlementTransactionType
 * : BuySellBack (BSBK) Buy-Sell Back: Sell Back ReceiveDelivery : Delivery
 * (DELI) SettlementTransactionType : BuySellBack (BSBK)
 * 
 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
 * CollateralOut (COLO)
 * 
 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In Return
 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : CollateralIn
 * (COLI)
 */
public class ConstraintOpeningClosingUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50
	 * SettlementDetails50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule#forSettlementDetails68
	 * ConstraintOpeningClosingUsageRule.forSettlementDetails68}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails50> forSettlementDetails50 = new MMConstraint<SettlementDetails50>() {
		{
			validator = ConstraintOpeningClosingUsageRule::checkSettlementDetails50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule.forSettlementDetails68);
			owner_lazy = () -> SettlementDetails50.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51
	 * SettlementDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails51> forSettlementDetails51 = new MMConstraint<SettlementDetails51>() {
		{
			validator = ConstraintOpeningClosingUsageRule::checkSettlementDetails51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)";
			owner_lazy = () -> SettlementDetails51.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68
	 * SettlementDetails68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule#forSettlementDetails94
	 * ConstraintOpeningClosingUsageRule.forSettlementDetails94}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule#forSettlementDetails50
	 * ConstraintOpeningClosingUsageRule.forSettlementDetails50}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails68> forSettlementDetails68 = new MMConstraint<SettlementDetails68>() {
		{
			validator = ConstraintOpeningClosingUsageRule::checkSettlementDetails68;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule.forSettlementDetails94);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule.forSettlementDetails50;
			owner_lazy = () -> SettlementDetails68.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83
	 * SettlementDetails83}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails83> forSettlementDetails83 = new MMConstraint<SettlementDetails83>() {
		{
			validator = ConstraintOpeningClosingUsageRule::checkSettlementDetails83;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)";
			owner_lazy = () -> SettlementDetails83.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94
	 * SettlementDetails94}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule#forSettlementDetails122
	 * ConstraintOpeningClosingUsageRule.forSettlementDetails122}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule#forSettlementDetails68
	 * ConstraintOpeningClosingUsageRule.forSettlementDetails68}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails94> forSettlementDetails94 = new MMConstraint<SettlementDetails94>() {
		{
			validator = ConstraintOpeningClosingUsageRule::checkSettlementDetails94;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule.forSettlementDetails122);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule.forSettlementDetails68;
			owner_lazy = () -> SettlementDetails94.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113
	 * SettlementDetails113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails113> forSettlementDetails113 = new MMConstraint<SettlementDetails113>() {
		{
			validator = ConstraintOpeningClosingUsageRule::checkSettlementDetails113;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)";
			owner_lazy = () -> SettlementDetails113.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122
	 * SettlementDetails122}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule#forSettlementDetails94
	 * ConstraintOpeningClosingUsageRule.forSettlementDetails94}</li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails122> forSettlementDetails122 = new MMConstraint<SettlementDetails122>() {
		{
			validator = ConstraintOpeningClosingUsageRule::checkSettlementDetails122;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOpeningClosingUsageRule.forSettlementDetails94;
			owner_lazy = () -> SettlementDetails122.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138
	 * SettlementDetails138}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningClosingUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SettlementDetails138> forSettlementDetails138 = new MMConstraint<SettlementDetails138>() {
		{
			validator = ConstraintOpeningClosingUsageRule::checkSettlementDetails138;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningClosingUsageRule";
			definition = "For settlement of two parts transactions (Securities Financing, buy-sell back, sell buy-back), the opening/initiation and closing/return of the transaction will be confirmed by sending the below combination of ReceiveDelivery codes and SettlementTransactionType codes:\n\nRepo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : Repo (REPU)\nRepo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : Repo (REPU)\n\nReverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : ReverseRepo (RVPO)\nReverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : ReverseRepo (RVPO)\n\nTriParty Repo Opening\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : TriPartyRepo (TRPO)\nTriParty Repo Closing\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyRepo (TRPO)\n\nTriParty Reverse Repo Opening\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : TriPartyReverseRepo (TRVO)\nTriParty Reverse Repo Closing\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : TriPartyReverseRepo (TRVO)\n\nSecurities Lending Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SecuritiesLending (SECL)\nSecurities Lending Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesLending (SECL)\n\nSecurities Borrowing Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SecuritiesBorrowing (SECB)\nSecurities Borrowing Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : SecuritiesBorrowing (SECB)\n\nSell-Buy Back: Sell\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : SellBuyBack (SBBK)\nSell-Buy Back: Buy Back\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : SellBuyBack (SBBK)\n\nBuy-Sell Back: Buy\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : BuySellBack (BSBK)\nBuy-Sell Back: Sell Back\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : BuySellBack (BSBK)\n\nCollateral (giver) Out Initiation\nReceiveDelivery : Delivery (DELI)\nSettlementTransactionType : CollateralOut (COLO)\nCollateral (giver) Out Return\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType :  CollateralOut (COLO)\n\nCollateral (taker) In Initiation\nReceiveDelivery : Receive (RECE)\nSettlementTransactionType : CollateralIn (COLI)\nCollateral (taker) In Return\nReceiveDelivery : Delivery (DELI) \nSettlementTransactionType : CollateralIn (COLI)";
			owner_lazy = () -> SettlementDetails138.mmObject();
		}
	};

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
	 * CollateralIn (COLI)
	 */
	public static void checkSettlementDetails50(SettlementDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
	 * CollateralIn (COLI)
	 */
	public static void checkSettlementDetails51(SettlementDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
	 * CollateralIn (COLI)
	 */
	public static void checkSettlementDetails68(SettlementDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
	 * CollateralIn (COLI)
	 */
	public static void checkSettlementDetails83(SettlementDetails83 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
	 * CollateralIn (COLI)
	 */
	public static void checkSettlementDetails94(SettlementDetails94 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
	 * CollateralIn (COLI)
	 */
	public static void checkSettlementDetails113(SettlementDetails113 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
	 * CollateralIn (COLI)
	 */
	public static void checkSettlementDetails122(SettlementDetails122 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing, buy-sell
	 * back, sell buy-back), the opening/initiation and closing/return of the
	 * transaction will be confirmed by sending the below combination of
	 * ReceiveDelivery codes and SettlementTransactionType codes:
	 * 
	 * Repo Opening ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : Repo (REPU) Repo Closing ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : Repo (REPU)
	 * 
	 * Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : ReverseRepo (RVPO) Reverse Repo Closing
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : ReverseRepo
	 * (RVPO)
	 * 
	 * TriParty Repo Opening ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : TriPartyRepo (TRPO) TriParty Repo Closing
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : TriPartyRepo
	 * (TRPO)
	 * 
	 * TriParty Reverse Repo Opening ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : TriPartyReverseRepo (TRVO) TriParty Reverse
	 * Repo Closing ReceiveDelivery : Delivery (DELI) SettlementTransactionType
	 * : TriPartyReverseRepo (TRVO)
	 * 
	 * Securities Lending Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesLending (SECL) Securities Lending
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * SecuritiesLending (SECL)
	 * 
	 * Securities Borrowing Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB) Securities
	 * Borrowing Return ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SecuritiesBorrowing (SECB)
	 * 
	 * Sell-Buy Back: Sell ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : SellBuyBack (SBBK) Sell-Buy Back: Buy Back
	 * ReceiveDelivery : Receive (RECE) SettlementTransactionType : SellBuyBack
	 * (SBBK)
	 * 
	 * Buy-Sell Back: Buy ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : BuySellBack (BSBK) Buy-Sell Back: Sell Back
	 * ReceiveDelivery : Delivery (DELI) SettlementTransactionType : BuySellBack
	 * (BSBK)
	 * 
	 * Collateral (giver) Out Initiation ReceiveDelivery : Delivery (DELI)
	 * SettlementTransactionType : CollateralOut (COLO) Collateral (giver) Out
	 * Return ReceiveDelivery : Receive (RECE) SettlementTransactionType :
	 * CollateralOut (COLO)
	 * 
	 * Collateral (taker) In Initiation ReceiveDelivery : Receive (RECE)
	 * SettlementTransactionType : CollateralIn (COLI) Collateral (taker) In
	 * Return ReceiveDelivery : Delivery (DELI) SettlementTransactionType :
	 * CollateralIn (COLI)
	 */
	public static void checkSettlementDetails138(SettlementDetails138 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
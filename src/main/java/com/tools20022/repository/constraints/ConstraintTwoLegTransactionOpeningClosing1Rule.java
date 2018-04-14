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
 * For settlement of two parts transactions (Securities Financing), the
 * opening/initiation and closing/return of the transaction is identified by the
 * providing of the below combination of SecuritiesMovementType codes and
 * SettlementParameters/SecuritiesTransactionType codes:<br>
 * <br>
 * Repo Opening<br>
 * SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
 * Repo Closing<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
 * <br>
 * Reverse Repo Opening<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
 * Reverse Repo Closing<br>
 * SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
 * <br>
 * TriParty Repo Opening<br>
 * SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
 * TriParty Repo Closing<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
 * <br>
 * TriParty Reverse Repo Opening<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)<br>
 * TriParty Reverse Repo Closing<br>
 * SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)<br>
 * <br>
 * Securities Lending Initiation<br>
 * SecuritiesMovementType: Delivery (DELI)<br>
 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
 * Securities Lending Return<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
 * <br>
 * Securities Borrowing Initiation<br>
 * SecuritiesMovementType: Receive (RECE)<br>
 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)<br>
 * Securities Borrowing Return<br>
 * SecuritiesMovementType: Delivery (DELI) <br>
 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).
 */
public class ConstraintTwoLegTransactionOpeningClosing1Rule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails26
	 * TransactionDetails26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails26> forTransactionDetails26 = new MMConstraint<TransactionDetails26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails26.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails26 obj) throws Exception {
			checkTransactionDetails26(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails90> forTransactionDetails90 = new MMConstraint<TransactionDetails90>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails90.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails90 obj) throws Exception {
			checkTransactionDetails90(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails68
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails68}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails71> forSecuritiesTradeDetails71 = new MMConstraint<SecuritiesTradeDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails68;
			owner_lazy = () -> SecuritiesTradeDetails71.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails71 obj) throws Exception {
			checkSecuritiesTradeDetails71(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails104
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails104}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails75
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails75}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails96> forTransactionDetails96 = new MMConstraint<TransactionDetails96>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails104);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails75;
			owner_lazy = () -> TransactionDetails96.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails96 obj) throws Exception {
			checkTransactionDetails96(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails5> forTransactionDetails5 = new MMConstraint<TransactionDetails5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails5.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails5 obj) throws Exception {
			checkTransactionDetails5(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails96
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails96}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails104> forTransactionDetails104 = new MMConstraint<TransactionDetails104>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails96;
			owner_lazy = () -> TransactionDetails104.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails104 obj) throws Exception {
			checkTransactionDetails104(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails42> forSecuritiesTradeDetails42 = new MMConstraint<SecuritiesTradeDetails42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails42.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails42 obj) throws Exception {
			checkSecuritiesTradeDetails42(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails18> forTransactionDetails18 = new MMConstraint<TransactionDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails18.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails18 obj) throws Exception {
			checkTransactionDetails18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V08
	 * SecuritiesSettlementTransactionConfirmation002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V08> for_sese_SecuritiesSettlementTransactionConfirmation002V08 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmation002V08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmation002V08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails78
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails78}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails57
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails57}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails63> forTransactionDetails63 = new MMConstraint<TransactionDetails63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails78);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails57;
			owner_lazy = () -> TransactionDetails63.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails63 obj) throws Exception {
			checkTransactionDetails63(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails27> forTransactionDetails27 = new MMConstraint<TransactionDetails27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails27.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails27 obj) throws Exception {
			checkTransactionDetails27(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails22> forSecuritiesTradeDetails22 = new MMConstraint<SecuritiesTradeDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails22.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails22 obj) throws Exception {
			checkSecuritiesTradeDetails22(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06> for_sese_SecuritiesSettlementTransactionAllegementNotification002V06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotification002V06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotification002V06(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails66> forTransactionDetails66 = new MMConstraint<TransactionDetails66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails66.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails66 obj) throws Exception {
			checkTransactionDetails66(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails72> forTransactionDetails72 = new MMConstraint<TransactionDetails72>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails72.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails72 obj) throws Exception {
			checkTransactionDetails72(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails95
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails95}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails103> forTransactionDetails103 = new MMConstraint<TransactionDetails103>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails95;
			owner_lazy = () -> TransactionDetails103.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails103 obj) throws Exception {
			checkTransactionDetails103(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails111> forTransactionDetails111 = new MMConstraint<TransactionDetails111>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails111.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails111 obj) throws Exception {
			checkTransactionDetails111(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V06> for_sese_SecuritiesSettlementTransactionInstruction002V06 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstruction002V06(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails71
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails71}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails49
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails68> forSecuritiesTradeDetails68 = new MMConstraint<SecuritiesTradeDetails68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails71);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails49;
			owner_lazy = () -> SecuritiesTradeDetails68.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails68 obj) throws Exception {
			checkSecuritiesTradeDetails68(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails97
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails97}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails105> forTransactionDetails105 = new MMConstraint<TransactionDetails105>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails97;
			owner_lazy = () -> TransactionDetails105.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails105 obj) throws Exception {
			checkTransactionDetails105(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails93
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails93}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails51> forTransactionDetails51 = new MMConstraint<TransactionDetails51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails93);
			owner_lazy = () -> TransactionDetails51.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails51 obj) throws Exception {
			checkTransactionDetails51(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails85> forSecuritiesTradeDetails85 = new MMConstraint<SecuritiesTradeDetails85>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails85.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails85 obj) throws Exception {
			checkSecuritiesTradeDetails85(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails16> forTransactionDetails16 = new MMConstraint<TransactionDetails16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails16.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails16 obj) throws Exception {
			checkTransactionDetails16(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV07
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV08> for_sese_SecuritiesSettlementTransactionInstructionV08 = new MMConstraint<SecuritiesSettlementTransactionInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV07;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails58> forTransactionDetails58 = new MMConstraint<TransactionDetails58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails58.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails58 obj) throws Exception {
			checkTransactionDetails58(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails69> forSecuritiesTradeDetails69 = new MMConstraint<SecuritiesTradeDetails69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails69.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails69 obj) throws Exception {
			checkSecuritiesTradeDetails69(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails4> forSecuritiesTradeDetails4 = new MMConstraint<SecuritiesTradeDetails4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails4.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails4 obj) throws Exception {
			checkSecuritiesTradeDetails4(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails6> forTransactionDetails6 = new MMConstraint<TransactionDetails6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails6.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails6 obj) throws Exception {
			checkTransactionDetails6(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails34> forTransactionDetails34 = new MMConstraint<TransactionDetails34>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails34.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails34 obj) throws Exception {
			checkTransactionDetails34(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails35
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails35}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails23> forSecuritiesTradeDetails23 = new MMConstraint<SecuritiesTradeDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails35);
			owner_lazy = () -> SecuritiesTradeDetails23.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails23 obj) throws Exception {
			checkSecuritiesTradeDetails23(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionConfirmationV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV04> for_sese_SecuritiesSettlementTransactionConfirmationV04 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionConfirmationV05);
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails110> forTransactionDetails110 = new MMConstraint<TransactionDetails110>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails110.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails110 obj) throws Exception {
			checkTransactionDetails110(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05> for_sese_SecuritiesSettlementTransactionAllegementNotificationV05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails79
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails79}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails61
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails61}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails70> forTransactionDetails70 = new MMConstraint<TransactionDetails70>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails79);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails61;
			owner_lazy = () -> TransactionDetails70.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails70 obj) throws Exception {
			checkTransactionDetails70(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails23> forTransactionDetails23 = new MMConstraint<TransactionDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails23.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails23 obj) throws Exception {
			checkTransactionDetails23(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails95
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails95}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails63
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails63}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails78> forTransactionDetails78 = new MMConstraint<TransactionDetails78>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails95);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails63;
			owner_lazy = () -> TransactionDetails78.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails78 obj) throws Exception {
			checkTransactionDetails78(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV03> for_sese_SecuritiesSettlementTransactionInstructionV03 = new MMConstraint<SecuritiesSettlementTransactionInstructionV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails68
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails68}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails35
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails35}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails49> forSecuritiesTradeDetails49 = new MMConstraint<SecuritiesTradeDetails49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails68);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails35;
			owner_lazy = () -> SecuritiesTradeDetails49.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails49 obj) throws Exception {
			checkSecuritiesTradeDetails49(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails91> forTransactionDetails91 = new MMConstraint<TransactionDetails91>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails91.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails91 obj) throws Exception {
			checkTransactionDetails91(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV03
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04> for_sese_SecuritiesSettlementTransactionAllegementNotificationV04 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV03;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV01> for_sese_SecuritiesSettlementTransactionConfirmationV01 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV01(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV04
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV05> for_sese_SecuritiesSettlementTransactionInstructionV05 = new MMConstraint<SecuritiesSettlementTransactionInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV04;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V06> for_sese_SecuritiesSettlementTransactionConfirmation002V06 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmation002V06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmation002V06(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails71> forTransactionDetails71 = new MMConstraint<TransactionDetails71>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails71.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails71 obj) throws Exception {
			checkTransactionDetails71(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails100> forTransactionDetails100 = new MMConstraint<TransactionDetails100>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails100.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails100 obj) throws Exception {
			checkTransactionDetails100(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails59> forTransactionDetails59 = new MMConstraint<TransactionDetails59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails59.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails59 obj) throws Exception {
			checkTransactionDetails59(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails112> forTransactionDetails112 = new MMConstraint<TransactionDetails112>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails112.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails112 obj) throws Exception {
			checkTransactionDetails112(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails60> forTransactionDetails60 = new MMConstraint<TransactionDetails60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails60.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails60 obj) throws Exception {
			checkTransactionDetails60(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails99> forTransactionDetails99 = new MMConstraint<TransactionDetails99>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails99.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails99 obj) throws Exception {
			checkTransactionDetails99(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails102
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails102}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails51
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails51}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails93> forTransactionDetails93 = new MMConstraint<TransactionDetails93>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails102);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails51;
			owner_lazy = () -> TransactionDetails93.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails93 obj) throws Exception {
			checkTransactionDetails93(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails68> forTransactionDetails68 = new MMConstraint<TransactionDetails68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails68.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails68 obj) throws Exception {
			checkTransactionDetails68(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV08
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV07> for_sese_SecuritiesSettlementTransactionInstructionV07 = new MMConstraint<SecuritiesSettlementTransactionInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV06;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionConfirmationV07
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionConfirmationV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV06> for_sese_SecuritiesSettlementTransactionConfirmationV06 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionConfirmationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV06(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails7> forTransactionDetails7 = new MMConstraint<TransactionDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails7.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails7 obj) throws Exception {
			checkTransactionDetails7(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails98> forTransactionDetails98 = new MMConstraint<TransactionDetails98>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails98.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails98 obj) throws Exception {
			checkTransactionDetails98(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails29> forSecuritiesTradeDetails29 = new MMConstraint<SecuritiesTradeDetails29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails29.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails29 obj) throws Exception {
			checkSecuritiesTradeDetails29(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails10> forSecuritiesTradeDetails10 = new MMConstraint<SecuritiesTradeDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails10.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails10 obj) throws Exception {
			checkSecuritiesTradeDetails10(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05> for_sese_SecuritiesSettlementTransactionAllegementNotification002V05 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotification002V05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotification002V05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails39> forTransactionDetails39 = new MMConstraint<TransactionDetails39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails39.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails39 obj) throws Exception {
			checkTransactionDetails39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07
	 * SecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07> for_sese_SecuritiesSettlementTransactionAllegementNotificationV07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails61> forSecuritiesTradeDetails61 = new MMConstraint<SecuritiesTradeDetails61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails61.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails61 obj) throws Exception {
			checkSecuritiesTradeDetails61(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV04
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03> for_sese_SecuritiesSettlementTransactionAllegementNotificationV03 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV04);
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails48> forTransactionDetails48 = new MMConstraint<TransactionDetails48>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails48.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails48 obj) throws Exception {
			checkTransactionDetails48(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V07
	 * SecuritiesSettlementTransactionAllegementNotification002V07}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V07> for_sese_SecuritiesSettlementTransactionAllegementNotification002V07 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotification002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotification002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotification002V07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotification002V07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails62
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails62}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails56> forTransactionDetails56 = new MMConstraint<TransactionDetails56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails62);
			owner_lazy = () -> TransactionDetails56.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails56 obj) throws Exception {
			checkTransactionDetails56(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01> for_sese_SecuritiesSettlementTransactionAllegementNotificationV01 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV01(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails103
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails103}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails78
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails78}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails95> forTransactionDetails95 = new MMConstraint<TransactionDetails95>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails103);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails78;
			owner_lazy = () -> TransactionDetails95.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails95 obj) throws Exception {
			checkTransactionDetails95(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails70
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails70}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails53
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails53}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails61> forTransactionDetails61 = new MMConstraint<TransactionDetails61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails70);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails53;
			owner_lazy = () -> TransactionDetails61.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails61 obj) throws Exception {
			checkTransactionDetails61(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV07
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV06> for_sese_SecuritiesSettlementTransactionInstructionV06 = new MMConstraint<SecuritiesSettlementTransactionInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV05;
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV06(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails63
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails63}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails57> forTransactionDetails57 = new MMConstraint<TransactionDetails57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails63);
			owner_lazy = () -> TransactionDetails57.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails57 obj) throws Exception {
			checkTransactionDetails57(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV01> for_sese_SecuritiesSettlementTransactionInstructionV01 = new MMConstraint<SecuritiesSettlementTransactionInstructionV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV01.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV01(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails61
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails61}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails53> forTransactionDetails53 = new MMConstraint<TransactionDetails53>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails61);
			owner_lazy = () -> TransactionDetails53.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails53 obj) throws Exception {
			checkTransactionDetails53(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails105
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails105}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails79
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails79}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails97> forTransactionDetails97 = new MMConstraint<TransactionDetails97>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails105);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails79;
			owner_lazy = () -> TransactionDetails97.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails97 obj) throws Exception {
			checkTransactionDetails97(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmation002V07> for_sese_SecuritiesSettlementTransactionConfirmation002V07 = new MMConstraint<SecuritiesSettlementTransactionConfirmation002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmation002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmation002V07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmation002V07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV02> for_sese_SecuritiesSettlementTransactionInstructionV02 = new MMConstraint<SecuritiesSettlementTransactionInstructionV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails47> forTransactionDetails47 = new MMConstraint<TransactionDetails47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails47.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails47 obj) throws Exception {
			checkTransactionDetails47(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails17> forSecuritiesTradeDetails17 = new MMConstraint<SecuritiesTradeDetails17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesTradeDetails17.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails17 obj) throws Exception {
			checkSecuritiesTradeDetails17(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails67> forTransactionDetails67 = new MMConstraint<TransactionDetails67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails67.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails67 obj) throws Exception {
			checkTransactionDetails67(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails24> forTransactionDetails24 = new MMConstraint<TransactionDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails24.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails24 obj) throws Exception {
			checkTransactionDetails24(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails22> forTransactionDetails22 = new MMConstraint<TransactionDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails22.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails22 obj) throws Exception {
			checkTransactionDetails22(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails97
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails97}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails70
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails70}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails79> forTransactionDetails79 = new MMConstraint<TransactionDetails79>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails97);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails70;
			owner_lazy = () -> TransactionDetails79.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails79 obj) throws Exception {
			checkTransactionDetails79(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV07
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06> for_sese_SecuritiesSettlementTransactionAllegementNotificationV06 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV05;
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV06.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV06 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV06(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02> for_sese_SecuritiesSettlementTransactionAllegementNotificationV02 = new MMConstraint<SecuritiesSettlementTransactionAllegementNotificationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionAllegementNotificationV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionAllegementNotificationV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails37> forTransactionDetails37 = new MMConstraint<TransactionDetails37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails37.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails37 obj) throws Exception {
			checkTransactionDetails37(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails93
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails93}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails102> forTransactionDetails102 = new MMConstraint<TransactionDetails102>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails93;
			owner_lazy = () -> TransactionDetails102.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails102 obj) throws Exception {
			checkTransactionDetails102(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V08
	 * SecuritiesSettlementTransactionInstruction002V08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V08> for_sese_SecuritiesSettlementTransactionInstruction002V08 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstruction002V08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionConfirmationV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionConfirmationV04
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV05> for_sese_SecuritiesSettlementTransactionConfirmationV05 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionConfirmationV04;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstruction002V07> for_sese_SecuritiesSettlementTransactionInstruction002V07 = new MMConstraint<SecuritiesSettlementTransactionInstruction002V07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionInstruction002V07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstruction002V07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionInstructionV05
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionInstructionV04> for_sese_SecuritiesSettlementTransactionInstructionV04 = new MMConstraint<SecuritiesSettlementTransactionInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is instructed by sending the below combination of SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionInstructionV05);
			owner_lazy = () -> SecuritiesSettlementTransactionInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionInstructionV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails50> forTransactionDetails50 = new MMConstraint<TransactionDetails50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails50.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails50 obj) throws Exception {
			checkTransactionDetails50(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails49
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails49}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forSecuritiesTradeDetails23
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * forSecuritiesTradeDetails23}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesTradeDetails35> forSecuritiesTradeDetails35 = new MMConstraint<SecuritiesTradeDetails35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is alleged by sending the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forSecuritiesTradeDetails23;
			owner_lazy = () -> SecuritiesTradeDetails35.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesTradeDetails35 obj) throws Exception {
			checkSecuritiesTradeDetails35(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV03> for_sese_SecuritiesSettlementTransactionConfirmationV03 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV03.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV03(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails69
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails69}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails56
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails56}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails62> forTransactionDetails62 = new MMConstraint<TransactionDetails62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails69);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails56;
			owner_lazy = () -> TransactionDetails62.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails62 obj) throws Exception {
			checkTransactionDetails62(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV02> for_sese_SecuritiesSettlementTransactionConfirmationV02 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV02.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails96
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails96}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails69
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails69}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails75> forTransactionDetails75 = new MMConstraint<TransactionDetails75>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails96);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails69;
			owner_lazy = () -> TransactionDetails75.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails75 obj) throws Exception {
			checkTransactionDetails75(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionConfirmationV08
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionConfirmationV06
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV07> for_sese_SecuritiesSettlementTransactionConfirmationV07 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionConfirmationV06;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV07 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails36> forTransactionDetails36 = new MMConstraint<TransactionDetails36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails36.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails36 obj) throws Exception {
			checkTransactionDetails36(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionConfirmationV07
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.
	 * for_sese_SecuritiesSettlementTransactionConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesSettlementTransactionConfirmationV08> for_sese_SecuritiesSettlementTransactionConfirmationV08 = new MMConstraint<SecuritiesSettlementTransactionConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is confirmed by sending the below combination of TransactionIdentificationDetails/SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nTransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nTransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionConfirmationV07;
			owner_lazy = () -> SecuritiesSettlementTransactionConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
			check_sese_SecuritiesSettlementTransactionConfirmationV08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails75
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails75}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#forTransactionDetails62
	 * ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails62}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails69> forTransactionDetails69 = new MMConstraint<TransactionDetails69>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails75);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.forTransactionDetails62;
			owner_lazy = () -> TransactionDetails69.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails69 obj) throws Exception {
			checkTransactionDetails69(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails87> forTransactionDetails87 = new MMConstraint<TransactionDetails87>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails87.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails87 obj) throws Exception {
			checkTransactionDetails87(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionOpeningClosing1Rule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<TransactionDetails9> forTransactionDetails9 = new MMConstraint<TransactionDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionOpeningClosing1Rule";
			definition = "For settlement of two parts transactions (Securities Financing), the opening/initiation and closing/return of the transaction is identified by the providing of the below combination of SecuritiesMovementType codes and SettlementParameters/SecuritiesTransactionType codes:\r\n\r\nRepo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\nRepo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: Repo (REPU)\r\n\r\nReverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\nReverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)\r\n\r\nTriParty Repo Opening\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\nTriParty Repo Closing\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)\r\n\r\nTriParty Reverse Repo Opening\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\nTriParty Reverse Repo Closing\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo (TRVO)\r\n\r\nSecurities Lending Initiation\r\nSecuritiesMovementType: Delivery (DELI)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\nSecurities Lending Return\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)\r\n\r\nSecurities Borrowing Initiation\r\nSecuritiesMovementType: Receive (RECE)\r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB)\r\nSecurities Borrowing Return\r\nSecuritiesMovementType: Delivery (DELI) \r\nSettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing (SECB).";
			owner_lazy = () -> TransactionDetails9.mmObject();
		}

		@Override
		public void executeValidator(TransactionDetails9 obj) throws Exception {
			checkTransactionDetails9(obj);
		}
	};

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails26(TransactionDetails26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails90(TransactionDetails90 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails71(SecuritiesTradeDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails96(TransactionDetails96 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails5(TransactionDetails5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails104(TransactionDetails104 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails42(SecuritiesTradeDetails42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails18(TransactionDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmation002V08(SecuritiesSettlementTransactionConfirmation002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails63(TransactionDetails63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails27(TransactionDetails27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails22(SecuritiesTradeDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotification002V06(SecuritiesSettlementTransactionAllegementNotification002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails66(TransactionDetails66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails72(TransactionDetails72 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails103(TransactionDetails103 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails111(TransactionDetails111 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstruction002V06(SecuritiesSettlementTransactionInstruction002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails68(SecuritiesTradeDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails105(TransactionDetails105 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails51(TransactionDetails51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails85(SecuritiesTradeDetails85 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails16(TransactionDetails16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV08(SecuritiesSettlementTransactionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails58(TransactionDetails58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails69(SecuritiesTradeDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails4(SecuritiesTradeDetails4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails6(TransactionDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails34(TransactionDetails34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails23(SecuritiesTradeDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV04(SecuritiesSettlementTransactionConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails110(TransactionDetails110 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV05(SecuritiesSettlementTransactionAllegementNotificationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails70(TransactionDetails70 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails23(TransactionDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails78(TransactionDetails78 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV03(SecuritiesSettlementTransactionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails49(SecuritiesTradeDetails49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails91(TransactionDetails91 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV04(SecuritiesSettlementTransactionAllegementNotificationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV01(SecuritiesSettlementTransactionConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV05(SecuritiesSettlementTransactionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmation002V06(SecuritiesSettlementTransactionConfirmation002V06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails71(TransactionDetails71 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails100(TransactionDetails100 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails59(TransactionDetails59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails112(TransactionDetails112 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails60(TransactionDetails60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails99(TransactionDetails99 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails93(TransactionDetails93 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails68(TransactionDetails68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV07(SecuritiesSettlementTransactionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV06(SecuritiesSettlementTransactionConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails7(TransactionDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails98(TransactionDetails98 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails29(SecuritiesTradeDetails29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails10(SecuritiesTradeDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotification002V05(SecuritiesSettlementTransactionAllegementNotification002V05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails39(TransactionDetails39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV07(SecuritiesSettlementTransactionAllegementNotificationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails61(SecuritiesTradeDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV03(SecuritiesSettlementTransactionAllegementNotificationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails48(TransactionDetails48 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotification002V07(SecuritiesSettlementTransactionAllegementNotification002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails56(TransactionDetails56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV01(SecuritiesSettlementTransactionAllegementNotificationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails95(TransactionDetails95 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails61(TransactionDetails61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV06(SecuritiesSettlementTransactionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails57(TransactionDetails57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV01(SecuritiesSettlementTransactionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails53(TransactionDetails53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails97(TransactionDetails97 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmation002V07(SecuritiesSettlementTransactionConfirmation002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV02(SecuritiesSettlementTransactionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails47(TransactionDetails47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails17(SecuritiesTradeDetails17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails67(TransactionDetails67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails24(TransactionDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails22(TransactionDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails79(TransactionDetails79 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV06(SecuritiesSettlementTransactionAllegementNotificationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionAllegementNotificationV02(SecuritiesSettlementTransactionAllegementNotificationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails37(TransactionDetails37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails102(TransactionDetails102 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstruction002V08(SecuritiesSettlementTransactionInstruction002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV05(SecuritiesSettlementTransactionConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstruction002V07(SecuritiesSettlementTransactionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is instructed by
	 * sending the below combination of
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Receive
	 * (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SettlementTypeAndAdditionalParameters/SecuritiesMovementType: Delivery
	 * (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionInstructionV04(SecuritiesSettlementTransactionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails50(TransactionDetails50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is alleged by
	 * sending the below combination of SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkSecuritiesTradeDetails35(SecuritiesTradeDetails35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV03(SecuritiesSettlementTransactionConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails62(TransactionDetails62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV02(SecuritiesSettlementTransactionConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails75(TransactionDetails75 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV07(SecuritiesSettlementTransactionConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails36(TransactionDetails36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is confirmed by
	 * sending the below combination of
	 * TransactionIdentificationDetails/SecuritiesMovementType codes and
	 * SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * TransactionIdentificationDetails/SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void check_sese_SecuritiesSettlementTransactionConfirmationV08(SecuritiesSettlementTransactionConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails69(TransactionDetails69 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails87(TransactionDetails87 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * For settlement of two parts transactions (Securities Financing), the
	 * opening/initiation and closing/return of the transaction is identified by
	 * the providing of the below combination of SecuritiesMovementType codes
	 * and SettlementParameters/SecuritiesTransactionType codes:<br>
	 * <br>
	 * Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: Repo (REPU)<br>
	 * <br>
	 * Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: ReverseRepo (RVPO)<br>
	 * <br>
	 * TriParty Repo Opening<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * TriParty Repo Closing<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyRepo (TRPO)<br>
	 * <br>
	 * TriParty Reverse Repo Opening<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * TriParty Reverse Repo Closing<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: TriPartyReverseRepo
	 * (TRVO)<br>
	 * <br>
	 * Securities Lending Initiation<br>
	 * SecuritiesMovementType: Delivery (DELI)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * Securities Lending Return<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesLending (SECL)<br>
	 * <br>
	 * Securities Borrowing Initiation<br>
	 * SecuritiesMovementType: Receive (RECE)<br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB)<br>
	 * Securities Borrowing Return<br>
	 * SecuritiesMovementType: Delivery (DELI) <br>
	 * SettlementParameters/SecuritiesTransactionType: SecuritiesBorrowing
	 * (SECB).
	 */
	public static void checkTransactionDetails9(TransactionDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}
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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RejectedStatusReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a rejected status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReasonCode
 * RejectedStatusReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmAfterDeadline
 * RejectedStatusReason10Code.mmAfterDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmAccountBlockedForTransfer
 * RejectedStatusReason10Code.mmAccountBlockedForTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmCutOffTime
 * RejectedStatusReason10Code.mmCutOffTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmSettlementDate
 * RejectedStatusReason10Code.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmAccountBlockedMissingDocuments
 * RejectedStatusReason10Code.mmAccountBlockedMissingDocuments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmFinancialInstrumentQuantity
 * RejectedStatusReason10Code.mmFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmFinancialInstrumentIdentification
 * RejectedStatusReason10Code.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmTradeDate
 * RejectedStatusReason10Code.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmFinancialInstrumentIdentificationAndName
 * RejectedStatusReason10Code.mmFinancialInstrumentIdentificationAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmSubscriberOrRedeemer
 * RejectedStatusReason10Code.mmSubscriberOrRedeemer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmIntermediary
 * RejectedStatusReason10Code.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmInvalidOrderType
 * RejectedStatusReason10Code.mmInvalidOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmInstructingPartyNotAllowedForAccount
 * RejectedStatusReason10Code.mmInstructingPartyNotAllowedForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmTooLate
 * RejectedStatusReason10Code.mmTooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmNotEnoughCash
 * RejectedStatusReason10Code.mmNotEnoughCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmNoCancellationMatch
 * RejectedStatusReason10Code.mmNoCancellationMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmNotCompliantWithSLA
 * RejectedStatusReason10Code.mmNotCompliantWithSLA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmDuplicateOrderReference
 * RejectedStatusReason10Code.mmDuplicateOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmInvestmentAccount
 * RejectedStatusReason10Code.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmNotEnoughFinancialInstrument
 * RejectedStatusReason10Code.mmNotEnoughFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmTooHighUnitsOrAmountToSubscribe
 * RejectedStatusReason10Code.mmTooHighUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmTooLowUnitsOrAmountToSubscribe
 * RejectedStatusReason10Code.mmTooLowUnitsOrAmountToSubscribe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmUnacceptedDealCurrency
 * RejectedStatusReason10Code.mmUnacceptedDealCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmUnknownLinkagesReference
 * RejectedStatusReason10Code.mmUnknownLinkagesReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmUnacceptedRequestedSettlementCurrency
 * RejectedStatusReason10Code.mmUnacceptedRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmInvalidOrderedAmount
 * RejectedStatusReason10Code.mmInvalidOrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmBelowMinimumInitialInvestmentAmount
 * RejectedStatusReason10Code.mmBelowMinimumInitialInvestmentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmBelowMinimumTopUpAmount
 * RejectedStatusReason10Code.mmBelowMinimumTopUpAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmInsufficientCapacity
 * RejectedStatusReason10Code.mmInsufficientCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmPercentageHoldingBreach
 * RejectedStatusReason10Code.mmPercentageHoldingBreach}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmBelowMinimumRedemptionAmount
 * RejectedStatusReason10Code.mmBelowMinimumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmBelowMinimumRetainedAmount
 * RejectedStatusReason10Code.mmBelowMinimumRetainedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmLockUp
 * RejectedStatusReason10Code.mmLockUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmAssetsIlliquid
 * RejectedStatusReason10Code.mmAssetsIlliquid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmDataInvalid
 * RejectedStatusReason10Code.mmDataInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code#mmFundClosed
 * RejectedStatusReason10Code.mmFundClosed}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectedStatusReason10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a rejected status."</li>
 * </ul>
 */
public class RejectedStatusReason10Code extends RejectedStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AfterDeadline"</li>
	 * </ul>
	 */
	public static final MMCode mmAfterDeadline = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AfterDeadline";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedForTransfer"</li>
	 * </ul>
	 */
	public static final MMCode mmAccountBlockedForTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedForTransfer";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffTime"</li>
	 * </ul>
	 */
	public static final MMCode mmCutOffTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutOffTime";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlockedMissingDocuments"</li>
	 * </ul>
	 */
	public static final MMCode mmAccountBlockedMissingDocuments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlockedMissingDocuments";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialInstrumentQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialInstrumentIdentification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final MMCode mmTradeDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentificationAndName"</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialInstrumentIdentificationAndName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentificationAndName";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriberOrRedeemer"</li>
	 * </ul>
	 */
	public static final MMCode mmSubscriberOrRedeemer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberOrRedeemer";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final MMCode mmIntermediary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrderType"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOrderType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrderType";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingPartyNotAllowedForAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmInstructingPartyNotAllowedForAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingPartyNotAllowedForAccount";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLate"</li>
	 * </ul>
	 */
	public static final MMCode mmTooLate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughCash"</li>
	 * </ul>
	 */
	public static final MMCode mmNotEnoughCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEnoughCash";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCancellationMatch"</li>
	 * </ul>
	 */
	public static final MMCode mmNoCancellationMatch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCancellationMatch";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotCompliantWithSLA"</li>
	 * </ul>
	 */
	public static final MMCode mmNotCompliantWithSLA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotCompliantWithSLA";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateOrderReference"</li>
	 * </ul>
	 */
	public static final MMCode mmDuplicateOrderReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateOrderReference";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEnoughFinancialInstrument"</li>
	 * </ul>
	 */
	public static final MMCode mmNotEnoughFinancialInstrument = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEnoughFinancialInstrument";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooHighUnitsOrAmountToSubscribe"</li>
	 * </ul>
	 */
	public static final MMCode mmTooHighUnitsOrAmountToSubscribe = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooHighUnitsOrAmountToSubscribe";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLowUnitsOrAmountToSubscribe"</li>
	 * </ul>
	 */
	public static final MMCode mmTooLowUnitsOrAmountToSubscribe = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLowUnitsOrAmountToSubscribe";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedDealCurrency"</li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptedDealCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedDealCurrency";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownLinkagesReference"</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownLinkagesReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownLinkagesReference";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptedRequestedSettlementCurrency"</li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptedRequestedSettlementCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptedRequestedSettlementCurrency";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOrderedAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOrderedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOrderedAmount";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumInitialInvestmentAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumInitialInvestmentAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumInitialInvestmentAmount";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumTopUpAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumTopUpAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumTopUpAmount";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCapacity"</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientCapacity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCapacity";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageHoldingBreach"</li>
	 * </ul>
	 */
	public static final MMCode mmPercentageHoldingBreach = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageHoldingBreach";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRedemptionAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumRedemptionAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRedemptionAmount";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BelowMinimumRetainedAmount"</li>
	 * </ul>
	 */
	public static final MMCode mmBelowMinimumRetainedAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BelowMinimumRetainedAmount";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockUp"</li>
	 * </ul>
	 */
	public static final MMCode mmLockUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockUp";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetsIlliquid"</li>
	 * </ul>
	 */
	public static final MMCode mmAssetsIlliquid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsIlliquid";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataInvalid"</li>
	 * </ul>
	 */
	public static final MMCode mmDataInvalid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataInvalid";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectedStatusReason10Code
	 * RejectedStatusReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClosed"</li>
	 * </ul>
	 */
	public static final MMCode mmFundClosed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundClosed";
			owner_lazy = () -> RejectedStatusReason10Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectedStatusReason10Code";
				definition = "Specifies the reason for a rejected status.";
				code_lazy = () -> Arrays.asList(RejectedStatusReason10Code.mmAfterDeadline, RejectedStatusReason10Code.mmAccountBlockedForTransfer, RejectedStatusReason10Code.mmCutOffTime, RejectedStatusReason10Code.mmSettlementDate,
						RejectedStatusReason10Code.mmAccountBlockedMissingDocuments, RejectedStatusReason10Code.mmFinancialInstrumentQuantity, RejectedStatusReason10Code.mmFinancialInstrumentIdentification,
						RejectedStatusReason10Code.mmTradeDate, RejectedStatusReason10Code.mmFinancialInstrumentIdentificationAndName, RejectedStatusReason10Code.mmSubscriberOrRedeemer, RejectedStatusReason10Code.mmIntermediary,
						RejectedStatusReason10Code.mmInvalidOrderType, RejectedStatusReason10Code.mmInstructingPartyNotAllowedForAccount, RejectedStatusReason10Code.mmTooLate, RejectedStatusReason10Code.mmNotEnoughCash,
						RejectedStatusReason10Code.mmNoCancellationMatch, RejectedStatusReason10Code.mmNotCompliantWithSLA, RejectedStatusReason10Code.mmDuplicateOrderReference, RejectedStatusReason10Code.mmInvestmentAccount,
						RejectedStatusReason10Code.mmNotEnoughFinancialInstrument, RejectedStatusReason10Code.mmTooHighUnitsOrAmountToSubscribe, RejectedStatusReason10Code.mmTooLowUnitsOrAmountToSubscribe,
						RejectedStatusReason10Code.mmUnacceptedDealCurrency, RejectedStatusReason10Code.mmUnknownLinkagesReference, RejectedStatusReason10Code.mmUnacceptedRequestedSettlementCurrency,
						RejectedStatusReason10Code.mmInvalidOrderedAmount, RejectedStatusReason10Code.mmBelowMinimumInitialInvestmentAmount, RejectedStatusReason10Code.mmBelowMinimumTopUpAmount,
						RejectedStatusReason10Code.mmInsufficientCapacity, RejectedStatusReason10Code.mmPercentageHoldingBreach, RejectedStatusReason10Code.mmBelowMinimumRedemptionAmount,
						RejectedStatusReason10Code.mmBelowMinimumRetainedAmount, RejectedStatusReason10Code.mmLockUp, RejectedStatusReason10Code.mmAssetsIlliquid, RejectedStatusReason10Code.mmDataInvalid,
						RejectedStatusReason10Code.mmFundClosed);
				trace_lazy = () -> RejectedStatusReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
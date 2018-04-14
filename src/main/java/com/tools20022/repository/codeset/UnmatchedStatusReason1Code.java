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
import com.tools20022.repository.codeset.UnmatchedStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction/instruction is unmatched.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#MatchingInstructionNotFound
 * UnmatchedStatusReason1Code.MatchingInstructionNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementSettlementDate
 * UnmatchedStatusReason1Code.DisagreementSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementDirectionOfTrade
 * UnmatchedStatusReason1Code.DisagreementDirectionOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementPlaceOfSettlement
 * UnmatchedStatusReason1Code.DisagreementPlaceOfSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementSettlementAmount
 * UnmatchedStatusReason1Code.DisagreementSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementDealPrice
 * UnmatchedStatusReason1Code.DisagreementDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementQuantity
 * UnmatchedStatusReason1Code.DisagreementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementRepurchaseCallDelay
 * UnmatchedStatusReason1Code.DisagreementRepurchaseCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementSettlementTransaction
 * UnmatchedStatusReason1Code.DisagreementSettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementSecurity
 * UnmatchedStatusReason1Code.DisagreementSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementVariableRateSupport
 * UnmatchedStatusReason1Code.DisagreementVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#NotRecognised
 * UnmatchedStatusReason1Code.NotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementRepurchaseSpreadRate
 * UnmatchedStatusReason1Code.DisagreementRepurchaseSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementRepurchaseRate
 * UnmatchedStatusReason1Code.DisagreementRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#CounterpartyTooLateForMatching
 * UnmatchedStatusReason1Code.CounterpartyTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementRepurchaseRateType
 * UnmatchedStatusReason1Code.DisagreementRepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementRepurchaseAmount
 * UnmatchedStatusReason1Code.DisagreementRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementRepurchasePremiumAmount
 * UnmatchedStatusReason1Code.DisagreementRepurchasePremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementPhysicalSettlement
 * UnmatchedStatusReason1Code.DisagreementPhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementCommonReference
 * UnmatchedStatusReason1Code.DisagreementCommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementPaymentCode
 * UnmatchedStatusReason1Code.DisagreementPaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementPlaceOfTrade
 * UnmatchedStatusReason1Code.DisagreementPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#PossibleDuplicateInstruction
 * UnmatchedStatusReason1Code.PossibleDuplicateInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementForfeitRepurchaseamount
 * UnmatchedStatusReason1Code.DisagreementForfeitRepurchaseamount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementRegistrationDetails
 * UnmatchedStatusReason1Code.DisagreementRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementRTGSSystem
 * UnmatchedStatusReason1Code.DisagreementRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#IncorrectAgent
 * UnmatchedStatusReason1Code.IncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#CounterpartyCancelledInstruction
 * UnmatchedStatusReason1Code.CounterpartyCancelledInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementChargesAmount
 * UnmatchedStatusReason1Code.DisagreementChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#IncorrectBuyerOrSeller
 * UnmatchedStatusReason1Code.IncorrectBuyerOrSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementCurrencySettlementAmount
 * UnmatchedStatusReason1Code.DisagreementCurrencySettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#NoMatchingStarted
 * UnmatchedStatusReason1Code.NoMatchingStarted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementSafekeepingAccount
 * UnmatchedStatusReason1Code.DisagreementSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementTradeDate
 * UnmatchedStatusReason1Code.DisagreementTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#YourInstructionTooLateForMatching
 * UnmatchedStatusReason1Code.YourInstructionTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementClosingDateTime
 * UnmatchedStatusReason1Code.DisagreementClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#DisagreementReceivingOrDeliveringCustodian
 * UnmatchedStatusReason1Code.DisagreementReceivingOrDeliveringCustodian}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReasonCode
 * UnmatchedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnmatchedStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is unmatched."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CMIS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnmatchedStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Matching instruction from the counterparty could not be found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMIS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingInstructionNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Matching instruction from the counterparty could not be found."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code MatchingInstructionNotFound = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingInstructionNotFound";
			definition = "Matching instruction from the counterparty could not be found.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "CMIS";
			codeName = UnmatchedStatusReasonCode.MatchingInstructionNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the settlement date/time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the settlement date/time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementSettlementDate = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSettlementDate";
			definition = "Counterparty disagrees with the settlement date/time.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DDAT";
			codeName = UnmatchedStatusReasonCode.DisagreementSettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty expects a delivery not a receipt, or counterparty expects a
	 * receipt not a delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DELN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementDirectionOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty expects a delivery not a receipt, or counterparty expects a receipt not a delivery."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementDirectionOfTrade = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementDirectionOfTrade";
			definition = "Counterparty expects a delivery not a receipt, or counterparty expects a receipt not a delivery.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DELN";
			codeName = UnmatchedStatusReasonCode.DisagreementDirectionOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the place of settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementPlaceOfSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the place of settlement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementPlaceOfSettlement = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementPlaceOfSettlement";
			definition = "Counterparty disagrees with the place of settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DEPT";
			codeName = UnmatchedStatusReasonCode.DisagreementPlaceOfSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the settlement amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementSettlementAmount = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSettlementAmount";
			definition = "Counterparty disagrees with the settlement amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DMON";
			codeName = UnmatchedStatusReasonCode.DisagreementSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the deal price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDEA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementDealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the deal price."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementDealPrice = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementDealPrice";
			definition = "Counterparty disagrees with the deal price.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DDEA";
			codeName = UnmatchedStatusReasonCode.DisagreementDealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the quantity of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty disagrees with the quantity of the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementQuantity = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementQuantity";
			definition = "Counterparty disagrees with the quantity of the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DQUA";
			codeName = UnmatchedStatusReasonCode.DisagreementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * Repurchase call delay does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase call delay does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementRepurchaseCallDelay = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseCallDelay";
			definition = "Repurchase call delay does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "CADE";
			codeName = UnmatchedStatusReasonCode.DisagreementRepurchaseCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * Settlement transaction type does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSettlementTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement transaction type does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementSettlementTransaction = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSettlementTransaction";
			definition = "Settlement transaction type does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "SETR";
			codeName = UnmatchedStatusReasonCode.DisagreementSettlementTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the security/issue, eg, ISIN or a financial
	 * instrument attribute differs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSEC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty disagrees with the security/issue, eg, ISIN or a financial instrument attribute differs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementSecurity = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSecurity";
			definition = "Counterparty disagrees with the security/issue, eg, ISIN or a financial instrument attribute differs.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DSEC";
			codeName = UnmatchedStatusReasonCode.DisagreementSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * Variable rate support does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VASU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementVariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable rate support does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementVariableRateSupport = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementVariableRateSupport";
			definition = "Variable rate support does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "VASU";
			codeName = UnmatchedStatusReasonCode.DisagreementVariableRateSupport.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty does not recognise the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotRecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty does not recognise the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code NotRecognised = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotRecognised";
			definition = "Counterparty does not recognise the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DTRA";
			codeName = UnmatchedStatusReasonCode.NotRecognised.getCodeName().orElse(name);
		}
	};
	/**
	 * Repurchase spread rate does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSPR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseSpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase spread rate does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementRepurchaseSpreadRate = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseSpreadRate";
			definition = "Repurchase spread rate does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "RSPR";
			codeName = UnmatchedStatusReasonCode.DisagreementRepurchaseSpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * Repurchase rate does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementRepurchaseRate = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseRate";
			definition = "Repurchase rate does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "REPO";
			codeName = UnmatchedStatusReasonCode.DisagreementRepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty's instruction was too late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty's instruction was too late."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code CounterpartyTooLateForMatching = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyTooLateForMatching";
			definition = "Counterparty's instruction was too late.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "CLAT";
			codeName = UnmatchedStatusReasonCode.CounterpartyTooLateForMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * Repurchase rate type does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RERT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate type does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementRepurchaseRateType = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseRateType";
			definition = "Repurchase rate type does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "RERT";
			codeName = UnmatchedStatusReasonCode.DisagreementRepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * Repurchase amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase amount does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementRepurchaseAmount = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseAmount";
			definition = "Repurchase amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "REPA";
			codeName = UnmatchedStatusReasonCode.DisagreementRepurchaseAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * Repurchase premium amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchasePremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase premium amount does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementRepurchasePremiumAmount = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchasePremiumAmount";
			definition = "Repurchase premium amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "REPP";
			codeName = UnmatchedStatusReasonCode.DisagreementRepurchasePremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty's instructions is for physical settlement, and yours is not,
	 * or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementPhysicalSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instructions is for physical settlement, and yours is not, or vice versa."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementPhysicalSettlement = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementPhysicalSettlement";
			definition = "Counterparty's instructions is for physical settlement, and yours is not, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "PHYS";
			codeName = UnmatchedStatusReasonCode.DisagreementPhysicalSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the common reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IIND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementCommonReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the common reference."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementCommonReference = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementCommonReference";
			definition = "Counterparty disagrees with the common reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "IIND";
			codeName = UnmatchedStatusReasonCode.DisagreementCommonReference.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty's instructions is for free settlement, and yours is for
	 * settlement against payment, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementPaymentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instructions is for free settlement, and yours is for settlement against payment, or vice versa."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementPaymentCode = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementPaymentCode";
			definition = "Counterparty's instructions is for free settlement, and yours is for settlement against payment, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "FRAP";
			codeName = UnmatchedStatusReasonCode.DisagreementPaymentCode.getCodeName().orElse(name);
		}
	};
	/**
	 * Place of trade does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLCE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementPlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of trade does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementPlaceOfTrade = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementPlaceOfTrade";
			definition = "Place of trade does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "PLCE";
			codeName = UnmatchedStatusReasonCode.DisagreementPlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * Instruction is a possible duplicate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PODU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicateInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is a possible duplicate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code PossibleDuplicateInstruction = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PossibleDuplicateInstruction";
			definition = "Instruction is a possible duplicate.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "PODU";
			codeName = UnmatchedStatusReasonCode.PossibleDuplicateInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * Repurchase forfeit amount does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementForfeitRepurchaseamount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase forfeit amount does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementForfeitRepurchaseamount = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementForfeitRepurchaseamount";
			definition = "Repurchase forfeit amount does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "FORF";
			codeName = UnmatchedStatusReasonCode.DisagreementForfeitRepurchaseamount.getCodeName().orElse(name);
		}
	};
	/**
	 * Discrepancies exist in the registration details linked to the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Discrepancies exist in the registration details linked to the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementRegistrationDetails = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRegistrationDetails";
			definition = "Discrepancies exist in the registration details linked to the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "REGD";
			codeName = UnmatchedStatusReasonCode.DisagreementRegistrationDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty indicates a settlement via RTGS system and you indicate
	 * non-RTGS settlement, or vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTGS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRTGSSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty indicates a settlement via RTGS system and you indicate non-RTGS settlement, or vice versa."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementRTGSSystem = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRTGSSystem";
			definition = "Counterparty indicates a settlement via RTGS system and you indicate non-RTGS settlement, or vice versa.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "RTGS";
			codeName = UnmatchedStatusReasonCode.DisagreementRTGSSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty indicated an incorrect delivery or receiving agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty indicated an incorrect delivery or receiving agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code IncorrectAgent = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectAgent";
			definition = "Counterparty indicated an incorrect delivery or receiving agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "ICAG";
			codeName = UnmatchedStatusReasonCode.IncorrectAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty has cancelled the transaction/instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPCA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancelledInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty has cancelled the transaction/instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code CounterpartyCancelledInstruction = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyCancelledInstruction";
			definition = "Counterparty has cancelled the transaction/instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "CPCA";
			codeName = UnmatchedStatusReasonCode.CounterpartyCancelledInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees on the amount of charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementChargesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees on the amount of charges."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementChargesAmount = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementChargesAmount";
			definition = "Counterparty disagrees on the amount of charges.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "CHAR";
			codeName = UnmatchedStatusReasonCode.DisagreementChargesAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * Instruction indicates an incorrect buyer (receiver) or seller
	 * (deliverer).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IEXE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectBuyerOrSeller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction indicates an incorrect buyer (receiver) or seller (deliverer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code IncorrectBuyerOrSeller = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectBuyerOrSeller";
			definition = "Instruction indicates an incorrect buyer (receiver) or seller (deliverer).";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "IEXE";
			codeName = UnmatchedStatusReasonCode.IncorrectBuyerOrSeller.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the currency of the settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCRR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementCurrencySettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty disagrees with the currency of the settlement amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementCurrencySettlementAmount = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementCurrencySettlementAmount";
			definition = "Counterparty disagrees with the currency of the settlement amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "NCRR";
			codeName = UnmatchedStatusReasonCode.DisagreementCurrencySettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * Matching process has not yet started.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingStarted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Matching process has not yet started."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code NoMatchingStarted = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMatchingStarted";
			definition = "Matching process has not yet started.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "NMAS";
			codeName = UnmatchedStatusReasonCode.NoMatchingStarted.getCodeName().orElse(name);
		}
	};
	/**
	 * Safekeeping account used as a matching criteria on the market concerned
	 * does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping account used as a matching criteria on the market concerned does not match."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementSafekeepingAccount = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSafekeepingAccount";
			definition = "Safekeeping account used as a matching criteria on the market concerned does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "SAFE";
			codeName = UnmatchedStatusReasonCode.DisagreementSafekeepingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * Counterparty disagrees with the trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the trade date."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementTradeDate = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementTradeDate";
			definition = "Counterparty disagrees with the trade date.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "DTRD";
			codeName = UnmatchedStatusReasonCode.DisagreementTradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * Instruction received too late for matching.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YourInstructionTooLateForMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction received too late for matching."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code YourInstructionTooLateForMatching = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YourInstructionTooLateForMatching";
			definition = "Instruction received too late for matching.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "LATE";
			codeName = UnmatchedStatusReasonCode.YourInstructionTooLateForMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * Closing date/time does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementClosingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Closing date/time does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementClosingDateTime = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementClosingDateTime";
			definition = "Closing date/time does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "TERM";
			codeName = UnmatchedStatusReasonCode.DisagreementClosingDateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * Incorrect delivering or receiving custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code
	 * UnmatchedStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICUS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementReceivingOrDeliveringCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incorrect delivering or receiving custodian."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final UnmatchedStatusReason1Code DisagreementReceivingOrDeliveringCustodian = new UnmatchedStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementReceivingOrDeliveringCustodian";
			definition = "Incorrect delivering or receiving custodian.";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedStatusReason1Code.mmObject();
			codeName = "ICUS";
			codeName = UnmatchedStatusReasonCode.DisagreementReceivingOrDeliveringCustodian.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnmatchedStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected UnmatchedStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CMIS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnmatchedStatusReason1Code";
				definition = "Specifies the reason the transaction/instruction is unmatched.";
				trace_lazy = () -> UnmatchedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedStatusReason1Code.MatchingInstructionNotFound, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementSettlementDate,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementDirectionOfTrade, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementPlaceOfSettlement,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementSettlementAmount, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementDealPrice,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementQuantity, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementRepurchaseCallDelay,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementSettlementTransaction, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementSecurity,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementVariableRateSupport, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.NotRecognised,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementRepurchaseSpreadRate, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementRepurchaseRate,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.CounterpartyTooLateForMatching, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementRepurchaseRateType,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementRepurchaseAmount, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementRepurchasePremiumAmount,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementPhysicalSettlement, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementCommonReference,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementPaymentCode, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementPlaceOfTrade,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.PossibleDuplicateInstruction, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementForfeitRepurchaseamount,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementRegistrationDetails, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementRTGSSystem,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.IncorrectAgent, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.CounterpartyCancelledInstruction,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementChargesAmount, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.IncorrectBuyerOrSeller,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementCurrencySettlementAmount, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.NoMatchingStarted,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementSafekeepingAccount, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementTradeDate,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.YourInstructionTooLateForMatching, com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementClosingDateTime,
						com.tools20022.repository.codeset.UnmatchedStatusReason1Code.DisagreementReceivingOrDeliveringCustodian);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MatchingInstructionNotFound.getCodeName().get(), MatchingInstructionNotFound);
		codesByName.put(DisagreementSettlementDate.getCodeName().get(), DisagreementSettlementDate);
		codesByName.put(DisagreementDirectionOfTrade.getCodeName().get(), DisagreementDirectionOfTrade);
		codesByName.put(DisagreementPlaceOfSettlement.getCodeName().get(), DisagreementPlaceOfSettlement);
		codesByName.put(DisagreementSettlementAmount.getCodeName().get(), DisagreementSettlementAmount);
		codesByName.put(DisagreementDealPrice.getCodeName().get(), DisagreementDealPrice);
		codesByName.put(DisagreementQuantity.getCodeName().get(), DisagreementQuantity);
		codesByName.put(DisagreementRepurchaseCallDelay.getCodeName().get(), DisagreementRepurchaseCallDelay);
		codesByName.put(DisagreementSettlementTransaction.getCodeName().get(), DisagreementSettlementTransaction);
		codesByName.put(DisagreementSecurity.getCodeName().get(), DisagreementSecurity);
		codesByName.put(DisagreementVariableRateSupport.getCodeName().get(), DisagreementVariableRateSupport);
		codesByName.put(NotRecognised.getCodeName().get(), NotRecognised);
		codesByName.put(DisagreementRepurchaseSpreadRate.getCodeName().get(), DisagreementRepurchaseSpreadRate);
		codesByName.put(DisagreementRepurchaseRate.getCodeName().get(), DisagreementRepurchaseRate);
		codesByName.put(CounterpartyTooLateForMatching.getCodeName().get(), CounterpartyTooLateForMatching);
		codesByName.put(DisagreementRepurchaseRateType.getCodeName().get(), DisagreementRepurchaseRateType);
		codesByName.put(DisagreementRepurchaseAmount.getCodeName().get(), DisagreementRepurchaseAmount);
		codesByName.put(DisagreementRepurchasePremiumAmount.getCodeName().get(), DisagreementRepurchasePremiumAmount);
		codesByName.put(DisagreementPhysicalSettlement.getCodeName().get(), DisagreementPhysicalSettlement);
		codesByName.put(DisagreementCommonReference.getCodeName().get(), DisagreementCommonReference);
		codesByName.put(DisagreementPaymentCode.getCodeName().get(), DisagreementPaymentCode);
		codesByName.put(DisagreementPlaceOfTrade.getCodeName().get(), DisagreementPlaceOfTrade);
		codesByName.put(PossibleDuplicateInstruction.getCodeName().get(), PossibleDuplicateInstruction);
		codesByName.put(DisagreementForfeitRepurchaseamount.getCodeName().get(), DisagreementForfeitRepurchaseamount);
		codesByName.put(DisagreementRegistrationDetails.getCodeName().get(), DisagreementRegistrationDetails);
		codesByName.put(DisagreementRTGSSystem.getCodeName().get(), DisagreementRTGSSystem);
		codesByName.put(IncorrectAgent.getCodeName().get(), IncorrectAgent);
		codesByName.put(CounterpartyCancelledInstruction.getCodeName().get(), CounterpartyCancelledInstruction);
		codesByName.put(DisagreementChargesAmount.getCodeName().get(), DisagreementChargesAmount);
		codesByName.put(IncorrectBuyerOrSeller.getCodeName().get(), IncorrectBuyerOrSeller);
		codesByName.put(DisagreementCurrencySettlementAmount.getCodeName().get(), DisagreementCurrencySettlementAmount);
		codesByName.put(NoMatchingStarted.getCodeName().get(), NoMatchingStarted);
		codesByName.put(DisagreementSafekeepingAccount.getCodeName().get(), DisagreementSafekeepingAccount);
		codesByName.put(DisagreementTradeDate.getCodeName().get(), DisagreementTradeDate);
		codesByName.put(YourInstructionTooLateForMatching.getCodeName().get(), YourInstructionTooLateForMatching);
		codesByName.put(DisagreementClosingDateTime.getCodeName().get(), DisagreementClosingDateTime);
		codesByName.put(DisagreementReceivingOrDeliveringCustodian.getCodeName().get(), DisagreementReceivingOrDeliveringCustodian);
	}

	public static UnmatchedStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnmatchedStatusReason1Code[] values() {
		UnmatchedStatusReason1Code[] values = new UnmatchedStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnmatchedStatusReason1Code> {
		@Override
		public UnmatchedStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnmatchedStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason the transaction/instruction is unmatched.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmMatchingInstructionNotFound
 * UnmatchedStatusReason1Code.mmMatchingInstructionNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementSettlementDate
 * UnmatchedStatusReason1Code.mmDisagreementSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementDirectionOfTrade
 * UnmatchedStatusReason1Code.mmDisagreementDirectionOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementPlaceOfSettlement
 * UnmatchedStatusReason1Code.mmDisagreementPlaceOfSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementSettlementAmount
 * UnmatchedStatusReason1Code.mmDisagreementSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementDealPrice
 * UnmatchedStatusReason1Code.mmDisagreementDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementQuantity
 * UnmatchedStatusReason1Code.mmDisagreementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementRepurchaseCallDelay
 * UnmatchedStatusReason1Code.mmDisagreementRepurchaseCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementSettlementTransaction
 * UnmatchedStatusReason1Code.mmDisagreementSettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementSecurity
 * UnmatchedStatusReason1Code.mmDisagreementSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementVariableRateSupport
 * UnmatchedStatusReason1Code.mmDisagreementVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmNotRecognised
 * UnmatchedStatusReason1Code.mmNotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementRepurchaseSpreadRate
 * UnmatchedStatusReason1Code.mmDisagreementRepurchaseSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementRepurchaseRate
 * UnmatchedStatusReason1Code.mmDisagreementRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmCounterpartyTooLateForMatching
 * UnmatchedStatusReason1Code.mmCounterpartyTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementRepurchaseRateType
 * UnmatchedStatusReason1Code.mmDisagreementRepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementRepurchaseAmount
 * UnmatchedStatusReason1Code.mmDisagreementRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementRepurchasePremiumAmount
 * UnmatchedStatusReason1Code.mmDisagreementRepurchasePremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementPhysicalSettlement
 * UnmatchedStatusReason1Code.mmDisagreementPhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementCommonReference
 * UnmatchedStatusReason1Code.mmDisagreementCommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementPaymentCode
 * UnmatchedStatusReason1Code.mmDisagreementPaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementPlaceOfTrade
 * UnmatchedStatusReason1Code.mmDisagreementPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmPossibleDuplicateInstruction
 * UnmatchedStatusReason1Code.mmPossibleDuplicateInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementForfeitRepurchaseamount
 * UnmatchedStatusReason1Code.mmDisagreementForfeitRepurchaseamount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementRegistrationDetails
 * UnmatchedStatusReason1Code.mmDisagreementRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementRTGSSystem
 * UnmatchedStatusReason1Code.mmDisagreementRTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmIncorrectAgent
 * UnmatchedStatusReason1Code.mmIncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmCounterpartyCancelledInstruction
 * UnmatchedStatusReason1Code.mmCounterpartyCancelledInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementChargesAmount
 * UnmatchedStatusReason1Code.mmDisagreementChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmIncorrectBuyerOrSeller
 * UnmatchedStatusReason1Code.mmIncorrectBuyerOrSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementCurrencySettlementAmount
 * UnmatchedStatusReason1Code.mmDisagreementCurrencySettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmNoMatchingStarted
 * UnmatchedStatusReason1Code.mmNoMatchingStarted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementSafekeepingAccount
 * UnmatchedStatusReason1Code.mmDisagreementSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementTradeDate
 * UnmatchedStatusReason1Code.mmDisagreementTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmYourInstructionTooLateForMatching
 * UnmatchedStatusReason1Code.mmYourInstructionTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementClosingDateTime
 * UnmatchedStatusReason1Code.mmDisagreementClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedStatusReason1Code#mmDisagreementReceivingOrDeliveringCustodian
 * UnmatchedStatusReason1Code.mmDisagreementReceivingOrDeliveringCustodian}</li>
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
 * <li>"CMIS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnmatchedStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is unmatched."</li>
 * </ul>
 */
public class UnmatchedStatusReason1Code {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingInstructionNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Matching instruction from the counterparty could not be found."</li>
	 * </ul>
	 */
	public static final MMCode mmMatchingInstructionNotFound = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingInstructionNotFound";
			definition = "Matching instruction from the counterparty could not be found.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "CMIS";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the settlement date/time."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementSettlementDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSettlementDate";
			definition = "Counterparty disagrees with the settlement date/time.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DDAT";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementDirectionOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty expects a delivery not a receipt, or counterparty expects a receipt not a delivery."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementDirectionOfTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementDirectionOfTrade";
			definition = "Counterparty expects a delivery not a receipt, or counterparty expects a receipt not a delivery.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DELN";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementPlaceOfSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the place of settlement."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementPlaceOfSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementPlaceOfSettlement";
			definition = "Counterparty disagrees with the place of settlement.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DEPT";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the settlement amount."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementSettlementAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSettlementAmount";
			definition = "Counterparty disagrees with the settlement amount.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DMON";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementDealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the deal price."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementDealPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementDealPrice";
			definition = "Counterparty disagrees with the deal price.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DDEA";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty disagrees with the quantity of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementQuantity";
			definition = "Counterparty disagrees with the quantity of the financial instrument.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DQUA";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase call delay does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementRepurchaseCallDelay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseCallDelay";
			definition = "Repurchase call delay does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "CADE";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSettlementTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement transaction type does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementSettlementTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSettlementTransaction";
			definition = "Settlement transaction type does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "SETR";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty disagrees with the security/issue, eg, ISIN or a financial instrument attribute differs."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSecurity";
			definition = "Counterparty disagrees with the security/issue, eg, ISIN or a financial instrument attribute differs.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DSEC";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementVariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variable rate support does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementVariableRateSupport = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementVariableRateSupport";
			definition = "Variable rate support does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "VASU";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotRecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty does not recognise the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmNotRecognised = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotRecognised";
			definition = "Counterparty does not recognise the transaction.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DTRA";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseSpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase spread rate does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementRepurchaseSpreadRate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseSpreadRate";
			definition = "Repurchase spread rate does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "RSPR";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementRepurchaseRate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseRate";
			definition = "Repurchase rate does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "REPO";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty's instruction was too late."</li>
	 * </ul>
	 */
	public static final MMCode mmCounterpartyTooLateForMatching = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyTooLateForMatching";
			definition = "Counterparty's instruction was too late.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "CLAT";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase rate type does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementRepurchaseRateType = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseRateType";
			definition = "Repurchase rate type does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "RERT";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase amount does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementRepurchaseAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchaseAmount";
			definition = "Repurchase amount does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "REPA";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRepurchasePremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase premium amount does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementRepurchasePremiumAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRepurchasePremiumAmount";
			definition = "Repurchase premium amount does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "REPP";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementPhysicalSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instructions is for physical settlement, and yours is not, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementPhysicalSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementPhysicalSettlement";
			definition = "Counterparty's instructions is for physical settlement, and yours is not, or vice versa.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "PHYS";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementCommonReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the common reference."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementCommonReference = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementCommonReference";
			definition = "Counterparty disagrees with the common reference.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "IIND";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementPaymentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty's instructions is for free settlement, and yours is for settlement against payment, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementPaymentCode = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementPaymentCode";
			definition = "Counterparty's instructions is for free settlement, and yours is for settlement against payment, or vice versa.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "FRAP";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementPlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of trade does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementPlaceOfTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementPlaceOfTrade";
			definition = "Place of trade does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "PLCE";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicateInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is a possible duplicate."</li>
	 * </ul>
	 */
	public static final MMCode mmPossibleDuplicateInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PossibleDuplicateInstruction";
			definition = "Instruction is a possible duplicate.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "PODU";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementForfeitRepurchaseamount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Repurchase forfeit amount does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementForfeitRepurchaseamount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementForfeitRepurchaseamount";
			definition = "Repurchase forfeit amount does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "FORF";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Discrepancies exist in the registration details linked to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementRegistrationDetails = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRegistrationDetails";
			definition = "Discrepancies exist in the registration details linked to the transaction.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "REGD";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementRTGSSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty indicates a settlement via RTGS system and you indicate non-RTGS settlement, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementRTGSSystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementRTGSSystem";
			definition = "Counterparty indicates a settlement via RTGS system and you indicate non-RTGS settlement, or vice versa.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "RTGS";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty indicated an incorrect delivery or receiving agent."</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectAgent";
			definition = "Counterparty indicated an incorrect delivery or receiving agent.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "ICAG";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancelledInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty has cancelled the transaction/instruction."</li>
	 * </ul>
	 */
	public static final MMCode mmCounterpartyCancelledInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyCancelledInstruction";
			definition = "Counterparty has cancelled the transaction/instruction.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "CPCA";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementChargesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees on the amount of charges."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementChargesAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementChargesAmount";
			definition = "Counterparty disagrees on the amount of charges.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "CHAR";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectBuyerOrSeller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction indicates an incorrect buyer (receiver) or seller (deliverer)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectBuyerOrSeller = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncorrectBuyerOrSeller";
			definition = "Instruction indicates an incorrect buyer (receiver) or seller (deliverer).";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "IEXE";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementCurrencySettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterparty disagrees with the currency of the settlement amount."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementCurrencySettlementAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementCurrencySettlementAmount";
			definition = "Counterparty disagrees with the currency of the settlement amount.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "NCRR";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingStarted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Matching process has not yet started."</li>
	 * </ul>
	 */
	public static final MMCode mmNoMatchingStarted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoMatchingStarted";
			definition = "Matching process has not yet started.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "NMAS";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementSafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Safekeeping account used as a matching criteria on the market concerned  does not match."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementSafekeepingAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementSafekeepingAccount";
			definition = "Safekeeping account used as a matching criteria on the market concerned  does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "SAFE";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty disagrees with the trade date."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementTradeDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementTradeDate";
			definition = "Counterparty disagrees with the trade date.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "DTRD";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YourInstructionTooLateForMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction received too late for matching."</li>
	 * </ul>
	 */
	public static final MMCode mmYourInstructionTooLateForMatching = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YourInstructionTooLateForMatching";
			definition = "Instruction received too late for matching.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "LATE";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementClosingDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Closing date/time does not match."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementClosingDateTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementClosingDateTime";
			definition = "Closing date/time does not match.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "TERM";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementReceivingOrDeliveringCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incorrect delivering or receiving custodian."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementReceivingOrDeliveringCustodian = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisagreementReceivingOrDeliveringCustodian";
			definition = "Incorrect delivering or receiving custodian.";
			owner_lazy = () -> UnmatchedStatusReason1Code.mmObject();
			codeName = "ICUS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CMIS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnmatchedStatusReason1Code";
				definition = "Specifies the reason the transaction/instruction is unmatched.";
				code_lazy = () -> Arrays.asList(UnmatchedStatusReason1Code.mmMatchingInstructionNotFound, UnmatchedStatusReason1Code.mmDisagreementSettlementDate, UnmatchedStatusReason1Code.mmDisagreementDirectionOfTrade,
						UnmatchedStatusReason1Code.mmDisagreementPlaceOfSettlement, UnmatchedStatusReason1Code.mmDisagreementSettlementAmount, UnmatchedStatusReason1Code.mmDisagreementDealPrice,
						UnmatchedStatusReason1Code.mmDisagreementQuantity, UnmatchedStatusReason1Code.mmDisagreementRepurchaseCallDelay, UnmatchedStatusReason1Code.mmDisagreementSettlementTransaction,
						UnmatchedStatusReason1Code.mmDisagreementSecurity, UnmatchedStatusReason1Code.mmDisagreementVariableRateSupport, UnmatchedStatusReason1Code.mmNotRecognised,
						UnmatchedStatusReason1Code.mmDisagreementRepurchaseSpreadRate, UnmatchedStatusReason1Code.mmDisagreementRepurchaseRate, UnmatchedStatusReason1Code.mmCounterpartyTooLateForMatching,
						UnmatchedStatusReason1Code.mmDisagreementRepurchaseRateType, UnmatchedStatusReason1Code.mmDisagreementRepurchaseAmount, UnmatchedStatusReason1Code.mmDisagreementRepurchasePremiumAmount,
						UnmatchedStatusReason1Code.mmDisagreementPhysicalSettlement, UnmatchedStatusReason1Code.mmDisagreementCommonReference, UnmatchedStatusReason1Code.mmDisagreementPaymentCode,
						UnmatchedStatusReason1Code.mmDisagreementPlaceOfTrade, UnmatchedStatusReason1Code.mmPossibleDuplicateInstruction, UnmatchedStatusReason1Code.mmDisagreementForfeitRepurchaseamount,
						UnmatchedStatusReason1Code.mmDisagreementRegistrationDetails, UnmatchedStatusReason1Code.mmDisagreementRTGSSystem, UnmatchedStatusReason1Code.mmIncorrectAgent,
						UnmatchedStatusReason1Code.mmCounterpartyCancelledInstruction, UnmatchedStatusReason1Code.mmDisagreementChargesAmount, UnmatchedStatusReason1Code.mmIncorrectBuyerOrSeller,
						UnmatchedStatusReason1Code.mmDisagreementCurrencySettlementAmount, UnmatchedStatusReason1Code.mmNoMatchingStarted, UnmatchedStatusReason1Code.mmDisagreementSafekeepingAccount,
						UnmatchedStatusReason1Code.mmDisagreementTradeDate, UnmatchedStatusReason1Code.mmYourInstructionTooLateForMatching, UnmatchedStatusReason1Code.mmDisagreementClosingDateTime,
						UnmatchedStatusReason1Code.mmDisagreementReceivingOrDeliveringCustodian);
			}
		});
		return mmObject_lazy.get();
	}
}
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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the securities or investment fund balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmAvailableWithNoAdditionalStatus
 * SecuritiesBalanceTypeDraftV3Code.mmAvailableWithNoAdditionalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmBlocked
 * SecuritiesBalanceTypeDraftV3Code.mmBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmAvailable
 * SecuritiesBalanceTypeDraftV3Code.mmAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmBlockedCorporateAction
 * SecuritiesBalanceTypeDraftV3Code.mmBlockedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmBlockedTrading
 * SecuritiesBalanceTypeDraftV3Code.mmBlockedTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmBlockedAuthenticity
 * SecuritiesBalanceTypeDraftV3Code.mmBlockedAuthenticity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmBorrowed
 * SecuritiesBalanceTypeDraftV3Code.mmBorrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingBorrowedDelivery
 * SecuritiesBalanceTypeDraftV3Code.mmPendingBorrowedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingBorrowedReceipt
 * SecuritiesBalanceTypeDraftV3Code.mmPendingBorrowedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmCollateralIn
 * SecuritiesBalanceTypeDraftV3Code.mmCollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmCollateralOut
 * SecuritiesBalanceTypeDraftV3Code.mmCollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmEligibleForCollateralPurposes
 * SecuritiesBalanceTypeDraftV3Code.mmEligibleForCollateralPurposes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmOnLoan
 * SecuritiesBalanceTypeDraftV3Code.mmOnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingOnLoanDelivery
 * SecuritiesBalanceTypeDraftV3Code.mmPendingOnLoanDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingOnLoanReceipt
 * SecuritiesBalanceTypeDraftV3Code.mmPendingOnLoanReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmDerivativesMargin
 * SecuritiesBalanceTypeDraftV3Code.mmDerivativesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingDeliveryMatchedBalance
 * SecuritiesBalanceTypeDraftV3Code.mmPendingDeliveryMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingDeliveryUnmatchedBalance
 * SecuritiesBalanceTypeDraftV3Code.mmPendingDeliveryUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingReceiptMatchedBalance
 * SecuritiesBalanceTypeDraftV3Code.mmPendingReceiptMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingReceiptUnmatchedBalance
 * SecuritiesBalanceTypeDraftV3Code.mmPendingReceiptUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingCorporateActionReceipt
 * SecuritiesBalanceTypeDraftV3Code.mmPendingCorporateActionReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingCorporateActionDelivery
 * SecuritiesBalanceTypeDraftV3Code.mmPendingCorporateActionDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingDelivery
 * SecuritiesBalanceTypeDraftV3Code.mmPendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPendingReceipt
 * SecuritiesBalanceTypeDraftV3Code.mmPendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPledged
 * SecuritiesBalanceTypeDraftV3Code.mmPledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmOutForRegistration
 * SecuritiesBalanceTypeDraftV3Code.mmOutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmRestricted
 * SecuritiesBalanceTypeDraftV3Code.mmRestricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmUnclassified
 * SecuritiesBalanceTypeDraftV3Code.mmUnclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmInTransshipment
 * SecuritiesBalanceTypeDraftV3Code.mmInTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmDrawn
 * SecuritiesBalanceTypeDraftV3Code.mmDrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmTaxExempt
 * SecuritiesBalanceTypeDraftV3Code.mmTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmNonTaxExempt
 * SecuritiesBalanceTypeDraftV3Code.mmNonTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmRegistered
 * SecuritiesBalanceTypeDraftV3Code.mmRegistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmStreetPosition
 * SecuritiesBalanceTypeDraftV3Code.mmStreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmUnregistered
 * SecuritiesBalanceTypeDraftV3Code.mmUnregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmWaitingDocumentation
 * SecuritiesBalanceTypeDraftV3Code.mmWaitingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmBeingTransferred
 * SecuritiesBalanceTypeDraftV3Code.mmBeingTransferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmIssued
 * SecuritiesBalanceTypeDraftV3Code.mmIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmQuasiIssued
 * SecuritiesBalanceTypeDraftV3Code.mmQuasiIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmOverdueNetPending
 * SecuritiesBalanceTypeDraftV3Code.mmOverdueNetPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmNetPending
 * SecuritiesBalanceTypeDraftV3Code.mmNetPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPurchasedInvestmentFundTaxGroupUnit1
 * SecuritiesBalanceTypeDraftV3Code.mmPurchasedInvestmentFundTaxGroupUnit1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#mmPurchasedInvestmentFundTaxGroupUnit2
 * SecuritiesBalanceTypeDraftV3Code.mmPurchasedInvestmentFundTaxGroupUnit2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
 * SecuritiesBalanceType14Code}</li>
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
 * <li>"AWAS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceTypeDraftV3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the securities or investment fund balance."</li>
 * </ul>
 */
public class SecuritiesBalanceTypeDraftV3Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Balance of financial instruments that are freely available with no
	 * specific additional status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AWAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoAdditionalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are freely available with no specific additional status."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAvailableWithNoAdditionalStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoAdditionalStatus";
			definition = "Balance of financial instruments that are freely available with no specific additional status.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "AWAS";
		}
	};
	/**
	 * Balance of financial instruments that are blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are blocked."</li>
	 * </ul>
	 */
	public static final MMCode mmBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Balance of financial instruments that are blocked.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "BLOK";
		}
	};
	/**
	 * Balance of financial instruments that are available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of financial instruments that are available."</li>
	 * </ul>
	 */
	public static final MMCode mmAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			definition = "Balance of financial instruments that are available.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "AVAI";
		}
	};
	/**
	 * Balance of financial instrument blocked following a corporate action,
	 * including proxy activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instrument blocked following a corporate action, including proxy activities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlockedCorporateAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedCorporateAction";
			definition = "Balance of financial instrument blocked following a corporate action, including proxy activities.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "BLCA";
		}
	};
	/**
	 * Balance of financial instruments that are blocked for trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are blocked for trading."</li>
	 * </ul>
	 */
	public static final MMCode mmBlockedTrading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrading";
			definition = "Balance of financial instruments that are blocked for trading.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "BLOT";
		}
	};
	/**
	 * Balance of financial instruments that are blocked for verification of
	 * authenticity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAuthenticity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are blocked for verification of authenticity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBlockedAuthenticity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAuthenticity";
			definition = "Balance of financial instruments that are blocked for verification of authenticity.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "BLOV";
		}
	};
	/**
	 * Balance of financial instruments that have been borrowed from another
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that have been borrowed from another party."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBorrowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "BORR";
		}
	};
	/**
	 * Balance of financial instruments that are pending delivery in relation to
	 * a borrow transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBorrowedDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending delivery in relation to a borrow transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingBorrowedDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedDelivery";
			definition = "Balance of financial instruments that are pending delivery in relation to a borrow transaction.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "BODE";
		}
	};
	/**
	 * Balance of financial instruments that are pending receipt in relation to
	 * a borrow transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBorrowedReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending receipt in relation to a borrow transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingBorrowedReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedReceipt";
			definition = "Balance of financial instruments that are pending receipt in relation to a borrow transaction.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "BORE";
		}
	};
	/**
	 * Balance of securities that belong to a third party and that are held for
	 * the purpose of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to a third party and that are held for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollateralIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "COLI";
		}
	};
	/**
	 * Balance of securities that belong to the safekeeping account indicated
	 * within this message, and are deposited with a third party for the purpose
	 * of collateralisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollateralOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Balance of securities that are eligible for use for collateral purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateralPurposes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that are eligible for use for collateral purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEligibleForCollateralPurposes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposes";
			definition = "Balance of securities that are eligible for use for collateral purposes.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "COLA";
		}
	};
	/**
	 * Loan for consumption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Loan for consumption."</li>
	 * </ul>
	 */
	public static final MMCode mmOnLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			definition = "Loan for consumption.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "LOAN";
		}
	};
	/**
	 * Balance of financial instruments that are pending delivery in relation to
	 * a lending transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending delivery in relation to a lending transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingOnLoanDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanDelivery";
			definition = "Balance of financial instruments that are pending delivery in relation to a lending transaction.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "LODE";
		}
	};
	/**
	 * Balance of financial instruments that are pending receipt in relation to
	 * a lending transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are pending receipt in relation to a lending transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingOnLoanReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanReceipt";
			definition = "Balance of financial instruments that are pending receipt in relation to a lending transaction.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "LORE";
		}
	};
	/**
	 * Account is used when financing is by the broker/dealer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativesMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used when financing is by the broker/dealer."</li>
	 * </ul>
	 */
	public static final MMCode mmDerivativesMargin = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativesMargin";
			definition = "Account is used when financing is by the broker/dealer.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "MARG";
		}
	};
	/**
	 * Balance of financial instruments pending delivery that have been matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryMatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments pending delivery that have been matched."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingDeliveryMatchedBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryMatchedBalance";
			definition = "Balance of financial instruments pending delivery that have been matched.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PDMT";
		}
	};
	/**
	 * Balance of financial instruments pending delivery that have been
	 * unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDUM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryUnmatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments pending delivery that have been unmatched."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingDeliveryUnmatchedBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryUnmatchedBalance";
			definition = "Balance of financial instruments pending delivery that have been unmatched.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PDUM";
		}
	};
	/**
	 * Balance of financial instruments pending receipt that have been matched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptMatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments pending receipt that have been matched."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingReceiptMatchedBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptMatchedBalance";
			definition = "Balance of financial instruments pending receipt that have been matched.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PRMT";
		}
	};
	/**
	 * Balance of financial instruments pending receipt that are unmatched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRUM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptUnmatchedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments pending receipt that are unmatched."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingReceiptUnmatchedBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptUnmatchedBalance";
			definition = "Balance of financial instruments pending receipt that are unmatched.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PRUM";
		}
	};
	/**
	 * Balance of financial instrument pending receipt following a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PECA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instrument pending receipt following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingCorporateActionReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionReceipt";
			definition = "Balance of financial instrument pending receipt following a corporate action.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PECA";
		}
	};
	/**
	 * Balance of financial instrument pending delivery following a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instrument pending delivery following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingCorporateActionDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionDelivery";
			definition = "Balance of financial instrument pending delivery following a corporate action.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PEDA";
		}
	};
	/**
	 * Processing has not been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing has not been completed."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			definition = "Processing has not been completed.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * The instruction is pending receipt of securities, for example, from a
	 * purchase, loan etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The instruction is pending receipt of securities, for example, from a purchase, loan etc."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			definition = "The instruction is pending receipt of securities, for example, from a purchase, loan etc.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PENR";
		}
	};
	/**
	 * Balance of securities that belong to and is kept in the safekeeping
	 * account indicated within this message, and that are pledged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPledged = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PLED";
		}
	};
	/**
	 * Balance of financial instruments currently being processed by the
	 * institution responsible for registering the new beneficial owner (or
	 * nominee).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOutForRegistration = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "REGO";
		}
	};
	/**
	 * Balance of financial instruments that may only be sold under certain
	 * conditions or require legal documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that may only be sold under certain conditions or require legal documents."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRestricted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			definition = "Balance of financial instruments that may only be sold under certain conditions or require legal documents.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "RSTR";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final MMCode mmUnclassified = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			definition = "Other. See Narrative.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Transaction has been generated due to transformation following a
	 * corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has been generated due to transformation following a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInTransshipment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			definition = "Transaction has been generated due to transformation following a corporate action.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Settlement transactions relates to drawn securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement transactions relates to drawn securities."</li>
	 * </ul>
	 */
	public static final MMCode mmDrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Tax-exempt financial instruments are to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax-exempt financial instruments are to be settled."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExempt";
			definition = "Tax-exempt financial instruments are to be settled.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "CLEN";
		}
	};
	/**
	 * Taxable financial instruments are to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonTaxExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxable financial instruments are to be settled."</li>
	 * </ul>
	 */
	public static final MMCode mmNonTaxExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonTaxExempt";
			definition = "Taxable financial instruments are to be settled.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "DIRT";
		}
	};
	/**
	 * Balance of financial instruments that are registered (in nominee name or
	 * in the name of the beneficial owner).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRegistered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			definition = "Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner).";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * Balance of financial instruments that remain registered in the name of
	 * the prior beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that remain registered in the name of the prior beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStreetPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "SPOS";
		}
	};
	/**
	 * Balance of securities that could not be registered due to foreign
	 * ownership limitation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unregistered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities that could not be registered due to foreign ownership limitation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnregistered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unregistered";
			definition = "Balance of securities that could not be registered due to foreign ownership limitation.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "UNRG";
		}
	};
	/**
	 * Financial instrument is unavailable due to missing or incomplete
	 * documentation pertaining to the account, or due to a missing or
	 * incomplete order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWaitingDocumentation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingDocumentation";
			definition = "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "WDOC";
		}
	};
	/**
	 * Financial instrument is unavailable as a result of a transfer order,
	 * pending movement in the shareholders' register.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingTransferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBeingTransferred = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingTransferred";
			definition = "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "BTRA";
		}
	};
	/**
	 * In issuer agent / depository communication, balance of issued financial
	 * instruments for which legal documentation has been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			definition = "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * In Issuer Agent / Depository communication, balance of issued financial
	 * instruments for which legal documentation has not yet been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In Issuer Agent / Depository communication, balance of issued financial instruments for which legal documentation has not yet been received."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmQuasiIssued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiIssued";
			definition = "In Issuer Agent / Depository communication, balance of issued financial instruments for which legal documentation has not yet been received.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "QUAS";
		}
	};
	/**
	 * Net balance of financial instrument that is traded pending settlement and
	 * settlement is overdue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverdueNetPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net balance of financial instrument that is traded pending settlement and settlement is overdue."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOverdueNetPending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverdueNetPending";
			definition = "Net balance of financial instrument that is traded pending settlement and settlement is overdue.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "OPNT";
		}
	};
	/**
	 * Net balance of financial instrument that is traded pending settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net balance of financial instrument that is traded pending settlement."</li>
	 * </ul>
	 */
	public static final MMCode mmNetPending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPending";
			definition = "Net balance of financial instrument that is traded pending settlement.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "PNET";
		}
	};
	/**
	 * Purchased investment fund units that were purchased prior to the last
	 * ex-div date.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRP1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchasedInvestmentFundTaxGroupUnit1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchased investment fund units that were purchased prior to the last ex-div date.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPurchasedInvestmentFundTaxGroupUnit1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchasedInvestmentFundTaxGroupUnit1";
			definition = "Purchased investment fund units that were purchased prior to the last ex-div date.\r\n";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "GRP1";
		}
	};
	/**
	 * Purchased investment fund units that were purchased since the ex-div
	 * date, and that benefit from the tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code
	 * SecuritiesBalanceTypeDraftV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRP2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchasedInvestmentFundTaxGroupUnit2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchased investment fund units that were purchased since the ex-div date, and that benefit from the tax exemption."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPurchasedInvestmentFundTaxGroupUnit2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchasedInvestmentFundTaxGroupUnit2";
			definition = "Purchased investment fund units that were purchased since the ex-div date, and that benefit from the tax exemption.";
			owner_lazy = () -> SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "GRP2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("AWAS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceTypeDraftV3Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmAvailableWithNoAdditionalStatus, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmBlocked,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmAvailable, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmBlockedCorporateAction,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmBlockedTrading, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmBlockedAuthenticity,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmBorrowed, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingBorrowedDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingBorrowedReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmCollateralIn,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmCollateralOut, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmEligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmOnLoan, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingOnLoanDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingOnLoanReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmDerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingDeliveryMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingDeliveryUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingReceiptMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingReceiptUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingCorporateActionReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingCorporateActionDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingDelivery, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPendingReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPledged, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmOutForRegistration,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmRestricted, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmUnclassified,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmInTransshipment, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmDrawn,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmTaxExempt, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmNonTaxExempt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmRegistered, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmStreetPosition,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmUnregistered, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmWaitingDocumentation,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmBeingTransferred, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmIssued,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmQuasiIssued, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmOverdueNetPending,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmNetPending, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPurchasedInvestmentFundTaxGroupUnit1,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmPurchasedInvestmentFundTaxGroupUnit2);
				derivation_lazy = () -> Arrays.asList(SecuritiesBalanceType14Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
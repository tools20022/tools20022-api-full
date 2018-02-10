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
import com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the securities or investment fund balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#AvailableWithNoAdditionalStatus
 * SecuritiesBalanceTypeDraftV3Code.AvailableWithNoAdditionalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Blocked
 * SecuritiesBalanceTypeDraftV3Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Available
 * SecuritiesBalanceTypeDraftV3Code.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#BlockedCorporateAction
 * SecuritiesBalanceTypeDraftV3Code.BlockedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#BlockedTrading
 * SecuritiesBalanceTypeDraftV3Code.BlockedTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#BlockedAuthenticity
 * SecuritiesBalanceTypeDraftV3Code.BlockedAuthenticity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Borrowed
 * SecuritiesBalanceTypeDraftV3Code.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingBorrowedDelivery
 * SecuritiesBalanceTypeDraftV3Code.PendingBorrowedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingBorrowedReceipt
 * SecuritiesBalanceTypeDraftV3Code.PendingBorrowedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#CollateralIn
 * SecuritiesBalanceTypeDraftV3Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#CollateralOut
 * SecuritiesBalanceTypeDraftV3Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#EligibleForCollateralPurposes
 * SecuritiesBalanceTypeDraftV3Code.EligibleForCollateralPurposes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#OnLoan
 * SecuritiesBalanceTypeDraftV3Code.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingOnLoanDelivery
 * SecuritiesBalanceTypeDraftV3Code.PendingOnLoanDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingOnLoanReceipt
 * SecuritiesBalanceTypeDraftV3Code.PendingOnLoanReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#DerivativesMargin
 * SecuritiesBalanceTypeDraftV3Code.DerivativesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingDeliveryMatchedBalance
 * SecuritiesBalanceTypeDraftV3Code.PendingDeliveryMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingDeliveryUnmatchedBalance
 * SecuritiesBalanceTypeDraftV3Code.PendingDeliveryUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingReceiptMatchedBalance
 * SecuritiesBalanceTypeDraftV3Code.PendingReceiptMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingReceiptUnmatchedBalance
 * SecuritiesBalanceTypeDraftV3Code.PendingReceiptUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingCorporateActionReceipt
 * SecuritiesBalanceTypeDraftV3Code.PendingCorporateActionReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingCorporateActionDelivery
 * SecuritiesBalanceTypeDraftV3Code.PendingCorporateActionDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingDelivery
 * SecuritiesBalanceTypeDraftV3Code.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PendingReceipt
 * SecuritiesBalanceTypeDraftV3Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Pledged
 * SecuritiesBalanceTypeDraftV3Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#OutForRegistration
 * SecuritiesBalanceTypeDraftV3Code.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Restricted
 * SecuritiesBalanceTypeDraftV3Code.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Unclassified
 * SecuritiesBalanceTypeDraftV3Code.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#InTransshipment
 * SecuritiesBalanceTypeDraftV3Code.InTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Drawn
 * SecuritiesBalanceTypeDraftV3Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#TaxExempt
 * SecuritiesBalanceTypeDraftV3Code.TaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#NonTaxExempt
 * SecuritiesBalanceTypeDraftV3Code.NonTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Registered
 * SecuritiesBalanceTypeDraftV3Code.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#StreetPosition
 * SecuritiesBalanceTypeDraftV3Code.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Unregistered
 * SecuritiesBalanceTypeDraftV3Code.Unregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#WaitingDocumentation
 * SecuritiesBalanceTypeDraftV3Code.WaitingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#BeingTransferred
 * SecuritiesBalanceTypeDraftV3Code.BeingTransferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#Issued
 * SecuritiesBalanceTypeDraftV3Code.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#QuasiIssued
 * SecuritiesBalanceTypeDraftV3Code.QuasiIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#OverdueNetPending
 * SecuritiesBalanceTypeDraftV3Code.OverdueNetPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#NetPending
 * SecuritiesBalanceTypeDraftV3Code.NetPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PurchasedInvestmentFundTaxGroupUnit1
 * SecuritiesBalanceTypeDraftV3Code.PurchasedInvestmentFundTaxGroupUnit1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code#PurchasedInvestmentFundTaxGroupUnit2
 * SecuritiesBalanceTypeDraftV3Code.PurchasedInvestmentFundTaxGroupUnit2}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceTypeDraftV3Code extends MMCode {

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
	public static final SecuritiesBalanceTypeDraftV3Code AvailableWithNoAdditionalStatus = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoAdditionalStatus";
			definition = "Balance of financial instruments that are freely available with no specific additional status.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Blocked = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			definition = "Balance of financial instruments that are blocked.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Available = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			definition = "Balance of financial instruments that are available.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code BlockedCorporateAction = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedCorporateAction";
			definition = "Balance of financial instrument blocked following a corporate action, including proxy activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code BlockedTrading = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrading";
			definition = "Balance of financial instruments that are blocked for trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code BlockedAuthenticity = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAuthenticity";
			definition = "Balance of financial instruments that are blocked for verification of authenticity.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Borrowed = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			definition = "Balance of financial instruments that have been borrowed from another party.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingBorrowedDelivery = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedDelivery";
			definition = "Balance of financial instruments that are pending delivery in relation to a borrow transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingBorrowedReceipt = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedReceipt";
			definition = "Balance of financial instruments that are pending receipt in relation to a borrow transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code CollateralIn = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			definition = "Balance of securities that belong to a third party and that are held for the purpose of collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code CollateralOut = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			definition = "Balance of securities that belong to the safekeeping account indicated within this message, and are deposited with a third party for the purpose of collateralisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code EligibleForCollateralPurposes = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposes";
			definition = "Balance of securities that are eligible for use for collateral purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code OnLoan = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			definition = "Loan for consumption.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingOnLoanDelivery = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanDelivery";
			definition = "Balance of financial instruments that are pending delivery in relation to a lending transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingOnLoanReceipt = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanReceipt";
			definition = "Balance of financial instruments that are pending receipt in relation to a lending transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code DerivativesMargin = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativesMargin";
			definition = "Account is used when financing is by the broker/dealer.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingDeliveryMatchedBalance = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryMatchedBalance";
			definition = "Balance of financial instruments pending delivery that have been matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingDeliveryUnmatchedBalance = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryUnmatchedBalance";
			definition = "Balance of financial instruments pending delivery that have been unmatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingReceiptMatchedBalance = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptMatchedBalance";
			definition = "Balance of financial instruments pending receipt that have been matched.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingReceiptUnmatchedBalance = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptUnmatchedBalance";
			definition = "Balance of financial instruments pending receipt that are unmatched.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingCorporateActionReceipt = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionReceipt";
			definition = "Balance of financial instrument pending receipt following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingCorporateActionDelivery = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionDelivery";
			definition = "Balance of financial instrument pending delivery following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingDelivery = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			definition = "Processing has not been completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PendingReceipt = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			definition = "The instruction is pending receipt of securities, for example, from a purchase, loan etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Pledged = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			definition = "Balance of securities that belong to and is kept in the safekeeping account indicated within this message, and that are pledged.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code OutForRegistration = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			definition = "Balance of financial instruments currently being processed by the institution responsible for registering the new beneficial owner (or nominee).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Restricted = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			definition = "Balance of financial instruments that may only be sold under certain conditions or require legal documents.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Unclassified = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code InTransshipment = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			definition = "Transaction has been generated due to transformation following a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Drawn = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			definition = "Settlement transactions relates to drawn securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code TaxExempt = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExempt";
			definition = "Tax-exempt financial instruments are to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code NonTaxExempt = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonTaxExempt";
			definition = "Taxable financial instruments are to be settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Registered = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			definition = "Balance of financial instruments that are registered (in nominee name or in the name of the beneficial owner).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code StreetPosition = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			definition = "Balance of financial instruments that remain registered in the name of the prior beneficial owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Unregistered = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unregistered";
			definition = "Balance of securities that could not be registered due to foreign ownership limitation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code WaitingDocumentation = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingDocumentation";
			definition = "Financial instrument is unavailable due to missing or incomplete documentation pertaining to the account, or due to a missing or incomplete order.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code BeingTransferred = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingTransferred";
			definition = "Financial instrument is unavailable as a result of a transfer order, pending movement in the shareholders' register.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code Issued = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			definition = "In issuer agent / depository communication, balance of issued financial instruments for which legal documentation has been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code QuasiIssued = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiIssued";
			definition = "In Issuer Agent / Depository communication, balance of issued financial instruments for which legal documentation has not yet been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code OverdueNetPending = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverdueNetPending";
			definition = "Net balance of financial instrument that is traded pending settlement and settlement is overdue.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code NetPending = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPending";
			definition = "Net balance of financial instrument that is traded pending settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PurchasedInvestmentFundTaxGroupUnit1 = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchasedInvestmentFundTaxGroupUnit1";
			definition = "Purchased investment fund units that were purchased prior to the last ex-div date.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
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
	public static final SecuritiesBalanceTypeDraftV3Code PurchasedInvestmentFundTaxGroupUnit2 = new SecuritiesBalanceTypeDraftV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchasedInvestmentFundTaxGroupUnit2";
			definition = "Purchased investment fund units that were purchased since the ex-div date, and that benefit from the tax exemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.mmObject();
			codeName = "GRP2";
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceTypeDraftV3Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceTypeDraftV3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWAS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceTypeDraftV3Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				derivation_lazy = () -> Arrays.asList(SecuritiesBalanceType14Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.AvailableWithNoAdditionalStatus, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Blocked,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Available, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.BlockedCorporateAction,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.BlockedTrading, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.BlockedAuthenticity,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Borrowed, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingBorrowedDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingBorrowedReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.CollateralOut, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.EligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.OnLoan, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingOnLoanDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingOnLoanReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.DerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingDeliveryMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingDeliveryUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingReceiptMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingReceiptUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingCorporateActionReceipt, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingCorporateActionDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingDelivery, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PendingReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Pledged, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.OutForRegistration,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Restricted, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Unclassified,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.InTransshipment, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Drawn,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.TaxExempt, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.NonTaxExempt,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Registered, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.StreetPosition,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Unregistered, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.WaitingDocumentation,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.BeingTransferred, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.Issued,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.QuasiIssued, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.OverdueNetPending,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.NetPending, com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PurchasedInvestmentFundTaxGroupUnit1,
						com.tools20022.repository.codeset.SecuritiesBalanceTypeDraftV3Code.PurchasedInvestmentFundTaxGroupUnit2);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AvailableWithNoAdditionalStatus.getCodeName().get(), AvailableWithNoAdditionalStatus);
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(Available.getCodeName().get(), Available);
		codesByName.put(BlockedCorporateAction.getCodeName().get(), BlockedCorporateAction);
		codesByName.put(BlockedTrading.getCodeName().get(), BlockedTrading);
		codesByName.put(BlockedAuthenticity.getCodeName().get(), BlockedAuthenticity);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(PendingBorrowedDelivery.getCodeName().get(), PendingBorrowedDelivery);
		codesByName.put(PendingBorrowedReceipt.getCodeName().get(), PendingBorrowedReceipt);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(EligibleForCollateralPurposes.getCodeName().get(), EligibleForCollateralPurposes);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(PendingOnLoanDelivery.getCodeName().get(), PendingOnLoanDelivery);
		codesByName.put(PendingOnLoanReceipt.getCodeName().get(), PendingOnLoanReceipt);
		codesByName.put(DerivativesMargin.getCodeName().get(), DerivativesMargin);
		codesByName.put(PendingDeliveryMatchedBalance.getCodeName().get(), PendingDeliveryMatchedBalance);
		codesByName.put(PendingDeliveryUnmatchedBalance.getCodeName().get(), PendingDeliveryUnmatchedBalance);
		codesByName.put(PendingReceiptMatchedBalance.getCodeName().get(), PendingReceiptMatchedBalance);
		codesByName.put(PendingReceiptUnmatchedBalance.getCodeName().get(), PendingReceiptUnmatchedBalance);
		codesByName.put(PendingCorporateActionReceipt.getCodeName().get(), PendingCorporateActionReceipt);
		codesByName.put(PendingCorporateActionDelivery.getCodeName().get(), PendingCorporateActionDelivery);
		codesByName.put(PendingDelivery.getCodeName().get(), PendingDelivery);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(OutForRegistration.getCodeName().get(), OutForRegistration);
		codesByName.put(Restricted.getCodeName().get(), Restricted);
		codesByName.put(Unclassified.getCodeName().get(), Unclassified);
		codesByName.put(InTransshipment.getCodeName().get(), InTransshipment);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(TaxExempt.getCodeName().get(), TaxExempt);
		codesByName.put(NonTaxExempt.getCodeName().get(), NonTaxExempt);
		codesByName.put(Registered.getCodeName().get(), Registered);
		codesByName.put(StreetPosition.getCodeName().get(), StreetPosition);
		codesByName.put(Unregistered.getCodeName().get(), Unregistered);
		codesByName.put(WaitingDocumentation.getCodeName().get(), WaitingDocumentation);
		codesByName.put(BeingTransferred.getCodeName().get(), BeingTransferred);
		codesByName.put(Issued.getCodeName().get(), Issued);
		codesByName.put(QuasiIssued.getCodeName().get(), QuasiIssued);
		codesByName.put(OverdueNetPending.getCodeName().get(), OverdueNetPending);
		codesByName.put(NetPending.getCodeName().get(), NetPending);
		codesByName.put(PurchasedInvestmentFundTaxGroupUnit1.getCodeName().get(), PurchasedInvestmentFundTaxGroupUnit1);
		codesByName.put(PurchasedInvestmentFundTaxGroupUnit2.getCodeName().get(), PurchasedInvestmentFundTaxGroupUnit2);
	}

	public static SecuritiesBalanceTypeDraftV3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceTypeDraftV3Code[] values() {
		SecuritiesBalanceTypeDraftV3Code[] values = new SecuritiesBalanceTypeDraftV3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceTypeDraftV3Code> {
		@Override
		public SecuritiesBalanceTypeDraftV3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceTypeDraftV3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
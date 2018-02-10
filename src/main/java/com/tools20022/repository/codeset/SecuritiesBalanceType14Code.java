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
import com.tools20022.repository.codeset.SecuritiesBalanceType14Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the securities or investment fund balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#AvailableWithNoAdditionalStatus
 * SecuritiesBalanceType14Code.AvailableWithNoAdditionalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#BeingTransferred
 * SecuritiesBalanceType14Code.BeingTransferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#Blocked
 * SecuritiesBalanceType14Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#BlockedAuthenticity
 * SecuritiesBalanceType14Code.BlockedAuthenticity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#BlockedCorporateAction
 * SecuritiesBalanceType14Code.BlockedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#BlockedTrading
 * SecuritiesBalanceType14Code.BlockedTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#Borrowed
 * SecuritiesBalanceType14Code.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#OverdueNetPending
 * SecuritiesBalanceType14Code.OverdueNetPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#NetPending
 * SecuritiesBalanceType14Code.NetPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#CollateralIn
 * SecuritiesBalanceType14Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#CollateralOut
 * SecuritiesBalanceType14Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#DerivativesMargin
 * SecuritiesBalanceType14Code.DerivativesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#Drawn
 * SecuritiesBalanceType14Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#InTransshipment
 * SecuritiesBalanceType14Code.InTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#OnLoan
 * SecuritiesBalanceType14Code.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#OutForRegistration
 * SecuritiesBalanceType14Code.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PendingBorrowedDelivery
 * SecuritiesBalanceType14Code.PendingBorrowedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PendingBorrowedReceipt
 * SecuritiesBalanceType14Code.PendingBorrowedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PendingCorporateActionDelivery
 * SecuritiesBalanceType14Code.PendingCorporateActionDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PendingCorporateActionReceipt
 * SecuritiesBalanceType14Code.PendingCorporateActionReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PendingDelivery
 * SecuritiesBalanceType14Code.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PendingOnLoanDelivery
 * SecuritiesBalanceType14Code.PendingOnLoanDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PendingOnLoanReceipt
 * SecuritiesBalanceType14Code.PendingOnLoanReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PendingReceipt
 * SecuritiesBalanceType14Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#Pledged
 * SecuritiesBalanceType14Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#Restricted
 * SecuritiesBalanceType14Code.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#Unclassified
 * SecuritiesBalanceType14Code.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#WaitingDocumentation
 * SecuritiesBalanceType14Code.WaitingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PurchasedInvestmentFundTaxGroupUnit1
 * SecuritiesBalanceType14Code.PurchasedInvestmentFundTaxGroupUnit1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code#PurchasedInvestmentFundTaxGroupUnit2
 * SecuritiesBalanceType14Code.PurchasedInvestmentFundTaxGroupUnit2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV3Code
 * SecuritiesBalanceTypeV3Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceType14Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of the securities or investment fund balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceType14Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoAdditionalStatus"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code AvailableWithNoAdditionalStatus = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoAdditionalStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.AvailableWithNoAdditionalStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingTransferred"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code BeingTransferred = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingTransferred";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.BeingTransferred.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code Blocked = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAuthenticity"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code BlockedAuthenticity = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAuthenticity";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.BlockedAuthenticity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedCorporateAction"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code BlockedCorporateAction = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.BlockedCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrading"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code BlockedTrading = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrading";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.BlockedTrading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code Borrowed = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.Borrowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverdueNetPending"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code OverdueNetPending = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverdueNetPending";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.OverdueNetPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPending"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code NetPending = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPending";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.NetPending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code CollateralIn = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code CollateralOut = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativesMargin"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code DerivativesMargin = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativesMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.DerivativesMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code Drawn = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipment"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code InTransshipment = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.InTransshipment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code OnLoan = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.OnLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code OutForRegistration = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.OutForRegistration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBorrowedDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PendingBorrowedDelivery = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PendingBorrowedDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBorrowedReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PendingBorrowedReceipt = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PendingBorrowedReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PendingCorporateActionDelivery = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PendingCorporateActionDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PendingCorporateActionReceipt = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PendingCorporateActionReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PendingDelivery = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PendingDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PendingOnLoanDelivery = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PendingOnLoanDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PendingOnLoanReceipt = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PendingOnLoanReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PendingReceipt = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PendingReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code Pledged = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.Pledged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code Restricted = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.Restricted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code Unclassified = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.Unclassified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingDocumentation"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code WaitingDocumentation = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingDocumentation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.WaitingDocumentation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchasedInvestmentFundTaxGroupUnit1"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PurchasedInvestmentFundTaxGroupUnit1 = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchasedInvestmentFundTaxGroupUnit1";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PurchasedInvestmentFundTaxGroupUnit1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType14Code
	 * SecuritiesBalanceType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchasedInvestmentFundTaxGroupUnit2"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType14Code PurchasedInvestmentFundTaxGroupUnit2 = new SecuritiesBalanceType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchasedInvestmentFundTaxGroupUnit2";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType14Code.mmObject();
			codeName = SecuritiesBalanceTypeV3Code.PurchasedInvestmentFundTaxGroupUnit2.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceType14Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceType14Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceType14Code";
				definition = "Specifies the type of the securities or investment fund balance.";
				trace_lazy = () -> SecuritiesBalanceTypeV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceType14Code.AvailableWithNoAdditionalStatus, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.BeingTransferred,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.Blocked, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.BlockedAuthenticity,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.BlockedCorporateAction, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.BlockedTrading,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.Borrowed, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.OverdueNetPending,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.NetPending, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.CollateralOut, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.DerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.Drawn, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.InTransshipment,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.OnLoan, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.OutForRegistration,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PendingBorrowedDelivery, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PendingBorrowedReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PendingCorporateActionDelivery, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PendingCorporateActionReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PendingDelivery, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PendingOnLoanDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PendingOnLoanReceipt, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PendingReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.Pledged, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.Restricted,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.Unclassified, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.WaitingDocumentation,
						com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PurchasedInvestmentFundTaxGroupUnit1, com.tools20022.repository.codeset.SecuritiesBalanceType14Code.PurchasedInvestmentFundTaxGroupUnit2);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AvailableWithNoAdditionalStatus.getCodeName().get(), AvailableWithNoAdditionalStatus);
		codesByName.put(BeingTransferred.getCodeName().get(), BeingTransferred);
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(BlockedAuthenticity.getCodeName().get(), BlockedAuthenticity);
		codesByName.put(BlockedCorporateAction.getCodeName().get(), BlockedCorporateAction);
		codesByName.put(BlockedTrading.getCodeName().get(), BlockedTrading);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(OverdueNetPending.getCodeName().get(), OverdueNetPending);
		codesByName.put(NetPending.getCodeName().get(), NetPending);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(DerivativesMargin.getCodeName().get(), DerivativesMargin);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(InTransshipment.getCodeName().get(), InTransshipment);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(OutForRegistration.getCodeName().get(), OutForRegistration);
		codesByName.put(PendingBorrowedDelivery.getCodeName().get(), PendingBorrowedDelivery);
		codesByName.put(PendingBorrowedReceipt.getCodeName().get(), PendingBorrowedReceipt);
		codesByName.put(PendingCorporateActionDelivery.getCodeName().get(), PendingCorporateActionDelivery);
		codesByName.put(PendingCorporateActionReceipt.getCodeName().get(), PendingCorporateActionReceipt);
		codesByName.put(PendingDelivery.getCodeName().get(), PendingDelivery);
		codesByName.put(PendingOnLoanDelivery.getCodeName().get(), PendingOnLoanDelivery);
		codesByName.put(PendingOnLoanReceipt.getCodeName().get(), PendingOnLoanReceipt);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(Restricted.getCodeName().get(), Restricted);
		codesByName.put(Unclassified.getCodeName().get(), Unclassified);
		codesByName.put(WaitingDocumentation.getCodeName().get(), WaitingDocumentation);
		codesByName.put(PurchasedInvestmentFundTaxGroupUnit1.getCodeName().get(), PurchasedInvestmentFundTaxGroupUnit1);
		codesByName.put(PurchasedInvestmentFundTaxGroupUnit2.getCodeName().get(), PurchasedInvestmentFundTaxGroupUnit2);
	}

	public static SecuritiesBalanceType14Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceType14Code[] values() {
		SecuritiesBalanceType14Code[] values = new SecuritiesBalanceType14Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceType14Code> {
		@Override
		public SecuritiesBalanceType14Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceType14Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
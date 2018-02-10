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
import com.tools20022.repository.codeset.SecuritiesBalanceType12Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#Blocked
 * SecuritiesBalanceType12Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#AvailableWithNoAdditionalStatus
 * SecuritiesBalanceType12Code.AvailableWithNoAdditionalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#BlockedCorporateAction
 * SecuritiesBalanceType12Code.BlockedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#BlockedTrading
 * SecuritiesBalanceType12Code.BlockedTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#BlockedAuthenticity
 * SecuritiesBalanceType12Code.BlockedAuthenticity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#Borrowed
 * SecuritiesBalanceType12Code.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#PendingBorrowedDelivery
 * SecuritiesBalanceType12Code.PendingBorrowedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#PendingBorrowedReceipt
 * SecuritiesBalanceType12Code.PendingBorrowedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#CollateralIn
 * SecuritiesBalanceType12Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#CollateralOut
 * SecuritiesBalanceType12Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#OnLoan
 * SecuritiesBalanceType12Code.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#PendingOnLoanDelivery
 * SecuritiesBalanceType12Code.PendingOnLoanDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#PendingOnLoanReceipt
 * SecuritiesBalanceType12Code.PendingOnLoanReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#DerivativesMargin
 * SecuritiesBalanceType12Code.DerivativesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#PendingCorporateActionReceipt
 * SecuritiesBalanceType12Code.PendingCorporateActionReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#PendingCorporateActionDelivery
 * SecuritiesBalanceType12Code.PendingCorporateActionDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#PendingDelivery
 * SecuritiesBalanceType12Code.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#PendingReceipt
 * SecuritiesBalanceType12Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#Pledged
 * SecuritiesBalanceType12Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#OutForRegistration
 * SecuritiesBalanceType12Code.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#Restricted
 * SecuritiesBalanceType12Code.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#Unclassified
 * SecuritiesBalanceType12Code.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#InTransshipment
 * SecuritiesBalanceType12Code.InTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#Drawn
 * SecuritiesBalanceType12Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#WaitingDocumentation
 * SecuritiesBalanceType12Code.WaitingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code#BeingTransferred
 * SecuritiesBalanceType12Code.BeingTransferred}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeV2Code
 * SecuritiesBalanceTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BLOK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceType12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the securities or investment fund balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceType12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code Blocked = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoAdditionalStatus"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code AvailableWithNoAdditionalStatus = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoAdditionalStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.AvailableWithNoAdditionalStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedCorporateAction"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code BlockedCorporateAction = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.BlockedCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrading"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code BlockedTrading = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrading";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.BlockedTrading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAuthenticity"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code BlockedAuthenticity = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAuthenticity";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.BlockedAuthenticity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code Borrowed = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Borrowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBorrowedDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code PendingBorrowedDelivery = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingBorrowedDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBorrowedReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code PendingBorrowedReceipt = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBorrowedReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingBorrowedReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code CollateralIn = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code CollateralOut = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code OnLoan = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.OnLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code PendingOnLoanDelivery = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingOnLoanDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code PendingOnLoanReceipt = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingOnLoanReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativesMargin"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code DerivativesMargin = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativesMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.DerivativesMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code PendingCorporateActionReceipt = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingCorporateActionReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code PendingCorporateActionDelivery = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingCorporateActionDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code PendingDelivery = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code PendingReceipt = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code Pledged = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Pledged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code OutForRegistration = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.OutForRegistration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code Restricted = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Restricted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code Unclassified = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Unclassified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipment"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code InTransshipment = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.InTransshipment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code Drawn = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingDocumentation"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code WaitingDocumentation = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingDocumentation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.WaitingDocumentation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType12Code
	 * SecuritiesBalanceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingTransferred"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType12Code BeingTransferred = new SecuritiesBalanceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingTransferred";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType12Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.BeingTransferred.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceType12Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceType12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceType12Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				trace_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceType12Code.Blocked, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.AvailableWithNoAdditionalStatus,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.BlockedCorporateAction, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.BlockedTrading,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.BlockedAuthenticity, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.Borrowed,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.PendingBorrowedDelivery, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.PendingBorrowedReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.OnLoan, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.PendingOnLoanDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.PendingOnLoanReceipt, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.DerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.PendingCorporateActionReceipt, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.PendingCorporateActionDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.PendingDelivery, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.PendingReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.Pledged, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.OutForRegistration,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.Restricted, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.Unclassified,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.InTransshipment, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.Drawn,
						com.tools20022.repository.codeset.SecuritiesBalanceType12Code.WaitingDocumentation, com.tools20022.repository.codeset.SecuritiesBalanceType12Code.BeingTransferred);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(AvailableWithNoAdditionalStatus.getCodeName().get(), AvailableWithNoAdditionalStatus);
		codesByName.put(BlockedCorporateAction.getCodeName().get(), BlockedCorporateAction);
		codesByName.put(BlockedTrading.getCodeName().get(), BlockedTrading);
		codesByName.put(BlockedAuthenticity.getCodeName().get(), BlockedAuthenticity);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(PendingBorrowedDelivery.getCodeName().get(), PendingBorrowedDelivery);
		codesByName.put(PendingBorrowedReceipt.getCodeName().get(), PendingBorrowedReceipt);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(PendingOnLoanDelivery.getCodeName().get(), PendingOnLoanDelivery);
		codesByName.put(PendingOnLoanReceipt.getCodeName().get(), PendingOnLoanReceipt);
		codesByName.put(DerivativesMargin.getCodeName().get(), DerivativesMargin);
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
		codesByName.put(WaitingDocumentation.getCodeName().get(), WaitingDocumentation);
		codesByName.put(BeingTransferred.getCodeName().get(), BeingTransferred);
	}

	public static SecuritiesBalanceType12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceType12Code[] values() {
		SecuritiesBalanceType12Code[] values = new SecuritiesBalanceType12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceType12Code> {
		@Override
		public SecuritiesBalanceType12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceType12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
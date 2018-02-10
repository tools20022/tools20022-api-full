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
import com.tools20022.repository.codeset.SecuritiesBalanceType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#Blocked
 * SecuritiesBalanceType1Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#Borrowed
 * SecuritiesBalanceType1Code.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#CollateralIn
 * SecuritiesBalanceType1Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#CollateralOut
 * SecuritiesBalanceType1Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#OnLoan
 * SecuritiesBalanceType1Code.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#DerivativesMargin
 * SecuritiesBalanceType1Code.DerivativesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#PendingDeliveryMatchedBalance
 * SecuritiesBalanceType1Code.PendingDeliveryMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#PendingReceiptMatchedBalance
 * SecuritiesBalanceType1Code.PendingReceiptMatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#PendingReceiptUnmatchedBalance
 * SecuritiesBalanceType1Code.PendingReceiptUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#PendingCorporateAction
 * SecuritiesBalanceType1Code.PendingCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#PendingDelivery
 * SecuritiesBalanceType1Code.PendingDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#PendingReceipt
 * SecuritiesBalanceType1Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#Pledged
 * SecuritiesBalanceType1Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#PendingDeliveryUnmatchedBalance
 * SecuritiesBalanceType1Code.PendingDeliveryUnmatchedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#OutForRegistration
 * SecuritiesBalanceType1Code.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#Restricted
 * SecuritiesBalanceType1Code.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#Unclassified
 * SecuritiesBalanceType1Code.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#InTransshipment
 * SecuritiesBalanceType1Code.InTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#Drawn
 * SecuritiesBalanceType1Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#WaitingDocumentation
 * SecuritiesBalanceType1Code.WaitingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code#BeingTransferred
 * SecuritiesBalanceType1Code.BeingTransferred}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceTypeCode
 * SecuritiesBalanceTypeCode}</li>
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
 * "SecuritiesBalanceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the securities or investment fund balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code Blocked = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code Borrowed = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.Borrowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code CollateralIn = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code CollateralOut = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code OnLoan = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.OnLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativesMargin"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code DerivativesMargin = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativesMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.DerivativesMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryMatchedBalance"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code PendingDeliveryMatchedBalance = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryMatchedBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.PendingDeliveryMatchedBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptMatchedBalance"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code PendingReceiptMatchedBalance = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptMatchedBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.PendingReceiptMatchedBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceiptUnmatchedBalance"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code PendingReceiptUnmatchedBalance = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceiptUnmatchedBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.PendingReceiptUnmatchedBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateAction"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code PendingCorporateAction = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.PendingCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code PendingDelivery = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.PendingDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code PendingReceipt = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.PendingReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code Pledged = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.Pledged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeliveryUnmatchedBalance"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code PendingDeliveryUnmatchedBalance = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeliveryUnmatchedBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.PendingDeliveryUnmatchedBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code OutForRegistration = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.OutForRegistration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code Restricted = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.Restricted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code Unclassified = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.Unclassified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipment"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code InTransshipment = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.InTransshipment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code Drawn = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingDocumentation"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code WaitingDocumentation = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingDocumentation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.WaitingDocumentation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType1Code
	 * SecuritiesBalanceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeingTransferred"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType1Code BeingTransferred = new SecuritiesBalanceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeingTransferred";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType1Code.mmObject();
			codeName = SecuritiesBalanceTypeCode.BeingTransferred.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceType1Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceType1Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				trace_lazy = () -> SecuritiesBalanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceType1Code.Blocked, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.Borrowed,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.OnLoan, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.DerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.PendingDeliveryMatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.PendingReceiptMatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.PendingReceiptUnmatchedBalance, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.PendingCorporateAction,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.PendingDelivery, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.PendingReceipt,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.Pledged, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.PendingDeliveryUnmatchedBalance,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.OutForRegistration, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.Restricted,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.Unclassified, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.InTransshipment,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.Drawn, com.tools20022.repository.codeset.SecuritiesBalanceType1Code.WaitingDocumentation,
						com.tools20022.repository.codeset.SecuritiesBalanceType1Code.BeingTransferred);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(DerivativesMargin.getCodeName().get(), DerivativesMargin);
		codesByName.put(PendingDeliveryMatchedBalance.getCodeName().get(), PendingDeliveryMatchedBalance);
		codesByName.put(PendingReceiptMatchedBalance.getCodeName().get(), PendingReceiptMatchedBalance);
		codesByName.put(PendingReceiptUnmatchedBalance.getCodeName().get(), PendingReceiptUnmatchedBalance);
		codesByName.put(PendingCorporateAction.getCodeName().get(), PendingCorporateAction);
		codesByName.put(PendingDelivery.getCodeName().get(), PendingDelivery);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(Pledged.getCodeName().get(), Pledged);
		codesByName.put(PendingDeliveryUnmatchedBalance.getCodeName().get(), PendingDeliveryUnmatchedBalance);
		codesByName.put(OutForRegistration.getCodeName().get(), OutForRegistration);
		codesByName.put(Restricted.getCodeName().get(), Restricted);
		codesByName.put(Unclassified.getCodeName().get(), Unclassified);
		codesByName.put(InTransshipment.getCodeName().get(), InTransshipment);
		codesByName.put(Drawn.getCodeName().get(), Drawn);
		codesByName.put(WaitingDocumentation.getCodeName().get(), WaitingDocumentation);
		codesByName.put(BeingTransferred.getCodeName().get(), BeingTransferred);
	}

	public static SecuritiesBalanceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceType1Code[] values() {
		SecuritiesBalanceType1Code[] values = new SecuritiesBalanceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceType1Code> {
		@Override
		public SecuritiesBalanceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
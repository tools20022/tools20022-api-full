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
import com.tools20022.repository.codeset.SecuritiesBalanceType11Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Blocked
 * SecuritiesBalanceType11Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#AvailableWithNoAdditionalStatus
 * SecuritiesBalanceType11Code.AvailableWithNoAdditionalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Available
 * SecuritiesBalanceType11Code.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#BlockedCorporateAction
 * SecuritiesBalanceType11Code.BlockedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#BlockedTrading
 * SecuritiesBalanceType11Code.BlockedTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#BlockedAuthenticity
 * SecuritiesBalanceType11Code.BlockedAuthenticity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Borrowed
 * SecuritiesBalanceType11Code.Borrowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#CollateralIn
 * SecuritiesBalanceType11Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#CollateralOut
 * SecuritiesBalanceType11Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#EligibleForCollateralPurposes
 * SecuritiesBalanceType11Code.EligibleForCollateralPurposes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#OnLoan
 * SecuritiesBalanceType11Code.OnLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#DerivativesMargin
 * SecuritiesBalanceType11Code.DerivativesMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#PendingCorporateActionReceipt
 * SecuritiesBalanceType11Code.PendingCorporateActionReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#PendingCorporateActionDelivery
 * SecuritiesBalanceType11Code.PendingCorporateActionDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Pledged
 * SecuritiesBalanceType11Code.Pledged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#OutForRegistration
 * SecuritiesBalanceType11Code.OutForRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Restricted
 * SecuritiesBalanceType11Code.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Unclassified
 * SecuritiesBalanceType11Code.Unclassified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#InTransshipment
 * SecuritiesBalanceType11Code.InTransshipment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Drawn
 * SecuritiesBalanceType11Code.Drawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#TaxExempt
 * SecuritiesBalanceType11Code.TaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#NonTaxExempt
 * SecuritiesBalanceType11Code.NonTaxExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Registered
 * SecuritiesBalanceType11Code.Registered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#StreetPosition
 * SecuritiesBalanceType11Code.StreetPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Unregistered
 * SecuritiesBalanceType11Code.Unregistered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#Issued
 * SecuritiesBalanceType11Code.Issued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#QuasiIssued
 * SecuritiesBalanceType11Code.QuasiIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code#PendingOnLoanDelivery
 * SecuritiesBalanceType11Code.PendingOnLoanDelivery}</li>
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
 * "SecuritiesBalanceType11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the securities or investment fund balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesBalanceType11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Blocked = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableWithNoAdditionalStatus"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code AvailableWithNoAdditionalStatus = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableWithNoAdditionalStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.AvailableWithNoAdditionalStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Available = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Available.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedCorporateAction"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code BlockedCorporateAction = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.BlockedCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrading"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code BlockedTrading = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrading";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.BlockedTrading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAuthenticity"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code BlockedAuthenticity = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAuthenticity";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.BlockedAuthenticity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowed"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Borrowed = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowed";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Borrowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code CollateralIn = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code CollateralOut = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateralPurposes"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code EligibleForCollateralPurposes = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleForCollateralPurposes";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.EligibleForCollateralPurposes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLoan"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code OnLoan = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLoan";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.OnLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativesMargin"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code DerivativesMargin = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativesMargin";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.DerivativesMargin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionReceipt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code PendingCorporateActionReceipt = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingCorporateActionReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCorporateActionDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code PendingCorporateActionDelivery = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCorporateActionDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingCorporateActionDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledged"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Pledged = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledged";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Pledged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutForRegistration"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code OutForRegistration = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutForRegistration";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.OutForRegistration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Restricted = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restricted";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Restricted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unclassified"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Unclassified = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unclassified";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Unclassified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransshipment"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code InTransshipment = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransshipment";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.InTransshipment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawn"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Drawn = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Drawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExempt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code TaxExempt = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.TaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonTaxExempt"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code NonTaxExempt = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonTaxExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.NonTaxExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registered"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Registered = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registered";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Registered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetPosition"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code StreetPosition = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.StreetPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unregistered"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Unregistered = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unregistered";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Unregistered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issued"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code Issued = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issued";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.Issued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiIssued"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code QuasiIssued = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiIssued";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.QuasiIssued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesBalanceType11Code
	 * SecuritiesBalanceType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingOnLoanDelivery"</li>
	 * </ul>
	 */
	public static final SecuritiesBalanceType11Code PendingOnLoanDelivery = new SecuritiesBalanceType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingOnLoanDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesBalanceType11Code.mmObject();
			codeName = SecuritiesBalanceTypeV2Code.PendingOnLoanDelivery.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesBalanceType11Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesBalanceType11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BLOK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceType11Code";
				definition = "Specifies the nature of the securities or investment fund balance.";
				trace_lazy = () -> SecuritiesBalanceTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Blocked, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.AvailableWithNoAdditionalStatus,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Available, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.BlockedCorporateAction,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.BlockedTrading, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.BlockedAuthenticity,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Borrowed, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.CollateralOut, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.EligibleForCollateralPurposes,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.OnLoan, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.DerivativesMargin,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.PendingCorporateActionReceipt, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.PendingCorporateActionDelivery,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Pledged, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.OutForRegistration,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Restricted, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Unclassified,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.InTransshipment, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Drawn,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.TaxExempt, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.NonTaxExempt,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Registered, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.StreetPosition,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Unregistered, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.Issued,
						com.tools20022.repository.codeset.SecuritiesBalanceType11Code.QuasiIssued, com.tools20022.repository.codeset.SecuritiesBalanceType11Code.PendingOnLoanDelivery);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(AvailableWithNoAdditionalStatus.getCodeName().get(), AvailableWithNoAdditionalStatus);
		codesByName.put(Available.getCodeName().get(), Available);
		codesByName.put(BlockedCorporateAction.getCodeName().get(), BlockedCorporateAction);
		codesByName.put(BlockedTrading.getCodeName().get(), BlockedTrading);
		codesByName.put(BlockedAuthenticity.getCodeName().get(), BlockedAuthenticity);
		codesByName.put(Borrowed.getCodeName().get(), Borrowed);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(EligibleForCollateralPurposes.getCodeName().get(), EligibleForCollateralPurposes);
		codesByName.put(OnLoan.getCodeName().get(), OnLoan);
		codesByName.put(DerivativesMargin.getCodeName().get(), DerivativesMargin);
		codesByName.put(PendingCorporateActionReceipt.getCodeName().get(), PendingCorporateActionReceipt);
		codesByName.put(PendingCorporateActionDelivery.getCodeName().get(), PendingCorporateActionDelivery);
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
		codesByName.put(Issued.getCodeName().get(), Issued);
		codesByName.put(QuasiIssued.getCodeName().get(), QuasiIssued);
		codesByName.put(PendingOnLoanDelivery.getCodeName().get(), PendingOnLoanDelivery);
	}

	public static SecuritiesBalanceType11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesBalanceType11Code[] values() {
		SecuritiesBalanceType11Code[] values = new SecuritiesBalanceType11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesBalanceType11Code> {
		@Override
		public SecuritiesBalanceType11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesBalanceType11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
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
import com.tools20022.repository.codeset.RejectionReason33Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#CashAccount
 * RejectionReason33Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#AccountServicerDeadlineMissed
 * RejectionReason33Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#SettlementAmountRejection
 * RejectionReason33Code.SettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#SettlementAmountCurrencyRejection
 * RejectionReason33Code.SettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#MarketDeadlineMissed
 * RejectionReason33Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#InvalidLink
 * RejectionReason33Code.InvalidLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#InvalidBalance
 * RejectionReason33Code.InvalidBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#InvalidLotNumber
 * RejectionReason33Code.InvalidLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#InvalidRule
 * RejectionReason33Code.InvalidRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#InsufficientMoney
 * RejectionReason33Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#CorporateActionRejection
 * RejectionReason33Code.CorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#SettlementDateRejection
 * RejectionReason33Code.SettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#ReferenceRejection
 * RejectionReason33Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#Other
 * RejectionReason33Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#QuantityRejection
 * RejectionReason33Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#InvalidSecurity
 * RejectionReason33Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#MinimumSettlementQuantity
 * RejectionReason33Code.MinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code#MultipleSettlementQuantity
 * RejectionReason33Code.MultipleSettlementQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
 * RejectionReasonV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason33Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason33Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code CashAccount = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code AccountServicerDeadlineMissed = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code SettlementAmountRejection = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code SettlementAmountCurrencyRejection = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountCurrencyRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code MarketDeadlineMissed = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidLink"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code InvalidLink = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLink";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidLink.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBalance"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code InvalidBalance = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidLotNumber"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code InvalidLotNumber = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLotNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidLotNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidRule"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code InvalidRule = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRule";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidRule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code InsufficientMoney = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code CorporateActionRejection = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.CorporateActionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code SettlementDateRejection = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementDateRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code ReferenceRejection = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.ReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code Other = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code QuantityRejection = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code InvalidSecurity = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code MinimumSettlementQuantity = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.MinimumSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason33Code
	 * RejectionReason33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * </ul>
	 */
	public static final RejectionReason33Code MultipleSettlementQuantity = new RejectionReason33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason33Code.mmObject();
			codeName = RejectionReasonV2Code.MultipleSettlementQuantity.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason33Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason33Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason33Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason33Code.CashAccount, com.tools20022.repository.codeset.RejectionReason33Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReason33Code.SettlementAmountRejection, com.tools20022.repository.codeset.RejectionReason33Code.SettlementAmountCurrencyRejection,
						com.tools20022.repository.codeset.RejectionReason33Code.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReason33Code.InvalidLink,
						com.tools20022.repository.codeset.RejectionReason33Code.InvalidBalance, com.tools20022.repository.codeset.RejectionReason33Code.InvalidLotNumber, com.tools20022.repository.codeset.RejectionReason33Code.InvalidRule,
						com.tools20022.repository.codeset.RejectionReason33Code.InsufficientMoney, com.tools20022.repository.codeset.RejectionReason33Code.CorporateActionRejection,
						com.tools20022.repository.codeset.RejectionReason33Code.SettlementDateRejection, com.tools20022.repository.codeset.RejectionReason33Code.ReferenceRejection,
						com.tools20022.repository.codeset.RejectionReason33Code.Other, com.tools20022.repository.codeset.RejectionReason33Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReason33Code.InvalidSecurity,
						com.tools20022.repository.codeset.RejectionReason33Code.MinimumSettlementQuantity, com.tools20022.repository.codeset.RejectionReason33Code.MultipleSettlementQuantity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(SettlementAmountRejection.getCodeName().get(), SettlementAmountRejection);
		codesByName.put(SettlementAmountCurrencyRejection.getCodeName().get(), SettlementAmountCurrencyRejection);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(InvalidLink.getCodeName().get(), InvalidLink);
		codesByName.put(InvalidBalance.getCodeName().get(), InvalidBalance);
		codesByName.put(InvalidLotNumber.getCodeName().get(), InvalidLotNumber);
		codesByName.put(InvalidRule.getCodeName().get(), InvalidRule);
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(CorporateActionRejection.getCodeName().get(), CorporateActionRejection);
		codesByName.put(SettlementDateRejection.getCodeName().get(), SettlementDateRejection);
		codesByName.put(ReferenceRejection.getCodeName().get(), ReferenceRejection);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(MinimumSettlementQuantity.getCodeName().get(), MinimumSettlementQuantity);
		codesByName.put(MultipleSettlementQuantity.getCodeName().get(), MultipleSettlementQuantity);
	}

	public static RejectionReason33Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason33Code[] values() {
		RejectionReason33Code[] values = new RejectionReason33Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason33Code> {
		@Override
		public RejectionReason33Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason33Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
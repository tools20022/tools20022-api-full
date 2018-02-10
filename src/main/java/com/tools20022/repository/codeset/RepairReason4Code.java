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
import com.tools20022.repository.codeset.RepairReason4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the settlement instruction has a repair status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#ProcessingBatch
 * RepairReason4Code.ProcessingBatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#CorporateAction
 * RepairReason4Code.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#CashAccount
 * RepairReason4Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#ImpossibleCashSettlementSystem
 * RepairReason4Code.ImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#SettlementDate
 * RepairReason4Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#DealPrice
 * RepairReason4Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#SettlementAmount
 * RepairReason4Code.SettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReason4Code#Quantity
 * RepairReason4Code.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReason4Code#Security
 * RepairReason4Code.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#TradeDate
 * RepairReason4Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#CommonReference
 * RepairReason4Code.CommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#MinimumSettlementQuantity
 * RepairReason4Code.MinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#MultipleSettlementQuantity
 * RepairReason4Code.MultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#SettlementAmountCurrency
 * RepairReason4Code.SettlementAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#PhysicalSettlementImpossible
 * RepairReason4Code.PhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#PlaceOfTrade
 * RepairReason4Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#Reference
 * RepairReason4Code.Reference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#ImpossibleToUseTheRTGSSystemInstructed
 * RepairReason4Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#SafekeepingAccount
 * RepairReason4Code.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#SettlementTransaction
 * RepairReason4Code.SettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#SettlementSystemMethod
 * RepairReason4Code.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#TaxStatus
 * RepairReason4Code.TaxStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#PlaceOfSafekeeping
 * RepairReason4Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#StampDuty
 * RepairReason4Code.StampDuty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReason4Code#Other
 * RepairReason4Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#ReceivingDeliveringParty3
 * RepairReason4Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#ReceivingDeliveringParty1
 * RepairReason4Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#ReceivingDeliveringDepository
 * RepairReason4Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code#ReceivingDeliveringParty2
 * RepairReason4Code.ReceivingDeliveringParty2}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RepairReasonV2Code
 * RepairReasonV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BATC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepairReason4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the settlement instruction has a repair status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepairReason4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatch"</li>
	 * </ul>
	 */
	public static final RepairReason4Code ProcessingBatch = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatch";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.ProcessingBatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * </ul>
	 */
	public static final RepairReason4Code CorporateAction = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.CorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * </ul>
	 */
	public static final RepairReason4Code CashAccount = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * </ul>
	 */
	public static final RepairReason4Code ImpossibleCashSettlementSystem = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.ImpossibleCashSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final RepairReason4Code SettlementDate = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * </ul>
	 */
	public static final RepairReason4Code DealPrice = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * </ul>
	 */
	public static final RepairReason4Code SettlementAmount = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.SettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * </ul>
	 */
	public static final RepairReason4Code Quantity = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.Quantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * </ul>
	 */
	public static final RepairReason4Code Security = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.Security.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final RepairReason4Code TradeDate = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * </ul>
	 */
	public static final RepairReason4Code CommonReference = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.CommonReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * </ul>
	 */
	public static final RepairReason4Code MinimumSettlementQuantity = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.MinimumSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * </ul>
	 */
	public static final RepairReason4Code MultipleSettlementQuantity = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.MultipleSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrency"</li>
	 * </ul>
	 */
	public static final RepairReason4Code SettlementAmountCurrency = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.SettlementAmountCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * </ul>
	 */
	public static final RepairReason4Code PhysicalSettlementImpossible = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.PhysicalSettlementImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final RepairReason4Code PlaceOfTrade = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * </ul>
	 */
	public static final RepairReason4Code Reference = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.Reference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * </ul>
	 */
	public static final RepairReason4Code ImpossibleToUseTheRTGSSystemInstructed = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * </ul>
	 */
	public static final RepairReason4Code SafekeepingAccount = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.SafekeepingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * </ul>
	 */
	public static final RepairReason4Code SettlementTransaction = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.SettlementTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * </ul>
	 */
	public static final RepairReason4Code SettlementSystemMethod = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.SettlementSystemMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatus"</li>
	 * </ul>
	 */
	public static final RepairReason4Code TaxStatus = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.TaxStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * </ul>
	 */
	public static final RepairReason4Code PlaceOfSafekeeping = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * </ul>
	 */
	public static final RepairReason4Code StampDuty = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.StampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final RepairReason4Code Other = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * </ul>
	 */
	public static final RepairReason4Code ReceivingDeliveringParty3 = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * </ul>
	 */
	public static final RepairReason4Code ReceivingDeliveringParty1 = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * </ul>
	 */
	public static final RepairReason4Code ReceivingDeliveringDepository = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason4Code
	 * RepairReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * </ul>
	 */
	public static final RepairReason4Code ReceivingDeliveringParty2 = new RepairReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason4Code.mmObject();
			codeName = RepairReasonV2Code.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RepairReason4Code> codesByName = new LinkedHashMap<>();

	protected RepairReason4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BATC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepairReason4Code";
				definition = "Specifies the reason why the settlement instruction has a repair status.";
				trace_lazy = () -> RepairReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepairReason4Code.ProcessingBatch, com.tools20022.repository.codeset.RepairReason4Code.CorporateAction,
						com.tools20022.repository.codeset.RepairReason4Code.CashAccount, com.tools20022.repository.codeset.RepairReason4Code.ImpossibleCashSettlementSystem,
						com.tools20022.repository.codeset.RepairReason4Code.SettlementDate, com.tools20022.repository.codeset.RepairReason4Code.DealPrice, com.tools20022.repository.codeset.RepairReason4Code.SettlementAmount,
						com.tools20022.repository.codeset.RepairReason4Code.Quantity, com.tools20022.repository.codeset.RepairReason4Code.Security, com.tools20022.repository.codeset.RepairReason4Code.TradeDate,
						com.tools20022.repository.codeset.RepairReason4Code.CommonReference, com.tools20022.repository.codeset.RepairReason4Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RepairReason4Code.MultipleSettlementQuantity, com.tools20022.repository.codeset.RepairReason4Code.SettlementAmountCurrency,
						com.tools20022.repository.codeset.RepairReason4Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RepairReason4Code.PlaceOfTrade, com.tools20022.repository.codeset.RepairReason4Code.Reference,
						com.tools20022.repository.codeset.RepairReason4Code.ImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RepairReason4Code.SafekeepingAccount,
						com.tools20022.repository.codeset.RepairReason4Code.SettlementTransaction, com.tools20022.repository.codeset.RepairReason4Code.SettlementSystemMethod, com.tools20022.repository.codeset.RepairReason4Code.TaxStatus,
						com.tools20022.repository.codeset.RepairReason4Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.RepairReason4Code.StampDuty, com.tools20022.repository.codeset.RepairReason4Code.Other,
						com.tools20022.repository.codeset.RepairReason4Code.ReceivingDeliveringParty3, com.tools20022.repository.codeset.RepairReason4Code.ReceivingDeliveringParty1,
						com.tools20022.repository.codeset.RepairReason4Code.ReceivingDeliveringDepository, com.tools20022.repository.codeset.RepairReason4Code.ReceivingDeliveringParty2);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ProcessingBatch.getCodeName().get(), ProcessingBatch);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(ImpossibleCashSettlementSystem.getCodeName().get(), ImpossibleCashSettlementSystem);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(Quantity.getCodeName().get(), Quantity);
		codesByName.put(Security.getCodeName().get(), Security);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(CommonReference.getCodeName().get(), CommonReference);
		codesByName.put(MinimumSettlementQuantity.getCodeName().get(), MinimumSettlementQuantity);
		codesByName.put(MultipleSettlementQuantity.getCodeName().get(), MultipleSettlementQuantity);
		codesByName.put(SettlementAmountCurrency.getCodeName().get(), SettlementAmountCurrency);
		codesByName.put(PhysicalSettlementImpossible.getCodeName().get(), PhysicalSettlementImpossible);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(Reference.getCodeName().get(), Reference);
		codesByName.put(ImpossibleToUseTheRTGSSystemInstructed.getCodeName().get(), ImpossibleToUseTheRTGSSystemInstructed);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(SettlementSystemMethod.getCodeName().get(), SettlementSystemMethod);
		codesByName.put(TaxStatus.getCodeName().get(), TaxStatus);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(StampDuty.getCodeName().get(), StampDuty);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
	}

	public static RepairReason4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepairReason4Code[] values() {
		RepairReason4Code[] values = new RepairReason4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepairReason4Code> {
		@Override
		public RepairReason4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepairReason4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
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
import com.tools20022.repository.codeset.RepairReason7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction is in repair.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#AccountServicerDeadlineMissed
 * RepairReason7Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ProcessingBatch
 * RepairReason7Code.ProcessingBatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#TypeOfOrderRepair
 * RepairReason7Code.TypeOfOrderRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#TransactionCallDelay
 * RepairReason7Code.TransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#CashAccount
 * RepairReason7Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ImpossibleCashSettlementSystem
 * RepairReason7Code.ImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#CommercializationContractRepair
 * RepairReason7Code.CommercializationContractRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#SettlementDate
 * RepairReason7Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#DealPrice
 * RepairReason7Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ReceivingDeliveringDepository
 * RepairReason7Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#SettlementAmount
 * RepairReason7Code.SettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReason7Code#Quantity
 * RepairReason7Code.Quantity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReason7Code#Security
 * RepairReason7Code.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#TradeDate
 * RepairReason7Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#FeeCommissionRepair
 * RepairReason7Code.FeeCommissionRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ForfeitAmount
 * RepairReason7Code.ForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ReceivingDeliveringParty1
 * RepairReason7Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ReceivingDeliveringParty2
 * RepairReason7Code.ReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ReceivingDeliveringParty3
 * RepairReason7Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#CommonReference
 * RepairReason7Code.CommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#NarrativeInformationRepair
 * RepairReason7Code.NarrativeInformationRepair}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#LetterOfGuaranteeIndicator
 * RepairReason7Code.LetterOfGuaranteeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#NarrativeReason
 * RepairReason7Code.NarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#SettlementAmountCurrency
 * RepairReason7Code.SettlementAmountCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReason7Code#NoMatch
 * RepairReason7Code.NoMatch}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReason7Code#NotFound
 * RepairReason7Code.NotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#PhysicalSettlementImpossible
 * RepairReason7Code.PhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#PlaceOfTrade
 * RepairReason7Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ClosingTransactionAmount
 * RepairReason7Code.ClosingTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#RepurchaseRate
 * RepairReason7Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#PremiumAmount
 * RepairReason7Code.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#RepurchaseRateType
 * RepairReason7Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#SpreadRate
 * RepairReason7Code.SpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ImpossibleToUseTheRTGSSystemInstructed
 * RepairReason7Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#SafekeepingAccount
 * RepairReason7Code.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#SettlementTransaction
 * RepairReason7Code.SettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#SettlementSystemMethod
 * RepairReason7Code.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#ClosingDateTime
 * RepairReason7Code.ClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#TaxStatus
 * RepairReason7Code.TaxStatus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RepairReason7Code#Unknown
 * RepairReason7Code.Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code#VariableRateSupport
 * RepairReason7Code.VariableRateSupport}</li>
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
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepairReason7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why the instruction is in repair."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepairReason7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final RepairReason7Code AccountServicerDeadlineMissed = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatch"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ProcessingBatch = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatch";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ProcessingBatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrderRepair"</li>
	 * </ul>
	 */
	public static final RepairReason7Code TypeOfOrderRepair = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.TypeOfOrderRepair.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * </ul>
	 */
	public static final RepairReason7Code TransactionCallDelay = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.TransactionCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * </ul>
	 */
	public static final RepairReason7Code CashAccount = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ImpossibleCashSettlementSystem = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ImpossibleCashSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercializationContractRepair"</li>
	 * </ul>
	 */
	public static final RepairReason7Code CommercializationContractRepair = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.CommercializationContractRepair.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final RepairReason7Code SettlementDate = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * </ul>
	 */
	public static final RepairReason7Code DealPrice = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ReceivingDeliveringDepository = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * </ul>
	 */
	public static final RepairReason7Code SettlementAmount = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.SettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * </ul>
	 */
	public static final RepairReason7Code Quantity = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.Quantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * </ul>
	 */
	public static final RepairReason7Code Security = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.Security.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final RepairReason7Code TradeDate = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeCommissionRepair"</li>
	 * </ul>
	 */
	public static final RepairReason7Code FeeCommissionRepair = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.FeeCommissionRepair.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ForfeitAmount = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ForfeitAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ReceivingDeliveringParty1 = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ReceivingDeliveringParty2 = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ReceivingDeliveringParty3 = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * </ul>
	 */
	public static final RepairReason7Code CommonReference = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.CommonReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeInformationRepair"</li>
	 * </ul>
	 */
	public static final RepairReason7Code NarrativeInformationRepair = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.NarrativeInformationRepair.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteeIndicator"</li>
	 * </ul>
	 */
	public static final RepairReason7Code LetterOfGuaranteeIndicator = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIndicator";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.LetterOfGuaranteeIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * </ul>
	 */
	public static final RepairReason7Code NarrativeReason = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.NarrativeReason.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrency"</li>
	 * </ul>
	 */
	public static final RepairReason7Code SettlementAmountCurrency = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.SettlementAmountCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * </ul>
	 */
	public static final RepairReason7Code NoMatch = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.NoMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFound"</li>
	 * </ul>
	 */
	public static final RepairReason7Code NotFound = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.NotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * </ul>
	 */
	public static final RepairReason7Code PhysicalSettlementImpossible = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.PhysicalSettlementImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final RepairReason7Code PlaceOfTrade = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingTransactionAmount"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ClosingTransactionAmount = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingTransactionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ClosingTransactionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * </ul>
	 */
	public static final RepairReason7Code RepurchaseRate = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * </ul>
	 */
	public static final RepairReason7Code PremiumAmount = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.PremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * </ul>
	 */
	public static final RepairReason7Code RepurchaseRateType = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * </ul>
	 */
	public static final RepairReason7Code SpreadRate = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.SpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ImpossibleToUseTheRTGSSystemInstructed = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * </ul>
	 */
	public static final RepairReason7Code SafekeepingAccount = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.SafekeepingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * </ul>
	 */
	public static final RepairReason7Code SettlementTransaction = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.SettlementTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * </ul>
	 */
	public static final RepairReason7Code SettlementSystemMethod = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.SettlementSystemMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTime"</li>
	 * </ul>
	 */
	public static final RepairReason7Code ClosingDateTime = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.ClosingDateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatus"</li>
	 * </ul>
	 */
	public static final RepairReason7Code TaxStatus = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.TaxStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final RepairReason7Code Unknown = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unknown";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.Unknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepairReason7Code
	 * RepairReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * </ul>
	 */
	public static final RepairReason7Code VariableRateSupport = new RepairReason7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			owner_lazy = () -> com.tools20022.repository.codeset.RepairReason7Code.mmObject();
			codeName = RepairReasonV2Code.VariableRateSupport.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RepairReason7Code> codesByName = new LinkedHashMap<>();

	protected RepairReason7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepairReason7Code";
				definition = "Specifies the reason why the instruction is in repair.";
				trace_lazy = () -> RepairReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepairReason7Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RepairReason7Code.ProcessingBatch,
						com.tools20022.repository.codeset.RepairReason7Code.TypeOfOrderRepair, com.tools20022.repository.codeset.RepairReason7Code.TransactionCallDelay, com.tools20022.repository.codeset.RepairReason7Code.CashAccount,
						com.tools20022.repository.codeset.RepairReason7Code.ImpossibleCashSettlementSystem, com.tools20022.repository.codeset.RepairReason7Code.CommercializationContractRepair,
						com.tools20022.repository.codeset.RepairReason7Code.SettlementDate, com.tools20022.repository.codeset.RepairReason7Code.DealPrice, com.tools20022.repository.codeset.RepairReason7Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.RepairReason7Code.SettlementAmount, com.tools20022.repository.codeset.RepairReason7Code.Quantity, com.tools20022.repository.codeset.RepairReason7Code.Security,
						com.tools20022.repository.codeset.RepairReason7Code.TradeDate, com.tools20022.repository.codeset.RepairReason7Code.FeeCommissionRepair, com.tools20022.repository.codeset.RepairReason7Code.ForfeitAmount,
						com.tools20022.repository.codeset.RepairReason7Code.ReceivingDeliveringParty1, com.tools20022.repository.codeset.RepairReason7Code.ReceivingDeliveringParty2,
						com.tools20022.repository.codeset.RepairReason7Code.ReceivingDeliveringParty3, com.tools20022.repository.codeset.RepairReason7Code.CommonReference,
						com.tools20022.repository.codeset.RepairReason7Code.NarrativeInformationRepair, com.tools20022.repository.codeset.RepairReason7Code.LetterOfGuaranteeIndicator,
						com.tools20022.repository.codeset.RepairReason7Code.NarrativeReason, com.tools20022.repository.codeset.RepairReason7Code.SettlementAmountCurrency, com.tools20022.repository.codeset.RepairReason7Code.NoMatch,
						com.tools20022.repository.codeset.RepairReason7Code.NotFound, com.tools20022.repository.codeset.RepairReason7Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RepairReason7Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RepairReason7Code.ClosingTransactionAmount, com.tools20022.repository.codeset.RepairReason7Code.RepurchaseRate, com.tools20022.repository.codeset.RepairReason7Code.PremiumAmount,
						com.tools20022.repository.codeset.RepairReason7Code.RepurchaseRateType, com.tools20022.repository.codeset.RepairReason7Code.SpreadRate,
						com.tools20022.repository.codeset.RepairReason7Code.ImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RepairReason7Code.SafekeepingAccount,
						com.tools20022.repository.codeset.RepairReason7Code.SettlementTransaction, com.tools20022.repository.codeset.RepairReason7Code.SettlementSystemMethod,
						com.tools20022.repository.codeset.RepairReason7Code.ClosingDateTime, com.tools20022.repository.codeset.RepairReason7Code.TaxStatus, com.tools20022.repository.codeset.RepairReason7Code.Unknown,
						com.tools20022.repository.codeset.RepairReason7Code.VariableRateSupport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(ProcessingBatch.getCodeName().get(), ProcessingBatch);
		codesByName.put(TypeOfOrderRepair.getCodeName().get(), TypeOfOrderRepair);
		codesByName.put(TransactionCallDelay.getCodeName().get(), TransactionCallDelay);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(ImpossibleCashSettlementSystem.getCodeName().get(), ImpossibleCashSettlementSystem);
		codesByName.put(CommercializationContractRepair.getCodeName().get(), CommercializationContractRepair);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(Quantity.getCodeName().get(), Quantity);
		codesByName.put(Security.getCodeName().get(), Security);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(FeeCommissionRepair.getCodeName().get(), FeeCommissionRepair);
		codesByName.put(ForfeitAmount.getCodeName().get(), ForfeitAmount);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(CommonReference.getCodeName().get(), CommonReference);
		codesByName.put(NarrativeInformationRepair.getCodeName().get(), NarrativeInformationRepair);
		codesByName.put(LetterOfGuaranteeIndicator.getCodeName().get(), LetterOfGuaranteeIndicator);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(SettlementAmountCurrency.getCodeName().get(), SettlementAmountCurrency);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(NotFound.getCodeName().get(), NotFound);
		codesByName.put(PhysicalSettlementImpossible.getCodeName().get(), PhysicalSettlementImpossible);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(ClosingTransactionAmount.getCodeName().get(), ClosingTransactionAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(PremiumAmount.getCodeName().get(), PremiumAmount);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(SpreadRate.getCodeName().get(), SpreadRate);
		codesByName.put(ImpossibleToUseTheRTGSSystemInstructed.getCodeName().get(), ImpossibleToUseTheRTGSSystemInstructed);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(SettlementSystemMethod.getCodeName().get(), SettlementSystemMethod);
		codesByName.put(ClosingDateTime.getCodeName().get(), ClosingDateTime);
		codesByName.put(TaxStatus.getCodeName().get(), TaxStatus);
		codesByName.put(Unknown.getCodeName().get(), Unknown);
		codesByName.put(VariableRateSupport.getCodeName().get(), VariableRateSupport);
	}

	public static RepairReason7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepairReason7Code[] values() {
		RepairReason7Code[] values = new RepairReason7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepairReason7Code> {
		@Override
		public RepairReason7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepairReason7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
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
import com.tools20022.repository.codeset.RejectionReason5Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#ClosedExchange
 * RejectionReason5Code.ClosedExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#UnknownSymbol
 * RejectionReason5Code.UnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#ExceedsLimit
 * RejectionReason5Code.ExceedsLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#TooLate
 * RejectionReason5Code.TooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#InvalidPrice
 * RejectionReason5Code.InvalidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#QuantityRejection
 * RejectionReason5Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#AgreementStartDate
 * RejectionReason5Code.AgreementStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#TransactionCallDelay
 * RejectionReason5Code.TransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#CashAccount
 * RejectionReason5Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#DealPrice
 * RejectionReason5Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#ForfeitAmount
 * RejectionReason5Code.ForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#DeliveringCustodian
 * RejectionReason5Code.DeliveringCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#ReceivingCustodian
 * RejectionReason5Code.ReceivingCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#NotFoundRejection
 * RejectionReason5Code.NotFoundRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#QuantityUnitType
 * RejectionReason5Code.QuantityUnitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#TerminationTransactionAmount
 * RejectionReason5Code.TerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#RepurchaseRate
 * RejectionReason5Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#PremiumAmount
 * RejectionReason5Code.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#RepurchaseRateType
 * RejectionReason5Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#SpreadRate
 * RejectionReason5Code.SpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#TradeDate
 * RejectionReason5Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#ReceivingAgent
 * RejectionReason5Code.ReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#Intermediary
 * RejectionReason5Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#DeliveringAgent
 * RejectionReason5Code.DeliveringAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#PlaceOfTrade
 * RejectionReason5Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#InvestorNameAddressUnknown
 * RejectionReason5Code.InvestorNameAddressUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#RejectedSinceAlreadyCancelled
 * RejectionReason5Code.RejectedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#RejectedSinceInProgress
 * RejectionReason5Code.RejectedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code#InvalidReference
 * RejectionReason5Code.InvalidReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXCL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedExchange"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code ClosedExchange = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.ClosedExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownSymbol"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code UnknownSymbol = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.UnknownSymbol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceedsLimit"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code ExceedsLimit = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceedsLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.ExceedsLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLate"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code TooLate = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.TooLate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPrice"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code InvalidPrice = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.InvalidPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code QuantityRejection = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementStartDate"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code AgreementStartDate = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementStartDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.AgreementStartDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code TransactionCallDelay = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.TransactionCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code CashAccount = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code DealPrice = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code ForfeitAmount = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.ForfeitAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringCustodian"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code DeliveringCustodian = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringCustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.DeliveringCustodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingCustodian"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code ReceivingCustodian = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingCustodian";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.ReceivingCustodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFoundRejection"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code NotFoundRejection = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFoundRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.NotFoundRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityUnitType"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code QuantityUnitType = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityUnitType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.QuantityUnitType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code TerminationTransactionAmount = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.TerminationTransactionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code RepurchaseRate = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code PremiumAmount = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.PremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code RepurchaseRateType = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code SpreadRate = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.SpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code TradeDate = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code ReceivingAgent = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.ReceivingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code Intermediary = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.Intermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgent"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code DeliveringAgent = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.DeliveringAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code PlaceOfTrade = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorNameAddressUnknown"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code InvestorNameAddressUnknown = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorNameAddressUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.InvestorNameAddressUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceAlreadyCancelled"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code RejectedSinceAlreadyCancelled = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.RejectedSinceAlreadyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceInProgress"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code RejectedSinceInProgress = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceInProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.RejectedSinceInProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason5Code
	 * RejectionReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * </ul>
	 */
	public static final RejectionReason5Code InvalidReference = new RejectionReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason5Code.mmObject();
			codeName = RejectionReasonCode.InvalidReference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason5Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXCL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason5Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason5Code.ClosedExchange, com.tools20022.repository.codeset.RejectionReason5Code.UnknownSymbol,
						com.tools20022.repository.codeset.RejectionReason5Code.ExceedsLimit, com.tools20022.repository.codeset.RejectionReason5Code.TooLate, com.tools20022.repository.codeset.RejectionReason5Code.InvalidPrice,
						com.tools20022.repository.codeset.RejectionReason5Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReason5Code.AgreementStartDate,
						com.tools20022.repository.codeset.RejectionReason5Code.TransactionCallDelay, com.tools20022.repository.codeset.RejectionReason5Code.CashAccount, com.tools20022.repository.codeset.RejectionReason5Code.DealPrice,
						com.tools20022.repository.codeset.RejectionReason5Code.ForfeitAmount, com.tools20022.repository.codeset.RejectionReason5Code.DeliveringCustodian,
						com.tools20022.repository.codeset.RejectionReason5Code.ReceivingCustodian, com.tools20022.repository.codeset.RejectionReason5Code.NotFoundRejection,
						com.tools20022.repository.codeset.RejectionReason5Code.QuantityUnitType, com.tools20022.repository.codeset.RejectionReason5Code.TerminationTransactionAmount,
						com.tools20022.repository.codeset.RejectionReason5Code.RepurchaseRate, com.tools20022.repository.codeset.RejectionReason5Code.PremiumAmount, com.tools20022.repository.codeset.RejectionReason5Code.RepurchaseRateType,
						com.tools20022.repository.codeset.RejectionReason5Code.SpreadRate, com.tools20022.repository.codeset.RejectionReason5Code.TradeDate, com.tools20022.repository.codeset.RejectionReason5Code.ReceivingAgent,
						com.tools20022.repository.codeset.RejectionReason5Code.Intermediary, com.tools20022.repository.codeset.RejectionReason5Code.DeliveringAgent, com.tools20022.repository.codeset.RejectionReason5Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReason5Code.InvestorNameAddressUnknown, com.tools20022.repository.codeset.RejectionReason5Code.RejectedSinceAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReason5Code.RejectedSinceInProgress, com.tools20022.repository.codeset.RejectionReason5Code.InvalidReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClosedExchange.getCodeName().get(), ClosedExchange);
		codesByName.put(UnknownSymbol.getCodeName().get(), UnknownSymbol);
		codesByName.put(ExceedsLimit.getCodeName().get(), ExceedsLimit);
		codesByName.put(TooLate.getCodeName().get(), TooLate);
		codesByName.put(InvalidPrice.getCodeName().get(), InvalidPrice);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(AgreementStartDate.getCodeName().get(), AgreementStartDate);
		codesByName.put(TransactionCallDelay.getCodeName().get(), TransactionCallDelay);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(ForfeitAmount.getCodeName().get(), ForfeitAmount);
		codesByName.put(DeliveringCustodian.getCodeName().get(), DeliveringCustodian);
		codesByName.put(ReceivingCustodian.getCodeName().get(), ReceivingCustodian);
		codesByName.put(NotFoundRejection.getCodeName().get(), NotFoundRejection);
		codesByName.put(QuantityUnitType.getCodeName().get(), QuantityUnitType);
		codesByName.put(TerminationTransactionAmount.getCodeName().get(), TerminationTransactionAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(PremiumAmount.getCodeName().get(), PremiumAmount);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(SpreadRate.getCodeName().get(), SpreadRate);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(ReceivingAgent.getCodeName().get(), ReceivingAgent);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(DeliveringAgent.getCodeName().get(), DeliveringAgent);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(InvestorNameAddressUnknown.getCodeName().get(), InvestorNameAddressUnknown);
		codesByName.put(RejectedSinceAlreadyCancelled.getCodeName().get(), RejectedSinceAlreadyCancelled);
		codesByName.put(RejectedSinceInProgress.getCodeName().get(), RejectedSinceInProgress);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
	}

	public static RejectionReason5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason5Code[] values() {
		RejectionReason5Code[] values = new RejectionReason5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason5Code> {
		@Override
		public RejectionReason5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
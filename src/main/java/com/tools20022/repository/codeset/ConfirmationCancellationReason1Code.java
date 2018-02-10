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
import com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why a confirmation is cancelled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#CashNotReceived
 * ConfirmationCancellationReason1Code.CashNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#ConfirmationReplacement
 * ConfirmationCancellationReason1Code.ConfirmationReplacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectBackEndLoadAmount
 * ConfirmationCancellationReason1Code.IncorrectBackEndLoadAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectCashAmount
 * ConfirmationCancellationReason1Code.IncorrectCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectDiscountAmount
 * ConfirmationCancellationReason1Code.IncorrectDiscountAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectDiscountAmountCurrency
 * ConfirmationCancellationReason1Code.IncorrectDiscountAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectExchangeRate
 * ConfirmationCancellationReason1Code.IncorrectExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectFeeOrCommission
 * ConfirmationCancellationReason1Code.IncorrectFeeOrCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectFinancialInstrumentQuantity
 * ConfirmationCancellationReason1Code.IncorrectFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectFrontEndLoadAmount
 * ConfirmationCancellationReason1Code.IncorrectFrontEndLoadAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectGrossAmount
 * ConfirmationCancellationReason1Code.IncorrectGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectGrossAmountCurrency
 * ConfirmationCancellationReason1Code.IncorrectGrossAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectNetAmount
 * ConfirmationCancellationReason1Code.IncorrectNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectNetAmountCurrency
 * ConfirmationCancellationReason1Code.IncorrectNetAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectOperation
 * ConfirmationCancellationReason1Code.IncorrectOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectQuantityUnitsOrCash
 * ConfirmationCancellationReason1Code.IncorrectQuantityUnitsOrCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectSettlementAmount
 * ConfirmationCancellationReason1Code.IncorrectSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectSettlementAmountCurrency
 * ConfirmationCancellationReason1Code.IncorrectSettlementAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectSettlementDate
 * ConfirmationCancellationReason1Code.IncorrectSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectSettlementMethod
 * ConfirmationCancellationReason1Code.IncorrectSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#IncorrectTradeDate
 * ConfirmationCancellationReason1Code.IncorrectTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code#InvalidReference
 * ConfirmationCancellationReason1Code.InvalidReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
 * ConfirmationCancellationReasonCode}</li>
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
 * "ConfirmationCancellationReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why a confirmation is cancelled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConfirmationCancellationReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashNotReceived"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code CashNotReceived = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashNotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.CashNotReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationReplacement"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code ConfirmationReplacement = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationReplacement";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.ConfirmationReplacement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectBackEndLoadAmount"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectBackEndLoadAmount = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectBackEndLoadAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectBackEndLoadAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCashAmount"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectCashAmount = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCashAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectCashAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDiscountAmount"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectDiscountAmount = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDiscountAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectDiscountAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDiscountAmountCurrency"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectDiscountAmountCurrency = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDiscountAmountCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectDiscountAmountCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectExchangeRate"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectExchangeRate = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectExchangeRate";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectExchangeRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFeeOrCommission"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectFeeOrCommission = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFeeOrCommission";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectFeeOrCommission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFinancialInstrumentQuantity"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectFinancialInstrumentQuantity = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFinancialInstrumentQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectFinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFrontEndLoadAmount"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectFrontEndLoadAmount = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFrontEndLoadAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectFrontEndLoadAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectGrossAmount"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectGrossAmount = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectGrossAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectGrossAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectGrossAmountCurrency"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectGrossAmountCurrency = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectGrossAmountCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectGrossAmountCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectNetAmount"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectNetAmount = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectNetAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectNetAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectNetAmountCurrency"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectNetAmountCurrency = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectNetAmountCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectNetAmountCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectOperation"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectOperation = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectQuantityUnitsOrCash"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectQuantityUnitsOrCash = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectQuantityUnitsOrCash";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectQuantityUnitsOrCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementAmount"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectSettlementAmount = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementAmountCurrency"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectSettlementAmountCurrency = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementAmountCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectSettlementAmountCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementDate"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectSettlementDate = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectSettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementMethod"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectSettlementMethod = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectSettlementMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectTradeDate"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code IncorrectTradeDate = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectTradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.IncorrectTradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
	 * ConfirmationCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReason1Code InvalidReference = new ConfirmationCancellationReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.mmObject();
			codeName = ConfirmationCancellationReasonCode.InvalidReference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ConfirmationCancellationReason1Code> codesByName = new LinkedHashMap<>();

	protected ConfirmationCancellationReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationCancellationReason1Code";
				definition = "Specifies the reason why a confirmation is cancelled.";
				trace_lazy = () -> ConfirmationCancellationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.CashNotReceived, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.ConfirmationReplacement,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectBackEndLoadAmount, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectCashAmount,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectDiscountAmount, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectDiscountAmountCurrency,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectExchangeRate, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectFeeOrCommission,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectFinancialInstrumentQuantity, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectFrontEndLoadAmount,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectGrossAmount, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectGrossAmountCurrency,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectNetAmount, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectNetAmountCurrency,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectOperation, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectQuantityUnitsOrCash,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectSettlementAmount, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectSettlementAmountCurrency,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectSettlementDate, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectSettlementMethod,
						com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.IncorrectTradeDate, com.tools20022.repository.codeset.ConfirmationCancellationReason1Code.InvalidReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashNotReceived.getCodeName().get(), CashNotReceived);
		codesByName.put(ConfirmationReplacement.getCodeName().get(), ConfirmationReplacement);
		codesByName.put(IncorrectBackEndLoadAmount.getCodeName().get(), IncorrectBackEndLoadAmount);
		codesByName.put(IncorrectCashAmount.getCodeName().get(), IncorrectCashAmount);
		codesByName.put(IncorrectDiscountAmount.getCodeName().get(), IncorrectDiscountAmount);
		codesByName.put(IncorrectDiscountAmountCurrency.getCodeName().get(), IncorrectDiscountAmountCurrency);
		codesByName.put(IncorrectExchangeRate.getCodeName().get(), IncorrectExchangeRate);
		codesByName.put(IncorrectFeeOrCommission.getCodeName().get(), IncorrectFeeOrCommission);
		codesByName.put(IncorrectFinancialInstrumentQuantity.getCodeName().get(), IncorrectFinancialInstrumentQuantity);
		codesByName.put(IncorrectFrontEndLoadAmount.getCodeName().get(), IncorrectFrontEndLoadAmount);
		codesByName.put(IncorrectGrossAmount.getCodeName().get(), IncorrectGrossAmount);
		codesByName.put(IncorrectGrossAmountCurrency.getCodeName().get(), IncorrectGrossAmountCurrency);
		codesByName.put(IncorrectNetAmount.getCodeName().get(), IncorrectNetAmount);
		codesByName.put(IncorrectNetAmountCurrency.getCodeName().get(), IncorrectNetAmountCurrency);
		codesByName.put(IncorrectOperation.getCodeName().get(), IncorrectOperation);
		codesByName.put(IncorrectQuantityUnitsOrCash.getCodeName().get(), IncorrectQuantityUnitsOrCash);
		codesByName.put(IncorrectSettlementAmount.getCodeName().get(), IncorrectSettlementAmount);
		codesByName.put(IncorrectSettlementAmountCurrency.getCodeName().get(), IncorrectSettlementAmountCurrency);
		codesByName.put(IncorrectSettlementDate.getCodeName().get(), IncorrectSettlementDate);
		codesByName.put(IncorrectSettlementMethod.getCodeName().get(), IncorrectSettlementMethod);
		codesByName.put(IncorrectTradeDate.getCodeName().get(), IncorrectTradeDate);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
	}

	public static ConfirmationCancellationReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConfirmationCancellationReason1Code[] values() {
		ConfirmationCancellationReason1Code[] values = new ConfirmationCancellationReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConfirmationCancellationReason1Code> {
		@Override
		public ConfirmationCancellationReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConfirmationCancellationReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
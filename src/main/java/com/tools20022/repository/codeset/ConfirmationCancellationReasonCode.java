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
import com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectBackEndLoadAmount
 * ConfirmationCancellationReasonCode.IncorrectBackEndLoadAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#ConfirmationReplacement
 * ConfirmationCancellationReasonCode.ConfirmationReplacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#CashNotReceived
 * ConfirmationCancellationReasonCode.CashNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectCashAmount
 * ConfirmationCancellationReasonCode.IncorrectCashAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectSettlementDate
 * ConfirmationCancellationReasonCode.IncorrectSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectTradeDate
 * ConfirmationCancellationReasonCode.IncorrectTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectDiscountAmount
 * ConfirmationCancellationReasonCode.IncorrectDiscountAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectDiscountAmountCurrency
 * ConfirmationCancellationReasonCode.IncorrectDiscountAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectSettlementAmount
 * ConfirmationCancellationReasonCode.IncorrectSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectFinancialInstrumentQuantity
 * ConfirmationCancellationReasonCode.IncorrectFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectExchangeRate
 * ConfirmationCancellationReasonCode.IncorrectExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectFeeOrCommission
 * ConfirmationCancellationReasonCode.IncorrectFeeOrCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectFrontEndLoadAmount
 * ConfirmationCancellationReasonCode.IncorrectFrontEndLoadAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectGrossAmount
 * ConfirmationCancellationReasonCode.IncorrectGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectGrossAmountCurrency
 * ConfirmationCancellationReasonCode.IncorrectGrossAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectQuantityUnitsOrCash
 * ConfirmationCancellationReasonCode.IncorrectQuantityUnitsOrCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectSettlementAmountCurrency
 * ConfirmationCancellationReasonCode.IncorrectSettlementAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectNetAmount
 * ConfirmationCancellationReasonCode.IncorrectNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectNetAmountCurrency
 * ConfirmationCancellationReasonCode.IncorrectNetAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectOperation
 * ConfirmationCancellationReasonCode.IncorrectOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#InvalidReference
 * ConfirmationCancellationReasonCode.InvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode#IncorrectSettlementMethod
 * ConfirmationCancellationReasonCode.IncorrectSettlementMethod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReason1Code
 * ConfirmationCancellationReason1Code}</li>
 * </ul>
 * </li>
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
 * "ConfirmationCancellationReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why a confirmation is cancelled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConfirmationCancellationReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Confirmation is cancelled because the back end load amount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectBackEndLoadAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the back end load amount is incorrect."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectBackEndLoadAmount = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectBackEndLoadAmount";
			definition = "Confirmation is cancelled because the back end load amount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "BENA";
		}
	};
	/**
	 * Confirmation is cancelled because it will be replaced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationReplacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmation is cancelled because it will be replaced."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode ConfirmationReplacement = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationReplacement";
			definition = "Confirmation is cancelled because it will be replaced.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "REPL";
		}
	};
	/**
	 * Confirmation is cancelled because the cash has not been received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashNotReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the cash has not been received."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode CashNotReceived = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashNotReceived";
			definition = "Confirmation is cancelled because the cash has not been received.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "CSHN";
		}
	};
	/**
	 * Confirmation is cancelled because the cash amount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCashAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the cash amount is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectCashAmount = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCashAmount";
			definition = "Confirmation is cancelled because the cash amount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "CSHW";
		}
	};
	/**
	 * Confirmation is cancelled because the settlement date is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the settlement date is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectSettlementDate = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementDate";
			definition = "Confirmation is cancelled because the settlement date is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Confirmation is cancelled because the trade date is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the trade date is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectTradeDate = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectTradeDate";
			definition = "Confirmation is cancelled because the trade date is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Confirmation is cancelled because the discount amount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDiscountAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the discount amount is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectDiscountAmount = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDiscountAmount";
			definition = "Confirmation is cancelled because the discount amount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "DISA";
		}
	};
	/**
	 * Confirmation is cancelled because the discount amount has an incorrect
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectDiscountAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the discount amount has an incorrect currency."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectDiscountAmountCurrency = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectDiscountAmountCurrency";
			definition = "Confirmation is cancelled because the discount amount has an incorrect currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Confirmation is cancelled because the settlement amount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the settlement amount is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectSettlementAmount = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementAmount";
			definition = "Confirmation is cancelled because the settlement amount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Confirmation is cancelled because the financial instrument quantity is
	 * incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the financial instrument quantity is incorrect."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectFinancialInstrumentQuantity = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFinancialInstrumentQuantity";
			definition = "Confirmation is cancelled because the financial instrument quantity is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Confirmation is cancelled because the exchange rate is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the exchange rate is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectExchangeRate = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectExchangeRate";
			definition = "Confirmation is cancelled because the exchange rate is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "EXCH";
		}
	};
	/**
	 * Confirmation is cancelled because a fee or commission amount is
	 * incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFeeOrCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because a fee or commission amount is incorrect."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectFeeOrCommission = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFeeOrCommission";
			definition = "Confirmation is cancelled because a fee or commission amount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Confirmation is cancelled because the front end load amount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FENA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFrontEndLoadAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the front end load amount is incorrect."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectFrontEndLoadAmount = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFrontEndLoadAmount";
			definition = "Confirmation is cancelled because the front end load amount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "FENA";
		}
	};
	/**
	 * Confirmation is cancelled because the gross amount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectGrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the gross amount is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectGrossAmount = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectGrossAmount";
			definition = "Confirmation is cancelled because the gross amount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "GROA";
		}
	};
	/**
	 * Confirmation is cancelled because the gross amount has an incorrect
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GROC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectGrossAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the gross amount has an incorrect currency."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectGrossAmountCurrency = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectGrossAmountCurrency";
			definition = "Confirmation is cancelled because the gross amount has an incorrect currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "GROC";
		}
	};
	/**
	 * Confirmation is cancelled because of an incorrect minimum traded quantity
	 * or cash amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectQuantityUnitsOrCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because of an incorrect minimum traded quantity or cash amount."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectQuantityUnitsOrCash = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectQuantityUnitsOrCash";
			definition = "Confirmation is cancelled because of an incorrect minimum traded quantity or cash amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * Confirmation is cancelled because the settlement amount has an incorrect
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the settlement amount has an incorrect currency."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectSettlementAmountCurrency = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementAmountCurrency";
			definition = "Confirmation is cancelled because the settlement amount has an incorrect currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Confirmation is cancelled because the net amount is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the net amount is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectNetAmount = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectNetAmount";
			definition = "Confirmation is cancelled because the net amount is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "NETA";
		}
	};
	/**
	 * Confirmation is cancelled because the net amount has an incorrect
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectNetAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the net amount has an incorrect currency."
	 * </li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectNetAmountCurrency = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectNetAmountCurrency";
			definition = "Confirmation is cancelled because the net amount has an incorrect currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "NETC";
		}
	};
	/**
	 * Confirmation is cancelled because of an incorrect operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because of an incorrect operation."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectOperation = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectOperation";
			definition = "Confirmation is cancelled because of an incorrect operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "OPER";
		}
	};
	/**
	 * Confirmation contains an invalid business reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmation contains an invalid business reference."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode InvalidReference = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			definition = "Confirmation contains an invalid business reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "REFE";
		}
	};
	/**
	 * Confirmation is cancelled because the settlement method is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationCancellationReasonCode
	 * ConfirmationCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectSettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation is cancelled because the settlement method is incorrect."</li>
	 * </ul>
	 */
	public static final ConfirmationCancellationReasonCode IncorrectSettlementMethod = new ConfirmationCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectSettlementMethod";
			definition = "Confirmation is cancelled because the settlement method is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.mmObject();
			codeName = "SETS";
		}
	};
	final static private LinkedHashMap<String, ConfirmationCancellationReasonCode> codesByName = new LinkedHashMap<>();

	protected ConfirmationCancellationReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationCancellationReasonCode";
				definition = "Specifies the reason why a confirmation is cancelled.";
				derivation_lazy = () -> Arrays.asList(ConfirmationCancellationReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectBackEndLoadAmount, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.ConfirmationReplacement,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.CashNotReceived, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectCashAmount,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectSettlementDate, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectTradeDate,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectDiscountAmount, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectDiscountAmountCurrency,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectSettlementAmount, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectFinancialInstrumentQuantity,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectExchangeRate, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectFeeOrCommission,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectFrontEndLoadAmount, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectGrossAmount,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectGrossAmountCurrency, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectQuantityUnitsOrCash,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectSettlementAmountCurrency, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectNetAmount,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectNetAmountCurrency, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectOperation,
						com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.InvalidReference, com.tools20022.repository.codeset.ConfirmationCancellationReasonCode.IncorrectSettlementMethod);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IncorrectBackEndLoadAmount.getCodeName().get(), IncorrectBackEndLoadAmount);
		codesByName.put(ConfirmationReplacement.getCodeName().get(), ConfirmationReplacement);
		codesByName.put(CashNotReceived.getCodeName().get(), CashNotReceived);
		codesByName.put(IncorrectCashAmount.getCodeName().get(), IncorrectCashAmount);
		codesByName.put(IncorrectSettlementDate.getCodeName().get(), IncorrectSettlementDate);
		codesByName.put(IncorrectTradeDate.getCodeName().get(), IncorrectTradeDate);
		codesByName.put(IncorrectDiscountAmount.getCodeName().get(), IncorrectDiscountAmount);
		codesByName.put(IncorrectDiscountAmountCurrency.getCodeName().get(), IncorrectDiscountAmountCurrency);
		codesByName.put(IncorrectSettlementAmount.getCodeName().get(), IncorrectSettlementAmount);
		codesByName.put(IncorrectFinancialInstrumentQuantity.getCodeName().get(), IncorrectFinancialInstrumentQuantity);
		codesByName.put(IncorrectExchangeRate.getCodeName().get(), IncorrectExchangeRate);
		codesByName.put(IncorrectFeeOrCommission.getCodeName().get(), IncorrectFeeOrCommission);
		codesByName.put(IncorrectFrontEndLoadAmount.getCodeName().get(), IncorrectFrontEndLoadAmount);
		codesByName.put(IncorrectGrossAmount.getCodeName().get(), IncorrectGrossAmount);
		codesByName.put(IncorrectGrossAmountCurrency.getCodeName().get(), IncorrectGrossAmountCurrency);
		codesByName.put(IncorrectQuantityUnitsOrCash.getCodeName().get(), IncorrectQuantityUnitsOrCash);
		codesByName.put(IncorrectSettlementAmountCurrency.getCodeName().get(), IncorrectSettlementAmountCurrency);
		codesByName.put(IncorrectNetAmount.getCodeName().get(), IncorrectNetAmount);
		codesByName.put(IncorrectNetAmountCurrency.getCodeName().get(), IncorrectNetAmountCurrency);
		codesByName.put(IncorrectOperation.getCodeName().get(), IncorrectOperation);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
		codesByName.put(IncorrectSettlementMethod.getCodeName().get(), IncorrectSettlementMethod);
	}

	public static ConfirmationCancellationReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConfirmationCancellationReasonCode[] values() {
		ConfirmationCancellationReasonCode[] values = new ConfirmationCancellationReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConfirmationCancellationReasonCode> {
		@Override
		public ConfirmationCancellationReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConfirmationCancellationReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
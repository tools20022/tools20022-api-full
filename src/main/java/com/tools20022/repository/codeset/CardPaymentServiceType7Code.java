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
import com.tools20022.repository.codeset.CardPaymentServiceType7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of transaction being undertaken for the main service. <br>
 * It correspond partially to the ISO 8583, field number 3.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#Balance
 * CardPaymentServiceType7Code.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CardActivation
 * CardPaymentServiceType7Code.CardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CardPayment
 * CardPaymentServiceType7Code.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CardsFundTransfer
 * CardPaymentServiceType7Code.CardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CardsFundTransferPull
 * CardPaymentServiceType7Code.CardsFundTransferPull}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CardsFundTransferPush
 * CardPaymentServiceType7Code.CardsFundTransferPush}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CardVerification
 * CardPaymentServiceType7Code.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CashAdvance
 * CardPaymentServiceType7Code.CashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CashDeposit
 * CardPaymentServiceType7Code.CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CashWithdrawal
 * CardPaymentServiceType7Code.CashWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#DeferredPayment
 * CardPaymentServiceType7Code.DeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#Loading
 * CardPaymentServiceType7Code.Loading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#OriginalCredit
 * CardPaymentServiceType7Code.OriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#PINChange
 * CardPaymentServiceType7Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#PINUnblock
 * CardPaymentServiceType7Code.PINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#QuasiCash
 * CardPaymentServiceType7Code.QuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#Refund
 * CardPaymentServiceType7Code.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#Reservation
 * CardPaymentServiceType7Code.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#Unloading
 * CardPaymentServiceType7Code.Unloading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#ValidityCheck
 * CardPaymentServiceType7Code.ValidityCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#DebitAdjustement
 * CardPaymentServiceType7Code.DebitAdjustement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code#CreditAdjustement
 * CardPaymentServiceType7Code.CreditAdjustement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
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
 * "CardPaymentServiceType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of transaction being undertaken for the main service. \r\nIt correspond partially to the ISO 8583, field number 3."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code Balance = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Balance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardActivation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CardActivation = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardActivation";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardActivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CardPayment = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransfer"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CardsFundTransfer = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPull"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CardsFundTransferPull = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPull";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransferPull.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPush"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CardsFundTransferPush = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPush";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransferPush.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CardVerification = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAdvance"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CashAdvance = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAdvance";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashAdvance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CashDeposit = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashWithdrawal"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CashWithdrawal = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code DeferredPayment = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DeferredPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loading"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code Loading = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loading";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCredit"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code OriginalCredit = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.OriginalCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code PINChange = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code PINUnblock = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PINUnblock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiCash"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code QuasiCash = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiCash";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.QuasiCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code Refund = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Refund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code Reservation = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Reservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unloading"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code Unloading = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unloading";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Unloading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityCheck"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code ValidityCheck = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityCheck";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.ValidityCheck.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAdjustement"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code DebitAdjustement = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAdjustement";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DebitAdjustement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditAdjustement"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType7Code CreditAdjustement = new CardPaymentServiceType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditAdjustement";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType7Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CreditAdjustement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType7Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType7Code";
				definition = "Type of transaction being undertaken for the main service. \r\nIt correspond partially to the ISO 8583, field number 3.";
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType7Code.Balance, com.tools20022.repository.codeset.CardPaymentServiceType7Code.CardActivation,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.CardPayment, com.tools20022.repository.codeset.CardPaymentServiceType7Code.CardsFundTransfer,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.CardsFundTransferPull, com.tools20022.repository.codeset.CardPaymentServiceType7Code.CardsFundTransferPush,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.CardVerification, com.tools20022.repository.codeset.CardPaymentServiceType7Code.CashAdvance,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.CashDeposit, com.tools20022.repository.codeset.CardPaymentServiceType7Code.CashWithdrawal,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.DeferredPayment, com.tools20022.repository.codeset.CardPaymentServiceType7Code.Loading,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.OriginalCredit, com.tools20022.repository.codeset.CardPaymentServiceType7Code.PINChange,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.PINUnblock, com.tools20022.repository.codeset.CardPaymentServiceType7Code.QuasiCash,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.Refund, com.tools20022.repository.codeset.CardPaymentServiceType7Code.Reservation,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.Unloading, com.tools20022.repository.codeset.CardPaymentServiceType7Code.ValidityCheck,
						com.tools20022.repository.codeset.CardPaymentServiceType7Code.DebitAdjustement, com.tools20022.repository.codeset.CardPaymentServiceType7Code.CreditAdjustement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Balance.getCodeName().get(), Balance);
		codesByName.put(CardActivation.getCodeName().get(), CardActivation);
		codesByName.put(CardPayment.getCodeName().get(), CardPayment);
		codesByName.put(CardsFundTransfer.getCodeName().get(), CardsFundTransfer);
		codesByName.put(CardsFundTransferPull.getCodeName().get(), CardsFundTransferPull);
		codesByName.put(CardsFundTransferPush.getCodeName().get(), CardsFundTransferPush);
		codesByName.put(CardVerification.getCodeName().get(), CardVerification);
		codesByName.put(CashAdvance.getCodeName().get(), CashAdvance);
		codesByName.put(CashDeposit.getCodeName().get(), CashDeposit);
		codesByName.put(CashWithdrawal.getCodeName().get(), CashWithdrawal);
		codesByName.put(DeferredPayment.getCodeName().get(), DeferredPayment);
		codesByName.put(Loading.getCodeName().get(), Loading);
		codesByName.put(OriginalCredit.getCodeName().get(), OriginalCredit);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(PINUnblock.getCodeName().get(), PINUnblock);
		codesByName.put(QuasiCash.getCodeName().get(), QuasiCash);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(Reservation.getCodeName().get(), Reservation);
		codesByName.put(Unloading.getCodeName().get(), Unloading);
		codesByName.put(ValidityCheck.getCodeName().get(), ValidityCheck);
		codesByName.put(DebitAdjustement.getCodeName().get(), DebitAdjustement);
		codesByName.put(CreditAdjustement.getCodeName().get(), CreditAdjustement);
	}

	public static CardPaymentServiceType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType7Code[] values() {
		CardPaymentServiceType7Code[] values = new CardPaymentServiceType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType7Code> {
		@Override
		public CardPaymentServiceType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
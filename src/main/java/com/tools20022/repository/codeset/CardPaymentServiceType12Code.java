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
import com.tools20022.repository.codeset.CardPaymentServiceType12Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Main service provided during the card payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Balance
 * CardPaymentServiceType12Code.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardActivation
 * CardPaymentServiceType12Code.CardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardPayment
 * CardPaymentServiceType12Code.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardsFundTransferPush
 * CardPaymentServiceType12Code.CardsFundTransferPush}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardVerification
 * CardPaymentServiceType12Code.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CashAdvance
 * CardPaymentServiceType12Code.CashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CashDeposit
 * CardPaymentServiceType12Code.CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#DeferredPayment
 * CardPaymentServiceType12Code.DeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Loading
 * CardPaymentServiceType12Code.Loading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#OriginalCredit
 * CardPaymentServiceType12Code.OriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#PINChange
 * CardPaymentServiceType12Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#QuasiCash
 * CardPaymentServiceType12Code.QuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Refund
 * CardPaymentServiceType12Code.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Reservation
 * CardPaymentServiceType12Code.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#ValidityCheck
 * CardPaymentServiceType12Code.ValidityCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Unloading
 * CardPaymentServiceType12Code.Unloading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardsFundTransfer
 * CardPaymentServiceType12Code.CardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardsFundTransferPull
 * CardPaymentServiceType12Code.CardsFundTransferPull}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardInitiatingDirectDebit
 * CardPaymentServiceType12Code.CardInitiatingDirectDebit}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CRDP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Main service provided during the card payment transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
 * CardPaymentServiceType5Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Balance
	 * CardPaymentServiceType5Code.Balance}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code Balance = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.Balance;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Balance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardActivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardActivation
	 * CardPaymentServiceType5Code.CardActivation}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CardActivation = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardActivation";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.CardActivation;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardActivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardPayment
	 * CardPaymentServiceType5Code.CardPayment}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CardPayment = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.CardPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPush"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardsFundTransferPush
	 * CardPaymentServiceType5Code.CardsFundTransferPush}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CardsFundTransferPush = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPush";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.CardsFundTransferPush;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransferPush.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardVerification
	 * CardPaymentServiceType5Code.CardVerification}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CardVerification = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.CardVerification;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAdvance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CashAdvance
	 * CardPaymentServiceType5Code.CashAdvance}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CashAdvance = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAdvance";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.CashAdvance;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashAdvance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CashDeposit
	 * CardPaymentServiceType5Code.CashDeposit}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CashDeposit = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.CashDeposit;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#DeferredPayment
	 * CardPaymentServiceType5Code.DeferredPayment}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code DeferredPayment = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredPayment";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.DeferredPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DeferredPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Loading
	 * CardPaymentServiceType5Code.Loading}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code Loading = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loading";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.Loading;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#OriginalCredit
	 * CardPaymentServiceType5Code.OriginalCredit}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code OriginalCredit = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCredit";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.OriginalCredit;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.OriginalCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#PINChange
	 * CardPaymentServiceType5Code.PINChange}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code PINChange = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.PINChange;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#QuasiCash
	 * CardPaymentServiceType5Code.QuasiCash}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code QuasiCash = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiCash";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.QuasiCash;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.QuasiCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Refund
	 * CardPaymentServiceType5Code.Refund}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code Refund = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.Refund;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Refund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Reservation
	 * CardPaymentServiceType5Code.Reservation}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code Reservation = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.Reservation;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Reservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#ValidityCheck
	 * CardPaymentServiceType5Code.ValidityCheck}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code ValidityCheck = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityCheck";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.ValidityCheck;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.ValidityCheck.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unloading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Unloading
	 * CardPaymentServiceType5Code.Unloading}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code Unloading = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unloading";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.Unloading;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Unloading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardsFundTransfer
	 * CardPaymentServiceType5Code.CardsFundTransfer}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CardsFundTransfer = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransfer";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.CardsFundTransfer;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPull"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardsFundTransferPull
	 * CardPaymentServiceType5Code.CardsFundTransferPull}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CardsFundTransferPull = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPull";
			previousVersion_lazy = () -> CardPaymentServiceType5Code.CardsFundTransferPull;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransferPull.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
	 * CardPaymentServiceType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardInitiatingDirectDebit"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType12Code CardInitiatingDirectDebit = new CardPaymentServiceType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardInitiatingDirectDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType12Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardInitiatingDirectDebit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType12Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRDP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType12Code";
				definition = "Main service provided during the card payment transaction.";
				previousVersion_lazy = () -> CardPaymentServiceType5Code.mmObject();
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType12Code.Balance, com.tools20022.repository.codeset.CardPaymentServiceType12Code.CardActivation,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.CardPayment, com.tools20022.repository.codeset.CardPaymentServiceType12Code.CardsFundTransferPush,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.CardVerification, com.tools20022.repository.codeset.CardPaymentServiceType12Code.CashAdvance,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.CashDeposit, com.tools20022.repository.codeset.CardPaymentServiceType12Code.DeferredPayment,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.Loading, com.tools20022.repository.codeset.CardPaymentServiceType12Code.OriginalCredit,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.PINChange, com.tools20022.repository.codeset.CardPaymentServiceType12Code.QuasiCash,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.Refund, com.tools20022.repository.codeset.CardPaymentServiceType12Code.Reservation,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.ValidityCheck, com.tools20022.repository.codeset.CardPaymentServiceType12Code.Unloading,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.CardsFundTransfer, com.tools20022.repository.codeset.CardPaymentServiceType12Code.CardsFundTransferPull,
						com.tools20022.repository.codeset.CardPaymentServiceType12Code.CardInitiatingDirectDebit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Balance.getCodeName().get(), Balance);
		codesByName.put(CardActivation.getCodeName().get(), CardActivation);
		codesByName.put(CardPayment.getCodeName().get(), CardPayment);
		codesByName.put(CardsFundTransferPush.getCodeName().get(), CardsFundTransferPush);
		codesByName.put(CardVerification.getCodeName().get(), CardVerification);
		codesByName.put(CashAdvance.getCodeName().get(), CashAdvance);
		codesByName.put(CashDeposit.getCodeName().get(), CashDeposit);
		codesByName.put(DeferredPayment.getCodeName().get(), DeferredPayment);
		codesByName.put(Loading.getCodeName().get(), Loading);
		codesByName.put(OriginalCredit.getCodeName().get(), OriginalCredit);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(QuasiCash.getCodeName().get(), QuasiCash);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(Reservation.getCodeName().get(), Reservation);
		codesByName.put(ValidityCheck.getCodeName().get(), ValidityCheck);
		codesByName.put(Unloading.getCodeName().get(), Unloading);
		codesByName.put(CardsFundTransfer.getCodeName().get(), CardsFundTransfer);
		codesByName.put(CardsFundTransferPull.getCodeName().get(), CardsFundTransferPull);
		codesByName.put(CardInitiatingDirectDebit.getCodeName().get(), CardInitiatingDirectDebit);
	}

	public static CardPaymentServiceType12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType12Code[] values() {
		CardPaymentServiceType12Code[] values = new CardPaymentServiceType12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType12Code> {
		@Override
		public CardPaymentServiceType12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
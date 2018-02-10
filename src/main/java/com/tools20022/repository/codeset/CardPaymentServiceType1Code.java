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
import com.tools20022.repository.codeset.CardPaymentServiceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of service provided by the card payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#CardsFundTransfer
 * CardPaymentServiceType1Code.CardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#OriginalCredit
 * CardPaymentServiceType1Code.OriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#CardPayment
 * CardPaymentServiceType1Code.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#CashBack
 * CardPaymentServiceType1Code.CashBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#CashAdvance
 * CardPaymentServiceType1Code.CashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#CashDeposit
 * CardPaymentServiceType1Code.CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#DeferredPayment
 * CardPaymentServiceType1Code.DeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#Reservation
 * CardPaymentServiceType1Code.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#Loading
 * CardPaymentServiceType1Code.Loading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#Refund
 * CardPaymentServiceType1Code.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#QuasiCash
 * CardPaymentServiceType1Code.QuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#Balance
 * CardPaymentServiceType1Code.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#CardActivation
 * CardPaymentServiceType1Code.CardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#CardVerification
 * CardPaymentServiceType1Code.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#PINChange
 * CardPaymentServiceType1Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code#ValidityCheck
 * CardPaymentServiceType1Code.ValidityCheck}</li>
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
 * <li>"CAFT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service provided by the card payment transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransfer"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code CardsFundTransfer = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCredit"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code OriginalCredit = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.OriginalCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code CardPayment = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code CashBack = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAdvance"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code CashAdvance = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAdvance";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashAdvance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code CashDeposit = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredPayment"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code DeferredPayment = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DeferredPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code Reservation = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Reservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loading"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code Loading = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loading";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code Refund = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Refund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiCash"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code QuasiCash = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiCash";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.QuasiCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code Balance = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Balance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardActivation"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code CardActivation = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardActivation";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardActivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code CardVerification = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code PINChange = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType1Code
	 * CardPaymentServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityCheck"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType1Code ValidityCheck = new CardPaymentServiceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityCheck";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType1Code.mmObject();
			codeName = CardPaymentServiceTypeCode.ValidityCheck.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType1Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType1Code";
				definition = "Type of service provided by the card payment transaction.";
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType1Code.CardsFundTransfer, com.tools20022.repository.codeset.CardPaymentServiceType1Code.OriginalCredit,
						com.tools20022.repository.codeset.CardPaymentServiceType1Code.CardPayment, com.tools20022.repository.codeset.CardPaymentServiceType1Code.CashBack,
						com.tools20022.repository.codeset.CardPaymentServiceType1Code.CashAdvance, com.tools20022.repository.codeset.CardPaymentServiceType1Code.CashDeposit,
						com.tools20022.repository.codeset.CardPaymentServiceType1Code.DeferredPayment, com.tools20022.repository.codeset.CardPaymentServiceType1Code.Reservation,
						com.tools20022.repository.codeset.CardPaymentServiceType1Code.Loading, com.tools20022.repository.codeset.CardPaymentServiceType1Code.Refund, com.tools20022.repository.codeset.CardPaymentServiceType1Code.QuasiCash,
						com.tools20022.repository.codeset.CardPaymentServiceType1Code.Balance, com.tools20022.repository.codeset.CardPaymentServiceType1Code.CardActivation,
						com.tools20022.repository.codeset.CardPaymentServiceType1Code.CardVerification, com.tools20022.repository.codeset.CardPaymentServiceType1Code.PINChange,
						com.tools20022.repository.codeset.CardPaymentServiceType1Code.ValidityCheck);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardsFundTransfer.getCodeName().get(), CardsFundTransfer);
		codesByName.put(OriginalCredit.getCodeName().get(), OriginalCredit);
		codesByName.put(CardPayment.getCodeName().get(), CardPayment);
		codesByName.put(CashBack.getCodeName().get(), CashBack);
		codesByName.put(CashAdvance.getCodeName().get(), CashAdvance);
		codesByName.put(CashDeposit.getCodeName().get(), CashDeposit);
		codesByName.put(DeferredPayment.getCodeName().get(), DeferredPayment);
		codesByName.put(Reservation.getCodeName().get(), Reservation);
		codesByName.put(Loading.getCodeName().get(), Loading);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(QuasiCash.getCodeName().get(), QuasiCash);
		codesByName.put(Balance.getCodeName().get(), Balance);
		codesByName.put(CardActivation.getCodeName().get(), CardActivation);
		codesByName.put(CardVerification.getCodeName().get(), CardVerification);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(ValidityCheck.getCodeName().get(), ValidityCheck);
	}

	public static CardPaymentServiceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType1Code[] values() {
		CardPaymentServiceType1Code[] values = new CardPaymentServiceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType1Code> {
		@Override
		public CardPaymentServiceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
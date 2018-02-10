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
import com.tools20022.repository.codeset.CardPaymentServiceType4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#PersonToPerson
 * CardPaymentServiceType4Code.PersonToPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#PersonToBusiness
 * CardPaymentServiceType4Code.PersonToBusiness}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#Balance
 * CardPaymentServiceType4Code.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CardActivation
 * CardPaymentServiceType4Code.CardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CardPayment
 * CardPaymentServiceType4Code.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CardsFundTransfer
 * CardPaymentServiceType4Code.CardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CardVerification
 * CardPaymentServiceType4Code.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CashAdvance
 * CardPaymentServiceType4Code.CashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CashBack
 * CardPaymentServiceType4Code.CashBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CashDeposit
 * CardPaymentServiceType4Code.CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#DeferredPayment
 * CardPaymentServiceType4Code.DeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#Loading
 * CardPaymentServiceType4Code.Loading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#OriginalCredit
 * CardPaymentServiceType4Code.OriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#PINChange
 * CardPaymentServiceType4Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#QuasiCash
 * CardPaymentServiceType4Code.QuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#Refund
 * CardPaymentServiceType4Code.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#Reservation
 * CardPaymentServiceType4Code.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#ValidityCheck
 * CardPaymentServiceType4Code.ValidityCheck}</li>
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
 * <li>"TP2P"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Main service provided during the card payment transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
 * CardPaymentServiceType5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonToPerson"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code PersonToPerson = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonToPerson";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PersonToPerson.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonToBusiness"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code PersonToBusiness = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonToBusiness";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PersonToBusiness.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Balance
	 * CardPaymentServiceType5Code.Balance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code Balance = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.Balance);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Balance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardActivation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardActivation
	 * CardPaymentServiceType5Code.CardActivation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code CardActivation = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardActivation";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.CardActivation);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardActivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardPayment
	 * CardPaymentServiceType5Code.CardPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code CardPayment = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.CardPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransfer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardsFundTransferPush
	 * CardPaymentServiceType5Code.CardsFundTransferPush}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code CardsFundTransfer = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransfer";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.CardsFundTransferPush);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardVerification
	 * CardPaymentServiceType5Code.CardVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code CardVerification = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.CardVerification);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAdvance"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CashAdvance
	 * CardPaymentServiceType5Code.CashAdvance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code CashAdvance = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAdvance";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.CashAdvance);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashAdvance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code CashBack = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDeposit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CashDeposit
	 * CardPaymentServiceType5Code.CashDeposit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code CashDeposit = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.CashDeposit);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#DeferredPayment
	 * CardPaymentServiceType5Code.DeferredPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code DeferredPayment = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredPayment";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.DeferredPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DeferredPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loading"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Loading
	 * CardPaymentServiceType5Code.Loading}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code Loading = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loading";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.Loading);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCredit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#OriginalCredit
	 * CardPaymentServiceType5Code.OriginalCredit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code OriginalCredit = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCredit";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.OriginalCredit);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.OriginalCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#PINChange
	 * CardPaymentServiceType5Code.PINChange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code PINChange = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.PINChange);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuasiCash"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#QuasiCash
	 * CardPaymentServiceType5Code.QuasiCash}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code QuasiCash = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiCash";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.QuasiCash);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.QuasiCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Refund"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Refund
	 * CardPaymentServiceType5Code.Refund}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code Refund = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.Refund);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Refund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Reservation
	 * CardPaymentServiceType5Code.Reservation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code Reservation = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.Reservation);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Reservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
	 * CardPaymentServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityCheck"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#ValidityCheck
	 * CardPaymentServiceType5Code.ValidityCheck}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType4Code ValidityCheck = new CardPaymentServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityCheck";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.ValidityCheck);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmObject();
			codeName = CardPaymentServiceTypeCode.ValidityCheck.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType4Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TP2P");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType4Code";
				definition = "Main service provided during the card payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.mmObject());
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType4Code.PersonToPerson, com.tools20022.repository.codeset.CardPaymentServiceType4Code.PersonToBusiness,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.Balance, com.tools20022.repository.codeset.CardPaymentServiceType4Code.CardActivation,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.CardPayment, com.tools20022.repository.codeset.CardPaymentServiceType4Code.CardsFundTransfer,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.CardVerification, com.tools20022.repository.codeset.CardPaymentServiceType4Code.CashAdvance,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.CashBack, com.tools20022.repository.codeset.CardPaymentServiceType4Code.CashDeposit,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.DeferredPayment, com.tools20022.repository.codeset.CardPaymentServiceType4Code.Loading,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.OriginalCredit, com.tools20022.repository.codeset.CardPaymentServiceType4Code.PINChange,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.QuasiCash, com.tools20022.repository.codeset.CardPaymentServiceType4Code.Refund,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.Reservation, com.tools20022.repository.codeset.CardPaymentServiceType4Code.ValidityCheck);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PersonToPerson.getCodeName().get(), PersonToPerson);
		codesByName.put(PersonToBusiness.getCodeName().get(), PersonToBusiness);
		codesByName.put(Balance.getCodeName().get(), Balance);
		codesByName.put(CardActivation.getCodeName().get(), CardActivation);
		codesByName.put(CardPayment.getCodeName().get(), CardPayment);
		codesByName.put(CardsFundTransfer.getCodeName().get(), CardsFundTransfer);
		codesByName.put(CardVerification.getCodeName().get(), CardVerification);
		codesByName.put(CashAdvance.getCodeName().get(), CashAdvance);
		codesByName.put(CashBack.getCodeName().get(), CashBack);
		codesByName.put(CashDeposit.getCodeName().get(), CashDeposit);
		codesByName.put(DeferredPayment.getCodeName().get(), DeferredPayment);
		codesByName.put(Loading.getCodeName().get(), Loading);
		codesByName.put(OriginalCredit.getCodeName().get(), OriginalCredit);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(QuasiCash.getCodeName().get(), QuasiCash);
		codesByName.put(Refund.getCodeName().get(), Refund);
		codesByName.put(Reservation.getCodeName().get(), Reservation);
		codesByName.put(ValidityCheck.getCodeName().get(), ValidityCheck);
	}

	public static CardPaymentServiceType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType4Code[] values() {
		CardPaymentServiceType4Code[] values = new CardPaymentServiceType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType4Code> {
		@Override
		public CardPaymentServiceType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
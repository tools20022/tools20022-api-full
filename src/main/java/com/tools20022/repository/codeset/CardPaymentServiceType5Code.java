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
import com.tools20022.repository.codeset.CardPaymentServiceType5Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Balance
 * CardPaymentServiceType5Code.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardActivation
 * CardPaymentServiceType5Code.CardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardPayment
 * CardPaymentServiceType5Code.CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardsFundTransferPush
 * CardPaymentServiceType5Code.CardsFundTransferPush}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardVerification
 * CardPaymentServiceType5Code.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CashAdvance
 * CardPaymentServiceType5Code.CashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CashDeposit
 * CardPaymentServiceType5Code.CashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#DeferredPayment
 * CardPaymentServiceType5Code.DeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Loading
 * CardPaymentServiceType5Code.Loading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#OriginalCredit
 * CardPaymentServiceType5Code.OriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#PINChange
 * CardPaymentServiceType5Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#QuasiCash
 * CardPaymentServiceType5Code.QuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Refund
 * CardPaymentServiceType5Code.Refund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Reservation
 * CardPaymentServiceType5Code.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#ValidityCheck
 * CardPaymentServiceType5Code.ValidityCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#Unloading
 * CardPaymentServiceType5Code.Unloading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardsFundTransfer
 * CardPaymentServiceType5Code.CardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#CardsFundTransferPull
 * CardPaymentServiceType5Code.CardsFundTransferPull}</li>
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
 * "CardPaymentServiceType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Main service provided during the card payment transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code
 * CardPaymentServiceType12Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code
 * CardPaymentServiceType4Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Balance
	 * CardPaymentServiceType12Code.Balance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#Balance
	 * CardPaymentServiceType4Code.Balance}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code Balance = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.Balance);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.Balance;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Balance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardActivation
	 * CardPaymentServiceType12Code.CardActivation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CardActivation
	 * CardPaymentServiceType4Code.CardActivation}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code CardActivation = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardActivation";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.CardActivation);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.CardActivation;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardActivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardPayment
	 * CardPaymentServiceType12Code.CardPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CardPayment
	 * CardPaymentServiceType4Code.CardPayment}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code CardPayment = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.CardPayment);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.CardPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPush"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardsFundTransferPush
	 * CardPaymentServiceType12Code.CardsFundTransferPush}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CardsFundTransfer
	 * CardPaymentServiceType4Code.CardsFundTransfer}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code CardsFundTransferPush = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPush";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.CardsFundTransferPush);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.CardsFundTransfer;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransferPush.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardVerification
	 * CardPaymentServiceType12Code.CardVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CardVerification
	 * CardPaymentServiceType4Code.CardVerification}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code CardVerification = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.CardVerification);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.CardVerification;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CashAdvance
	 * CardPaymentServiceType12Code.CashAdvance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CashAdvance
	 * CardPaymentServiceType4Code.CashAdvance}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code CashAdvance = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAdvance";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.CashAdvance);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.CashAdvance;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashAdvance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CashDeposit
	 * CardPaymentServiceType12Code.CashDeposit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#CashDeposit
	 * CardPaymentServiceType4Code.CashDeposit}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code CashDeposit = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.CashDeposit);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.CashDeposit;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#DeferredPayment
	 * CardPaymentServiceType12Code.DeferredPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#DeferredPayment
	 * CardPaymentServiceType4Code.DeferredPayment}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code DeferredPayment = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredPayment";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.DeferredPayment);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.DeferredPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DeferredPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Loading
	 * CardPaymentServiceType12Code.Loading}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#Loading
	 * CardPaymentServiceType4Code.Loading}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code Loading = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loading";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.Loading);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.Loading;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#OriginalCredit
	 * CardPaymentServiceType12Code.OriginalCredit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#OriginalCredit
	 * CardPaymentServiceType4Code.OriginalCredit}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code OriginalCredit = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCredit";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.OriginalCredit);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.OriginalCredit;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.OriginalCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#PINChange
	 * CardPaymentServiceType12Code.PINChange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#PINChange
	 * CardPaymentServiceType4Code.PINChange}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code PINChange = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.PINChange);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.PINChange;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#QuasiCash
	 * CardPaymentServiceType12Code.QuasiCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#QuasiCash
	 * CardPaymentServiceType4Code.QuasiCash}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code QuasiCash = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiCash";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.QuasiCash);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.QuasiCash;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.QuasiCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Refund
	 * CardPaymentServiceType12Code.Refund}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#Refund
	 * CardPaymentServiceType4Code.Refund}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code Refund = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.Refund);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.Refund;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Refund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Reservation
	 * CardPaymentServiceType12Code.Reservation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#Reservation
	 * CardPaymentServiceType4Code.Reservation}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code Reservation = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.Reservation);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.Reservation;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Reservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#ValidityCheck
	 * CardPaymentServiceType12Code.ValidityCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#ValidityCheck
	 * CardPaymentServiceType4Code.ValidityCheck}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code ValidityCheck = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityCheck";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.ValidityCheck);
			previousVersion_lazy = () -> CardPaymentServiceType4Code.ValidityCheck;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.ValidityCheck.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unloading"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#Unloading
	 * CardPaymentServiceType12Code.Unloading}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code Unloading = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unloading";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.Unloading);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Unloading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardsFundTransfer
	 * CardPaymentServiceType12Code.CardsFundTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code CardsFundTransfer = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransfer";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.CardsFundTransfer);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code
	 * CardPaymentServiceType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardsFundTransferPull"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType12Code#CardsFundTransferPull
	 * CardPaymentServiceType12Code.CardsFundTransferPull}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardPaymentServiceType5Code CardsFundTransferPull = new CardPaymentServiceType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransferPull";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.CardsFundTransferPull);
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CardsFundTransferPull.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType5Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CRDP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType5Code";
				definition = "Main service provided during the card payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType12Code.mmObject());
				previousVersion_lazy = () -> CardPaymentServiceType4Code.mmObject();
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.Balance, com.tools20022.repository.codeset.CardPaymentServiceType5Code.CardActivation,
						com.tools20022.repository.codeset.CardPaymentServiceType5Code.CardPayment, com.tools20022.repository.codeset.CardPaymentServiceType5Code.CardsFundTransferPush,
						com.tools20022.repository.codeset.CardPaymentServiceType5Code.CardVerification, com.tools20022.repository.codeset.CardPaymentServiceType5Code.CashAdvance,
						com.tools20022.repository.codeset.CardPaymentServiceType5Code.CashDeposit, com.tools20022.repository.codeset.CardPaymentServiceType5Code.DeferredPayment,
						com.tools20022.repository.codeset.CardPaymentServiceType5Code.Loading, com.tools20022.repository.codeset.CardPaymentServiceType5Code.OriginalCredit,
						com.tools20022.repository.codeset.CardPaymentServiceType5Code.PINChange, com.tools20022.repository.codeset.CardPaymentServiceType5Code.QuasiCash, com.tools20022.repository.codeset.CardPaymentServiceType5Code.Refund,
						com.tools20022.repository.codeset.CardPaymentServiceType5Code.Reservation, com.tools20022.repository.codeset.CardPaymentServiceType5Code.ValidityCheck,
						com.tools20022.repository.codeset.CardPaymentServiceType5Code.Unloading, com.tools20022.repository.codeset.CardPaymentServiceType5Code.CardsFundTransfer,
						com.tools20022.repository.codeset.CardPaymentServiceType5Code.CardsFundTransferPull);
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
	}

	public static CardPaymentServiceType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType5Code[] values() {
		CardPaymentServiceType5Code[] values = new CardPaymentServiceType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType5Code> {
		@Override
		public CardPaymentServiceType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
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
import com.tools20022.repository.codeset.CardPaymentServiceTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Main service provided during the card payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmPersonToPerson
 * CardPaymentServiceType4Code.mmPersonToPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmPersonToBusiness
 * CardPaymentServiceType4Code.mmPersonToBusiness}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmBalance
 * CardPaymentServiceType4Code.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmCardActivation
 * CardPaymentServiceType4Code.mmCardActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmCardPayment
 * CardPaymentServiceType4Code.mmCardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmCardsFundTransfer
 * CardPaymentServiceType4Code.mmCardsFundTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmCardVerification
 * CardPaymentServiceType4Code.mmCardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmCashAdvance
 * CardPaymentServiceType4Code.mmCashAdvance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmCashBack
 * CardPaymentServiceType4Code.mmCashBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmCashDeposit
 * CardPaymentServiceType4Code.mmCashDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmDeferredPayment
 * CardPaymentServiceType4Code.mmDeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmLoading
 * CardPaymentServiceType4Code.mmLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmOriginalCredit
 * CardPaymentServiceType4Code.mmOriginalCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmPINChange
 * CardPaymentServiceType4Code.mmPINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmQuasiCash
 * CardPaymentServiceType4Code.mmQuasiCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmRefund
 * CardPaymentServiceType4Code.mmRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmReservation
 * CardPaymentServiceType4Code.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType4Code#mmValidityCheck
 * CardPaymentServiceType4Code.mmValidityCheck}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CardPaymentServiceType4Code extends CardPaymentServiceTypeCode {

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
	public static final MMCode mmPersonToPerson = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonToPerson";
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	public static final MMCode mmPersonToBusiness = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonToBusiness";
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmBalance
	 * CardPaymentServiceType5Code.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmBalance);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmCardActivation
	 * CardPaymentServiceType5Code.mmCardActivation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardActivation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardActivation";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmCardActivation);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmCardPayment
	 * CardPaymentServiceType5Code.mmCardPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPayment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmCardPayment);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmCardsFundTransferPush
	 * CardPaymentServiceType5Code.mmCardsFundTransferPush}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardsFundTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardsFundTransfer";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmCardsFundTransferPush);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmCardVerification
	 * CardPaymentServiceType5Code.mmCardVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardVerification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmCardVerification);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmCashAdvance
	 * CardPaymentServiceType5Code.mmCashAdvance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashAdvance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAdvance";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmCashAdvance);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	public static final MMCode mmCashBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmCashDeposit
	 * CardPaymentServiceType5Code.mmCashDeposit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDeposit";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmCashDeposit);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmDeferredPayment
	 * CardPaymentServiceType5Code.mmDeferredPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDeferredPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeferredPayment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmDeferredPayment);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmLoading
	 * CardPaymentServiceType5Code.mmLoading}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLoading = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loading";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmLoading);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmOriginalCredit
	 * CardPaymentServiceType5Code.mmOriginalCredit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOriginalCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCredit";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmOriginalCredit);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmPINChange
	 * CardPaymentServiceType5Code.mmPINChange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPINChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmPINChange);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmQuasiCash
	 * CardPaymentServiceType5Code.mmQuasiCash}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmQuasiCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuasiCash";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmQuasiCash);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmRefund
	 * CardPaymentServiceType5Code.mmRefund}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRefund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Refund";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmRefund);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmReservation
	 * CardPaymentServiceType5Code.mmReservation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReservation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmReservation);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType5Code#mmValidityCheck
	 * CardPaymentServiceType5Code.mmValidityCheck}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmValidityCheck = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityCheck";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType5Code.mmValidityCheck);
			owner_lazy = () -> CardPaymentServiceType4Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("TP2P");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType4Code";
				definition = "Main service provided during the card payment transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType5Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmPersonToPerson, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmPersonToBusiness,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmBalance, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmCardActivation,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmCardPayment, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmCardsFundTransfer,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmCardVerification, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmCashAdvance,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmCashBack, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmCashDeposit,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmDeferredPayment, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmLoading,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmOriginalCredit, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmPINChange,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmQuasiCash, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmRefund,
						com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmReservation, com.tools20022.repository.codeset.CardPaymentServiceType4Code.mmValidityCheck);
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}
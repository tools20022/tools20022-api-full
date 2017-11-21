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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes the type of transaction available for a customer on an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmChosenWithdrawal
 * ATMServiceTypeCode.mmChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmPreAuthorisedWithdrawal
 * ATMServiceTypeCode.mmPreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmProfileWithdrawal
 * ATMServiceTypeCode.mmProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmStandardWithdrawal
 * ATMServiceTypeCode.mmStandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmSupervisedWithdrawal
 * ATMServiceTypeCode.mmSupervisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmPINChange
 * ATMServiceTypeCode.mmPINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmPINRecovery
 * ATMServiceTypeCode.mmPINRecovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmPINUnblock
 * ATMServiceTypeCode.mmPINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmAccountStatements
 * ATMServiceTypeCode.mmAccountStatements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmCardVerification
 * ATMServiceTypeCode.mmCardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmCustomerProfile
 * ATMServiceTypeCode.mmCustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmDynamicCurrencyConversion
 * ATMServiceTypeCode.mmDynamicCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmExchangeRateDeposit
 * ATMServiceTypeCode.mmExchangeRateDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmExchangeRateWithdrawal
 * ATMServiceTypeCode.mmExchangeRateWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmSelectEMVApplication
 * ATMServiceTypeCode.mmSelectEMVApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmBalanceInquiry
 * ATMServiceTypeCode.mmBalanceInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmDeposit
 * ATMServiceTypeCode.mmDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmMakingChange
 * ATMServiceTypeCode.mmMakingChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmNonVerifiedDeposit
 * ATMServiceTypeCode.mmNonVerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmVerifiedDeposit
 * ATMServiceTypeCode.mmVerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmCustomerTransfer
 * ATMServiceTypeCode.mmCustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmInterCustomerTransfer
 * ATMServiceTypeCode.mmInterCustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#mmPayment
 * ATMServiceTypeCode.mmPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType1Code
 * ATMServiceType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
 * ATMServiceType4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType2Code
 * ATMServiceType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
 * ATMServiceType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType5Code
 * ATMServiceType5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType6Code
 * ATMServiceType6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType7Code
 * ATMServiceType7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType8Code
 * ATMServiceType8Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType9Code
 * ATMServiceType9Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
 * ATMServiceType10Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMServiceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of transaction available for a customer on an ATM."</li>
 * </ul>
 */
public class ATMServiceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount and notes values are chosen by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHSN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount and notes values are chosen by the customer."</li>
	 * </ul>
	 */
	public static final MMCode mmChosenWithdrawal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			definition = "Amount and notes values are chosen by the customer.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "CHSN";
		}
	};
	/**
	 * Withdrawal transaction was pre-authorised by another channel, for
	 * instance a mobile. The amount could be absent from the withdrawal request
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PATH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPreAuthorisedWithdrawal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			definition = "Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "PATH";
		}
	};
	/**
	 * Amount and notes Values are pre-defined by the customer profile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount and notes Values are pre-defined by the customer profile."</li>
	 * </ul>
	 */
	public static final MMCode mmProfileWithdrawal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			definition = "Amount and notes Values are pre-defined by the customer profile.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "PRFL";
		}
	};
	/**
	 * Standard withdrawal of items.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standard withdrawal of items."</li>
	 * </ul>
	 */
	public static final MMCode mmStandardWithdrawal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			definition = "Standard withdrawal of items.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "STDR";
		}
	};
	/**
	 * Withdrawal authorised by a supervisor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupervisedWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal authorised by a supervisor."</li>
	 * </ul>
	 */
	public static final MMCode mmSupervisedWithdrawal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupervisedWithdrawal";
			definition = "Withdrawal authorised by a supervisor.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "SPRV";
		}
	};
	/**
	 * Modification of the card PIN value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification of the card PIN value."</li>
	 * </ul>
	 */
	public static final MMCode mmPINChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			definition = "Modification of the card PIN value.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "PINC";
		}
	};
	/**
	 * Resetting of a PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRecovery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resetting of a PIN."</li>
	 * </ul>
	 */
	public static final MMCode mmPINRecovery = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRecovery";
			definition = "Resetting of a PIN.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "PINR";
		}
	};
	/**
	 * Unblock the PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unblock the PIN."</li>
	 * </ul>
	 */
	public static final MMCode mmPINUnblock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			definition = "Unblock the PIN.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "PINU";
		}
	};
	/**
	 * Ask for account statement information to a related custumer account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask for account statement information to a related custumer account."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountStatements = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatements";
			definition = "Ask for account statement information to a related custumer account.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "ASTS";
		}
	};
	/**
	 * Verification of the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDVF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Verification of the card."</li>
	 * </ul>
	 */
	public static final MMCode mmCardVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			definition = "Verification of the card.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "CDVF";
		}
	};
	/**
	 * Ask for customer profile with eventualy related account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask for customer profile with eventualy related account information."</li>
	 * </ul>
	 */
	public static final MMCode mmCustomerProfile = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerProfile";
			definition = "Ask for customer profile with eventualy related account information.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "CMPF";
		}
	};
	/**
	 * Ask to a DCC service provider to qualify the currency conversion for the
	 * card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicCurrencyConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask to a DCC service provider to qualify the currency conversion for the card."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDynamicCurrencyConversion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicCurrencyConversion";
			definition = "Ask to a DCC service provider to qualify the currency conversion for the card.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "DCCS";
		}
	};
	/**
	 * Ask for exchange rate for the ongoing deposit transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XRTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask for exchange rate for the ongoing deposit transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmExchangeRateDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateDeposit";
			definition = "Ask for exchange rate for the ongoing deposit transaction.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "XRTD";
		}
	};
	/**
	 * Ask for exchange rate for the ongoing withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XRTW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask for exchange rate for the ongoing withdrawal transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmExchangeRateWithdrawal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateWithdrawal";
			definition = "Ask for exchange rate for the ongoing withdrawal transaction.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "XRTW";
		}
	};
	/**
	 * Select the EMV applications allowed by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectEMVApplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Select the EMV applications allowed by the acquirer."</li>
	 * </ul>
	 */
	public static final MMCode mmSelectEMVApplication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectEMVApplication";
			definition = "Select the EMV applications allowed by the acquirer.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "EMVS";
		}
	};
	/**
	 * Balance inquiry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance inquiry."</li>
	 * </ul>
	 */
	public static final MMCode mmBalanceInquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceInquiry";
			definition = "Balance inquiry.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "BLCQ";
		}
	};
	/**
	 * Deposit of items.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit of items."</li>
	 * </ul>
	 */
	public static final MMCode mmDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			definition = "Deposit of items.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "DPST";
		}
	};
	/**
	 * Making change between media types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MakingChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Making change between media types."</li>
	 * </ul>
	 */
	public static final MMCode mmMakingChange = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MakingChange";
			definition = "Making change between media types.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "MCHG";
		}
	};
	/**
	 * Deposit of media items unverified by the ATM, for instance in an
	 * envelope.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPSN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonVerifiedDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deposit of media items unverified by the ATM, for instance in an envelope."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonVerifiedDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonVerifiedDeposit";
			definition = "Deposit of media items unverified by the ATM, for instance in an envelope.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "DPSN";
		}
	};
	/**
	 * Deposit of media items verified by the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPSV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VerifiedDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit of media items verified by the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmVerifiedDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VerifiedDeposit";
			definition = "Deposit of media items verified by the ATM.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "DPSV";
		}
	};
	/**
	 * Funds transfer between accounts belonging to the customer in the same
	 * bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRFC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds transfer between accounts belonging to the customer in the same bank."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCustomerTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTransfer";
			definition = "Funds transfer between accounts belonging to the customer in the same bank.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "TRFC";
		}
	};
	/**
	 * Funds transfer to another customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCustomerTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds transfer to another customer."</li>
	 * </ul>
	 */
	public static final MMCode mmInterCustomerTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCustomerTransfer";
			definition = "Funds transfer to another customer.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "TRFI";
		}
	};
	/**
	 * Funds transfer to pay a third party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
	 * ATMServiceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRFP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds transfer to pay a third party."</li>
	 * </ul>
	 */
	public static final MMCode mmPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Funds transfer to pay a third party.";
			owner_lazy = () -> ATMServiceTypeCode.mmObject();
			codeName = "TRFP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceTypeCode";
				definition = "Describes the type of transaction available for a customer on an ATM.";
				code_lazy = () -> Arrays.asList(ATMServiceTypeCode.mmChosenWithdrawal, ATMServiceTypeCode.mmPreAuthorisedWithdrawal, ATMServiceTypeCode.mmProfileWithdrawal, ATMServiceTypeCode.mmStandardWithdrawal,
						ATMServiceTypeCode.mmSupervisedWithdrawal, ATMServiceTypeCode.mmPINChange, ATMServiceTypeCode.mmPINRecovery, ATMServiceTypeCode.mmPINUnblock, ATMServiceTypeCode.mmAccountStatements,
						ATMServiceTypeCode.mmCardVerification, ATMServiceTypeCode.mmCustomerProfile, ATMServiceTypeCode.mmDynamicCurrencyConversion, ATMServiceTypeCode.mmExchangeRateDeposit, ATMServiceTypeCode.mmExchangeRateWithdrawal,
						ATMServiceTypeCode.mmSelectEMVApplication, ATMServiceTypeCode.mmBalanceInquiry, ATMServiceTypeCode.mmDeposit, ATMServiceTypeCode.mmMakingChange, ATMServiceTypeCode.mmNonVerifiedDeposit,
						ATMServiceTypeCode.mmVerifiedDeposit, ATMServiceTypeCode.mmCustomerTransfer, ATMServiceTypeCode.mmInterCustomerTransfer, ATMServiceTypeCode.mmPayment);
				derivation_lazy = () -> Arrays.asList(ATMServiceType1Code.mmObject(), ATMServiceType4Code.mmObject(), ATMServiceType2Code.mmObject(), ATMServiceType3Code.mmObject(), ATMServiceType5Code.mmObject(),
						ATMServiceType6Code.mmObject(), ATMServiceType7Code.mmObject(), ATMServiceType8Code.mmObject(), ATMServiceType9Code.mmObject(), ATMServiceType10Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
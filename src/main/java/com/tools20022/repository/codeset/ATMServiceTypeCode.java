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
import com.tools20022.repository.codeset.ATMServiceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the type of transaction available for a customer on an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#ChosenWithdrawal
 * ATMServiceTypeCode.ChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#PreAuthorisedWithdrawal
 * ATMServiceTypeCode.PreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#ProfileWithdrawal
 * ATMServiceTypeCode.ProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#StandardWithdrawal
 * ATMServiceTypeCode.StandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#SupervisedWithdrawal
 * ATMServiceTypeCode.SupervisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#PINChange
 * ATMServiceTypeCode.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#PINRecovery
 * ATMServiceTypeCode.PINRecovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#PINUnblock
 * ATMServiceTypeCode.PINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#AccountStatements
 * ATMServiceTypeCode.AccountStatements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#CardVerification
 * ATMServiceTypeCode.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#CustomerProfile
 * ATMServiceTypeCode.CustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#DynamicCurrencyConversion
 * ATMServiceTypeCode.DynamicCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#ExchangeRateDeposit
 * ATMServiceTypeCode.ExchangeRateDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#ExchangeRateWithdrawal
 * ATMServiceTypeCode.ExchangeRateWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#SelectEMVApplication
 * ATMServiceTypeCode.SelectEMVApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#BalanceInquiry
 * ATMServiceTypeCode.BalanceInquiry}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#Deposit
 * ATMServiceTypeCode.Deposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#MakingChange
 * ATMServiceTypeCode.MakingChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#NonVerifiedDeposit
 * ATMServiceTypeCode.NonVerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#VerifiedDeposit
 * ATMServiceTypeCode.VerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#CustomerTransfer
 * ATMServiceTypeCode.CustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#InterCustomerTransfer
 * ATMServiceTypeCode.InterCustomerTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode#Payment
 * ATMServiceTypeCode.Payment}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMServiceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of transaction available for a customer on an ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMServiceTypeCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount and notes values are chosen by the customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode ChosenWithdrawal = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			definition = "Amount and notes values are chosen by the customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode PreAuthorisedWithdrawal = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			definition = "Withdrawal transaction was pre-authorised by another channel, for instance a mobile. The amount could be absent from the withdrawal request message.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount and notes Values are pre-defined by the customer profile."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode ProfileWithdrawal = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			definition = "Amount and notes Values are pre-defined by the customer profile.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standard withdrawal of items."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode StandardWithdrawal = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			definition = "Standard withdrawal of items.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupervisedWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal authorised by a supervisor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode SupervisedWithdrawal = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupervisedWithdrawal";
			definition = "Withdrawal authorised by a supervisor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Modification of the card PIN value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode PINChange = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			definition = "Modification of the card PIN value.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRecovery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resetting of a PIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode PINRecovery = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRecovery";
			definition = "Resetting of a PIN.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unblock the PIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode PINUnblock = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			definition = "Unblock the PIN.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask for account statement information to a related custumer account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode AccountStatements = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatements";
			definition = "Ask for account statement information to a related custumer account.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Verification of the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode CardVerification = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			definition = "Verification of the card.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask for customer profile with eventualy related account information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode CustomerProfile = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerProfile";
			definition = "Ask for customer profile with eventualy related account information.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicCurrencyConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask to a DCC service provider to qualify the currency conversion for the card."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode DynamicCurrencyConversion = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicCurrencyConversion";
			definition = "Ask to a DCC service provider to qualify the currency conversion for the card.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask for exchange rate for the ongoing deposit transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode ExchangeRateDeposit = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateDeposit";
			definition = "Ask for exchange rate for the ongoing deposit transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ask for exchange rate for the ongoing withdrawal transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode ExchangeRateWithdrawal = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateWithdrawal";
			definition = "Ask for exchange rate for the ongoing withdrawal transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectEMVApplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Select the EMV applications allowed by the acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode SelectEMVApplication = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectEMVApplication";
			definition = "Select the EMV applications allowed by the acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance inquiry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode BalanceInquiry = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceInquiry";
			definition = "Balance inquiry.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit of items."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode Deposit = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			definition = "Deposit of items.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MakingChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Making change between media types."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode MakingChange = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MakingChange";
			definition = "Making change between media types.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonVerifiedDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deposit of media items unverified by the ATM, for instance in an envelope."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode NonVerifiedDeposit = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonVerifiedDeposit";
			definition = "Deposit of media items unverified by the ATM, for instance in an envelope.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VerifiedDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit of media items verified by the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode VerifiedDeposit = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VerifiedDeposit";
			definition = "Deposit of media items verified by the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds transfer between accounts belonging to the customer in the same bank."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode CustomerTransfer = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTransfer";
			definition = "Funds transfer between accounts belonging to the customer in the same bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCustomerTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds transfer to another customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode InterCustomerTransfer = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCustomerTransfer";
			definition = "Funds transfer to another customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds transfer to pay a third party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ATMServiceTypeCode Payment = new ATMServiceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Funds transfer to pay a third party.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceTypeCode.mmObject();
			codeName = "TRFP";
		}
	};
	final static private LinkedHashMap<String, ATMServiceTypeCode> codesByName = new LinkedHashMap<>();

	protected ATMServiceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceTypeCode";
				definition = "Describes the type of transaction available for a customer on an ATM.";
				derivation_lazy = () -> Arrays.asList(ATMServiceType1Code.mmObject(), ATMServiceType4Code.mmObject(), ATMServiceType2Code.mmObject(), ATMServiceType3Code.mmObject(), ATMServiceType5Code.mmObject(),
						ATMServiceType6Code.mmObject(), ATMServiceType7Code.mmObject(), ATMServiceType8Code.mmObject(), ATMServiceType9Code.mmObject(), ATMServiceType10Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMServiceTypeCode.ChosenWithdrawal, com.tools20022.repository.codeset.ATMServiceTypeCode.PreAuthorisedWithdrawal,
						com.tools20022.repository.codeset.ATMServiceTypeCode.ProfileWithdrawal, com.tools20022.repository.codeset.ATMServiceTypeCode.StandardWithdrawal,
						com.tools20022.repository.codeset.ATMServiceTypeCode.SupervisedWithdrawal, com.tools20022.repository.codeset.ATMServiceTypeCode.PINChange, com.tools20022.repository.codeset.ATMServiceTypeCode.PINRecovery,
						com.tools20022.repository.codeset.ATMServiceTypeCode.PINUnblock, com.tools20022.repository.codeset.ATMServiceTypeCode.AccountStatements, com.tools20022.repository.codeset.ATMServiceTypeCode.CardVerification,
						com.tools20022.repository.codeset.ATMServiceTypeCode.CustomerProfile, com.tools20022.repository.codeset.ATMServiceTypeCode.DynamicCurrencyConversion,
						com.tools20022.repository.codeset.ATMServiceTypeCode.ExchangeRateDeposit, com.tools20022.repository.codeset.ATMServiceTypeCode.ExchangeRateWithdrawal,
						com.tools20022.repository.codeset.ATMServiceTypeCode.SelectEMVApplication, com.tools20022.repository.codeset.ATMServiceTypeCode.BalanceInquiry, com.tools20022.repository.codeset.ATMServiceTypeCode.Deposit,
						com.tools20022.repository.codeset.ATMServiceTypeCode.MakingChange, com.tools20022.repository.codeset.ATMServiceTypeCode.NonVerifiedDeposit, com.tools20022.repository.codeset.ATMServiceTypeCode.VerifiedDeposit,
						com.tools20022.repository.codeset.ATMServiceTypeCode.CustomerTransfer, com.tools20022.repository.codeset.ATMServiceTypeCode.InterCustomerTransfer, com.tools20022.repository.codeset.ATMServiceTypeCode.Payment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ChosenWithdrawal.getCodeName().get(), ChosenWithdrawal);
		codesByName.put(PreAuthorisedWithdrawal.getCodeName().get(), PreAuthorisedWithdrawal);
		codesByName.put(ProfileWithdrawal.getCodeName().get(), ProfileWithdrawal);
		codesByName.put(StandardWithdrawal.getCodeName().get(), StandardWithdrawal);
		codesByName.put(SupervisedWithdrawal.getCodeName().get(), SupervisedWithdrawal);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(PINRecovery.getCodeName().get(), PINRecovery);
		codesByName.put(PINUnblock.getCodeName().get(), PINUnblock);
		codesByName.put(AccountStatements.getCodeName().get(), AccountStatements);
		codesByName.put(CardVerification.getCodeName().get(), CardVerification);
		codesByName.put(CustomerProfile.getCodeName().get(), CustomerProfile);
		codesByName.put(DynamicCurrencyConversion.getCodeName().get(), DynamicCurrencyConversion);
		codesByName.put(ExchangeRateDeposit.getCodeName().get(), ExchangeRateDeposit);
		codesByName.put(ExchangeRateWithdrawal.getCodeName().get(), ExchangeRateWithdrawal);
		codesByName.put(SelectEMVApplication.getCodeName().get(), SelectEMVApplication);
		codesByName.put(BalanceInquiry.getCodeName().get(), BalanceInquiry);
		codesByName.put(Deposit.getCodeName().get(), Deposit);
		codesByName.put(MakingChange.getCodeName().get(), MakingChange);
		codesByName.put(NonVerifiedDeposit.getCodeName().get(), NonVerifiedDeposit);
		codesByName.put(VerifiedDeposit.getCodeName().get(), VerifiedDeposit);
		codesByName.put(CustomerTransfer.getCodeName().get(), CustomerTransfer);
		codesByName.put(InterCustomerTransfer.getCodeName().get(), InterCustomerTransfer);
		codesByName.put(Payment.getCodeName().get(), Payment);
	}

	public static ATMServiceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMServiceTypeCode[] values() {
		ATMServiceTypeCode[] values = new ATMServiceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMServiceTypeCode> {
		@Override
		public ATMServiceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMServiceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}
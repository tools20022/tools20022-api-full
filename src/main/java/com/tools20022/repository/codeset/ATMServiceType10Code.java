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
import com.tools20022.repository.codeset.ATMServiceType10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the type of service selected by the customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#CustomerTransfer
 * ATMServiceType10Code.CustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#InterCustomerTransfer
 * ATMServiceType10Code.InterCustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#Payment
 * ATMServiceType10Code.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#AccountStatements
 * ATMServiceType10Code.AccountStatements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#BalanceInquiry
 * ATMServiceType10Code.BalanceInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#CardVerification
 * ATMServiceType10Code.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#ChosenWithdrawal
 * ATMServiceType10Code.ChosenWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#CustomerProfile
 * ATMServiceType10Code.CustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#DynamicCurrencyConversion
 * ATMServiceType10Code.DynamicCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#ExchangeRateDeposit
 * ATMServiceType10Code.ExchangeRateDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#ExchangeRateWithdrawal
 * ATMServiceType10Code.ExchangeRateWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#MakingChange
 * ATMServiceType10Code.MakingChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#NonVerifiedDeposit
 * ATMServiceType10Code.NonVerifiedDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#PINChange
 * ATMServiceType10Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#PINRecovery
 * ATMServiceType10Code.PINRecovery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#PINUnblock
 * ATMServiceType10Code.PINUnblock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#PreAuthorisedWithdrawal
 * ATMServiceType10Code.PreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#ProfileWithdrawal
 * ATMServiceType10Code.ProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#SelectEMVApplication
 * ATMServiceType10Code.SelectEMVApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#StandardWithdrawal
 * ATMServiceType10Code.StandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#SupervisedWithdrawal
 * ATMServiceType10Code.SupervisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#VerifiedDeposit
 * ATMServiceType10Code.VerifiedDeposit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
 * ATMServiceTypeCode}</li>
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
 * "ATMServiceType10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes the type of service selected by the customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code
 * ATMServiceType9Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMServiceType10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code#CustomerTransfer
	 * ATMServiceType9Code.CustomerTransfer}</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code CustomerTransfer = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTransfer";
			previousVersion_lazy = () -> ATMServiceType9Code.CustomerTransfer;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.CustomerTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCustomerTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code#InterCustomerTransfer
	 * ATMServiceType9Code.InterCustomerTransfer}</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code InterCustomerTransfer = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCustomerTransfer";
			previousVersion_lazy = () -> ATMServiceType9Code.InterCustomerTransfer;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.InterCustomerTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code#Payment
	 * ATMServiceType9Code.Payment}</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code Payment = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			previousVersion_lazy = () -> ATMServiceType9Code.Payment;
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.Payment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatements"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code AccountStatements = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatements";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.AccountStatements.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceInquiry"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code BalanceInquiry = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.BalanceInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code CardVerification = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.CardVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code ChosenWithdrawal = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.ChosenWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerProfile"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code CustomerProfile = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerProfile";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.CustomerProfile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicCurrencyConversion"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code DynamicCurrencyConversion = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicCurrencyConversion";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.DynamicCurrencyConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateDeposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code ExchangeRateDeposit = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.ExchangeRateDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code ExchangeRateWithdrawal = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.ExchangeRateWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MakingChange"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code MakingChange = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MakingChange";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.MakingChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonVerifiedDeposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code NonVerifiedDeposit = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonVerifiedDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.NonVerifiedDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code PINChange = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINRecovery"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code PINRecovery = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINRecovery";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.PINRecovery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINUnblock"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code PINUnblock = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINUnblock";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.PINUnblock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code PreAuthorisedWithdrawal = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.PreAuthorisedWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code ProfileWithdrawal = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.ProfileWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectEMVApplication"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code SelectEMVApplication = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectEMVApplication";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.SelectEMVApplication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code StandardWithdrawal = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.StandardWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupervisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code SupervisedWithdrawal = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupervisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.SupervisedWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
	 * ATMServiceType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VerifiedDeposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType10Code VerifiedDeposit = new ATMServiceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VerifiedDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType10Code.mmObject();
			codeName = ATMServiceTypeCode.VerifiedDeposit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMServiceType10Code> codesByName = new LinkedHashMap<>();

	protected ATMServiceType10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceType10Code";
				definition = "Describes the type of service selected by the customer.";
				previousVersion_lazy = () -> ATMServiceType9Code.mmObject();
				trace_lazy = () -> ATMServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMServiceType10Code.CustomerTransfer, com.tools20022.repository.codeset.ATMServiceType10Code.InterCustomerTransfer,
						com.tools20022.repository.codeset.ATMServiceType10Code.Payment, com.tools20022.repository.codeset.ATMServiceType10Code.AccountStatements, com.tools20022.repository.codeset.ATMServiceType10Code.BalanceInquiry,
						com.tools20022.repository.codeset.ATMServiceType10Code.CardVerification, com.tools20022.repository.codeset.ATMServiceType10Code.ChosenWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType10Code.CustomerProfile, com.tools20022.repository.codeset.ATMServiceType10Code.DynamicCurrencyConversion,
						com.tools20022.repository.codeset.ATMServiceType10Code.ExchangeRateDeposit, com.tools20022.repository.codeset.ATMServiceType10Code.ExchangeRateWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType10Code.MakingChange, com.tools20022.repository.codeset.ATMServiceType10Code.NonVerifiedDeposit, com.tools20022.repository.codeset.ATMServiceType10Code.PINChange,
						com.tools20022.repository.codeset.ATMServiceType10Code.PINRecovery, com.tools20022.repository.codeset.ATMServiceType10Code.PINUnblock, com.tools20022.repository.codeset.ATMServiceType10Code.PreAuthorisedWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType10Code.ProfileWithdrawal, com.tools20022.repository.codeset.ATMServiceType10Code.SelectEMVApplication,
						com.tools20022.repository.codeset.ATMServiceType10Code.StandardWithdrawal, com.tools20022.repository.codeset.ATMServiceType10Code.SupervisedWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType10Code.VerifiedDeposit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CustomerTransfer.getCodeName().get(), CustomerTransfer);
		codesByName.put(InterCustomerTransfer.getCodeName().get(), InterCustomerTransfer);
		codesByName.put(Payment.getCodeName().get(), Payment);
		codesByName.put(AccountStatements.getCodeName().get(), AccountStatements);
		codesByName.put(BalanceInquiry.getCodeName().get(), BalanceInquiry);
		codesByName.put(CardVerification.getCodeName().get(), CardVerification);
		codesByName.put(ChosenWithdrawal.getCodeName().get(), ChosenWithdrawal);
		codesByName.put(CustomerProfile.getCodeName().get(), CustomerProfile);
		codesByName.put(DynamicCurrencyConversion.getCodeName().get(), DynamicCurrencyConversion);
		codesByName.put(ExchangeRateDeposit.getCodeName().get(), ExchangeRateDeposit);
		codesByName.put(ExchangeRateWithdrawal.getCodeName().get(), ExchangeRateWithdrawal);
		codesByName.put(MakingChange.getCodeName().get(), MakingChange);
		codesByName.put(NonVerifiedDeposit.getCodeName().get(), NonVerifiedDeposit);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(PINRecovery.getCodeName().get(), PINRecovery);
		codesByName.put(PINUnblock.getCodeName().get(), PINUnblock);
		codesByName.put(PreAuthorisedWithdrawal.getCodeName().get(), PreAuthorisedWithdrawal);
		codesByName.put(ProfileWithdrawal.getCodeName().get(), ProfileWithdrawal);
		codesByName.put(SelectEMVApplication.getCodeName().get(), SelectEMVApplication);
		codesByName.put(StandardWithdrawal.getCodeName().get(), StandardWithdrawal);
		codesByName.put(SupervisedWithdrawal.getCodeName().get(), SupervisedWithdrawal);
		codesByName.put(VerifiedDeposit.getCodeName().get(), VerifiedDeposit);
	}

	public static ATMServiceType10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMServiceType10Code[] values() {
		ATMServiceType10Code[] values = new ATMServiceType10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMServiceType10Code> {
		@Override
		public ATMServiceType10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMServiceType10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}